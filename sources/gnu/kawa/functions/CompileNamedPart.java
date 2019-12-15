package gnu.kawa.functions;

import gnu.bytecode.Access;
import gnu.bytecode.ArrayType;
import gnu.bytecode.ClassType;
import gnu.bytecode.ObjectType;
import gnu.bytecode.Type;
import gnu.expr.ApplyExp;
import gnu.expr.Compilation;
import gnu.expr.Declaration;
import gnu.expr.Expression;
import gnu.expr.InlineCalls;
import gnu.expr.Language;
import gnu.expr.PrimProcedure;
import gnu.expr.QuoteExp;
import gnu.expr.ReferenceExp;
import gnu.kawa.reflect.ClassMethods;
import gnu.kawa.reflect.CompileReflect;
import gnu.kawa.reflect.Invoke;
import gnu.kawa.reflect.SlotGet;
import gnu.kawa.reflect.SlotSet;
import gnu.mapping.Environment;
import gnu.mapping.EnvironmentKey;
import gnu.mapping.HasNamedParts;
import gnu.mapping.Namespace;
import gnu.mapping.Procedure;
import gnu.mapping.SimpleSymbol;
import gnu.mapping.Symbol;
import kawa.lang.Translator;

public class CompileNamedPart {
    static final ClassType typeHasNamedParts = ClassType.make("gnu.mapping.HasNamedParts");

    public static Expression validateGetNamedPart(ApplyExp exp, InlineCalls visitor, Type required, Procedure proc) {
        exp.visitArgs(visitor);
        Expression[] args = exp.getArgs();
        if (args.length != 2 || !(args[1] instanceof QuoteExp) || !(exp instanceof GetNamedExp)) {
            return exp;
        }
        Expression context = args[0];
        Declaration decl = null;
        if (context instanceof ReferenceExp) {
            ReferenceExp rexp = (ReferenceExp) context;
            if ("*".equals(rexp.getName())) {
                return makeGetNamedInstancePartExp(args[1]);
            }
            decl = rexp.getBinding();
        }
        String mname = ((QuoteExp) args[1]).getValue().toString();
        Type type = context.getType();
        if (context == QuoteExp.nullExp) {
        }
        Compilation comp = visitor.getCompilation();
        Language language = comp.getLanguage();
        Type typeval = language.getTypeFor(context, false);
        ClassType caller = comp == null ? null : comp.curClass != null ? comp.curClass : comp.mainClass;
        GetNamedExp nexp = (GetNamedExp) exp;
        if (typeval != null) {
            if (mname.equals(GetNamedPart.CLASSTYPE_FOR)) {
                QuoteExp quoteExp = new QuoteExp(typeval);
                return quoteExp;
            } else if (typeval instanceof ObjectType) {
                if (mname.equals("new")) {
                    return nexp.setProcedureKind('N');
                }
                if (mname.equals(GetNamedPart.INSTANCEOF_METHOD_NAME)) {
                    return nexp.setProcedureKind(Access.INNERCLASS_CONTEXT);
                }
                if (mname.equals(GetNamedPart.CAST_METHOD_NAME)) {
                    return nexp.setProcedureKind(Access.CLASS_CONTEXT);
                }
            }
        }
        if (!(typeval instanceof ObjectType)) {
            if (typeval != null) {
            }
            if (type.isSubtype(Compilation.typeClassType) || type.isSubtype(Type.javalangClassType)) {
                return exp;
            }
            if (type instanceof ObjectType) {
                ObjectType otype = (ObjectType) type;
                PrimProcedure[] methods = ClassMethods.getMethods(otype, Compilation.mangleName(mname), 'V', caller, language);
                if (methods != null && methods.length > 0) {
                    nexp.methods = methods;
                    return nexp.setProcedureKind(Access.METHOD_CONTEXT);
                } else if (type.isSubtype(typeHasNamedParts)) {
                    if (decl != null) {
                        Object val = Declaration.followAliases(decl).getConstantValue();
                        if (val != null) {
                            HasNamedParts value = (HasNamedParts) val;
                            if (value.isConstant(mname)) {
                                return QuoteExp.getInstance(value.get(mname));
                            }
                        }
                    }
                    Expression[] args2 = {args[0], QuoteExp.getInstance(mname)};
                    ApplyExp applyExp = new ApplyExp(typeHasNamedParts.getDeclaredMethod("get", 1), args2);
                    Expression[] expressionArr = args2;
                    return applyExp.setLine((Expression) exp);
                } else if (SlotGet.lookupMember(otype, mname, caller) != null || (mname.equals("length") && (type instanceof ArrayType))) {
                    ApplyExp aexp = new ApplyExp((Procedure) SlotGet.field, args);
                    aexp.setLine((Expression) exp);
                    return visitor.visitApplyOnly(aexp, required);
                }
            }
            if (!comp.warnUnknownMember()) {
                return exp;
            }
            comp.error('w', "no known slot '" + mname + "' in " + type.getName());
            return exp;
        } else if (mname.length() > 1 && mname.charAt(0) == '.') {
            NamedPart namedPart = new NamedPart(typeval, mname, 'D');
            QuoteExp quoteExp2 = new QuoteExp(namedPart);
            return quoteExp2;
        } else if (CompileReflect.checkKnownClass(typeval, comp) < 0) {
            return exp;
        } else {
            PrimProcedure[] methods2 = ClassMethods.getMethods((ObjectType) typeval, Compilation.mangleName(mname), 0, caller, language);
            if (methods2 == null || methods2.length <= 0) {
                ApplyExp aexp2 = new ApplyExp((Procedure) SlotGet.staticField, args);
                aexp2.setLine((Expression) exp);
                return visitor.visitApplyOnly(aexp2, required);
            }
            nexp.methods = methods2;
            return nexp.setProcedureKind('S');
        }
    }

    public static Expression validateSetNamedPart(ApplyExp exp, InlineCalls visitor, Type required, Procedure proc) {
        exp.visitArgs(visitor);
        Expression[] args = exp.getArgs();
        if (args.length == 3 && (args[1] instanceof QuoteExp)) {
            Expression context = args[0];
            String mname = ((QuoteExp) args[1]).getValue().toString();
            Type type = context.getType();
            Compilation comp = visitor.getCompilation();
            Type typeval = comp.getLanguage().getTypeFor(context);
            ClassType caller = comp == null ? null : comp.curClass != null ? comp.curClass : comp.mainClass;
            ApplyExp original = exp;
            if (typeval instanceof ClassType) {
                exp = new ApplyExp((Procedure) SlotSet.set$Mnstatic$Mnfield$Ex, args);
            } else if ((type instanceof ClassType) && SlotSet.lookupMember((ClassType) type, mname, caller) != null) {
                exp = new ApplyExp((Procedure) SlotSet.set$Mnfield$Ex, args);
            }
            if (exp != original) {
                exp.setLine((Expression) original);
            }
            exp.setType(Type.voidType);
        }
        return exp;
    }

    public static Expression makeExp(Expression clas, Expression member) {
        String combinedName = combineName(clas, member);
        Environment env = Environment.getCurrent();
        if (combinedName != null) {
            Translator tr = (Translator) Compilation.getCurrent();
            Symbol symbol = Namespace.EmptyNamespace.getSymbol(combinedName);
            Declaration decl = tr.lexical.lookup((Object) symbol, false);
            if (!Declaration.isUnknown(decl)) {
                return new ReferenceExp(decl);
            }
            if (symbol != null && env.isBound(symbol, null)) {
                return new ReferenceExp((Object) combinedName);
            }
        }
        if (clas instanceof ReferenceExp) {
            ReferenceExp rexp = (ReferenceExp) clas;
            if (rexp.isUnknown()) {
                Object rsym = rexp.getSymbol();
                if (env.get((EnvironmentKey) rsym instanceof Symbol ? (Symbol) rsym : env.getSymbol(rsym.toString()), (Object) null) == null) {
                    try {
                        clas = QuoteExp.getInstance(Type.make(ClassType.getContextClass(rexp.getName())));
                    } catch (Throwable th) {
                    }
                }
            }
        }
        GetNamedExp exp = new GetNamedExp(new Expression[]{clas, member});
        exp.combinedName = combinedName;
        return exp;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        return (r0 + ':' + r1).intern();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r0 == null) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r0 != null) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String combineName(gnu.expr.Expression r4, gnu.expr.Expression r5) {
        /*
            java.lang.Object r1 = r5.valueIfConstant()
            boolean r2 = r1 instanceof gnu.mapping.SimpleSymbol
            if (r2 == 0) goto L_0x003b
            boolean r2 = r4 instanceof gnu.expr.ReferenceExp
            if (r2 == 0) goto L_0x0015
            r2 = r4
            gnu.expr.ReferenceExp r2 = (gnu.expr.ReferenceExp) r2
            java.lang.String r0 = r2.getSimpleName()
            if (r0 != 0) goto L_0x001f
        L_0x0015:
            boolean r2 = r4 instanceof gnu.kawa.functions.GetNamedExp
            if (r2 == 0) goto L_0x003b
            gnu.kawa.functions.GetNamedExp r4 = (gnu.kawa.functions.GetNamedExp) r4
            java.lang.String r0 = r4.combinedName
            if (r0 == 0) goto L_0x003b
        L_0x001f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r0)
            r3 = 58
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r2.intern()
        L_0x003a:
            return r2
        L_0x003b:
            r2 = 0
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: gnu.kawa.functions.CompileNamedPart.combineName(gnu.expr.Expression, gnu.expr.Expression):java.lang.String");
    }

    public static Expression makeExp(Expression clas, String member) {
        return makeExp(clas, (Expression) new QuoteExp(member));
    }

    public static Expression makeExp(Type type, String member) {
        return makeExp((Expression) new QuoteExp(type), (Expression) new QuoteExp(member));
    }

    public static Expression validateNamedPart(ApplyExp exp, InlineCalls visitor, Type required, Procedure proc) {
        SlotGet slotProc;
        exp.visitArgs(visitor);
        Expression[] args = exp.getArgs();
        NamedPart namedPart = (NamedPart) proc;
        switch (namedPart.kind) {
            case 'D':
                Expression[] xargs = new Expression[2];
                xargs[1] = QuoteExp.getInstance(namedPart.member.toString().substring(1));
                if (args.length > 0) {
                    xargs[0] = Compilation.makeCoercion(args[0], (Expression) new QuoteExp(namedPart.container));
                    slotProc = SlotGet.field;
                } else {
                    xargs[0] = QuoteExp.getInstance(namedPart.container);
                    slotProc = SlotGet.staticField;
                }
                ApplyExp aexp = new ApplyExp((Procedure) slotProc, xargs);
                aexp.setLine((Expression) exp);
                return visitor.visitApplyOnly(aexp, required);
            default:
                return exp;
        }
    }

    public static Expression validateNamedPartSetter(ApplyExp exp, InlineCalls visitor, Type required, Procedure proc) {
        SlotSet slotProc;
        exp.visitArgs(visitor);
        NamedPart get = (NamedPart) ((NamedPartSetter) proc).getGetter();
        if (get.kind != 'D') {
            return exp;
        }
        Expression[] xargs = new Expression[3];
        xargs[1] = QuoteExp.getInstance(get.member.toString().substring(1));
        xargs[2] = exp.getArgs()[0];
        if (exp.getArgCount() == 1) {
            xargs[0] = QuoteExp.getInstance(get.container);
            slotProc = SlotSet.set$Mnstatic$Mnfield$Ex;
        } else if (exp.getArgCount() != 2) {
            return exp;
        } else {
            xargs[0] = Compilation.makeCoercion(exp.getArgs()[0], (Expression) new QuoteExp(get.container));
            slotProc = SlotSet.set$Mnfield$Ex;
        }
        ApplyExp aexp = new ApplyExp((Procedure) slotProc, xargs);
        aexp.setLine((Expression) exp);
        return visitor.visitApplyOnly(aexp, required);
    }

    public static Expression makeGetNamedInstancePartExp(Expression member) {
        if (member instanceof QuoteExp) {
            Object val = ((QuoteExp) member).getValue();
            if (val instanceof SimpleSymbol) {
                return QuoteExp.getInstance(new GetNamedInstancePart(val.toString()));
            }
        }
        return new ApplyExp((Procedure) Invoke.make, new QuoteExp(ClassType.make("gnu.kawa.functions.GetNamedInstancePart")), member);
    }

    public static Expression validateGetNamedInstancePart(ApplyExp exp, InlineCalls visitor, Type required, Procedure proc) {
        Expression[] xargs;
        Procedure property;
        exp.visitArgs(visitor);
        Expression[] args = exp.getArgs();
        GetNamedInstancePart gproc = (GetNamedInstancePart) proc;
        if (gproc.isField) {
            xargs = new Expression[]{args[0], new QuoteExp(gproc.pname)};
            property = SlotGet.field;
        } else {
            int nargs = args.length;
            xargs = new Expression[(nargs + 1)];
            xargs[0] = args[0];
            xargs[1] = new QuoteExp(gproc.pname);
            System.arraycopy(args, 1, xargs, 2, nargs - 1);
            property = Invoke.invoke;
        }
        return visitor.visitApplyOnly(new ApplyExp(property, xargs), required);
    }

    public static Expression validateSetNamedInstancePart(ApplyExp exp, InlineCalls visitor, Type required, Procedure proc) {
        exp.visitArgs(visitor);
        Expression[] args = exp.getArgs();
        return visitor.visitApplyOnly(new ApplyExp((Procedure) SlotSet.set$Mnfield$Ex, args[0], new QuoteExp(((SetNamedInstancePart) proc).pname), args[1]), required);
    }
}
