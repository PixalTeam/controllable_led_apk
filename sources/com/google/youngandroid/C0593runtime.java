package com.google.youngandroid;

import android.content.Context;
import android.os.Handler;
import android.support.p000v4.app.FragmentTransaction;
import android.text.format.Formatter;
import com.google.appinventor.components.common.ComponentConstants;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.common.YaVersion;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.errors.PermissionException;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.AssetFetcher;
import com.google.appinventor.components.runtime.util.CsvUtil;
import com.google.appinventor.components.runtime.util.ErrorMessages;
import com.google.appinventor.components.runtime.util.JavaJoinListOfStrings;
import com.google.appinventor.components.runtime.util.PropertyUtil;
import com.google.appinventor.components.runtime.util.RetValManager;
import com.google.appinventor.components.runtime.util.YailList;
import com.google.appinventor.components.runtime.util.YailNumberToString;
import gnu.bytecode.ClassType;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleInfo;
import gnu.expr.ModuleMethod;
import gnu.expr.Special;
import gnu.kawa.functions.AddOp;
import gnu.kawa.functions.Apply;
import gnu.kawa.functions.Arithmetic;
import gnu.kawa.functions.BitwiseOp;
import gnu.kawa.functions.CallCC;
import gnu.kawa.functions.DivideOp;
import gnu.kawa.functions.Format;
import gnu.kawa.functions.GetNamedPart;
import gnu.kawa.functions.IsEqual;
import gnu.kawa.functions.MultiplyOp;
import gnu.kawa.functions.NumberCompare;
import gnu.kawa.lispexpr.LangObjType;
import gnu.kawa.lispexpr.LispLanguage;
import gnu.kawa.reflect.Invoke;
import gnu.kawa.reflect.SlotGet;
import gnu.kawa.reflect.SlotSet;
import gnu.lists.Consumer;
import gnu.lists.FString;
import gnu.lists.LList;
import gnu.lists.Pair;
import gnu.lists.PairWithPosition;
import gnu.mapping.CallContext;
import gnu.mapping.Environment;
import gnu.mapping.Procedure;
import gnu.mapping.SimpleSymbol;
import gnu.mapping.Symbol;
import gnu.mapping.Values;
import gnu.mapping.WrongType;
import gnu.math.DFloNum;
import gnu.math.IntNum;
import gnu.math.Numeric;
import gnu.math.RealNum;
import gnu.text.Char;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import kawa.lang.Macro;
import kawa.lang.Quote;
import kawa.lang.SyntaxPattern;
import kawa.lang.SyntaxRule;
import kawa.lang.SyntaxRules;
import kawa.lang.SyntaxTemplate;
import kawa.lang.TemplateScope;
import kawa.lib.C0605lists;
import kawa.lib.characters;
import kawa.lib.misc;
import kawa.lib.numbers;
import kawa.lib.ports;
import kawa.lib.std_syntax;
import kawa.lib.strings;
import kawa.lib.thread;
import kawa.standard.Scheme;
import kawa.standard.expt;
import kawa.standard.syntax_case;

/* renamed from: com.google.youngandroid.runtime */
/* compiled from: runtime5720098754470623974.scm */
public class C0593runtime extends ModuleBody implements Runnable {
    public static final ModuleMethod $Pcset$Mnand$Mncoerce$Mnproperty$Ex;
    public static final ModuleMethod $Pcset$Mnsubform$Mnlayout$Mnproperty$Ex;
    public static Object $Stalpha$Mnopaque$St;
    public static Object $Stcolor$Mnalpha$Mnposition$St;
    public static Object $Stcolor$Mnblue$Mnposition$St;
    public static Object $Stcolor$Mngreen$Mnposition$St;
    public static Object $Stcolor$Mnred$Mnposition$St;
    public static Boolean $Stdebug$St;
    public static final ModuleMethod $Stformat$Mninexact$St;
    public static Object $Stinit$Mnthunk$Mnenvironment$St;
    public static String $Stjava$Mnexception$Mnmessage$St;
    public static final Macro $Stlist$Mnfor$Mnruntime$St = Macro.make(Lit85, Lit86, $instance);
    public static Object $Stmax$Mncolor$Mncomponent$St;
    public static Object $Stnon$Mncoercible$Mnvalue$St;
    public static IntNum $Stnum$Mnconnections$St;
    public static DFloNum $Stpi$St;
    public static Random $Strandom$Mnnumber$Mngenerator$St;
    public static IntNum $Strepl$Mnport$St;
    public static String $Strepl$Mnserver$Mnaddress$St;
    public static Boolean $Strun$Mntelnet$Mnrepl$St;
    public static Object $Sttest$Mnenvironment$St;
    public static Object $Sttest$Mnglobal$Mnvar$Mnenvironment$St;
    public static Boolean $Sttesting$St;
    public static String $Stthe$Mnempty$Mnstring$Mnprinted$Mnrep$St;
    public static Object $Stthe$Mnnull$Mnvalue$Mnprinted$Mnrep$St;
    public static Object $Stthe$Mnnull$Mnvalue$St;
    public static Object $Stthis$Mnform$St;
    public static Object $Stthis$Mnis$Mnthe$Mnrepl$St;
    public static Object $Stui$Mnhandler$St;
    public static final ModuleMethod $Styail$Mnbreak$St;
    public static SimpleSymbol $Styail$Mnlist$St;
    public static final C0593runtime $instance = new C0593runtime();
    public static final Class AssetFetcher = AssetFetcher.class;
    public static final Class CsvUtil = CsvUtil.class;
    public static final Class Double = Double.class;
    public static Object ERROR_DIVISION_BY_ZERO;
    public static final Class Float = Float.class;
    public static final Class Integer = Integer.class;
    public static final Class JavaCollection = Collection.class;
    public static final Class JavaIterator = Iterator.class;
    public static final Class JavaJoinListOfStrings = JavaJoinListOfStrings.class;
    public static final Class KawaEnvironment = Environment.class;
    static final SimpleSymbol Lit0;
    static final SimpleSymbol Lit1;
    static final SimpleSymbol Lit10 = ((SimpleSymbol) new SimpleSymbol("any").readResolve());
    static final SimpleSymbol Lit100 = ((SimpleSymbol) new SimpleSymbol("any$").readResolve());
    static final SyntaxTemplate Lit101 = new SyntaxTemplate("\u0001\u0001\u0001\u0001\u0000", "\u000b", new Object[0], 0);
    static final SyntaxTemplate Lit102 = new SyntaxTemplate("\u0001\u0001\u0001\u0001\u0000", "\u0013", new Object[0], 0);
    static final SyntaxTemplate Lit103 = new SyntaxTemplate("\u0001\u0001\u0001\u0001\u0000", "\t\u001b\b\"", new Object[0], 0);
    static final SyntaxTemplate Lit104 = new SyntaxTemplate("\u0001\u0001\u0001\u0001\u0000", "\u0010", new Object[0], 0);
    static final SimpleSymbol Lit105 = ((SimpleSymbol) new SimpleSymbol("def").readResolve());
    static final SyntaxRules Lit106 = new SyntaxRules(new Object[]{Lit295}, new SyntaxRule[]{new SyntaxRule(new SyntaxPattern("\f\u0018<\f\u0007\r\u000f\b\b\b\r\u0017\u0010\b\b", new Object[0], 3), "\u0001\u0003\u0003", "\u0011\u0018\u0004\b\u0011\u0018\f\u0011\u0018\u0014¡\u0011\u0018\u001c)\u0011\u0018$\b\u0003\b\u0011\u0018,\u0019\b\r\u000b\b\u0015\u0013\b\u0011\u00184)\u0011\u0018$\b\u0003\b\u0011\u0018,\t\u0010\b\u0011\u0018,\u0019\b\r\u000b\b\u0015\u0013", new Object[]{Lit303, Lit298, Lit307, Lit113, Lit308, Lit301, Lit309}, 1), new SyntaxRule(new SyntaxPattern("\f\u0018\f\u0007\f\u000f\b", new Object[0], 2), "\u0001\u0001", "\u0011\u0018\u0004\b\u0011\u0018\f\u0011\u0018\u0014Y\u0011\u0018\u001c)\u0011\u0018$\b\u0003\b\u000b\b\u0011\u0018,)\u0011\u0018$\b\u0003\b\u0011\u00184\t\u0010\b\u000b", new Object[]{Lit303, Lit298, Lit307, Lit113, Lit308, Lit309, Lit301}, 0)}, 3);
    static final SimpleSymbol Lit107 = ((SimpleSymbol) new SimpleSymbol("do-after-form-creation").readResolve());
    static final SyntaxRules Lit108 = new SyntaxRules(new Object[]{Lit295}, new SyntaxRule[]{new SyntaxRule(new SyntaxPattern("\f\u0018\r\u0007\u0000\b\b", new Object[0], 1), "\u0003", "\u0011\u0018\u0004\u0011\u0018\f1\u0011\u0018\u0014\b\u0005\u0003\b\u0011\u0018\u001c\b\u0011\u0018$\b\u0011\u0018\u0014\b\u0005\u0003", new Object[]{Lit298, Lit307, Lit303, Lit343, Lit306}, 1)}, 1);
    static final SimpleSymbol Lit109 = ((SimpleSymbol) new SimpleSymbol("add-to-current-form-environment").readResolve());
    static final SimpleSymbol Lit11 = ((SimpleSymbol) new SimpleSymbol("Screen").readResolve());
    static final SimpleSymbol Lit110 = ((SimpleSymbol) new SimpleSymbol("lookup-in-current-form-environment").readResolve());
    static final SimpleSymbol Lit111 = ((SimpleSymbol) new SimpleSymbol("delete-from-current-form-environment").readResolve());
    static final SimpleSymbol Lit112 = ((SimpleSymbol) new SimpleSymbol("rename-in-current-form-environment").readResolve());
    static final SimpleSymbol Lit113 = ((SimpleSymbol) new SimpleSymbol("add-global-var-to-current-form-environment").readResolve());
    static final SimpleSymbol Lit114 = ((SimpleSymbol) new SimpleSymbol("lookup-global-var-in-current-form-environment").readResolve());
    static final SimpleSymbol Lit115 = ((SimpleSymbol) new SimpleSymbol("reset-current-form-environment").readResolve());
    static final SimpleSymbol Lit116 = ((SimpleSymbol) new SimpleSymbol("foreach").readResolve());
    static final PairWithPosition Lit117 = PairWithPosition.make(Lit300, LList.Empty, "/tmp/runtime5720098754470623974.scm", 3567620);
    static final PairWithPosition Lit118 = PairWithPosition.make(Lit301, LList.Empty, "/tmp/runtime5720098754470623974.scm", 3571717);
    static final PairWithPosition Lit119 = PairWithPosition.make(Lit124, LList.Empty, "/tmp/runtime5720098754470623974.scm", 3571725);
    static final SimpleSymbol Lit12;
    static final PairWithPosition Lit120 = PairWithPosition.make(Lit302, LList.Empty, "/tmp/runtime5720098754470623974.scm", 3575815);
    static final PairWithPosition Lit121 = PairWithPosition.make(Lit305, LList.Empty, "/tmp/runtime5720098754470623974.scm", 3575821);
    static final PairWithPosition Lit122 = PairWithPosition.make(Lit301, LList.Empty, "/tmp/runtime5720098754470623974.scm", 3575827);
    static final PairWithPosition Lit123 = PairWithPosition.make(Lit250, PairWithPosition.make(Lit305, LList.Empty, "/tmp/runtime5720098754470623974.scm", 3579928), "/tmp/runtime5720098754470623974.scm", 3579913);
    static final SimpleSymbol Lit124;
    static final SimpleSymbol Lit125 = ((SimpleSymbol) new SimpleSymbol("forrange").readResolve());
    static final PairWithPosition Lit126 = PairWithPosition.make(Lit300, LList.Empty, "/tmp/runtime5720098754470623974.scm", 3649540);
    static final PairWithPosition Lit127 = PairWithPosition.make(Lit301, LList.Empty, "/tmp/runtime5720098754470623974.scm", 3653637);
    static final PairWithPosition Lit128 = PairWithPosition.make(Lit124, LList.Empty, "/tmp/runtime5720098754470623974.scm", 3653645);
    static final PairWithPosition Lit129 = PairWithPosition.make(Lit251, LList.Empty, "/tmp/runtime5720098754470623974.scm", 3657735);
    static final DFloNum Lit13 = DFloNum.make(Double.POSITIVE_INFINITY);
    static final PairWithPosition Lit130 = PairWithPosition.make(Lit301, LList.Empty, "/tmp/runtime5720098754470623974.scm", 3657751);
    static final SimpleSymbol Lit131 = ((SimpleSymbol) new SimpleSymbol("while").readResolve());
    static final PairWithPosition Lit132 = PairWithPosition.make(Lit302, LList.Empty, "/tmp/runtime5720098754470623974.scm", 3710980);
    static final PairWithPosition Lit133 = PairWithPosition.make(Lit31, LList.Empty, "/tmp/runtime5720098754470623974.scm", 3710986);
    static final PairWithPosition Lit134 = PairWithPosition.make(Lit301, LList.Empty, "/tmp/runtime5720098754470623974.scm", 3710992);
    static final PairWithPosition Lit135;
    static final PairWithPosition Lit136 = PairWithPosition.make(Lit302, PairWithPosition.make(Lit304, PairWithPosition.make(LList.Empty, LList.Empty, "/tmp/runtime5720098754470623974.scm", 3715107), "/tmp/runtime5720098754470623974.scm", 3715095), "/tmp/runtime5720098754470623974.scm", 3715090);
    static final PairWithPosition Lit137 = PairWithPosition.make(Lit298, LList.Empty, "/tmp/runtime5720098754470623974.scm", 3719188);
    static final PairWithPosition Lit138 = PairWithPosition.make(Lit303, LList.Empty, "/tmp/runtime5720098754470623974.scm", 3723288);
    static final PairWithPosition Lit139 = PairWithPosition.make(Lit303, LList.Empty, "/tmp/runtime5720098754470623974.scm", 3723295);
    static final DFloNum Lit14 = DFloNum.make(Double.NEGATIVE_INFINITY);
    static final PairWithPosition Lit140 = PairWithPosition.make(PairWithPosition.make(Lit304, LList.Empty, "/tmp/runtime5720098754470623974.scm", 3727391), LList.Empty, "/tmp/runtime5720098754470623974.scm", 3727391);
    static final PairWithPosition Lit141 = PairWithPosition.make(null, LList.Empty, "/tmp/runtime5720098754470623974.scm", 3731480);
    static final PairWithPosition Lit142;
    static final SimpleSymbol Lit143 = ((SimpleSymbol) new SimpleSymbol("foreach-with-break").readResolve());
    static final SyntaxRules Lit144 = new SyntaxRules(new Object[]{Lit295}, new SyntaxRule[]{new SyntaxRule(new SyntaxPattern("\f\u0018\f\u0007\f\u000f\f\u0017\f\u001f\b", new Object[0], 4), "\u0001\u0001\u0001\u0001", "\u0011\u0018\u0004\b\u0011\u0018\f\u0011\b\u0003\b\u0011\u0018\u0014i\b\u0011\u0018\u001c\b\u0011\u0018\f\u0011\b\u000b\b\u0013\b\u0011\u0018$\u0011\u0018\u001c\b\u001b", new Object[]{Lit300, Lit301, Lit302, Lit305, Lit250}, 0)}, 4);
    static final SimpleSymbol Lit145 = ((SimpleSymbol) new SimpleSymbol("forrange-with-break").readResolve());
    static final SyntaxRules Lit146 = new SyntaxRules(new Object[]{Lit295}, new SyntaxRule[]{new SyntaxRule(new SyntaxPattern("\f\u0018\f\u0007\f\u000f\f\u0017\f\u001f\f'\f/\b", new Object[0], 6), "\u0001\u0001\u0001\u0001\u0001\u0001", "\u0011\u0018\u0004\b\u0011\u0018\f\u0011\b\u0003\b\u0011\u0018\u0014A\u0011\u0018\f\u0011\b\u000b\b\u0013\t\u001b\t#\b+", new Object[]{Lit300, Lit301, Lit251}, 0)}, 6);
    static final SimpleSymbol Lit147 = ((SimpleSymbol) new SimpleSymbol("while-with-break").readResolve());
    static final SyntaxRules Lit148 = new SyntaxRules(new Object[]{Lit295}, new SyntaxRule[]{new SyntaxRule(new SyntaxPattern("\f\u0018\f\u0007\f\u000f\r\u0017\u0010\b\b", new Object[0], 3), "\u0001\u0001\u0003", "\u0011\u0018\u0004\b\u0011\u0018\f\u0011\b\u0003\b\u0011\u0018\u0014\u0011\u0018\u001c\t\u0010\b\u0011\u0018$\t\u000bA\u0011\u0018,\u0011\u0015\u0013\u00184\u0018<", new Object[]{Lit300, Lit301, Lit302, Lit299, Lit298, Lit303, PairWithPosition.make(PairWithPosition.make(Lit299, LList.Empty, "/tmp/runtime5720098754470623974.scm", 3915779), LList.Empty, "/tmp/runtime5720098754470623974.scm", 3915779), PairWithPosition.make(Lit409, LList.Empty, "/tmp/runtime5720098754470623974.scm", 3919880)}, 1)}, 3);
    static final SimpleSymbol Lit149 = ((SimpleSymbol) new SimpleSymbol("call-component-method").readResolve());
    static final DFloNum Lit15 = DFloNum.make(Double.POSITIVE_INFINITY);
    static final SimpleSymbol Lit150 = ((SimpleSymbol) new SimpleSymbol("call-component-type-method").readResolve());
    static final SimpleSymbol Lit151 = ((SimpleSymbol) new SimpleSymbol("call-yail-primitive").readResolve());
    static final SimpleSymbol Lit152 = ((SimpleSymbol) new SimpleSymbol("sanitize-component-data").readResolve());
    static final SimpleSymbol Lit153 = ((SimpleSymbol) new SimpleSymbol("java-collection->yail-list").readResolve());
    static final SimpleSymbol Lit154 = ((SimpleSymbol) new SimpleSymbol("java-collection->kawa-list").readResolve());
    static final SimpleSymbol Lit155 = ((SimpleSymbol) new SimpleSymbol("sanitize-atomic").readResolve());
    static final SimpleSymbol Lit156 = ((SimpleSymbol) new SimpleSymbol("signal-runtime-error").readResolve());
    static final SimpleSymbol Lit157 = ((SimpleSymbol) new SimpleSymbol("signal-runtime-form-error").readResolve());
    static final SimpleSymbol Lit158 = ((SimpleSymbol) new SimpleSymbol("yail-not").readResolve());
    static final SimpleSymbol Lit159 = ((SimpleSymbol) new SimpleSymbol("call-with-coerced-args").readResolve());
    static final DFloNum Lit16 = DFloNum.make(Double.NEGATIVE_INFINITY);
    static final SimpleSymbol Lit160 = ((SimpleSymbol) new SimpleSymbol("%set-and-coerce-property!").readResolve());
    static final SimpleSymbol Lit161 = ((SimpleSymbol) new SimpleSymbol("%set-subform-layout-property!").readResolve());
    static final SimpleSymbol Lit162 = ((SimpleSymbol) new SimpleSymbol("generate-runtime-type-error").readResolve());
    static final SimpleSymbol Lit163 = ((SimpleSymbol) new SimpleSymbol("show-arglist-no-parens").readResolve());
    static final SimpleSymbol Lit164 = ((SimpleSymbol) new SimpleSymbol("coerce-args").readResolve());
    static final SimpleSymbol Lit165 = ((SimpleSymbol) new SimpleSymbol("coerce-arg").readResolve());
    static final SimpleSymbol Lit166 = ((SimpleSymbol) new SimpleSymbol("coerce-to-text").readResolve());
    static final SimpleSymbol Lit167 = ((SimpleSymbol) new SimpleSymbol("coerce-to-instant").readResolve());
    static final SimpleSymbol Lit168 = ((SimpleSymbol) new SimpleSymbol("coerce-to-component").readResolve());
    static final SimpleSymbol Lit169 = ((SimpleSymbol) new SimpleSymbol("coerce-to-component-of-type").readResolve());
    static final IntNum Lit17 = IntNum.make(1);
    static final SimpleSymbol Lit170 = ((SimpleSymbol) new SimpleSymbol("type->class").readResolve());
    static final SimpleSymbol Lit171 = ((SimpleSymbol) new SimpleSymbol("coerce-to-number").readResolve());
    static final SimpleSymbol Lit172 = ((SimpleSymbol) new SimpleSymbol("use-json-format").readResolve());
    static final SyntaxRules Lit173;
    static final SimpleSymbol Lit174 = ((SimpleSymbol) new SimpleSymbol("coerce-to-string").readResolve());
    static final SimpleSymbol Lit175 = ((SimpleSymbol) new SimpleSymbol("get-display-representation").readResolve());
    static final SimpleSymbol Lit176 = ((SimpleSymbol) new SimpleSymbol("join-strings").readResolve());
    static final SimpleSymbol Lit177 = ((SimpleSymbol) new SimpleSymbol("string-replace").readResolve());
    static final SimpleSymbol Lit178 = ((SimpleSymbol) new SimpleSymbol("coerce-to-yail-list").readResolve());
    static final SimpleSymbol Lit179 = ((SimpleSymbol) new SimpleSymbol("coerce-to-boolean").readResolve());
    static final IntNum Lit18;
    static final SimpleSymbol Lit180 = ((SimpleSymbol) new SimpleSymbol("is-coercible?").readResolve());
    static final SimpleSymbol Lit181 = ((SimpleSymbol) new SimpleSymbol("all-coercible?").readResolve());
    static final SimpleSymbol Lit182 = ((SimpleSymbol) new SimpleSymbol("boolean->string").readResolve());
    static final SimpleSymbol Lit183 = ((SimpleSymbol) new SimpleSymbol("padded-string->number").readResolve());
    static final SimpleSymbol Lit184 = ((SimpleSymbol) new SimpleSymbol("*format-inexact*").readResolve());
    static final SimpleSymbol Lit185 = ((SimpleSymbol) new SimpleSymbol("appinventor-number->string").readResolve());
    static final SimpleSymbol Lit186 = ((SimpleSymbol) new SimpleSymbol("yail-equal?").readResolve());
    static final SimpleSymbol Lit187 = ((SimpleSymbol) new SimpleSymbol("yail-atomic-equal?").readResolve());
    static final SimpleSymbol Lit188 = ((SimpleSymbol) new SimpleSymbol("as-number").readResolve());
    static final SimpleSymbol Lit189 = ((SimpleSymbol) new SimpleSymbol("yail-not-equal?").readResolve());
    static final IntNum Lit19 = IntNum.make(2);
    static final SimpleSymbol Lit190 = ((SimpleSymbol) new SimpleSymbol("process-and-delayed").readResolve());
    static final SimpleSymbol Lit191 = ((SimpleSymbol) new SimpleSymbol("process-or-delayed").readResolve());
    static final SimpleSymbol Lit192 = ((SimpleSymbol) new SimpleSymbol("yail-floor").readResolve());
    static final SimpleSymbol Lit193 = ((SimpleSymbol) new SimpleSymbol("yail-ceiling").readResolve());
    static final SimpleSymbol Lit194 = ((SimpleSymbol) new SimpleSymbol("yail-round").readResolve());
    static final SimpleSymbol Lit195 = ((SimpleSymbol) new SimpleSymbol("random-set-seed").readResolve());
    static final SimpleSymbol Lit196 = ((SimpleSymbol) new SimpleSymbol("random-fraction").readResolve());
    static final SimpleSymbol Lit197 = ((SimpleSymbol) new SimpleSymbol("random-integer").readResolve());
    static final SimpleSymbol Lit198 = ((SimpleSymbol) new SimpleSymbol("yail-divide").readResolve());
    static final SimpleSymbol Lit199 = ((SimpleSymbol) new SimpleSymbol("degrees->radians-internal").readResolve());
    static final PairWithPosition Lit2 = PairWithPosition.make((SimpleSymbol) new SimpleSymbol("non-coercible").readResolve(), LList.Empty, "/tmp/runtime5720098754470623974.scm", 4136992);
    static final IntNum Lit20 = IntNum.make(30);
    static final SimpleSymbol Lit200 = ((SimpleSymbol) new SimpleSymbol("radians->degrees-internal").readResolve());
    static final SimpleSymbol Lit201 = ((SimpleSymbol) new SimpleSymbol("degrees->radians").readResolve());
    static final SimpleSymbol Lit202 = ((SimpleSymbol) new SimpleSymbol("radians->degrees").readResolve());
    static final SimpleSymbol Lit203 = ((SimpleSymbol) new SimpleSymbol("sin-degrees").readResolve());
    static final SimpleSymbol Lit204 = ((SimpleSymbol) new SimpleSymbol("cos-degrees").readResolve());
    static final SimpleSymbol Lit205 = ((SimpleSymbol) new SimpleSymbol("tan-degrees").readResolve());
    static final SimpleSymbol Lit206 = ((SimpleSymbol) new SimpleSymbol("asin-degrees").readResolve());
    static final SimpleSymbol Lit207 = ((SimpleSymbol) new SimpleSymbol("acos-degrees").readResolve());
    static final SimpleSymbol Lit208 = ((SimpleSymbol) new SimpleSymbol("atan-degrees").readResolve());
    static final SimpleSymbol Lit209 = ((SimpleSymbol) new SimpleSymbol("atan2-degrees").readResolve());
    static final DFloNum Lit21 = DFloNum.make(3.14159265d);
    static final SimpleSymbol Lit210 = ((SimpleSymbol) new SimpleSymbol("string-to-upper-case").readResolve());
    static final SimpleSymbol Lit211 = ((SimpleSymbol) new SimpleSymbol("string-to-lower-case").readResolve());
    static final SimpleSymbol Lit212 = ((SimpleSymbol) new SimpleSymbol("format-as-decimal").readResolve());
    static final SimpleSymbol Lit213 = ((SimpleSymbol) new SimpleSymbol("is-number?").readResolve());
    static final SimpleSymbol Lit214 = ((SimpleSymbol) new SimpleSymbol("is-base10?").readResolve());
    static final SimpleSymbol Lit215 = ((SimpleSymbol) new SimpleSymbol("is-hexadecimal?").readResolve());
    static final SimpleSymbol Lit216 = ((SimpleSymbol) new SimpleSymbol("is-binary?").readResolve());
    static final SimpleSymbol Lit217 = ((SimpleSymbol) new SimpleSymbol("math-convert-dec-hex").readResolve());
    static final SimpleSymbol Lit218 = ((SimpleSymbol) new SimpleSymbol("math-convert-hex-dec").readResolve());
    static final SimpleSymbol Lit219 = ((SimpleSymbol) new SimpleSymbol("math-convert-bin-dec").readResolve());
    static final IntNum Lit22 = IntNum.make(180);
    static final SimpleSymbol Lit220 = ((SimpleSymbol) new SimpleSymbol("math-convert-dec-bin").readResolve());
    static final SimpleSymbol Lit221 = ((SimpleSymbol) new SimpleSymbol("patched-number->string-binary").readResolve());
    static final SimpleSymbol Lit222 = ((SimpleSymbol) new SimpleSymbol("alternate-number->string-binary").readResolve());
    static final SimpleSymbol Lit223 = ((SimpleSymbol) new SimpleSymbol("internal-binary-convert").readResolve());
    static final SimpleSymbol Lit224 = ((SimpleSymbol) new SimpleSymbol("yail-list?").readResolve());
    static final SimpleSymbol Lit225 = ((SimpleSymbol) new SimpleSymbol("yail-list-candidate?").readResolve());
    static final SimpleSymbol Lit226 = ((SimpleSymbol) new SimpleSymbol("yail-list-contents").readResolve());
    static final SimpleSymbol Lit227 = ((SimpleSymbol) new SimpleSymbol("set-yail-list-contents!").readResolve());
    static final SimpleSymbol Lit228 = ((SimpleSymbol) new SimpleSymbol("insert-yail-list-header").readResolve());
    static final SimpleSymbol Lit229 = ((SimpleSymbol) new SimpleSymbol("kawa-list->yail-list").readResolve());
    static final DFloNum Lit23 = DFloNum.make(6.2831853d);
    static final SimpleSymbol Lit230 = ((SimpleSymbol) new SimpleSymbol("yail-list->kawa-list").readResolve());
    static final SimpleSymbol Lit231 = ((SimpleSymbol) new SimpleSymbol("yail-list-empty?").readResolve());
    static final SimpleSymbol Lit232 = ((SimpleSymbol) new SimpleSymbol("make-yail-list").readResolve());
    static final SimpleSymbol Lit233 = ((SimpleSymbol) new SimpleSymbol("yail-list-copy").readResolve());
    static final SimpleSymbol Lit234 = ((SimpleSymbol) new SimpleSymbol("yail-list-reverse").readResolve());
    static final SimpleSymbol Lit235 = ((SimpleSymbol) new SimpleSymbol("yail-list-to-csv-table").readResolve());
    static final SimpleSymbol Lit236 = ((SimpleSymbol) new SimpleSymbol("yail-list-to-csv-row").readResolve());
    static final SimpleSymbol Lit237 = ((SimpleSymbol) new SimpleSymbol("convert-to-strings-for-csv").readResolve());
    static final SimpleSymbol Lit238 = ((SimpleSymbol) new SimpleSymbol("yail-list-from-csv-table").readResolve());
    static final SimpleSymbol Lit239 = ((SimpleSymbol) new SimpleSymbol("yail-list-from-csv-row").readResolve());
    static final DFloNum Lit24 = DFloNum.make(6.2831853d);
    static final SimpleSymbol Lit240 = ((SimpleSymbol) new SimpleSymbol("yail-list-length").readResolve());
    static final SimpleSymbol Lit241 = ((SimpleSymbol) new SimpleSymbol("yail-list-index").readResolve());
    static final SimpleSymbol Lit242 = ((SimpleSymbol) new SimpleSymbol("yail-list-get-item").readResolve());
    static final SimpleSymbol Lit243 = ((SimpleSymbol) new SimpleSymbol("yail-list-set-item!").readResolve());
    static final SimpleSymbol Lit244 = ((SimpleSymbol) new SimpleSymbol("yail-list-remove-item!").readResolve());
    static final SimpleSymbol Lit245 = ((SimpleSymbol) new SimpleSymbol("yail-list-insert-item!").readResolve());
    static final SimpleSymbol Lit246 = ((SimpleSymbol) new SimpleSymbol("yail-list-append!").readResolve());
    static final SimpleSymbol Lit247 = ((SimpleSymbol) new SimpleSymbol("yail-list-add-to-list!").readResolve());
    static final SimpleSymbol Lit248 = ((SimpleSymbol) new SimpleSymbol("yail-list-member?").readResolve());
    static final SimpleSymbol Lit249 = ((SimpleSymbol) new SimpleSymbol("yail-list-pick-random").readResolve());
    static final IntNum Lit25 = IntNum.make(360);
    static final SimpleSymbol Lit250 = ((SimpleSymbol) new SimpleSymbol("yail-for-each").readResolve());
    static final SimpleSymbol Lit251 = ((SimpleSymbol) new SimpleSymbol("yail-for-range").readResolve());
    static final SimpleSymbol Lit252 = ((SimpleSymbol) new SimpleSymbol("yail-for-range-with-numeric-checked-args").readResolve());
    static final SimpleSymbol Lit253 = ((SimpleSymbol) new SimpleSymbol("yail-number-range").readResolve());
    static final SimpleSymbol Lit254 = ((SimpleSymbol) new SimpleSymbol("yail-alist-lookup").readResolve());
    static final SimpleSymbol Lit255 = ((SimpleSymbol) new SimpleSymbol("pair-ok?").readResolve());
    static final SimpleSymbol Lit256 = ((SimpleSymbol) new SimpleSymbol("yail-list-join-with-separator").readResolve());
    static final SimpleSymbol Lit257 = ((SimpleSymbol) new SimpleSymbol("make-disjunct").readResolve());
    static final SimpleSymbol Lit258 = ((SimpleSymbol) new SimpleSymbol("array->list").readResolve());
    static final SimpleSymbol Lit259 = ((SimpleSymbol) new SimpleSymbol("string-starts-at").readResolve());
    static final DFloNum Lit26 = DFloNum.make(1.0E18d);
    static final SimpleSymbol Lit260 = ((SimpleSymbol) new SimpleSymbol("string-contains").readResolve());
    static final SimpleSymbol Lit261 = ((SimpleSymbol) new SimpleSymbol("string-split-at-first").readResolve());
    static final SimpleSymbol Lit262 = ((SimpleSymbol) new SimpleSymbol("string-split-at-first-of-any").readResolve());
    static final SimpleSymbol Lit263 = ((SimpleSymbol) new SimpleSymbol("string-split").readResolve());
    static final SimpleSymbol Lit264 = ((SimpleSymbol) new SimpleSymbol("string-split-at-any").readResolve());
    static final SimpleSymbol Lit265 = ((SimpleSymbol) new SimpleSymbol("string-split-at-spaces").readResolve());
    static final SimpleSymbol Lit266 = ((SimpleSymbol) new SimpleSymbol("string-substring").readResolve());
    static final SimpleSymbol Lit267 = ((SimpleSymbol) new SimpleSymbol("string-trim").readResolve());
    static final SimpleSymbol Lit268 = ((SimpleSymbol) new SimpleSymbol("string-replace-all").readResolve());
    static final SimpleSymbol Lit269 = ((SimpleSymbol) new SimpleSymbol("string-empty?").readResolve());
    static final SimpleSymbol Lit27 = ((SimpleSymbol) new SimpleSymbol("*list*").readResolve());
    static final SimpleSymbol Lit270 = ((SimpleSymbol) new SimpleSymbol("text-deobfuscate").readResolve());
    static final SimpleSymbol Lit271 = ((SimpleSymbol) new SimpleSymbol("make-exact-yail-integer").readResolve());
    static final SimpleSymbol Lit272 = ((SimpleSymbol) new SimpleSymbol("make-color").readResolve());
    static final SimpleSymbol Lit273 = ((SimpleSymbol) new SimpleSymbol("split-color").readResolve());
    static final SimpleSymbol Lit274 = ((SimpleSymbol) new SimpleSymbol("close-screen").readResolve());
    static final SimpleSymbol Lit275 = ((SimpleSymbol) new SimpleSymbol("close-application").readResolve());
    static final SimpleSymbol Lit276 = ((SimpleSymbol) new SimpleSymbol("open-another-screen").readResolve());
    static final SimpleSymbol Lit277 = ((SimpleSymbol) new SimpleSymbol("open-another-screen-with-start-value").readResolve());
    static final SimpleSymbol Lit278 = ((SimpleSymbol) new SimpleSymbol("get-start-value").readResolve());
    static final SimpleSymbol Lit279 = ((SimpleSymbol) new SimpleSymbol("close-screen-with-value").readResolve());
    static final SimpleSymbol Lit28;
    static final SimpleSymbol Lit280 = ((SimpleSymbol) new SimpleSymbol("get-plain-start-text").readResolve());
    static final SimpleSymbol Lit281 = ((SimpleSymbol) new SimpleSymbol("close-screen-with-plain-text").readResolve());
    static final SimpleSymbol Lit282 = ((SimpleSymbol) new SimpleSymbol("get-server-address-from-wifi").readResolve());
    static final SimpleSymbol Lit283 = ((SimpleSymbol) new SimpleSymbol("process-repl-input").readResolve());
    static final SyntaxRules Lit284 = new SyntaxRules(new Object[]{Lit295}, new SyntaxRule[]{new SyntaxRule(new SyntaxPattern("\f\u0018\f\u0007\f\u000f\b", new Object[0], 2), "\u0001\u0001", "\u0011\u0018\u0004\t\u0003\b\u0011\u0018\f\b\u000b", new Object[]{Lit285, Lit306}, 0)}, 2);
    static final SimpleSymbol Lit285 = ((SimpleSymbol) new SimpleSymbol("in-ui").readResolve());
    static final SimpleSymbol Lit286 = ((SimpleSymbol) new SimpleSymbol("send-to-block").readResolve());
    static final SimpleSymbol Lit287 = ((SimpleSymbol) new SimpleSymbol("clear-current-form").readResolve());
    static final SimpleSymbol Lit288 = ((SimpleSymbol) new SimpleSymbol("set-form-name").readResolve());
    static final SimpleSymbol Lit289 = ((SimpleSymbol) new SimpleSymbol("remove-component").readResolve());
    static final IntNum Lit29 = IntNum.make(255);
    static final SimpleSymbol Lit290 = ((SimpleSymbol) new SimpleSymbol("rename-component").readResolve());
    static final SimpleSymbol Lit291 = ((SimpleSymbol) new SimpleSymbol("init-runtime").readResolve());
    static final SimpleSymbol Lit292 = ((SimpleSymbol) new SimpleSymbol("set-this-form").readResolve());
    static final SimpleSymbol Lit293 = ((SimpleSymbol) new SimpleSymbol("clarify").readResolve());
    static final SimpleSymbol Lit294 = ((SimpleSymbol) new SimpleSymbol("clarify1").readResolve());
    static final SimpleSymbol Lit295 = ((SimpleSymbol) new SimpleSymbol("_").readResolve());
    static final SimpleSymbol Lit296 = ((SimpleSymbol) new SimpleSymbol("$lookup$").readResolve());
    static final SimpleSymbol Lit297 = ((SimpleSymbol) new SimpleSymbol(LispLanguage.quasiquote_sym).readResolve());
    static final SimpleSymbol Lit298 = ((SimpleSymbol) new SimpleSymbol("if").readResolve());
    static final SimpleSymbol Lit299 = ((SimpleSymbol) new SimpleSymbol("loop").readResolve());
    static final SimpleSymbol Lit3 = ((SimpleSymbol) new SimpleSymbol("remove").readResolve());
    static final IntNum Lit30 = IntNum.make(8);
    static final SimpleSymbol Lit300 = ((SimpleSymbol) new SimpleSymbol("call-with-current-continuation").readResolve());
    static final SimpleSymbol Lit301 = ((SimpleSymbol) new SimpleSymbol("lambda").readResolve());
    static final SimpleSymbol Lit302 = ((SimpleSymbol) new SimpleSymbol("let").readResolve());
    static final SimpleSymbol Lit303 = ((SimpleSymbol) new SimpleSymbol("begin").readResolve());
    static final SimpleSymbol Lit304 = ((SimpleSymbol) new SimpleSymbol("*yail-loop*").readResolve());
    static final SimpleSymbol Lit305 = ((SimpleSymbol) new SimpleSymbol("proc").readResolve());
    static final SimpleSymbol Lit306 = ((SimpleSymbol) new SimpleSymbol("delay").readResolve());
    static final SimpleSymbol Lit307 = ((SimpleSymbol) new SimpleSymbol("*this-is-the-repl*").readResolve());
    static final SimpleSymbol Lit308 = ((SimpleSymbol) new SimpleSymbol(LispLanguage.quote_sym).readResolve());
    static final SimpleSymbol Lit309 = ((SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve());
    static final SimpleSymbol Lit31;
    static final SimpleSymbol Lit310 = ((SimpleSymbol) new SimpleSymbol("define").readResolve());
    static final SimpleSymbol Lit311 = ((SimpleSymbol) new SimpleSymbol("*").readResolve());
    static final SimpleSymbol Lit312 = ((SimpleSymbol) new SimpleSymbol("object").readResolve());
    static final SimpleSymbol Lit313 = ((SimpleSymbol) new SimpleSymbol("::").readResolve());
    static final SimpleSymbol Lit314 = ((SimpleSymbol) new SimpleSymbol("onCreate").readResolve());
    static final SimpleSymbol Lit315 = ((SimpleSymbol) new SimpleSymbol("icicle").readResolve());
    static final SimpleSymbol Lit316 = ((SimpleSymbol) new SimpleSymbol("*debug-form*").readResolve());
    static final SimpleSymbol Lit317 = ((SimpleSymbol) new SimpleSymbol("message").readResolve());
    static final SimpleSymbol Lit318 = ((SimpleSymbol) new SimpleSymbol("gnu.mapping.Environment").readResolve());
    static final SimpleSymbol Lit319 = ((SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve());
    static final IntNum Lit32 = IntNum.make(24);
    static final SimpleSymbol Lit320 = ((SimpleSymbol) new SimpleSymbol("android-log-form").readResolve());
    static final SimpleSymbol Lit321 = ((SimpleSymbol) new SimpleSymbol("name").readResolve());
    static final SimpleSymbol Lit322 = ((SimpleSymbol) new SimpleSymbol("form-environment").readResolve());
    static final SimpleSymbol Lit323 = ((SimpleSymbol) new SimpleSymbol("gnu.mapping.Symbol").readResolve());
    static final SimpleSymbol Lit324 = ((SimpleSymbol) new SimpleSymbol("default-value").readResolve());
    static final SimpleSymbol Lit325 = ((SimpleSymbol) new SimpleSymbol("isBound").readResolve());
    static final SimpleSymbol Lit326 = ((SimpleSymbol) new SimpleSymbol("make").readResolve());
    static final SimpleSymbol Lit327 = ((SimpleSymbol) new SimpleSymbol("format").readResolve());
    static final SimpleSymbol Lit328 = ((SimpleSymbol) new SimpleSymbol("global-var-environment").readResolve());
    static final SimpleSymbol Lit329 = ((SimpleSymbol) new SimpleSymbol("gnu.lists.LList").readResolve());
    static final IntNum Lit33 = IntNum.make(16);
    static final SimpleSymbol Lit330 = ((SimpleSymbol) new SimpleSymbol("add-to-events").readResolve());
    static final SimpleSymbol Lit331 = ((SimpleSymbol) new SimpleSymbol("events-to-register").readResolve());
    static final SimpleSymbol Lit332 = ((SimpleSymbol) new SimpleSymbol("cons").readResolve());
    static final SimpleSymbol Lit333 = ((SimpleSymbol) new SimpleSymbol("component-name").readResolve());
    static final SimpleSymbol Lit334 = ((SimpleSymbol) new SimpleSymbol("event-name").readResolve());
    static final SimpleSymbol Lit335 = ((SimpleSymbol) new SimpleSymbol("set!").readResolve());
    static final SimpleSymbol Lit336 = ((SimpleSymbol) new SimpleSymbol("components-to-create").readResolve());
    static final SimpleSymbol Lit337 = ((SimpleSymbol) new SimpleSymbol("container-name").readResolve());
    static final SimpleSymbol Lit338 = ((SimpleSymbol) new SimpleSymbol("component-type").readResolve());
    static final SimpleSymbol Lit339 = ((SimpleSymbol) new SimpleSymbol("init-thunk").readResolve());
    static final IntNum Lit34 = IntNum.make(3);
    static final SimpleSymbol Lit340 = ((SimpleSymbol) new SimpleSymbol("global-vars-to-create").readResolve());
    static final SimpleSymbol Lit341 = ((SimpleSymbol) new SimpleSymbol("var").readResolve());
    static final SimpleSymbol Lit342 = ((SimpleSymbol) new SimpleSymbol("val-thunk").readResolve());
    static final SimpleSymbol Lit343 = ((SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve());
    static final SimpleSymbol Lit344 = ((SimpleSymbol) new SimpleSymbol("form-do-after-creation").readResolve());
    static final SimpleSymbol Lit345 = ((SimpleSymbol) new SimpleSymbol("thunk").readResolve());
    static final SimpleSymbol Lit346 = ((SimpleSymbol) new SimpleSymbol("error").readResolve());
    static final SimpleSymbol Lit347 = ((SimpleSymbol) new SimpleSymbol("when").readResolve());
    static final SimpleSymbol Lit348 = ((SimpleSymbol) new SimpleSymbol("this").readResolve());
    static final SimpleSymbol Lit349 = ((SimpleSymbol) new SimpleSymbol("ex").readResolve());
    static final IntNum Lit35 = IntNum.make(4);
    static final SimpleSymbol Lit350 = ((SimpleSymbol) new SimpleSymbol("send-error").readResolve());
    static final SimpleSymbol Lit351 = ((SimpleSymbol) new SimpleSymbol("getMessage").readResolve());
    static final SimpleSymbol Lit352 = ((SimpleSymbol) new SimpleSymbol(GetNamedPart.INSTANCEOF_METHOD_NAME).readResolve());
    static final SimpleSymbol Lit353 = ((SimpleSymbol) new SimpleSymbol("YailRuntimeError").readResolve());
    static final SimpleSymbol Lit354 = ((SimpleSymbol) new SimpleSymbol("as").readResolve());
    static final SimpleSymbol Lit355 = ((SimpleSymbol) new SimpleSymbol("java.lang.String").readResolve());
    static final SimpleSymbol Lit356 = ((SimpleSymbol) new SimpleSymbol("registeredComponentName").readResolve());
    static final SimpleSymbol Lit357 = ((SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve());
    static final SimpleSymbol Lit358 = ((SimpleSymbol) new SimpleSymbol("registeredObject").readResolve());
    static final SimpleSymbol Lit359 = ((SimpleSymbol) new SimpleSymbol("eq?").readResolve());
    static final IntNum Lit36 = IntNum.make(9999);
    static final SimpleSymbol Lit360 = ((SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve());
    static final SimpleSymbol Lit361 = ((SimpleSymbol) new SimpleSymbol("componentObject").readResolve());
    static final SimpleSymbol Lit362 = ((SimpleSymbol) new SimpleSymbol("eventName").readResolve());
    static final SimpleSymbol Lit363 = ((SimpleSymbol) new SimpleSymbol("handler").readResolve());
    static final SimpleSymbol Lit364 = ((SimpleSymbol) new SimpleSymbol("args").readResolve());
    static final SimpleSymbol Lit365 = ((SimpleSymbol) new SimpleSymbol("exception").readResolve());
    static final SimpleSymbol Lit366 = ((SimpleSymbol) new SimpleSymbol("and").readResolve());
    static final SimpleSymbol Lit367 = ((SimpleSymbol) new SimpleSymbol("process-exception").readResolve());
    static final SimpleSymbol Lit368 = ((SimpleSymbol) new SimpleSymbol("printStackTrace").readResolve());
    static final SimpleSymbol Lit369 = ((SimpleSymbol) new SimpleSymbol("com.google.appinventor.components.runtime.EventDispatcher").readResolve());
    static final SimpleSymbol Lit37 = ((SimpleSymbol) new SimpleSymbol("getDhcpInfo").readResolve());
    static final SimpleSymbol Lit370 = ((SimpleSymbol) new SimpleSymbol("com.google.appinventor.components.runtime.HandlesEventDispatching").readResolve());
    static final SimpleSymbol Lit371 = ((SimpleSymbol) new SimpleSymbol("com.google.appinventor.components.runtime.Component").readResolve());
    static final SimpleSymbol Lit372 = ((SimpleSymbol) new SimpleSymbol("java.lang.Object[]").readResolve());
    static final SimpleSymbol Lit373 = ((SimpleSymbol) new SimpleSymbol("void").readResolve());
    static final SimpleSymbol Lit374 = ((SimpleSymbol) new SimpleSymbol("string->symbol").readResolve());
    static final SimpleSymbol Lit375 = ((SimpleSymbol) new SimpleSymbol("string-append").readResolve());
    static final SimpleSymbol Lit376 = ((SimpleSymbol) new SimpleSymbol("get-simple-name").readResolve());
    static final SimpleSymbol Lit377 = ((SimpleSymbol) new SimpleSymbol("handler-symbol").readResolve());
    static final SimpleSymbol Lit378 = ((SimpleSymbol) new SimpleSymbol("try-catch").readResolve());
    static final SimpleSymbol Lit379 = ((SimpleSymbol) new SimpleSymbol("apply").readResolve());
    static final SimpleSymbol Lit38 = ((SimpleSymbol) new SimpleSymbol("post").readResolve());
    static final SimpleSymbol Lit380 = ((SimpleSymbol) new SimpleSymbol("notAlreadyHandled").readResolve());
    static final SimpleSymbol Lit381 = ((SimpleSymbol) new SimpleSymbol("com.google.appinventor.components.runtime.errors.PermissionException").readResolve());
    static final SimpleSymbol Lit382 = ((SimpleSymbol) new SimpleSymbol("equal?").readResolve());
    static final SimpleSymbol Lit383 = ((SimpleSymbol) new SimpleSymbol("PermissionDenied").readResolve());
    static final SimpleSymbol Lit384 = ((SimpleSymbol) new SimpleSymbol("getPermissionNeeded").readResolve());
    static final SimpleSymbol Lit385 = ((SimpleSymbol) new SimpleSymbol("java.lang.Throwable").readResolve());
    static final SimpleSymbol Lit386 = ((SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve());
    static final SimpleSymbol Lit387 = ((SimpleSymbol) new SimpleSymbol("componentName").readResolve());
    static final SimpleSymbol Lit388 = ((SimpleSymbol) new SimpleSymbol("define-alias").readResolve());
    static final SimpleSymbol Lit389 = ((SimpleSymbol) new SimpleSymbol("SimpleEventDispatcher").readResolve());
    static final SimpleSymbol Lit39 = ((SimpleSymbol) new SimpleSymbol("android-log").readResolve());
    static final SimpleSymbol Lit390 = ((SimpleSymbol) new SimpleSymbol("registerEventForDelegation").readResolve());
    static final SimpleSymbol Lit391 = ((SimpleSymbol) new SimpleSymbol("event-info").readResolve());
    static final SimpleSymbol Lit392 = ((SimpleSymbol) new SimpleSymbol("events").readResolve());
    static final SimpleSymbol Lit393 = ((SimpleSymbol) new SimpleSymbol("for-each").readResolve());
    static final SimpleSymbol Lit394 = ((SimpleSymbol) new SimpleSymbol("car").readResolve());
    static final SimpleSymbol Lit395 = ((SimpleSymbol) new SimpleSymbol("var-val").readResolve());
    static final SimpleSymbol Lit396 = ((SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve());
    static final SimpleSymbol Lit397 = ((SimpleSymbol) new SimpleSymbol("var-val-pairs").readResolve());
    static final SimpleSymbol Lit398 = ((SimpleSymbol) new SimpleSymbol("component-info").readResolve());
    static final SimpleSymbol Lit399 = ((SimpleSymbol) new SimpleSymbol("cadr").readResolve());
    static final SimpleSymbol Lit4 = ((SimpleSymbol) new SimpleSymbol("number").readResolve());
    static final SimpleSymbol Lit40;
    static final SimpleSymbol Lit400 = ((SimpleSymbol) new SimpleSymbol("component-container").readResolve());
    static final SimpleSymbol Lit401 = ((SimpleSymbol) new SimpleSymbol("component-object").readResolve());
    static final SimpleSymbol Lit402 = ((SimpleSymbol) new SimpleSymbol("component-descriptors").readResolve());
    static final SimpleSymbol Lit403 = ((SimpleSymbol) new SimpleSymbol("caddr").readResolve());
    static final SimpleSymbol Lit404 = ((SimpleSymbol) new SimpleSymbol("cadddr").readResolve());
    static final SimpleSymbol Lit405 = ((SimpleSymbol) new SimpleSymbol("field").readResolve());
    static final SimpleSymbol Lit406 = ((SimpleSymbol) new SimpleSymbol("symbol->string").readResolve());
    static final SimpleSymbol Lit407 = ((SimpleSymbol) new SimpleSymbol("symbols").readResolve());
    static final SimpleSymbol Lit408 = ((SimpleSymbol) new SimpleSymbol("register-events").readResolve());
    static final SimpleSymbol Lit409 = ((SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve());
    static final SyntaxPattern Lit41 = new SyntaxPattern("\f\u0007\f\u000f\b", new Object[0], 2);
    static final SimpleSymbol Lit410 = ((SimpleSymbol) new SimpleSymbol("reverse").readResolve());
    static final SimpleSymbol Lit411 = ((SimpleSymbol) new SimpleSymbol("create-components").readResolve());
    static final SimpleSymbol Lit412 = ((SimpleSymbol) new SimpleSymbol("components").readResolve());
    static final SimpleSymbol Lit413 = ((SimpleSymbol) new SimpleSymbol("init-global-variables").readResolve());
    static final SimpleSymbol Lit414 = ((SimpleSymbol) new SimpleSymbol("init-components").readResolve());
    static final SimpleSymbol Lit415 = ((SimpleSymbol) new SimpleSymbol("add-to-components").readResolve());
    static final SyntaxTemplate Lit42 = new SyntaxTemplate("\u0001\u0001", "\u000b", new Object[0], 0);
    static final SimpleSymbol Lit43 = ((SimpleSymbol) new SimpleSymbol("add-component").readResolve());
    static final SyntaxRules Lit44;
    static final SimpleSymbol Lit45 = ((SimpleSymbol) new SimpleSymbol("add-component-within-repl").readResolve());
    static final SimpleSymbol Lit46 = ((SimpleSymbol) new SimpleSymbol("call-Initialize-of-components").readResolve());
    static final SimpleSymbol Lit47 = ((SimpleSymbol) new SimpleSymbol("add-init-thunk").readResolve());
    static final SimpleSymbol Lit48 = ((SimpleSymbol) new SimpleSymbol("get-init-thunk").readResolve());
    static final SimpleSymbol Lit49 = ((SimpleSymbol) new SimpleSymbol("clear-init-thunks").readResolve());
    static final SimpleSymbol Lit5 = ((SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve());
    static final SimpleSymbol Lit50 = ((SimpleSymbol) new SimpleSymbol("get-component").readResolve());
    static final SyntaxRules Lit51 = new SyntaxRules(new Object[]{Lit295}, new SyntaxRule[]{new SyntaxRule(new SyntaxPattern("\f\u0018\f\u0007\b", new Object[0], 1), "\u0001", "\u0011\u0018\u0004\b\u0011\u0018\f\b\u0003", new Object[]{Lit110, Lit308}, 0)}, 1);
    static final SimpleSymbol Lit52 = ((SimpleSymbol) new SimpleSymbol("lookup-component").readResolve());
    static final SimpleSymbol Lit53 = ((SimpleSymbol) new SimpleSymbol("set-and-coerce-property!").readResolve());
    static final SimpleSymbol Lit54 = ((SimpleSymbol) new SimpleSymbol("get-property").readResolve());
    static final SimpleSymbol Lit55 = ((SimpleSymbol) new SimpleSymbol("coerce-to-component-and-verify").readResolve());
    static final SimpleSymbol Lit56 = ((SimpleSymbol) new SimpleSymbol("get-property-and-check").readResolve());
    static final SimpleSymbol Lit57 = ((SimpleSymbol) new SimpleSymbol("set-and-coerce-property-and-check!").readResolve());
    static final SimpleSymbol Lit58 = ((SimpleSymbol) new SimpleSymbol("get-var").readResolve());
    static final SyntaxRules Lit59 = new SyntaxRules(new Object[]{Lit295}, new SyntaxRule[]{new SyntaxRule(new SyntaxPattern("\f\u0018\f\u0007\b", new Object[0], 1), "\u0001", "\u0011\u0018\u0004)\u0011\u0018\f\b\u0003\u0018\u0014", new Object[]{Lit114, Lit308, PairWithPosition.make(Lit409, LList.Empty, "/tmp/runtime5720098754470623974.scm", 983103)}, 0)}, 1);
    static final SimpleSymbol Lit6;
    static final SimpleSymbol Lit60 = ((SimpleSymbol) new SimpleSymbol("set-var!").readResolve());
    static final SyntaxRules Lit61 = new SyntaxRules(new Object[]{Lit295}, new SyntaxRule[]{new SyntaxRule(new SyntaxPattern("\f\u0018\f\u0007\f\u000f\b", new Object[0], 2), "\u0001\u0001", "\u0011\u0018\u0004)\u0011\u0018\f\b\u0003\b\u000b", new Object[]{Lit113, Lit308}, 0)}, 2);
    static final SimpleSymbol Lit62 = ((SimpleSymbol) new SimpleSymbol("lexical-value").readResolve());
    static final SyntaxRules Lit63 = new SyntaxRules(new Object[]{Lit295}, new SyntaxRule[]{new SyntaxRule(new SyntaxPattern("\f\u0018\f\u0007\b", new Object[0], 1), "\u0001", "\u0011\u0018\u00049\u0011\u0018\f\t\u0003\u0018\u0014Á\u0011\u0018\u001c\u0011\u0018$\u0011\u0018,I\u0011\u00184\b\u0011\u0018<\b\u0003\u0018D\u0018L\b\u0003", new Object[]{Lit298, Lit352, PairWithPosition.make((SimpleSymbol) new SimpleSymbol("<java.lang.Package>").readResolve(), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1048606), Lit156, Lit375, "The variable ", Lit175, Lit297, PairWithPosition.make(" is not bound in the current context", LList.Empty, "/tmp/runtime5720098754470623974.scm", 1060890), PairWithPosition.make("Unbound Variable", LList.Empty, "/tmp/runtime5720098754470623974.scm", 1064971)}, 0)}, 1);
    static final SimpleSymbol Lit64 = ((SimpleSymbol) new SimpleSymbol("set-lexical!").readResolve());
    static final SyntaxRules Lit65 = new SyntaxRules(new Object[]{Lit295}, new SyntaxRule[]{new SyntaxRule(new SyntaxPattern("\f\u0018\f\u0007\f\u000f\b", new Object[0], 2), "\u0001\u0001", "\u0011\u0018\u0004\t\u0003\b\u000b", new Object[]{Lit335}, 0)}, 2);
    static final SimpleSymbol Lit66 = ((SimpleSymbol) new SimpleSymbol("and-delayed").readResolve());
    static final SyntaxRules Lit67 = new SyntaxRules(new Object[]{Lit295}, new SyntaxRule[]{new SyntaxRule(new SyntaxPattern("\f\u0018\r\u0007\u0000\b\b", new Object[0], 1), "\u0003", "\u0011\u0018\u0004\b\u0005\u0011\u0018\f\t\u0010\b\u0003", new Object[]{Lit190, Lit301}, 1)}, 1);
    static final SimpleSymbol Lit68 = ((SimpleSymbol) new SimpleSymbol("or-delayed").readResolve());
    static final SyntaxRules Lit69 = new SyntaxRules(new Object[]{Lit295}, new SyntaxRule[]{new SyntaxRule(new SyntaxPattern("\f\u0018\r\u0007\u0000\b\b", new Object[0], 1), "\u0003", "\u0011\u0018\u0004\b\u0005\u0011\u0018\f\t\u0010\b\u0003", new Object[]{Lit191, Lit301}, 1)}, 1);
    static final SimpleSymbol Lit7;
    static final SimpleSymbol Lit70 = ((SimpleSymbol) new SimpleSymbol("define-form").readResolve());
    static final SyntaxRules Lit71;
    static final SimpleSymbol Lit72 = ((SimpleSymbol) new SimpleSymbol("define-repl-form").readResolve());
    static final SyntaxRules Lit73 = new SyntaxRules(new Object[]{Lit295}, new SyntaxRule[]{new SyntaxRule(new SyntaxPattern("\f\u0018\f\u0007\f\u000f\b", new Object[0], 2), "\u0001\u0001", "\u0011\u0018\u0004\t\u0003\t\u000b\u0018\f", new Object[]{Lit74, PairWithPosition.make(PairWithPosition.make(Lit308, PairWithPosition.make((SimpleSymbol) new SimpleSymbol("com.google.appinventor.components.runtime.ReplForm").readResolve(), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1224754), "/tmp/runtime5720098754470623974.scm", 1224754), PairWithPosition.make(Boolean.TRUE, PairWithPosition.make(Boolean.FALSE, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1224808), "/tmp/runtime5720098754470623974.scm", 1224805), "/tmp/runtime5720098754470623974.scm", 1224753)}, 0)}, 2);
    static final SimpleSymbol Lit74 = ((SimpleSymbol) new SimpleSymbol("define-form-internal").readResolve());
    static final SyntaxRules Lit75;
    static final SimpleSymbol Lit76;
    static final SimpleSymbol Lit77 = ((SimpleSymbol) new SimpleSymbol("gen-event-name").readResolve());
    static final SyntaxPattern Lit78 = new SyntaxPattern("\f\u0007\f\u000f\f\u0017\b", new Object[0], 3);
    static final SyntaxTemplate Lit79 = new SyntaxTemplate("\u0001\u0001\u0001", "\u0011\u0018\u0004\t\u000b\u0011\u0018\f\b\u0013", new Object[]{Lit76, PairWithPosition.make(Lit308, PairWithPosition.make(Lit92, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2703427), "/tmp/runtime5720098754470623974.scm", 2703427)}, 0);
    static final SimpleSymbol Lit8 = ((SimpleSymbol) new SimpleSymbol("InstantInTime").readResolve());
    static final SimpleSymbol Lit80 = ((SimpleSymbol) new SimpleSymbol("gen-generic-event-name").readResolve());
    static final SyntaxPattern Lit81 = new SyntaxPattern("\f\u0007\f\u000f\f\u0017\b", new Object[0], 3);
    static final SyntaxTemplate Lit82;
    static final SimpleSymbol Lit83;
    static final SyntaxRules Lit84 = new SyntaxRules(new Object[]{Lit295}, new SyntaxRule[]{new SyntaxRule(new SyntaxPattern("\f\u0018\f\u0007,\r\u000f\b\b\b,\r\u0017\u0010\b\b\b", new Object[0], 3), "\u0001\u0003\u0003", "\u0011\u0018\u0004Ù\u0011\u0018\f)\t\u0003\b\r\u000b\b\u0011\u0018\u0014Q\b\r\t\u000b\b\u0011\u0018\u001c\b\u000b\b\u0015\u0013\b\u0011\u0018$\u0011\u0018,Y\u0011\u00184)\u0011\u0018<\b\u0003\b\u0003\b\u0011\u0018D)\u0011\u0018<\b\u0003\b\u0003", new Object[]{Lit303, Lit310, Lit302, Lit152, Lit298, Lit307, Lit109, Lit308, Lit319}, 1)}, 3);
    static final SimpleSymbol Lit85 = ((SimpleSymbol) new SimpleSymbol("*list-for-runtime*").readResolve());
    static final SyntaxRules Lit86;
    static final SimpleSymbol Lit87 = ((SimpleSymbol) new SimpleSymbol("define-event").readResolve());
    static final SyntaxPattern Lit88 = new SyntaxPattern("\f\u0007\f\u000f\f\u0017\f\u001f#", new Object[0], 5);
    static final SyntaxTemplate Lit89 = new SyntaxTemplate("\u0001\u0001\u0001\u0001\u0000", "\u0018\u0004", new Object[]{PairWithPosition.make(Lit303, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2965514)}, 0);
    static final SimpleSymbol Lit9 = ((SimpleSymbol) new SimpleSymbol("component").readResolve());
    static final SyntaxTemplate Lit90 = new SyntaxTemplate("\u0001\u0001\u0001\u0001\u0000", "\u0018\u0004", new Object[]{PairWithPosition.make(Lit83, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2969612)}, 0);
    static final SyntaxTemplate Lit91 = new SyntaxTemplate("\u0001\u0001\u0001\u0001\u0000", "\u000b", new Object[0], 0);
    static final SimpleSymbol Lit92 = ((SimpleSymbol) new SimpleSymbol("$").readResolve());
    static final SyntaxTemplate Lit93 = new SyntaxTemplate("\u0001\u0001\u0001\u0001\u0000", "\u0013", new Object[0], 0);
    static final SyntaxTemplate Lit94 = new SyntaxTemplate("\u0001\u0001\u0001\u0001\u0000", "\t\u001b\b\"", new Object[0], 0);
    static final SyntaxTemplate Lit95 = new SyntaxTemplate("\u0001\u0001\u0001\u0001\u0000", "\b\u0011\u0018\u0004\u0011\u0018\f\u0011\u0018\u0014\u0011\u0018\u001c)\u0011\u0018$\b\u000b\b\u0011\u0018$\b\u0013\b\u0011\u0018,)\u0011\u0018$\b\u000b\b\u0011\u0018$\b\u0013", new Object[]{Lit298, Lit307, PairWithPosition.make(Lit296, Pair.make(Lit369, Pair.make(Pair.make(Lit297, Pair.make(Lit390, LList.Empty)), LList.Empty)), "/tmp/runtime5720098754470623974.scm", 2994193), PairWithPosition.make(Lit354, PairWithPosition.make(Lit370, PairWithPosition.make((SimpleSymbol) new SimpleSymbol("*this-form*").readResolve(), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2998359), "/tmp/runtime5720098754470623974.scm", 2998293), "/tmp/runtime5720098754470623974.scm", 2998289), Lit308, Lit330}, 0);
    static final SimpleSymbol Lit96 = ((SimpleSymbol) new SimpleSymbol("define-generic-event").readResolve());
    static final SyntaxPattern Lit97 = new SyntaxPattern("\f\u0007\f\u000f\f\u0017\f\u001f#", new Object[0], 5);
    static final SyntaxTemplate Lit98 = new SyntaxTemplate("\u0001\u0001\u0001\u0001\u0000", "\u0018\u0004", new Object[]{PairWithPosition.make(Lit303, LList.Empty, "/tmp/runtime5720098754470623974.scm", 3039242)}, 0);
    static final SyntaxTemplate Lit99;
    public static final Class Long = Long.class;
    public static final Class Pattern = Pattern.class;
    public static final Class PermissionException = PermissionException.class;
    public static final Class Short = Short.class;
    public static final ClassType SimpleForm = ClassType.make("com.google.appinventor.components.runtime.Form");
    public static final Class String = String.class;
    public static final Class YailList = YailList.class;
    public static final Class YailNumberToString = YailNumberToString.class;
    public static final Class YailRuntimeError = YailRuntimeError.class;
    public static final ModuleMethod acos$Mndegrees;
    public static final Macro add$Mncomponent = Macro.make(Lit43, Lit44, $instance);
    public static final ModuleMethod add$Mncomponent$Mnwithin$Mnrepl;
    public static final ModuleMethod add$Mnglobal$Mnvar$Mnto$Mncurrent$Mnform$Mnenvironment;
    public static final ModuleMethod add$Mninit$Mnthunk;
    public static final ModuleMethod add$Mnto$Mncurrent$Mnform$Mnenvironment;
    public static final ModuleMethod all$Mncoercible$Qu;
    public static final ModuleMethod alternate$Mnnumber$Mn$Grstring$Mnbinary;
    public static final Macro and$Mndelayed = Macro.make(Lit66, Lit67, $instance);
    public static final ModuleMethod android$Mnlog;
    public static final ModuleMethod appinventor$Mnnumber$Mn$Grstring;
    public static final ModuleMethod array$Mn$Grlist;
    public static final ModuleMethod as$Mnnumber;
    public static final ModuleMethod asin$Mndegrees;
    public static final ModuleMethod atan$Mndegrees;
    public static final ModuleMethod atan2$Mndegrees;
    public static final ModuleMethod boolean$Mn$Grstring;
    public static final ModuleMethod call$MnInitialize$Mnof$Mncomponents;
    public static final ModuleMethod call$Mncomponent$Mnmethod;
    public static final ModuleMethod call$Mncomponent$Mntype$Mnmethod;
    public static final ModuleMethod call$Mnwith$Mncoerced$Mnargs;
    public static final ModuleMethod call$Mnyail$Mnprimitive;
    public static final ModuleMethod clarify;
    public static final ModuleMethod clarify1;
    public static final ModuleMethod clear$Mncurrent$Mnform;
    public static final ModuleMethod clear$Mninit$Mnthunks;
    public static Object clip$Mnto$Mnjava$Mnint$Mnrange;
    public static final ModuleMethod close$Mnapplication;
    public static final ModuleMethod close$Mnscreen;
    public static final ModuleMethod close$Mnscreen$Mnwith$Mnplain$Mntext;
    public static final ModuleMethod close$Mnscreen$Mnwith$Mnvalue;
    public static final ModuleMethod coerce$Mnarg;
    public static final ModuleMethod coerce$Mnargs;
    public static final ModuleMethod coerce$Mnto$Mnboolean;
    public static final ModuleMethod coerce$Mnto$Mncomponent;
    public static final ModuleMethod coerce$Mnto$Mncomponent$Mnand$Mnverify;
    public static final ModuleMethod coerce$Mnto$Mncomponent$Mnof$Mntype;
    public static final ModuleMethod coerce$Mnto$Mninstant;
    public static final ModuleMethod coerce$Mnto$Mnnumber;
    public static final ModuleMethod coerce$Mnto$Mnstring;
    public static final ModuleMethod coerce$Mnto$Mntext;
    public static final ModuleMethod coerce$Mnto$Mnyail$Mnlist;
    public static final ModuleMethod convert$Mnto$Mnstrings$Mnfor$Mncsv;
    public static final ModuleMethod cos$Mndegrees;
    public static final Macro def = Macro.make(Lit105, Lit106, $instance);
    public static final Macro define$Mnevent;
    public static final Macro define$Mnevent$Mnhelper = Macro.make(Lit83, Lit84, $instance);
    public static final Macro define$Mnform = Macro.make(Lit70, Lit71, $instance);
    public static final Macro define$Mnform$Mninternal = Macro.make(Lit74, Lit75, $instance);
    public static final Macro define$Mngeneric$Mnevent;
    public static final Macro define$Mnrepl$Mnform = Macro.make(Lit72, Lit73, $instance);
    public static final ModuleMethod degrees$Mn$Grradians;
    public static final ModuleMethod degrees$Mn$Grradians$Mninternal;
    public static final ModuleMethod delete$Mnfrom$Mncurrent$Mnform$Mnenvironment;
    public static final Macro do$Mnafter$Mnform$Mncreation = Macro.make(Lit107, Lit108, $instance);
    public static final Class errorMessages = ErrorMessages.class;
    public static final Macro foreach;
    public static final Macro foreach$Mnwith$Mnbreak = Macro.make(Lit143, Lit144, $instance);
    public static final ModuleMethod format$Mnas$Mndecimal;
    public static final Macro forrange;
    public static final Macro forrange$Mnwith$Mnbreak = Macro.make(Lit145, Lit146, $instance);
    public static final Macro gen$Mnevent$Mnname;
    public static final Macro gen$Mngeneric$Mnevent$Mnname;
    public static final Macro gen$Mnsimple$Mncomponent$Mntype;
    public static final ModuleMethod generate$Mnruntime$Mntype$Mnerror;
    public static final Macro get$Mncomponent = Macro.make(Lit50, Lit51, $instance);
    public static final ModuleMethod get$Mndisplay$Mnrepresentation;
    public static final ModuleMethod get$Mninit$Mnthunk;
    public static Object get$Mnjson$Mndisplay$Mnrepresentation;
    public static Object get$Mnoriginal$Mndisplay$Mnrepresentation;
    public static final ModuleMethod get$Mnplain$Mnstart$Mntext;
    public static final ModuleMethod get$Mnproperty;
    public static final ModuleMethod get$Mnproperty$Mnand$Mncheck;
    public static final ModuleMethod get$Mnserver$Mnaddress$Mnfrom$Mnwifi;
    public static final ModuleMethod get$Mnstart$Mnvalue;
    public static final Macro get$Mnvar = Macro.make(Lit58, Lit59, $instance);
    static Numeric highest;
    public static final ModuleMethod in$Mnui;
    public static final ModuleMethod init$Mnruntime;
    public static final ModuleMethod insert$Mnyail$Mnlist$Mnheader;
    public static final ModuleMethod internal$Mnbinary$Mnconvert;
    public static final ModuleMethod is$Mnbase10$Qu;
    public static final ModuleMethod is$Mnbinary$Qu;
    public static final ModuleMethod is$Mncoercible$Qu;
    public static final ModuleMethod is$Mnhexadecimal$Qu;
    public static final ModuleMethod is$Mnnumber$Qu;
    public static final ModuleMethod java$Mncollection$Mn$Grkawa$Mnlist;
    public static final ModuleMethod java$Mncollection$Mn$Gryail$Mnlist;
    public static final ModuleMethod join$Mnstrings;
    public static final ModuleMethod kawa$Mnlist$Mn$Gryail$Mnlist;
    static final ModuleMethod lambda$Fn11;
    static final ModuleMethod lambda$Fn4;
    static final ModuleMethod lambda$Fn7;
    public static final Macro lexical$Mnvalue = Macro.make(Lit62, Lit63, $instance);
    public static final ModuleMethod lookup$Mncomponent;
    public static final ModuleMethod lookup$Mnglobal$Mnvar$Mnin$Mncurrent$Mnform$Mnenvironment;
    public static final ModuleMethod lookup$Mnin$Mncurrent$Mnform$Mnenvironment;
    static Numeric lowest;
    public static final ModuleMethod make$Mncolor;
    public static final ModuleMethod make$Mndisjunct;
    public static final ModuleMethod make$Mnexact$Mnyail$Mninteger;
    public static final ModuleMethod make$Mnyail$Mnlist;
    public static final ModuleMethod math$Mnconvert$Mnbin$Mndec;
    public static final ModuleMethod math$Mnconvert$Mndec$Mnbin;
    public static final ModuleMethod math$Mnconvert$Mndec$Mnhex;
    public static final ModuleMethod math$Mnconvert$Mnhex$Mndec;
    public static final ModuleMethod open$Mnanother$Mnscreen;
    public static final ModuleMethod open$Mnanother$Mnscreen$Mnwith$Mnstart$Mnvalue;
    public static final Macro or$Mndelayed = Macro.make(Lit68, Lit69, $instance);
    public static final ModuleMethod padded$Mnstring$Mn$Grnumber;
    public static final ModuleMethod pair$Mnok$Qu;
    public static final ModuleMethod patched$Mnnumber$Mn$Grstring$Mnbinary;
    public static final ModuleMethod process$Mnand$Mndelayed;
    public static final ModuleMethod process$Mnor$Mndelayed;
    public static final Macro process$Mnrepl$Mninput = Macro.make(Lit283, Lit284, $instance);
    public static final ModuleMethod radians$Mn$Grdegrees;
    public static final ModuleMethod radians$Mn$Grdegrees$Mninternal;
    public static final ModuleMethod random$Mnfraction;
    public static final ModuleMethod random$Mninteger;
    public static final ModuleMethod random$Mnset$Mnseed;
    public static final ModuleMethod remove$Mncomponent;
    public static final ModuleMethod rename$Mncomponent;
    public static final ModuleMethod rename$Mnin$Mncurrent$Mnform$Mnenvironment;
    public static final ModuleMethod reset$Mncurrent$Mnform$Mnenvironment;
    public static final ModuleMethod sanitize$Mnatomic;
    public static final ModuleMethod sanitize$Mncomponent$Mndata;
    public static final ModuleMethod send$Mnto$Mnblock;
    public static final ModuleMethod set$Mnand$Mncoerce$Mnproperty$Ex;
    public static final ModuleMethod set$Mnand$Mncoerce$Mnproperty$Mnand$Mncheck$Ex;
    public static final ModuleMethod set$Mnform$Mnname;
    public static final Macro set$Mnlexical$Ex = Macro.make(Lit64, Lit65, $instance);
    public static final ModuleMethod set$Mnthis$Mnform;
    public static final Macro set$Mnvar$Ex = Macro.make(Lit60, Lit61, $instance);
    public static final ModuleMethod set$Mnyail$Mnlist$Mncontents$Ex;
    public static final ModuleMethod show$Mnarglist$Mnno$Mnparens;
    public static final ModuleMethod signal$Mnruntime$Mnerror;
    public static final ModuleMethod signal$Mnruntime$Mnform$Mnerror;
    public static final String simple$Mncomponent$Mnpackage$Mnname = "com.google.appinventor.components.runtime";
    public static final ModuleMethod sin$Mndegrees;
    public static final ModuleMethod split$Mncolor;
    public static final ModuleMethod string$Mncontains;
    public static final ModuleMethod string$Mnempty$Qu;
    public static final ModuleMethod string$Mnreplace;
    public static final ModuleMethod string$Mnreplace$Mnall;
    public static final ModuleMethod string$Mnsplit;
    public static final ModuleMethod string$Mnsplit$Mnat$Mnany;
    public static final ModuleMethod string$Mnsplit$Mnat$Mnfirst;
    public static final ModuleMethod string$Mnsplit$Mnat$Mnfirst$Mnof$Mnany;
    public static final ModuleMethod string$Mnsplit$Mnat$Mnspaces;
    public static final ModuleMethod string$Mnstarts$Mnat;
    public static final ModuleMethod string$Mnsubstring;
    public static final ModuleMethod string$Mnto$Mnlower$Mncase;
    public static final ModuleMethod string$Mnto$Mnupper$Mncase;
    public static final ModuleMethod string$Mntrim;
    public static final ModuleMethod symbol$Mnappend;
    public static final ModuleMethod tan$Mndegrees;
    public static final ModuleMethod text$Mndeobfuscate;
    public static final ModuleMethod type$Mn$Grclass;
    public static final Macro use$Mnjson$Mnformat = Macro.make(Lit172, Lit173, $instance);

    /* renamed from: while reason: not valid java name */
    public static final Macro f258while;
    public static final Macro while$Mnwith$Mnbreak = Macro.make(Lit147, Lit148, $instance);
    public static final ModuleMethod yail$Mnalist$Mnlookup;
    public static final ModuleMethod yail$Mnatomic$Mnequal$Qu;
    public static final ModuleMethod yail$Mnceiling;
    public static final ModuleMethod yail$Mndivide;
    public static final ModuleMethod yail$Mnequal$Qu;
    public static final ModuleMethod yail$Mnfloor;
    public static final ModuleMethod yail$Mnfor$Mneach;
    public static final ModuleMethod yail$Mnfor$Mnrange;
    public static final ModuleMethod yail$Mnfor$Mnrange$Mnwith$Mnnumeric$Mnchecked$Mnargs;
    public static final ModuleMethod yail$Mnlist$Mn$Grkawa$Mnlist;
    public static final ModuleMethod yail$Mnlist$Mnadd$Mnto$Mnlist$Ex;
    public static final ModuleMethod yail$Mnlist$Mnappend$Ex;
    public static final ModuleMethod yail$Mnlist$Mncandidate$Qu;
    public static final ModuleMethod yail$Mnlist$Mncontents;
    public static final ModuleMethod yail$Mnlist$Mncopy;
    public static final ModuleMethod yail$Mnlist$Mnempty$Qu;
    public static final ModuleMethod yail$Mnlist$Mnfrom$Mncsv$Mnrow;
    public static final ModuleMethod yail$Mnlist$Mnfrom$Mncsv$Mntable;
    public static final ModuleMethod yail$Mnlist$Mnget$Mnitem;
    public static final ModuleMethod yail$Mnlist$Mnindex;
    public static final ModuleMethod yail$Mnlist$Mninsert$Mnitem$Ex;
    public static final ModuleMethod yail$Mnlist$Mnjoin$Mnwith$Mnseparator;
    public static final ModuleMethod yail$Mnlist$Mnlength;
    public static final ModuleMethod yail$Mnlist$Mnmember$Qu;
    public static final ModuleMethod yail$Mnlist$Mnpick$Mnrandom;
    public static final ModuleMethod yail$Mnlist$Mnremove$Mnitem$Ex;
    public static final ModuleMethod yail$Mnlist$Mnreverse;
    public static final ModuleMethod yail$Mnlist$Mnset$Mnitem$Ex;
    public static final ModuleMethod yail$Mnlist$Mnto$Mncsv$Mnrow;
    public static final ModuleMethod yail$Mnlist$Mnto$Mncsv$Mntable;
    public static final ModuleMethod yail$Mnlist$Qu;
    public static final ModuleMethod yail$Mnnot;
    public static final ModuleMethod yail$Mnnot$Mnequal$Qu;
    public static final ModuleMethod yail$Mnnumber$Mnrange;
    public static final ModuleMethod yail$Mnround;

    /* renamed from: com.google.youngandroid.runtime$frame */
    /* compiled from: runtime5720098754470623974.scm */
    public class frame extends ModuleBody {
        Object component$Mnname;
        Object component$Mnto$Mnadd;
        Object existing$Mncomponent;
        Object init$Mnprops$Mnthunk;
        final ModuleMethod lambda$Fn1;

        public frame() {
            ModuleMethod moduleMethod = new ModuleMethod(this, 1, null, 0);
            moduleMethod.setProperty("source-location", "/tmp/runtime5720098754470623974.scm:99");
            this.lambda$Fn1 = moduleMethod;
        }

        public Object apply0(ModuleMethod moduleMethod) {
            return moduleMethod.selector == 1 ? lambda1() : super.apply0(moduleMethod);
        }

        /* access modifiers changed from: 0000 */
        public Object lambda1() {
            if (this.init$Mnprops$Mnthunk != Boolean.FALSE) {
                Scheme.applyToArgs.apply1(this.init$Mnprops$Mnthunk);
            }
            if (this.existing$Mncomponent == Boolean.FALSE) {
                return Values.empty;
            }
            C0593runtime.androidLog(Format.formatToString(0, "Copying component properties for ~A", this.component$Mnname));
            Object obj = this.existing$Mncomponent;
            try {
                Component component = (Component) obj;
                Object obj2 = this.component$Mnto$Mnadd;
                try {
                    return PropertyUtil.copyComponentProperties(component, (Component) obj2);
                } catch (ClassCastException e) {
                    throw new WrongType(e, "com.google.appinventor.components.runtime.util.PropertyUtil.copyComponentProperties(com.google.appinventor.components.runtime.Component,com.google.appinventor.components.runtime.Component)", 2, obj2);
                }
            } catch (ClassCastException e2) {
                throw new WrongType(e2, "com.google.appinventor.components.runtime.util.PropertyUtil.copyComponentProperties(com.google.appinventor.components.runtime.Component,com.google.appinventor.components.runtime.Component)", 1, obj);
            }
        }

        public int match0(ModuleMethod moduleMethod, CallContext callContext) {
            if (moduleMethod.selector != 1) {
                return super.match0(moduleMethod, callContext);
            }
            callContext.proc = moduleMethod;
            callContext.f231pc = 0;
            return 0;
        }
    }

    /* renamed from: com.google.youngandroid.runtime$frame0 */
    /* compiled from: runtime5720098754470623974.scm */
    public class frame0 extends ModuleBody {
        Object arg;
        final ModuleMethod lambda$Fn2;
        final ModuleMethod lambda$Fn3;
        LList pieces;

        public frame0() {
            ModuleMethod moduleMethod = new ModuleMethod(this, 2, null, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            moduleMethod.setProperty("source-location", "/tmp/runtime5720098754470623974.scm:1393");
            this.lambda$Fn2 = moduleMethod;
            ModuleMethod moduleMethod2 = new ModuleMethod(this, 3, null, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            moduleMethod2.setProperty("source-location", "/tmp/runtime5720098754470623974.scm:1394");
            this.lambda$Fn3 = moduleMethod2;
        }

        /* access modifiers changed from: 0000 */
        public void lambda2(Object port) {
            ports.display(this.pieces, port);
        }

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 2:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 1;
                    return 0;
                case 3:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 1;
                    return 0;
                default:
                    return super.match1(moduleMethod, obj, callContext);
            }
        }

        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            switch (moduleMethod.selector) {
                case 2:
                    lambda2(obj);
                    return Values.empty;
                case 3:
                    lambda3(obj);
                    return Values.empty;
                default:
                    return super.apply1(moduleMethod, obj);
            }
        }

        /* access modifiers changed from: 0000 */
        public void lambda3(Object port) {
            ports.display(this.arg, port);
        }
    }

    /* renamed from: com.google.youngandroid.runtime$frame1 */
    /* compiled from: runtime5720098754470623974.scm */
    public class frame1 extends ModuleBody {
        Object arg;
        final ModuleMethod lambda$Fn5;
        final ModuleMethod lambda$Fn6;
        LList pieces;

        public frame1() {
            ModuleMethod moduleMethod = new ModuleMethod(this, 4, null, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            moduleMethod.setProperty("source-location", "/tmp/runtime5720098754470623974.scm:1428");
            this.lambda$Fn5 = moduleMethod;
            ModuleMethod moduleMethod2 = new ModuleMethod(this, 5, null, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            moduleMethod2.setProperty("source-location", "/tmp/runtime5720098754470623974.scm:1429");
            this.lambda$Fn6 = moduleMethod2;
        }

        /* access modifiers changed from: 0000 */
        public void lambda5(Object port) {
            ports.display(this.pieces, port);
        }

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 4:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 1;
                    return 0;
                case 5:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 1;
                    return 0;
                default:
                    return super.match1(moduleMethod, obj, callContext);
            }
        }

        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            switch (moduleMethod.selector) {
                case 4:
                    lambda5(obj);
                    return Values.empty;
                case 5:
                    lambda6(obj);
                    return Values.empty;
                default:
                    return super.apply1(moduleMethod, obj);
            }
        }

        /* access modifiers changed from: 0000 */
        public void lambda6(Object port) {
            ports.display(this.arg, port);
        }
    }

    /* renamed from: com.google.youngandroid.runtime$frame2 */
    /* compiled from: runtime5720098754470623974.scm */
    public class frame2 extends ModuleBody {
        Object arg;
        final ModuleMethod lambda$Fn8;

        public frame2() {
            ModuleMethod moduleMethod = new ModuleMethod(this, 6, null, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            moduleMethod.setProperty("source-location", "/tmp/runtime5720098754470623974.scm:1449");
            this.lambda$Fn8 = moduleMethod;
        }

        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            if (moduleMethod.selector != 6) {
                return super.apply1(moduleMethod, obj);
            }
            lambda8(obj);
            return Values.empty;
        }

        /* access modifiers changed from: 0000 */
        public void lambda8(Object port) {
            ports.display(this.arg, port);
        }

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            if (moduleMethod.selector != 6) {
                return super.match1(moduleMethod, obj, callContext);
            }
            callContext.value1 = obj;
            callContext.proc = moduleMethod;
            callContext.f231pc = 1;
            return 0;
        }
    }

    /* renamed from: com.google.youngandroid.runtime$frame3 */
    /* compiled from: runtime5720098754470623974.scm */
    public class frame3 extends ModuleBody {
        final ModuleMethod lambda$Fn10;
        final ModuleMethod lambda$Fn9;

        /* renamed from: n */
        Object f45n;

        public frame3() {
            ModuleMethod moduleMethod = new ModuleMethod(this, 7, null, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            moduleMethod.setProperty("source-location", "/tmp/runtime5720098754470623974.scm:1562");
            this.lambda$Fn9 = moduleMethod;
            ModuleMethod moduleMethod2 = new ModuleMethod(this, 8, null, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            moduleMethod2.setProperty("source-location", "/tmp/runtime5720098754470623974.scm:1570");
            this.lambda$Fn10 = moduleMethod2;
        }

        /* access modifiers changed from: 0000 */
        public void lambda9(Object port) {
            ports.display(this.f45n, port);
        }

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 7:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 1;
                    return 0;
                case 8:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 1;
                    return 0;
                default:
                    return super.match1(moduleMethod, obj, callContext);
            }
        }

        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            switch (moduleMethod.selector) {
                case 7:
                    lambda9(obj);
                    return Values.empty;
                case 8:
                    lambda10(obj);
                    return Values.empty;
                default:
                    return super.apply1(moduleMethod, obj);
            }
        }

        /* access modifiers changed from: 0000 */
        public void lambda10(Object port) {
            Object obj = this.f45n;
            try {
                ports.display(numbers.exact((Number) obj), port);
            } catch (ClassCastException e) {
                throw new WrongType(e, "exact", 1, obj);
            }
        }
    }

    /* renamed from: com.google.youngandroid.runtime$frame4 */
    /* compiled from: runtime5720098754470623974.scm */
    public class frame4 extends ModuleBody {
        final ModuleMethod cont$Fn12 = new ModuleMethod(this, 9, C0593runtime.Lit31, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);

        /* renamed from: lc */
        Object f46lc;
        Object text;

        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            return moduleMethod.selector == 9 ? lambda14cont(obj) : super.apply1(moduleMethod, obj);
        }

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            if (moduleMethod.selector != 9) {
                return super.match1(moduleMethod, obj, callContext);
            }
            callContext.value1 = obj;
            callContext.proc = moduleMethod;
            callContext.f231pc = 1;
            return 0;
        }

        public Object lambda14cont(Object $Styail$Mnbreak$St) {
            while (true) {
                Object obj = this.f46lc;
                try {
                    int stringLength = strings.stringLength((CharSequence) obj);
                    Object obj2 = this.text;
                    try {
                        if (stringLength >= strings.stringLength((CharSequence) obj2)) {
                            return null;
                        }
                        this.f46lc = strings.stringAppend(this.f46lc, this.f46lc);
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "string-length", 1, obj2);
                    }
                } catch (ClassCastException e2) {
                    throw new WrongType(e2, "string-length", 1, obj);
                }
            }
        }
    }

    /* renamed from: com.google.youngandroid.runtime$frame5 */
    /* compiled from: runtime5720098754470623974.scm */
    public class frame5 extends ModuleBody {
        Object blockid;
        final ModuleMethod lambda$Fn13;
        Object promise;

        public frame5() {
            ModuleMethod moduleMethod = new ModuleMethod(this, 10, null, 0);
            moduleMethod.setProperty("source-location", "/tmp/runtime5720098754470623974.scm:2723");
            this.lambda$Fn13 = moduleMethod;
        }

        public Object apply0(ModuleMethod moduleMethod) {
            return moduleMethod.selector == 10 ? lambda15() : super.apply0(moduleMethod);
        }

        /* access modifiers changed from: 0000 */
        public Object lambda15() {
            String message;
            Pair list2;
            Object obj = this.blockid;
            try {
                list2 = LList.list2("OK", C0593runtime.getDisplayRepresentation(misc.force(this.promise)));
            } catch (PermissionException exception) {
                exception.printStackTrace();
                list2 = LList.list2("NOK", strings.stringAppend("Failed due to missing permission: ", exception.getPermissionNeeded()));
            } catch (YailRuntimeError exception2) {
                C0593runtime.androidLog(exception2.getMessage());
                list2 = LList.list2("NOK", exception2.getMessage());
            } catch (Throwable exception3) {
                C0593runtime.androidLog(exception3.getMessage());
                exception3.printStackTrace();
                String str = "NOK";
                if (exception3 instanceof Error) {
                    message = exception3.toString();
                } else {
                    message = exception3.getMessage();
                }
                list2 = LList.list2(str, message);
            }
            return C0593runtime.sendToBlock(obj, list2);
        }

        public int match0(ModuleMethod moduleMethod, CallContext callContext) {
            if (moduleMethod.selector != 10) {
                return super.match0(moduleMethod, callContext);
            }
            callContext.proc = moduleMethod;
            callContext.f231pc = 0;
            return 0;
        }
    }

    public C0593runtime() {
        ModuleInfo.register(this);
    }

    public static Object lookupGlobalVarInCurrentFormEnvironment(Symbol symbol) {
        return lookupGlobalVarInCurrentFormEnvironment(symbol, Boolean.FALSE);
    }

    public static Object lookupInCurrentFormEnvironment(Symbol symbol) {
        return lookupInCurrentFormEnvironment(symbol, Boolean.FALSE);
    }

    public final void run(CallContext $ctx) {
        Consumer consumer = $ctx.consumer;
        $Stdebug$St = Boolean.FALSE;
        $Stthis$Mnis$Mnthe$Mnrepl$St = Boolean.FALSE;
        $Sttesting$St = Boolean.FALSE;
        $Stinit$Mnthunk$Mnenvironment$St = Environment.make("init-thunk-environment");
        $Sttest$Mnenvironment$St = Environment.make("test-env");
        $Sttest$Mnglobal$Mnvar$Mnenvironment$St = Environment.make("test-global-var-env");
        $Stthe$Mnnull$Mnvalue$St = null;
        $Stthe$Mnnull$Mnvalue$Mnprinted$Mnrep$St = "*nothing*";
        $Stthe$Mnempty$Mnstring$Mnprinted$Mnrep$St = "*empty-string*";
        $Stnon$Mncoercible$Mnvalue$St = Lit2;
        $Stjava$Mnexception$Mnmessage$St = "An internal system error occurred: ";
        get$Mnoriginal$Mndisplay$Mnrepresentation = lambda$Fn4;
        get$Mnjson$Mndisplay$Mnrepresentation = lambda$Fn7;
        $Strandom$Mnnumber$Mngenerator$St = new Random();
        Object apply2 = AddOp.$Mn.apply2(expt.expt((Object) Lit19, (Object) Lit20), Lit17);
        try {
            highest = (Numeric) apply2;
            Object apply1 = AddOp.$Mn.apply1(highest);
            try {
                lowest = (Numeric) apply1;
                clip$Mnto$Mnjava$Mnint$Mnrange = lambda$Fn11;
                ERROR_DIVISION_BY_ZERO = Integer.valueOf(ErrorMessages.ERROR_DIVISION_BY_ZERO);
                $Stpi$St = Lit21;
                $Styail$Mnlist$St = Lit27;
                $Stmax$Mncolor$Mncomponent$St = numbers.exact(Lit29);
                $Stcolor$Mnalpha$Mnposition$St = numbers.exact(Lit32);
                $Stcolor$Mnred$Mnposition$St = numbers.exact(Lit33);
                $Stcolor$Mngreen$Mnposition$St = numbers.exact(Lit30);
                $Stcolor$Mnblue$Mnposition$St = numbers.exact(Lit18);
                $Stalpha$Mnopaque$St = numbers.exact(Lit29);
                $Strun$Mntelnet$Mnrepl$St = Boolean.TRUE;
                $Stnum$Mnconnections$St = Lit17;
                $Strepl$Mnserver$Mnaddress$St = "NONE";
                $Strepl$Mnport$St = Lit36;
                $Stui$Mnhandler$St = null;
                $Stthis$Mnform$St = null;
            } catch (ClassCastException e) {
                throw new WrongType(e, "lowest", -2, apply1);
            }
        } catch (ClassCastException e2) {
            throw new WrongType(e2, "highest", -2, apply2);
        }
    }

    public static void androidLog(Object message) {
    }

    public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
        switch (moduleMethod.selector) {
            case 11:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 12:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 16:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 18:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 21:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 25:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 26:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 27:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 28:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 30:
                if (!(obj instanceof Symbol)) {
                    return -786431;
                }
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 32:
                if (!(obj instanceof Symbol)) {
                    return -786431;
                }
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 35:
                if (!(obj instanceof Symbol)) {
                    return -786431;
                }
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 39:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 45:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 46:
                if (!(obj instanceof Collection)) {
                    return -786431;
                }
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 47:
                if (!(obj instanceof Collection)) {
                    return -786431;
                }
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 48:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 51:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 56:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 59:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 60:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 61:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 63:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 64:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 65:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 66:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 67:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 68:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 71:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 72:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 73:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 74:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 75:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 76:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 77:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 78:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 81:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 85:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 86:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 87:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 88:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 91:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 93:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 94:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 95:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 96:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 97:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 98:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 99:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 100:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 101:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 102:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 104:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 105:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 107:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 108:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 109:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 110:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 111:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 112:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 113:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 114:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 115:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 116:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 117:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 118:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 119:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 120:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 122:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 123:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 124:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 125:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 127:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 128:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 129:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 130:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 131:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 132:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 133:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 134:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 143:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 149:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 151:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 152:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 159:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 161:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 163:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 165:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 166:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 167:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 170:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 173:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 175:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 180:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 181:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case YaVersion.YOUNG_ANDROID_VERSION /*185*/:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            case 186:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.f231pc = 1;
                return 0;
            default:
                return super.match1(moduleMethod, obj, callContext);
        }
    }

    static {
        Object[] objArr = {Lit295};
        SimpleSymbol simpleSymbol = Lit298;
        SimpleSymbol simpleSymbol2 = (SimpleSymbol) new SimpleSymbol("*testing*").readResolve();
        Boolean bool = Boolean.TRUE;
        PairWithPosition make = PairWithPosition.make(Lit296, Pair.make(Lit311, Pair.make(Pair.make(Lit297, Pair.make((SimpleSymbol) new SimpleSymbol("ShowListsAsJson").readResolve(), LList.Empty)), LList.Empty)), "/tmp/runtime5720098754470623974.scm", 5652491);
        SimpleSymbol simpleSymbol3 = Lit296;
        SimpleSymbol simpleSymbol4 = simpleSymbol3;
        PairWithPosition pairWithPosition = make;
        Boolean bool2 = bool;
        SimpleSymbol simpleSymbol5 = simpleSymbol;
        Lit173 = new SyntaxRules(objArr, new SyntaxRule[]{new SyntaxRule(new SyntaxPattern("\f\u0018\b", new Object[0], 0), "", "\u0018\u0004", new Object[]{PairWithPosition.make(simpleSymbol5, PairWithPosition.make(simpleSymbol2, PairWithPosition.make(bool2, PairWithPosition.make(PairWithPosition.make(pairWithPosition, PairWithPosition.make(PairWithPosition.make(PairWithPosition.make(simpleSymbol4, Pair.make((SimpleSymbol) new SimpleSymbol("SimpleForm").readResolve(), Pair.make(Pair.make(Lit297, Pair.make((SimpleSymbol) new SimpleSymbol("getActiveForm").readResolve(), LList.Empty)), LList.Empty)), "/tmp/runtime5720098754470623974.scm", 5652510), LList.Empty, "/tmp/runtime5720098754470623974.scm", 5652509), LList.Empty, "/tmp/runtime5720098754470623974.scm", 5652509), "/tmp/runtime5720098754470623974.scm", 5652490), LList.Empty, "/tmp/runtime5720098754470623974.scm", 5652490), "/tmp/runtime5720098754470623974.scm", 5648404), "/tmp/runtime5720098754470623974.scm", 5648394), "/tmp/runtime5720098754470623974.scm", 5648390)}, 0)}, 0);
        SimpleSymbol simpleSymbol6 = Lit300;
        SimpleSymbol simpleSymbol7 = (SimpleSymbol) new SimpleSymbol("cont").readResolve();
        Lit31 = simpleSymbol7;
        Lit142 = PairWithPosition.make(PairWithPosition.make(simpleSymbol6, PairWithPosition.make(simpleSymbol7, LList.Empty, "/tmp/runtime5720098754470623974.scm", 3735590), "/tmp/runtime5720098754470623974.scm", 3735558), LList.Empty, "/tmp/runtime5720098754470623974.scm", 3735558);
        SimpleSymbol simpleSymbol8 = (SimpleSymbol) new SimpleSymbol("*yail-break*").readResolve();
        Lit124 = simpleSymbol8;
        Lit135 = PairWithPosition.make(simpleSymbol8, LList.Empty, "/tmp/runtime5720098754470623974.scm", 3711000);
        SimpleSymbol simpleSymbol9 = (SimpleSymbol) new SimpleSymbol("define-event-helper").readResolve();
        Lit83 = simpleSymbol9;
        Lit99 = new SyntaxTemplate("\u0001\u0001\u0001\u0001\u0000", "\u0018\u0004", new Object[]{PairWithPosition.make(simpleSymbol9, LList.Empty, "/tmp/runtime5720098754470623974.scm", 3043340)}, 0);
        Object[] objArr2 = {Lit295};
        SimpleSymbol simpleSymbol10 = (SimpleSymbol) new SimpleSymbol("list").readResolve();
        Lit7 = simpleSymbol10;
        Lit86 = new SyntaxRules(objArr2, new SyntaxRule[]{new SyntaxRule(new SyntaxPattern("\f\u0018\r\u0007\u0000\b\b", new Object[0], 1), "\u0003", "\u0011\u0018\u0004\b\u0005\u0003", new Object[]{simpleSymbol10}, 1)}, 1);
        SimpleSymbol simpleSymbol11 = (SimpleSymbol) new SimpleSymbol("symbol-append").readResolve();
        Lit76 = simpleSymbol11;
        Lit82 = new SyntaxTemplate("\u0001\u0001\u0001", "\u0011\u0018\u0004\u0011\u0018\f\t\u000b\u0011\u0018\u0014\b\u0013", new Object[]{simpleSymbol11, PairWithPosition.make(Lit308, PairWithPosition.make(Lit100, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2736180), "/tmp/runtime5720098754470623974.scm", 2736180), PairWithPosition.make(Lit308, PairWithPosition.make(Lit92, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2736201), "/tmp/runtime5720098754470623974.scm", 2736201)}, 0);
        Object[] objArr3 = {Lit295};
        SimpleSymbol simpleSymbol12 = Lit310;
        PairWithPosition make2 = PairWithPosition.make(Lit376, PairWithPosition.make(Lit312, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1269793), "/tmp/runtime5720098754470623974.scm", 1269776);
        PairWithPosition make3 = PairWithPosition.make(PairWithPosition.make(PairWithPosition.make(Lit296, Pair.make(Lit311, Pair.make(Pair.make(Lit297, Pair.make((SimpleSymbol) new SimpleSymbol("getSimpleName").readResolve(), LList.Empty)), LList.Empty)), "/tmp/runtime5720098754470623974.scm", 1273867), PairWithPosition.make(PairWithPosition.make(PairWithPosition.make(Lit296, Pair.make(Lit311, Pair.make(Pair.make(Lit297, Pair.make((SimpleSymbol) new SimpleSymbol("getClass").readResolve(), LList.Empty)), LList.Empty)), "/tmp/runtime5720098754470623974.scm", 1273884), PairWithPosition.make(Lit312, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1273895), "/tmp/runtime5720098754470623974.scm", 1273883), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1273883), "/tmp/runtime5720098754470623974.scm", 1273866), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1273866);
        SimpleSymbol simpleSymbol13 = Lit314;
        SimpleSymbol simpleSymbol14 = Lit315;
        PairWithPosition make4 = PairWithPosition.make(Lit313, PairWithPosition.make((SimpleSymbol) new SimpleSymbol("android.os.Bundle").readResolve(), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1282084), "/tmp/runtime5720098754470623974.scm", 1282081);
        SimpleSymbol simpleSymbol15 = Lit296;
        SimpleSymbol simpleSymbol16 = (SimpleSymbol) new SimpleSymbol("com.google.appinventor.components.runtime.AppInventorCompatActivity").readResolve();
        SimpleSymbol simpleSymbol17 = Lit297;
        Pair make5 = Pair.make((SimpleSymbol) new SimpleSymbol("setClassicModeFromYail").readResolve(), LList.Empty);
        SimpleSymbol simpleSymbol18 = simpleSymbol15;
        SimpleSymbol simpleSymbol19 = Lit310;
        PairWithPosition make6 = PairWithPosition.make(Lit320, PairWithPosition.make(Lit317, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1310754), "/tmp/runtime5720098754470623974.scm", 1310736);
        SimpleSymbol simpleSymbol20 = Lit347;
        SimpleSymbol simpleSymbol21 = Lit316;
        SimpleSymbol simpleSymbol22 = Lit296;
        SimpleSymbol simpleSymbol23 = simpleSymbol22;
        PairWithPosition make7 = PairWithPosition.make(simpleSymbol23, Pair.make((SimpleSymbol) new SimpleSymbol("android.util.Log").readResolve(), Pair.make(Pair.make(Lit297, Pair.make((SimpleSymbol) new SimpleSymbol("i").readResolve(), LList.Empty)), LList.Empty)), "/tmp/runtime5720098754470623974.scm", 1314846);
        PairWithPosition make8 = PairWithPosition.make(Lit317, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1314872);
        SimpleSymbol simpleSymbol24 = simpleSymbol21;
        SimpleSymbol simpleSymbol25 = simpleSymbol20;
        PairWithPosition pairWithPosition2 = make6;
        SimpleSymbol simpleSymbol26 = simpleSymbol19;
        SimpleSymbol simpleSymbol27 = Lit310;
        PairWithPosition make9 = PairWithPosition.make(Lit319, PairWithPosition.make(Lit321, PairWithPosition.make(Lit313, PairWithPosition.make(Lit323, PairWithPosition.make(Lit312, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1347652), "/tmp/runtime5720098754470623974.scm", 1347633), "/tmp/runtime5720098754470623974.scm", 1347630), "/tmp/runtime5720098754470623974.scm", 1347625), "/tmp/runtime5720098754470623974.scm", 1347600);
        PairWithPosition make10 = PairWithPosition.make(Lit320, PairWithPosition.make(PairWithPosition.make(Lit327, PairWithPosition.make(Boolean.FALSE, PairWithPosition.make("Adding ~A to env ~A with value ~A", PairWithPosition.make(Lit321, PairWithPosition.make(Lit322, PairWithPosition.make(Lit312, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1351777), "/tmp/runtime5720098754470623974.scm", 1351760), "/tmp/runtime5720098754470623974.scm", 1351755), "/tmp/runtime5720098754470623974.scm", 1351719), "/tmp/runtime5720098754470623974.scm", 1351716), "/tmp/runtime5720098754470623974.scm", 1351708), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1351708), "/tmp/runtime5720098754470623974.scm", 1351690);
        SimpleSymbol simpleSymbol28 = Lit296;
        SimpleSymbol simpleSymbol29 = Lit318;
        SimpleSymbol simpleSymbol30 = Lit297;
        SimpleSymbol simpleSymbol31 = (SimpleSymbol) new SimpleSymbol("put").readResolve();
        Lit0 = simpleSymbol31;
        PairWithPosition make11 = PairWithPosition.make(make10, PairWithPosition.make(PairWithPosition.make(PairWithPosition.make(simpleSymbol28, Pair.make(simpleSymbol29, Pair.make(Pair.make(simpleSymbol30, Pair.make(simpleSymbol31, LList.Empty)), LList.Empty)), "/tmp/runtime5720098754470623974.scm", 1355787), PairWithPosition.make(Lit322, PairWithPosition.make(Lit321, PairWithPosition.make(Lit312, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1355837), "/tmp/runtime5720098754470623974.scm", 1355832), "/tmp/runtime5720098754470623974.scm", 1355815), "/tmp/runtime5720098754470623974.scm", 1355786), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1355786), "/tmp/runtime5720098754470623974.scm", 1351690);
        SimpleSymbol simpleSymbol32 = Lit310;
        PairWithPosition make12 = PairWithPosition.make(Lit360, PairWithPosition.make(Lit321, PairWithPosition.make(Lit313, PairWithPosition.make(Lit323, PairWithPosition.make(Special.optional, PairWithPosition.make(PairWithPosition.make(Lit324, PairWithPosition.make(Boolean.FALSE, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1364065), "/tmp/runtime5720098754470623974.scm", 1364050), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1364050), "/tmp/runtime5720098754470623974.scm", 1364039), "/tmp/runtime5720098754470623974.scm", 1364020), "/tmp/runtime5720098754470623974.scm", 1364017), "/tmp/runtime5720098754470623974.scm", 1364012), "/tmp/runtime5720098754470623974.scm", 1363984);
        SimpleSymbol simpleSymbol33 = Lit298;
        PairWithPosition make13 = PairWithPosition.make(Lit366, PairWithPosition.make(PairWithPosition.make((SimpleSymbol) new SimpleSymbol("not").readResolve(), PairWithPosition.make(PairWithPosition.make(Lit359, PairWithPosition.make(Lit322, PairWithPosition.make(null, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1368110), "/tmp/runtime5720098754470623974.scm", 1368093), "/tmp/runtime5720098754470623974.scm", 1368088), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1368088), "/tmp/runtime5720098754470623974.scm", 1368083), PairWithPosition.make(PairWithPosition.make(PairWithPosition.make(Lit296, Pair.make(Lit318, Pair.make(Pair.make(Lit297, Pair.make(Lit325, LList.Empty)), LList.Empty)), "/tmp/runtime5720098754470623974.scm", 1372180), PairWithPosition.make(Lit322, PairWithPosition.make(Lit321, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1372229), "/tmp/runtime5720098754470623974.scm", 1372212), "/tmp/runtime5720098754470623974.scm", 1372179), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1372179), "/tmp/runtime5720098754470623974.scm", 1368083), "/tmp/runtime5720098754470623974.scm", 1368078);
        SimpleSymbol simpleSymbol34 = Lit296;
        SimpleSymbol simpleSymbol35 = Lit318;
        SimpleSymbol simpleSymbol36 = Lit297;
        SimpleSymbol simpleSymbol37 = (SimpleSymbol) new SimpleSymbol("get").readResolve();
        Lit1 = simpleSymbol37;
        PairWithPosition make14 = PairWithPosition.make(PairWithPosition.make(simpleSymbol33, PairWithPosition.make(make13, PairWithPosition.make(PairWithPosition.make(PairWithPosition.make(simpleSymbol34, Pair.make(simpleSymbol35, Pair.make(Pair.make(simpleSymbol36, Pair.make(simpleSymbol37, LList.Empty)), LList.Empty)), "/tmp/runtime5720098754470623974.scm", 1376271), PairWithPosition.make(Lit322, PairWithPosition.make(Lit321, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1376316), "/tmp/runtime5720098754470623974.scm", 1376299), "/tmp/runtime5720098754470623974.scm", 1376270), PairWithPosition.make(Lit324, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1380366), "/tmp/runtime5720098754470623974.scm", 1376270), "/tmp/runtime5720098754470623974.scm", 1368078), "/tmp/runtime5720098754470623974.scm", 1368074), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1368074);
        SimpleSymbol simpleSymbol38 = Lit310;
        PairWithPosition make15 = PairWithPosition.make(Lit350, PairWithPosition.make(Lit346, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1634332), "/tmp/runtime5720098754470623974.scm", 1634320);
        SimpleSymbol simpleSymbol39 = Lit296;
        SimpleSymbol simpleSymbol40 = (SimpleSymbol) new SimpleSymbol("com.google.appinventor.components.runtime.util.RetValManager").readResolve();
        SimpleSymbol simpleSymbol41 = Lit297;
        Pair make16 = Pair.make((SimpleSymbol) new SimpleSymbol("sendError").readResolve(), LList.Empty);
        SimpleSymbol simpleSymbol42 = simpleSymbol39;
        PairWithPosition pairWithPosition3 = make15;
        SimpleSymbol simpleSymbol43 = simpleSymbol38;
        SimpleSymbol simpleSymbol44 = Lit388;
        SimpleSymbol simpleSymbol45 = Lit353;
        PairWithPosition make17 = PairWithPosition.make((SimpleSymbol) new SimpleSymbol("<com.google.appinventor.components.runtime.errors.YailRuntimeError>").readResolve(), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1650729);
        SimpleSymbol simpleSymbol46 = Lit347;
        PairWithPosition make18 = PairWithPosition.make(PairWithPosition.make(Lit296, Pair.make(PairWithPosition.make(Lit348, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1671189), Pair.make(Pair.make(Lit297, Pair.make((SimpleSymbol) new SimpleSymbol("toastAllowed").readResolve(), LList.Empty)), LList.Empty)), "/tmp/runtime5720098754470623974.scm", 1671189), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1671188);
        SimpleSymbol simpleSymbol47 = Lit302;
        PairWithPosition make19 = PairWithPosition.make(PairWithPosition.make(Lit317, PairWithPosition.make(PairWithPosition.make(Lit298, PairWithPosition.make(PairWithPosition.make(Lit352, PairWithPosition.make(Lit349, PairWithPosition.make((SimpleSymbol) new SimpleSymbol("java.lang.Error").readResolve(), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1675317), "/tmp/runtime5720098754470623974.scm", 1675314), "/tmp/runtime5720098754470623974.scm", 1675303), PairWithPosition.make(PairWithPosition.make(PairWithPosition.make(Lit296, Pair.make(Lit349, Pair.make(Pair.make(Lit297, Pair.make((SimpleSymbol) new SimpleSymbol("toString").readResolve(), LList.Empty)), LList.Empty)), "/tmp/runtime5720098754470623974.scm", 1675335), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1675334), PairWithPosition.make(PairWithPosition.make(PairWithPosition.make(Lit296, Pair.make(Lit349, Pair.make(Pair.make(Lit297, Pair.make(Lit351, LList.Empty)), LList.Empty)), "/tmp/runtime5720098754470623974.scm", 1675349), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1675348), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1675348), "/tmp/runtime5720098754470623974.scm", 1675334), "/tmp/runtime5720098754470623974.scm", 1675303), "/tmp/runtime5720098754470623974.scm", 1675299), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1675299), "/tmp/runtime5720098754470623974.scm", 1675290), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1675289);
        PairWithPosition make20 = PairWithPosition.make(Lit350, PairWithPosition.make(Lit317, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1679394), "/tmp/runtime5720098754470623974.scm", 1679382);
        SimpleSymbol simpleSymbol48 = Lit296;
        SimpleSymbol simpleSymbol49 = Lit296;
        SimpleSymbol simpleSymbol50 = simpleSymbol49;
        SimpleSymbol simpleSymbol51 = simpleSymbol48;
        PairWithPosition pairWithPosition4 = make20;
        PairWithPosition pairWithPosition5 = make19;
        SimpleSymbol simpleSymbol52 = simpleSymbol47;
        PairWithPosition pairWithPosition6 = make18;
        SimpleSymbol simpleSymbol53 = simpleSymbol46;
        PairWithPosition make21 = PairWithPosition.make(simpleSymbol53, PairWithPosition.make(pairWithPosition6, PairWithPosition.make(PairWithPosition.make(simpleSymbol52, PairWithPosition.make(pairWithPosition5, PairWithPosition.make(pairWithPosition4, PairWithPosition.make(PairWithPosition.make(PairWithPosition.make(simpleSymbol51, Pair.make(PairWithPosition.make(PairWithPosition.make(simpleSymbol50, Pair.make((SimpleSymbol) new SimpleSymbol("android.widget.Toast").readResolve(), Pair.make(Pair.make(Lit297, Pair.make((SimpleSymbol) new SimpleSymbol("makeText").readResolve(), LList.Empty)), LList.Empty)), "/tmp/runtime5720098754470623974.scm", 1683480), PairWithPosition.make(PairWithPosition.make(Lit348, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1683510), PairWithPosition.make(Lit317, PairWithPosition.make(IntNum.make(5), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1683525), "/tmp/runtime5720098754470623974.scm", 1683517), "/tmp/runtime5720098754470623974.scm", 1683510), "/tmp/runtime5720098754470623974.scm", 1683479), Pair.make(Pair.make(Lit297, Pair.make((SimpleSymbol) new SimpleSymbol("show").readResolve(), LList.Empty)), LList.Empty)), "/tmp/runtime5720098754470623974.scm", 1683479), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1683478), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1683478), "/tmp/runtime5720098754470623974.scm", 1679382), "/tmp/runtime5720098754470623974.scm", 1675289), "/tmp/runtime5720098754470623974.scm", 1675284), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1675284), "/tmp/runtime5720098754470623974.scm", 1671188), "/tmp/runtime5720098754470623974.scm", 1671182);
        SimpleSymbol simpleSymbol54 = Lit296;
        SimpleSymbol simpleSymbol55 = simpleSymbol54;
        PairWithPosition make22 = PairWithPosition.make(simpleSymbol55, Pair.make((SimpleSymbol) new SimpleSymbol("com.google.appinventor.components.runtime.util.RuntimeErrorAlert").readResolve(), Pair.make(Pair.make(Lit297, Pair.make((SimpleSymbol) new SimpleSymbol("alert").readResolve(), LList.Empty)), LList.Empty)), "/tmp/runtime5720098754470623974.scm", 1691663);
        PairWithPosition make23 = PairWithPosition.make(Lit348, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1695759);
        PairWithPosition make24 = PairWithPosition.make(PairWithPosition.make(PairWithPosition.make(Lit296, Pair.make(Lit349, Pair.make(Pair.make(Lit297, Pair.make(Lit351, LList.Empty)), LList.Empty)), "/tmp/runtime5720098754470623974.scm", 1699856), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1699855), PairWithPosition.make(PairWithPosition.make(Lit298, PairWithPosition.make(PairWithPosition.make(Lit352, PairWithPosition.make(Lit349, PairWithPosition.make(Lit353, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1703969), "/tmp/runtime5720098754470623974.scm", 1703966), "/tmp/runtime5720098754470623974.scm", 1703955), PairWithPosition.make(PairWithPosition.make(PairWithPosition.make(Lit296, Pair.make(PairWithPosition.make(Lit354, PairWithPosition.make(Lit353, PairWithPosition.make(Lit349, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1704009), "/tmp/runtime5720098754470623974.scm", 1703992), "/tmp/runtime5720098754470623974.scm", 1703988), Pair.make(Pair.make(Lit297, Pair.make((SimpleSymbol) new SimpleSymbol("getErrorType").readResolve(), LList.Empty)), LList.Empty)), "/tmp/runtime5720098754470623974.scm", 1703988), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1703987), PairWithPosition.make("Runtime Error", LList.Empty, "/tmp/runtime5720098754470623974.scm", 1704027), "/tmp/runtime5720098754470623974.scm", 1703987), "/tmp/runtime5720098754470623974.scm", 1703955), "/tmp/runtime5720098754470623974.scm", 1703951), PairWithPosition.make("End Application", LList.Empty, "/tmp/runtime5720098754470623974.scm", 1708047), "/tmp/runtime5720098754470623974.scm", 1703951), "/tmp/runtime5720098754470623974.scm", 1699855);
        PairWithPosition pairWithPosition7 = make21;
        SimpleSymbol simpleSymbol56 = Lit310;
        PairWithPosition make25 = PairWithPosition.make((SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve(), PairWithPosition.make(Lit361, PairWithPosition.make(Lit313, PairWithPosition.make(Lit371, PairWithPosition.make(Lit356, PairWithPosition.make(Lit313, PairWithPosition.make(Lit355, PairWithPosition.make(Lit362, PairWithPosition.make(Lit313, PairWithPosition.make(Lit355, PairWithPosition.make(Lit364, PairWithPosition.make(Lit313, PairWithPosition.make(Lit372, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1736743), "/tmp/runtime5720098754470623974.scm", 1736740), "/tmp/runtime5720098754470623974.scm", 1736735), "/tmp/runtime5720098754470623974.scm", 1732652), "/tmp/runtime5720098754470623974.scm", 1732649), "/tmp/runtime5720098754470623974.scm", 1732639), "/tmp/runtime5720098754470623974.scm", 1728570), "/tmp/runtime5720098754470623974.scm", 1728567), "/tmp/runtime5720098754470623974.scm", 1728543), "/tmp/runtime5720098754470623974.scm", 1724466), "/tmp/runtime5720098754470623974.scm", 1724463), "/tmp/runtime5720098754470623974.scm", 1724447), "/tmp/runtime5720098754470623974.scm", 1724432);
        SimpleSymbol simpleSymbol57 = Lit313;
        SimpleSymbol simpleSymbol58 = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve();
        Lit6 = simpleSymbol58;
        SimpleSymbol simpleSymbol59 = Lit302;
        PairWithPosition make26 = PairWithPosition.make(PairWithPosition.make(Lit358, PairWithPosition.make(PairWithPosition.make(Lit374, PairWithPosition.make(Lit356, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1761332), "/tmp/runtime5720098754470623974.scm", 1761316), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1761316), "/tmp/runtime5720098754470623974.scm", 1761298), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1761297);
        SimpleSymbol simpleSymbol60 = Lit298;
        PairWithPosition make27 = PairWithPosition.make(Lit357, PairWithPosition.make(Lit358, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1765428), "/tmp/runtime5720098754470623974.scm", 1765398);
        SimpleSymbol simpleSymbol61 = Lit298;
        PairWithPosition make28 = PairWithPosition.make(Lit359, PairWithPosition.make(PairWithPosition.make(Lit360, PairWithPosition.make(Lit358, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1769531), "/tmp/runtime5720098754470623974.scm", 1769503), PairWithPosition.make(Lit361, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1769549), "/tmp/runtime5720098754470623974.scm", 1769503), "/tmp/runtime5720098754470623974.scm", 1769498);
        SimpleSymbol simpleSymbol62 = Lit302;
        PairWithPosition make29 = PairWithPosition.make(PairWithPosition.make(Lit363, PairWithPosition.make(PairWithPosition.make(Lit386, PairWithPosition.make(Lit356, PairWithPosition.make(Lit362, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1773648), "/tmp/runtime5720098754470623974.scm", 1773624), "/tmp/runtime5720098754470623974.scm", 1773608), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1773608), "/tmp/runtime5720098754470623974.scm", 1773599), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1773598);
        SimpleSymbol simpleSymbol63 = Lit378;
        SimpleSymbol simpleSymbol64 = Lit303;
        SimpleSymbol simpleSymbol65 = Lit379;
        SimpleSymbol simpleSymbol66 = Lit363;
        SimpleSymbol simpleSymbol67 = Lit296;
        SimpleSymbol simpleSymbol68 = Lit329;
        SimpleSymbol simpleSymbol69 = Lit297;
        SimpleSymbol simpleSymbol70 = (SimpleSymbol) new SimpleSymbol("makeList").readResolve();
        Lit28 = simpleSymbol70;
        PairWithPosition make30 = PairWithPosition.make(simpleSymbol67, Pair.make(simpleSymbol68, Pair.make(Pair.make(simpleSymbol69, Pair.make(simpleSymbol70, LList.Empty)), LList.Empty)), "/tmp/runtime5720098754470623974.scm", 1810484);
        SimpleSymbol simpleSymbol71 = Lit364;
        IntNum make31 = IntNum.make(0);
        Lit18 = make31;
        PairWithPosition make32 = PairWithPosition.make(make26, PairWithPosition.make(PairWithPosition.make(simpleSymbol60, PairWithPosition.make(make27, PairWithPosition.make(PairWithPosition.make(simpleSymbol61, PairWithPosition.make(make28, PairWithPosition.make(PairWithPosition.make(simpleSymbol62, PairWithPosition.make(make29, PairWithPosition.make(PairWithPosition.make(simpleSymbol63, PairWithPosition.make(PairWithPosition.make(simpleSymbol64, PairWithPosition.make(PairWithPosition.make(simpleSymbol65, PairWithPosition.make(simpleSymbol66, PairWithPosition.make(PairWithPosition.make(make30, PairWithPosition.make(simpleSymbol71, PairWithPosition.make(make31, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1810514), "/tmp/runtime5720098754470623974.scm", 1810509), "/tmp/runtime5720098754470623974.scm", 1810483), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1810483), "/tmp/runtime5720098754470623974.scm", 1810475), "/tmp/runtime5720098754470623974.scm", 1810468), PairWithPosition.make(Boolean.TRUE, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1814564), "/tmp/runtime5720098754470623974.scm", 1810468), "/tmp/runtime5720098754470623974.scm", 1806370), PairWithPosition.make(PairWithPosition.make(Lit365, PairWithPosition.make(Lit381, PairWithPosition.make(PairWithPosition.make(Lit303, PairWithPosition.make(PairWithPosition.make(PairWithPosition.make(Lit296, Pair.make(Lit365, Pair.make(Pair.make(Lit297, Pair.make(Lit368, LList.Empty)), LList.Empty)), "/tmp/runtime5720098754470623974.scm", 1851430), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1851429), PairWithPosition.make(PairWithPosition.make(Lit298, PairWithPosition.make(PairWithPosition.make(Lit366, PairWithPosition.make(PairWithPosition.make(Lit359, PairWithPosition.make(PairWithPosition.make(Lit348, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1867827), PairWithPosition.make(Lit361, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1867834), "/tmp/runtime5720098754470623974.scm", 1867827), "/tmp/runtime5720098754470623974.scm", 1867822), PairWithPosition.make(PairWithPosition.make(Lit382, PairWithPosition.make(Lit362, PairWithPosition.make("PermissionNeeded", LList.Empty, "/tmp/runtime5720098754470623974.scm", 1871936), "/tmp/runtime5720098754470623974.scm", 1871926), "/tmp/runtime5720098754470623974.scm", 1871918), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1871918), "/tmp/runtime5720098754470623974.scm", 1867822), "/tmp/runtime5720098754470623974.scm", 1867817), PairWithPosition.make(PairWithPosition.make(Lit367, PairWithPosition.make(Lit365, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1888316), "/tmp/runtime5720098754470623974.scm", 1888297), PairWithPosition.make(PairWithPosition.make(PairWithPosition.make(Lit296, Pair.make(PairWithPosition.make(Lit348, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1892394), Pair.make(Pair.make(Lit297, Pair.make(Lit383, LList.Empty)), LList.Empty)), "/tmp/runtime5720098754470623974.scm", 1892394), PairWithPosition.make(Lit361, PairWithPosition.make(Lit362, PairWithPosition.make(PairWithPosition.make(PairWithPosition.make(Lit296, Pair.make(Lit365, Pair.make(Pair.make(Lit297, Pair.make(Lit384, LList.Empty)), LList.Empty)), "/tmp/runtime5720098754470623974.scm", 1896515), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1896514), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1896514), "/tmp/runtime5720098754470623974.scm", 1892434), "/tmp/runtime5720098754470623974.scm", 1892418), "/tmp/runtime5720098754470623974.scm", 1892393), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1892393), "/tmp/runtime5720098754470623974.scm", 1888297), "/tmp/runtime5720098754470623974.scm", 1867817), "/tmp/runtime5720098754470623974.scm", 1867813), PairWithPosition.make(Boolean.FALSE, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1900581), "/tmp/runtime5720098754470623974.scm", 1867813), "/tmp/runtime5720098754470623974.scm", 1851429), "/tmp/runtime5720098754470623974.scm", 1847331), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1847331), "/tmp/runtime5720098754470623974.scm", 1843245), "/tmp/runtime5720098754470623974.scm", 1843234), PairWithPosition.make(PairWithPosition.make(Lit365, PairWithPosition.make(Lit385, PairWithPosition.make(PairWithPosition.make(Lit303, PairWithPosition.make(PairWithPosition.make(Lit320, PairWithPosition.make(PairWithPosition.make(PairWithPosition.make(Lit296, Pair.make(Lit365, Pair.make(Pair.make(Lit297, Pair.make(Lit351, LList.Empty)), LList.Empty)), "/tmp/runtime5720098754470623974.scm", 1912888), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1912887), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1912887), "/tmp/runtime5720098754470623974.scm", 1912869), PairWithPosition.make(PairWithPosition.make(PairWithPosition.make(Lit296, Pair.make(Lit365, Pair.make(Pair.make(Lit297, Pair.make(Lit368, LList.Empty)), LList.Empty)), "/tmp/runtime5720098754470623974.scm", 1921062), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1921061), PairWithPosition.make(PairWithPosition.make(Lit367, PairWithPosition.make(Lit365, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1925176), "/tmp/runtime5720098754470623974.scm", 1925157), PairWithPosition.make(Boolean.FALSE, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1929253), "/tmp/runtime5720098754470623974.scm", 1925157), "/tmp/runtime5720098754470623974.scm", 1921061), "/tmp/runtime5720098754470623974.scm", 1912869), "/tmp/runtime5720098754470623974.scm", 1908771), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1908771), "/tmp/runtime5720098754470623974.scm", 1904685), "/tmp/runtime5720098754470623974.scm", 1904674), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1904674), "/tmp/runtime5720098754470623974.scm", 1843234), "/tmp/runtime5720098754470623974.scm", 1806370), "/tmp/runtime5720098754470623974.scm", 1802273), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1802273), "/tmp/runtime5720098754470623974.scm", 1773598), "/tmp/runtime5720098754470623974.scm", 1773593), PairWithPosition.make(Boolean.FALSE, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1933337), "/tmp/runtime5720098754470623974.scm", 1773593), "/tmp/runtime5720098754470623974.scm", 1769498), "/tmp/runtime5720098754470623974.scm", 1769494), PairWithPosition.make(PairWithPosition.make(Lit303, PairWithPosition.make(PairWithPosition.make(PairWithPosition.make(Lit296, Pair.make(Lit369, Pair.make(Pair.make(Lit297, Pair.make((SimpleSymbol) new SimpleSymbol("unregisterEventForDelegation").readResolve(), LList.Empty)), LList.Empty)), "/tmp/runtime5720098754470623974.scm", 1945625), PairWithPosition.make(PairWithPosition.make(Lit354, PairWithPosition.make(Lit370, PairWithPosition.make(PairWithPosition.make(Lit348, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1949792), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1949792), "/tmp/runtime5720098754470623974.scm", 1949726), "/tmp/runtime5720098754470623974.scm", 1949722), PairWithPosition.make(Lit356, PairWithPosition.make(Lit362, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1953842), "/tmp/runtime5720098754470623974.scm", 1953818), "/tmp/runtime5720098754470623974.scm", 1949722), "/tmp/runtime5720098754470623974.scm", 1945624), PairWithPosition.make(Boolean.FALSE, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1957912), "/tmp/runtime5720098754470623974.scm", 1945624), "/tmp/runtime5720098754470623974.scm", 1941526), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1941526), "/tmp/runtime5720098754470623974.scm", 1769494), "/tmp/runtime5720098754470623974.scm", 1765398), "/tmp/runtime5720098754470623974.scm", 1765394), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1765394), "/tmp/runtime5720098754470623974.scm", 1761297);
        SimpleSymbol simpleSymbol72 = simpleSymbol57;
        PairWithPosition pairWithPosition8 = make25;
        SimpleSymbol simpleSymbol73 = simpleSymbol56;
        SimpleSymbol simpleSymbol74 = Lit310;
        PairWithPosition make33 = PairWithPosition.make((SimpleSymbol) new SimpleSymbol("dispatchGenericEvent").readResolve(), PairWithPosition.make(Lit361, PairWithPosition.make(Lit313, PairWithPosition.make(Lit371, PairWithPosition.make(Lit362, PairWithPosition.make(Lit313, PairWithPosition.make(Lit355, PairWithPosition.make(Lit380, PairWithPosition.make(Lit313, PairWithPosition.make(Lit6, PairWithPosition.make(Lit364, PairWithPosition.make(Lit313, PairWithPosition.make(Lit372, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1978414), "/tmp/runtime5720098754470623974.scm", 1978411), "/tmp/runtime5720098754470623974.scm", 1978406), "/tmp/runtime5720098754470623974.scm", 1974331), "/tmp/runtime5720098754470623974.scm", 1974328), "/tmp/runtime5720098754470623974.scm", 1974310), "/tmp/runtime5720098754470623974.scm", 1970227), "/tmp/runtime5720098754470623974.scm", 1970224), "/tmp/runtime5720098754470623974.scm", 1970214), "/tmp/runtime5720098754470623974.scm", 1966137), "/tmp/runtime5720098754470623974.scm", 1966134), "/tmp/runtime5720098754470623974.scm", 1966118), "/tmp/runtime5720098754470623974.scm", 1966096);
        PairWithPosition make34 = PairWithPosition.make(Lit313, PairWithPosition.make(Lit373, PairWithPosition.make(PairWithPosition.make((SimpleSymbol) new SimpleSymbol("let*").readResolve(), PairWithPosition.make(PairWithPosition.make(PairWithPosition.make(Lit377, PairWithPosition.make(PairWithPosition.make(Lit374, PairWithPosition.make(PairWithPosition.make(Lit375, PairWithPosition.make("any$", PairWithPosition.make(PairWithPosition.make(Lit376, PairWithPosition.make(Lit361, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2015320), "/tmp/runtime5720098754470623974.scm", 2015303), PairWithPosition.make("$", PairWithPosition.make(Lit362, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2015341), "/tmp/runtime5720098754470623974.scm", 2015337), "/tmp/runtime5720098754470623974.scm", 2015303), "/tmp/runtime5720098754470623974.scm", 2015296), "/tmp/runtime5720098754470623974.scm", 2015281), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2015281), "/tmp/runtime5720098754470623974.scm", 2015265), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2015265), "/tmp/runtime5720098754470623974.scm", 2015249), PairWithPosition.make(PairWithPosition.make(Lit363, PairWithPosition.make(PairWithPosition.make(Lit360, PairWithPosition.make(Lit377, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2019382), "/tmp/runtime5720098754470623974.scm", 2019354), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2019354), "/tmp/runtime5720098754470623974.scm", 2019345), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2019345), "/tmp/runtime5720098754470623974.scm", 2015248), PairWithPosition.make(PairWithPosition.make(Lit298, PairWithPosition.make(Lit363, PairWithPosition.make(PairWithPosition.make(Lit378, PairWithPosition.make(PairWithPosition.make(Lit303, PairWithPosition.make(PairWithPosition.make(Lit379, PairWithPosition.make(Lit363, PairWithPosition.make(PairWithPosition.make(Lit332, PairWithPosition.make(Lit361, PairWithPosition.make(PairWithPosition.make(Lit332, PairWithPosition.make(Lit380, PairWithPosition.make(PairWithPosition.make(PairWithPosition.make(Lit296, Pair.make(Lit329, Pair.make(Pair.make(Lit297, Pair.make(Lit28, LList.Empty)), LList.Empty)), "/tmp/runtime5720098754470623974.scm", 2035793), PairWithPosition.make(Lit364, PairWithPosition.make(Lit18, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2035823), "/tmp/runtime5720098754470623974.scm", 2035818), "/tmp/runtime5720098754470623974.scm", 2035792), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2035792), "/tmp/runtime5720098754470623974.scm", 2035774), "/tmp/runtime5720098754470623974.scm", 2035768), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2035768), "/tmp/runtime5720098754470623974.scm", 2035752), "/tmp/runtime5720098754470623974.scm", 2035746), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2035746), "/tmp/runtime5720098754470623974.scm", 2035738), "/tmp/runtime5720098754470623974.scm", 2035731), PairWithPosition.make(Boolean.TRUE, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2039827), "/tmp/runtime5720098754470623974.scm", 2035731), "/tmp/runtime5720098754470623974.scm", 2031633), PairWithPosition.make(PairWithPosition.make(Lit365, PairWithPosition.make(Lit381, PairWithPosition.make(PairWithPosition.make(Lit303, PairWithPosition.make(PairWithPosition.make(PairWithPosition.make(Lit296, Pair.make(Lit365, Pair.make(Pair.make(Lit297, Pair.make(Lit368, LList.Empty)), LList.Empty)), "/tmp/runtime5720098754470623974.scm", 2052117), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2052116), PairWithPosition.make(PairWithPosition.make(Lit298, PairWithPosition.make(PairWithPosition.make(Lit366, PairWithPosition.make(PairWithPosition.make(Lit359, PairWithPosition.make(PairWithPosition.make(Lit348, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2068514), PairWithPosition.make(Lit361, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2068521), "/tmp/runtime5720098754470623974.scm", 2068514), "/tmp/runtime5720098754470623974.scm", 2068509), PairWithPosition.make(PairWithPosition.make(Lit382, PairWithPosition.make(Lit362, PairWithPosition.make("PermissionNeeded", LList.Empty, "/tmp/runtime5720098754470623974.scm", 2072623), "/tmp/runtime5720098754470623974.scm", 2072613), "/tmp/runtime5720098754470623974.scm", 2072605), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2072605), "/tmp/runtime5720098754470623974.scm", 2068509), "/tmp/runtime5720098754470623974.scm", 2068504), PairWithPosition.make(PairWithPosition.make(Lit367, PairWithPosition.make(Lit365, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2089003), "/tmp/runtime5720098754470623974.scm", 2088984), PairWithPosition.make(PairWithPosition.make(PairWithPosition.make(Lit296, Pair.make(PairWithPosition.make(Lit348, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2093081), Pair.make(Pair.make(Lit297, Pair.make(Lit383, LList.Empty)), LList.Empty)), "/tmp/runtime5720098754470623974.scm", 2093081), PairWithPosition.make(Lit361, PairWithPosition.make(Lit362, PairWithPosition.make(PairWithPosition.make(PairWithPosition.make(Lit296, Pair.make(Lit365, Pair.make(Pair.make(Lit297, Pair.make(Lit384, LList.Empty)), LList.Empty)), "/tmp/runtime5720098754470623974.scm", 2097178), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2097177), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2097177), "/tmp/runtime5720098754470623974.scm", 2093121), "/tmp/runtime5720098754470623974.scm", 2093105), "/tmp/runtime5720098754470623974.scm", 2093080), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2093080), "/tmp/runtime5720098754470623974.scm", 2088984), "/tmp/runtime5720098754470623974.scm", 2068504), "/tmp/runtime5720098754470623974.scm", 2068500), PairWithPosition.make(Boolean.FALSE, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2101268), "/tmp/runtime5720098754470623974.scm", 2068500), "/tmp/runtime5720098754470623974.scm", 2052116), "/tmp/runtime5720098754470623974.scm", 2048018), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2048018), "/tmp/runtime5720098754470623974.scm", 2043932), "/tmp/runtime5720098754470623974.scm", 2043921), PairWithPosition.make(PairWithPosition.make(Lit365, PairWithPosition.make(Lit385, PairWithPosition.make(PairWithPosition.make(Lit303, PairWithPosition.make(PairWithPosition.make(Lit320, PairWithPosition.make(PairWithPosition.make(PairWithPosition.make(Lit296, Pair.make(Lit365, Pair.make(Pair.make(Lit297, Pair.make(Lit351, LList.Empty)), LList.Empty)), "/tmp/runtime5720098754470623974.scm", 2113575), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2113574), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2113574), "/tmp/runtime5720098754470623974.scm", 2113556), PairWithPosition.make(PairWithPosition.make(PairWithPosition.make(Lit296, Pair.make(Lit365, Pair.make(Pair.make(Lit297, Pair.make(Lit368, LList.Empty)), LList.Empty)), "/tmp/runtime5720098754470623974.scm", 2121749), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2121748), PairWithPosition.make(PairWithPosition.make(Lit367, PairWithPosition.make(Lit365, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2125863), "/tmp/runtime5720098754470623974.scm", 2125844), PairWithPosition.make(Boolean.FALSE, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2129940), "/tmp/runtime5720098754470623974.scm", 2125844), "/tmp/runtime5720098754470623974.scm", 2121748), "/tmp/runtime5720098754470623974.scm", 2113556), "/tmp/runtime5720098754470623974.scm", 2109458), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2109458), "/tmp/runtime5720098754470623974.scm", 2105372), "/tmp/runtime5720098754470623974.scm", 2105361), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2105361), "/tmp/runtime5720098754470623974.scm", 2043921), "/tmp/runtime5720098754470623974.scm", 2031633), "/tmp/runtime5720098754470623974.scm", 2027536), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2027536), "/tmp/runtime5720098754470623974.scm", 2023440), "/tmp/runtime5720098754470623974.scm", 2023436), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2023436), "/tmp/runtime5720098754470623974.scm", 2015248), "/tmp/runtime5720098754470623974.scm", 2015242), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2015242), "/tmp/runtime5720098754470623974.scm", 1978437), "/tmp/runtime5720098754470623974.scm", 1978434);
        SimpleSymbol simpleSymbol75 = Lit310;
        PairWithPosition make35 = PairWithPosition.make(Lit386, PairWithPosition.make(Lit387, PairWithPosition.make(Lit362, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2138158), "/tmp/runtime5720098754470623974.scm", 2138144), "/tmp/runtime5720098754470623974.scm", 2138128);
        PairWithPosition make36 = PairWithPosition.make(PairWithPosition.make(Lit360, PairWithPosition.make(PairWithPosition.make(Lit374, PairWithPosition.make(PairWithPosition.make(PairWithPosition.make(Lit296, Pair.make(Lit369, Pair.make(Pair.make(Lit297, Pair.make((SimpleSymbol) new SimpleSymbol("makeFullEventName").readResolve(), LList.Empty)), LList.Empty)), "/tmp/runtime5720098754470623974.scm", 2150413), PairWithPosition.make(Lit387, PairWithPosition.make(Lit362, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2154523), "/tmp/runtime5720098754470623974.scm", 2154509), "/tmp/runtime5720098754470623974.scm", 2150412), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2150412), "/tmp/runtime5720098754470623974.scm", 2146315), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2146315), "/tmp/runtime5720098754470623974.scm", 2142218), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2142218);
        SimpleSymbol simpleSymbol76 = Lit310;
        PairWithPosition make37 = PairWithPosition.make(Lit408, PairWithPosition.make(Lit392, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2183203), "/tmp/runtime5720098754470623974.scm", 2183186);
        PairWithPosition make38 = PairWithPosition.make(PairWithPosition.make(Lit388, PairWithPosition.make(Lit389, PairWithPosition.make((SimpleSymbol) new SimpleSymbol("<com.google.appinventor.components.runtime.EventDispatcher>").readResolve(), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2191374), "/tmp/runtime5720098754470623974.scm", 2187290), "/tmp/runtime5720098754470623974.scm", 2187276), PairWithPosition.make(PairWithPosition.make(Lit393, PairWithPosition.make(PairWithPosition.make(Lit301, PairWithPosition.make(PairWithPosition.make(Lit391, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2195486), PairWithPosition.make(PairWithPosition.make(PairWithPosition.make(Lit296, Pair.make(Lit389, Pair.make(Pair.make(Lit297, Pair.make(Lit390, LList.Empty)), LList.Empty)), "/tmp/runtime5720098754470623974.scm", 2203673), PairWithPosition.make(PairWithPosition.make(Lit354, PairWithPosition.make(Lit370, PairWithPosition.make(PairWithPosition.make(Lit348, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2207839), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2207839), "/tmp/runtime5720098754470623974.scm", 2207773), "/tmp/runtime5720098754470623974.scm", 2207769), PairWithPosition.make(PairWithPosition.make(Lit394, PairWithPosition.make(Lit391, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2211870), "/tmp/runtime5720098754470623974.scm", 2211865), PairWithPosition.make(PairWithPosition.make((SimpleSymbol) new SimpleSymbol("cdr").readResolve(), PairWithPosition.make(Lit391, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2215966), "/tmp/runtime5720098754470623974.scm", 2215961), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2215961), "/tmp/runtime5720098754470623974.scm", 2211865), "/tmp/runtime5720098754470623974.scm", 2207769), "/tmp/runtime5720098754470623974.scm", 2203672), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2203672), "/tmp/runtime5720098754470623974.scm", 2195486), "/tmp/runtime5720098754470623974.scm", 2195478), PairWithPosition.make(Lit392, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2220054), "/tmp/runtime5720098754470623974.scm", 2195478), "/tmp/runtime5720098754470623974.scm", 2195468), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2195468), "/tmp/runtime5720098754470623974.scm", 2187276);
        SimpleSymbol simpleSymbol77 = Lit310;
        PairWithPosition make39 = PairWithPosition.make(Lit414, PairWithPosition.make(Lit402, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2342947), "/tmp/runtime5720098754470623974.scm", 2342930);
        PairWithPosition make40 = PairWithPosition.make(PairWithPosition.make(Lit393, PairWithPosition.make(PairWithPosition.make(Lit301, PairWithPosition.make(PairWithPosition.make(Lit398, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2351134), PairWithPosition.make(PairWithPosition.make(Lit302, PairWithPosition.make(PairWithPosition.make(PairWithPosition.make(Lit333, PairWithPosition.make(PairWithPosition.make(Lit403, PairWithPosition.make(Lit398, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2355253), "/tmp/runtime5720098754470623974.scm", 2355246), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2355246), "/tmp/runtime5720098754470623974.scm", 2355230), PairWithPosition.make(PairWithPosition.make(Lit339, PairWithPosition.make(PairWithPosition.make(Lit404, PairWithPosition.make(Lit398, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2359346), "/tmp/runtime5720098754470623974.scm", 2359338), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2359338), "/tmp/runtime5720098754470623974.scm", 2359326), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2359326), "/tmp/runtime5720098754470623974.scm", 2355229), PairWithPosition.make(PairWithPosition.make(Lit347, PairWithPosition.make(Lit339, PairWithPosition.make(PairWithPosition.make(Lit339, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2367531), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2367531), "/tmp/runtime5720098754470623974.scm", 2367520), "/tmp/runtime5720098754470623974.scm", 2367514), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2367514), "/tmp/runtime5720098754470623974.scm", 2355229), "/tmp/runtime5720098754470623974.scm", 2355224), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2355224), "/tmp/runtime5720098754470623974.scm", 2351134), "/tmp/runtime5720098754470623974.scm", 2351126), PairWithPosition.make(Lit402, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2371606), "/tmp/runtime5720098754470623974.scm", 2351126), "/tmp/runtime5720098754470623974.scm", 2351116), PairWithPosition.make(PairWithPosition.make(Lit393, PairWithPosition.make(PairWithPosition.make(Lit301, PairWithPosition.make(PairWithPosition.make(Lit398, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2379806), PairWithPosition.make(PairWithPosition.make(Lit302, PairWithPosition.make(PairWithPosition.make(PairWithPosition.make(Lit333, PairWithPosition.make(PairWithPosition.make(Lit403, PairWithPosition.make(Lit398, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2383925), "/tmp/runtime5720098754470623974.scm", 2383918), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2383918), "/tmp/runtime5720098754470623974.scm", 2383902), PairWithPosition.make(PairWithPosition.make(Lit339, PairWithPosition.make(PairWithPosition.make(Lit404, PairWithPosition.make(Lit398, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2388018), "/tmp/runtime5720098754470623974.scm", 2388010), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2388010), "/tmp/runtime5720098754470623974.scm", 2387998), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2387998), "/tmp/runtime5720098754470623974.scm", 2383901), PairWithPosition.make(PairWithPosition.make(PairWithPosition.make(Lit296, Pair.make(PairWithPosition.make(Lit348, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2396187), Pair.make(Pair.make(Lit297, Pair.make((SimpleSymbol) new SimpleSymbol("callInitialize").readResolve(), LList.Empty)), LList.Empty)), "/tmp/runtime5720098754470623974.scm", 2396187), PairWithPosition.make(PairWithPosition.make(Lit405, PairWithPosition.make(PairWithPosition.make(Lit348, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2396216), PairWithPosition.make(Lit333, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2396223), "/tmp/runtime5720098754470623974.scm", 2396216), "/tmp/runtime5720098754470623974.scm", 2396209), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2396209), "/tmp/runtime5720098754470623974.scm", 2396186), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2396186), "/tmp/runtime5720098754470623974.scm", 2383901), "/tmp/runtime5720098754470623974.scm", 2383896), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2383896), "/tmp/runtime5720098754470623974.scm", 2379806), "/tmp/runtime5720098754470623974.scm", 2379798), PairWithPosition.make(Lit402, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2400278), "/tmp/runtime5720098754470623974.scm", 2379798), "/tmp/runtime5720098754470623974.scm", 2379788), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2379788), "/tmp/runtime5720098754470623974.scm", 2351116);
        SimpleSymbol simpleSymbol78 = Lit310;
        PairWithPosition make41 = PairWithPosition.make(Lit76, Lit407, "/tmp/runtime5720098754470623974.scm", 2412562);
        PairWithPosition make42 = PairWithPosition.make(PairWithPosition.make(Lit374, PairWithPosition.make(PairWithPosition.make(Lit379, PairWithPosition.make(Lit375, PairWithPosition.make(PairWithPosition.make((SimpleSymbol) new SimpleSymbol("map").readResolve(), PairWithPosition.make(Lit406, PairWithPosition.make(Lit407, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2424872), "/tmp/runtime5720098754470623974.scm", 2424857), "/tmp/runtime5720098754470623974.scm", 2424852), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2424852), "/tmp/runtime5720098754470623974.scm", 2420756), "/tmp/runtime5720098754470623974.scm", 2420749), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2420749), "/tmp/runtime5720098754470623974.scm", 2416652), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2416652);
        SimpleSymbol simpleSymbol79 = Lit296;
        SimpleSymbol simpleSymbol80 = simpleSymbol79;
        PairWithPosition make43 = PairWithPosition.make(simpleSymbol80, Pair.make((SimpleSymbol) new SimpleSymbol("gnu.expr.Language").readResolve(), Pair.make(Pair.make(Lit297, Pair.make((SimpleSymbol) new SimpleSymbol("setDefaults").readResolve(), LList.Empty)), LList.Empty)), "/tmp/runtime5720098754470623974.scm", 2445323);
        SimpleSymbol simpleSymbol81 = Lit296;
        SimpleSymbol simpleSymbol82 = (SimpleSymbol) new SimpleSymbol("kawa.standard.Scheme").readResolve();
        SimpleSymbol simpleSymbol83 = Lit297;
        Pair make44 = Pair.make((SimpleSymbol) new SimpleSymbol("getInstance").readResolve(), LList.Empty);
        SimpleSymbol simpleSymbol84 = simpleSymbol81;
        PairWithPosition pairWithPosition9 = make43;
        SimpleSymbol simpleSymbol85 = Lit378;
        SimpleSymbol simpleSymbol86 = simpleSymbol85;
        Lit75 = new SyntaxRules(objArr3, new SyntaxRule[]{new SyntaxRule(new SyntaxPattern("\f\u0018\f\u0007\f\u000f\f\u0017\f\u001f\f'\b", new Object[0], 5), "\u0001\u0001\u0001\u0001\u0001", "\u0011\u0018\u0004)\u0011\u0018\f\b\u0013)\u0011\u0018\u0014\b\u0003)\u0011\u0018\u001c\b\u000b\u0011\u0018$\u0011\u0018,Ñ\u0011\u00184\u0011\u0018<\u0011\u0018D\u0011\u0018L)\u0011\u0018T\b#\b\u0011\u0018\\\t\u0013\u0018d\u0011\u0018l\u0011\u0018tÑ\u0011\u00184\u0011\u0018|\u0011\u0018D\u0011\u0018\b\u0011\u0018\b\u0011\u0018\b\u0011\u0018\b\u000b\u0011\u0018¤\u0011\u0018¬\u0011\u0018´ā\u0011\u00184\u0011\u0018¼\u0011\u0018D\u0011\u0018\b\u0011\u0018Ä\b\u0011\u0018ÌI\u0011\u0018\b\u0011\u0018\b\u000b\u0018Ô\u0011\u0018Üa\u0011\u00184\t\u000b\u0011\u0018D\t\u0003\u0018ä\u0011\u00184\u0011\u0018ì\u0011\u0018D\u0011\u0018ô\b\u0011\u0018\b\u000b\u0011\u0018ü\u0011\u0018Ą\u0011\u0018Č\u0011\u0018Ĕ\u0011\u0018Ĝ\u0011\u0018Ĥ\u0011\u0018Ĭ\u0011\u0018Ĵ\u0011\u0018ļ\u0011\u00184\u0011\u0018ń\u0011\u0018Ō\b\u0011\u0018Ŕ\t\u001b\u0018Ŝ\u0011\u0018Ť\u0011\u0018Ŭ\u0011\u0018Ŵ\b\u0011\u00184\u0011\u0018ż\u0011\u0018D\u0011\u0018L\u0011\u0018Ƅ\u0011\u0018ƌ\u0011\u0018Ɣ\u0011\u0018Ɯ\u0011\u0018Ƥ\u0011\u0018Ƭ\u0011\u0018ƴ9\u0011\u0018Ƽ\t\u000b\u0018ǄY\u0011\u0018ǌ)\u0011\u0018\b\u000b\u0018ǔ\u0018ǜ", new Object[]{Lit303, (SimpleSymbol) new SimpleSymbol("module-extends").readResolve(), (SimpleSymbol) new SimpleSymbol("module-name").readResolve(), (SimpleSymbol) new SimpleSymbol("module-static").readResolve(), PairWithPosition.make((SimpleSymbol) new SimpleSymbol("require").readResolve(), PairWithPosition.make((SimpleSymbol) new SimpleSymbol("<com.google.youngandroid.runtime>").readResolve(), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1261585), "/tmp/runtime5720098754470623974.scm", 1261576), PairWithPosition.make(simpleSymbol12, PairWithPosition.make(make2, make3, "/tmp/runtime5720098754470623974.scm", 1269776), "/tmp/runtime5720098754470623974.scm", 1269768), Lit310, PairWithPosition.make(simpleSymbol13, PairWithPosition.make(simpleSymbol14, make4, "/tmp/runtime5720098754470623974.scm", 1282074), "/tmp/runtime5720098754470623974.scm", 1282064), Lit313, Lit373, PairWithPosition.make(simpleSymbol18, Pair.make(simpleSymbol16, Pair.make(Pair.make(simpleSymbol17, make5), LList.Empty)), "/tmp/runtime5720098754470623974.scm", 1290251), (SimpleSymbol) new SimpleSymbol("invoke-special").readResolve(), PairWithPosition.make(PairWithPosition.make(Lit348, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1294376), PairWithPosition.make(PairWithPosition.make(Lit308, PairWithPosition.make(Lit314, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1294384), "/tmp/runtime5720098754470623974.scm", 1294384), PairWithPosition.make(Lit315, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1294393), "/tmp/runtime5720098754470623974.scm", 1294383), "/tmp/runtime5720098754470623974.scm", 1294376), PairWithPosition.make(Lit310, PairWithPosition.make(Lit316, PairWithPosition.make(Boolean.FALSE, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1302557), "/tmp/runtime5720098754470623974.scm", 1302544), "/tmp/runtime5720098754470623974.scm", 1302536), PairWithPosition.make(simpleSymbol26, PairWithPosition.make(pairWithPosition2, PairWithPosition.make(PairWithPosition.make(simpleSymbol25, PairWithPosition.make(simpleSymbol24, PairWithPosition.make(PairWithPosition.make(make7, PairWithPosition.make("YAIL", make8, "/tmp/runtime5720098754470623974.scm", 1314865), "/tmp/runtime5720098754470623974.scm", 1314845), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1314845), "/tmp/runtime5720098754470623974.scm", 1314832), "/tmp/runtime5720098754470623974.scm", 1314826), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1314826), "/tmp/runtime5720098754470623974.scm", 1310736), "/tmp/runtime5720098754470623974.scm", 1310728), Lit322, Lit318, PairWithPosition.make(Lit296, Pair.make(Lit318, Pair.make(Pair.make(Lit297, Pair.make(Lit326, LList.Empty)), LList.Empty)), "/tmp/runtime5720098754470623974.scm", 1339403), Lit406, Lit308, PairWithPosition.make(simpleSymbol27, PairWithPosition.make(make9, make11, "/tmp/runtime5720098754470623974.scm", 1347600), "/tmp/runtime5720098754470623974.scm", 1347592), PairWithPosition.make(simpleSymbol32, PairWithPosition.make(make12, make14, "/tmp/runtime5720098754470623974.scm", 1363984), "/tmp/runtime5720098754470623974.scm", 1363976), PairWithPosition.make(Lit310, PairWithPosition.make(PairWithPosition.make(Lit357, PairWithPosition.make(Lit321, PairWithPosition.make(Lit313, PairWithPosition.make(Lit323, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1388598), "/tmp/runtime5720098754470623974.scm", 1388595), "/tmp/runtime5720098754470623974.scm", 1388590), "/tmp/runtime5720098754470623974.scm", 1388560), PairWithPosition.make(PairWithPosition.make(PairWithPosition.make(Lit296, Pair.make(Lit318, Pair.make(Pair.make(Lit297, Pair.make(Lit325, LList.Empty)), LList.Empty)), "/tmp/runtime5720098754470623974.scm", 1392651), PairWithPosition.make(Lit322, PairWithPosition.make(Lit321, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1392700), "/tmp/runtime5720098754470623974.scm", 1392683), "/tmp/runtime5720098754470623974.scm", 1392650), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1392650), "/tmp/runtime5720098754470623974.scm", 1388560), "/tmp/runtime5720098754470623974.scm", 1388552), Lit328, PairWithPosition.make(Lit296, Pair.make(Lit318, Pair.make(Pair.make(Lit297, Pair.make(Lit326, LList.Empty)), LList.Empty)), "/tmp/runtime5720098754470623974.scm", 1404939), Lit375, PairWithPosition.make("-global-vars", LList.Empty, "/tmp/runtime5720098754470623974.scm", 1413161), PairWithPosition.make(Lit310, PairWithPosition.make(PairWithPosition.make(Lit396, PairWithPosition.make(Lit321, PairWithPosition.make(Lit313, PairWithPosition.make(Lit323, PairWithPosition.make(Lit312, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1421386), "/tmp/runtime5720098754470623974.scm", 1421367), "/tmp/runtime5720098754470623974.scm", 1421364), "/tmp/runtime5720098754470623974.scm", 1421359), "/tmp/runtime5720098754470623974.scm", 1421328), PairWithPosition.make(PairWithPosition.make(Lit320, PairWithPosition.make(PairWithPosition.make(Lit327, PairWithPosition.make(Boolean.FALSE, PairWithPosition.make("Adding ~A to env ~A with value ~A", PairWithPosition.make(Lit321, PairWithPosition.make(Lit328, PairWithPosition.make(Lit312, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1425511), "/tmp/runtime5720098754470623974.scm", 1425488), "/tmp/runtime5720098754470623974.scm", 1425483), "/tmp/runtime5720098754470623974.scm", 1425447), "/tmp/runtime5720098754470623974.scm", 1425444), "/tmp/runtime5720098754470623974.scm", 1425436), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1425436), "/tmp/runtime5720098754470623974.scm", 1425418), PairWithPosition.make(PairWithPosition.make(PairWithPosition.make(Lit296, Pair.make(Lit318, Pair.make(Pair.make(Lit297, Pair.make(Lit0, LList.Empty)), LList.Empty)), "/tmp/runtime5720098754470623974.scm", 1429515), PairWithPosition.make(Lit328, PairWithPosition.make(Lit321, PairWithPosition.make(Lit312, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1429571), "/tmp/runtime5720098754470623974.scm", 1429566), "/tmp/runtime5720098754470623974.scm", 1429543), "/tmp/runtime5720098754470623974.scm", 1429514), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1429514), "/tmp/runtime5720098754470623974.scm", 1425418), "/tmp/runtime5720098754470623974.scm", 1421328), "/tmp/runtime5720098754470623974.scm", 1421320), PairWithPosition.make(null, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1445928), (SimpleSymbol) new SimpleSymbol("form-name-symbol").readResolve(), Lit323, PairWithPosition.make(Lit310, PairWithPosition.make(Lit331, PairWithPosition.make(Lit313, PairWithPosition.make(Lit329, PairWithPosition.make(PairWithPosition.make(Lit308, PairWithPosition.make(LList.Empty, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1470520), "/tmp/runtime5720098754470623974.scm", 1470520), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1470519), "/tmp/runtime5720098754470623974.scm", 1470503), "/tmp/runtime5720098754470623974.scm", 1470500), "/tmp/runtime5720098754470623974.scm", 1470480), "/tmp/runtime5720098754470623974.scm", 1470472), PairWithPosition.make(Lit310, PairWithPosition.make(Lit336, PairWithPosition.make(Lit313, PairWithPosition.make(Lit329, PairWithPosition.make(PairWithPosition.make(Lit308, PairWithPosition.make(LList.Empty, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1491002), "/tmp/runtime5720098754470623974.scm", 1491002), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1491001), "/tmp/runtime5720098754470623974.scm", 1490985), "/tmp/runtime5720098754470623974.scm", 1490982), "/tmp/runtime5720098754470623974.scm", 1490960), "/tmp/runtime5720098754470623974.scm", 1490952), PairWithPosition.make(Lit310, PairWithPosition.make(PairWithPosition.make(Lit330, PairWithPosition.make(Lit333, PairWithPosition.make(Lit334, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1507374), "/tmp/runtime5720098754470623974.scm", 1507359), "/tmp/runtime5720098754470623974.scm", 1507344), PairWithPosition.make(PairWithPosition.make(Lit335, PairWithPosition.make(Lit331, PairWithPosition.make(PairWithPosition.make(Lit332, PairWithPosition.make(PairWithPosition.make(Lit332, PairWithPosition.make(Lit333, PairWithPosition.make(Lit334, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1515563), "/tmp/runtime5720098754470623974.scm", 1515548), "/tmp/runtime5720098754470623974.scm", 1515542), PairWithPosition.make(Lit331, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1519638), "/tmp/runtime5720098754470623974.scm", 1515542), "/tmp/runtime5720098754470623974.scm", 1515536), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1515536), "/tmp/runtime5720098754470623974.scm", 1511440), "/tmp/runtime5720098754470623974.scm", 1511434), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1511434), "/tmp/runtime5720098754470623974.scm", 1507344), "/tmp/runtime5720098754470623974.scm", 1507336), PairWithPosition.make(Lit310, PairWithPosition.make(PairWithPosition.make(Lit415, PairWithPosition.make(Lit337, PairWithPosition.make(Lit338, PairWithPosition.make(Lit333, PairWithPosition.make(Lit339, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1536080), "/tmp/runtime5720098754470623974.scm", 1536065), "/tmp/runtime5720098754470623974.scm", 1536050), "/tmp/runtime5720098754470623974.scm", 1536035), "/tmp/runtime5720098754470623974.scm", 1536016), PairWithPosition.make(PairWithPosition.make(Lit335, PairWithPosition.make(Lit336, PairWithPosition.make(PairWithPosition.make(Lit332, PairWithPosition.make(PairWithPosition.make(Lit7, PairWithPosition.make(Lit337, PairWithPosition.make(Lit338, PairWithPosition.make(Lit333, PairWithPosition.make(Lit339, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1544265), "/tmp/runtime5720098754470623974.scm", 1544250), "/tmp/runtime5720098754470623974.scm", 1544235), "/tmp/runtime5720098754470623974.scm", 1544220), "/tmp/runtime5720098754470623974.scm", 1544214), PairWithPosition.make(Lit336, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1548310), "/tmp/runtime5720098754470623974.scm", 1544214), "/tmp/runtime5720098754470623974.scm", 1544208), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1544208), "/tmp/runtime5720098754470623974.scm", 1540112), "/tmp/runtime5720098754470623974.scm", 1540106), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1540106), "/tmp/runtime5720098754470623974.scm", 1536016), "/tmp/runtime5720098754470623974.scm", 1536008), PairWithPosition.make(Lit310, PairWithPosition.make(Lit340, PairWithPosition.make(Lit313, PairWithPosition.make(Lit329, PairWithPosition.make(PairWithPosition.make(Lit308, PairWithPosition.make(LList.Empty, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1560635), "/tmp/runtime5720098754470623974.scm", 1560635), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1560634), "/tmp/runtime5720098754470623974.scm", 1560618), "/tmp/runtime5720098754470623974.scm", 1560615), "/tmp/runtime5720098754470623974.scm", 1560592), "/tmp/runtime5720098754470623974.scm", 1560584), PairWithPosition.make(Lit310, PairWithPosition.make(PairWithPosition.make(Lit309, PairWithPosition.make(Lit341, PairWithPosition.make(Lit342, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1572904), "/tmp/runtime5720098754470623974.scm", 1572900), "/tmp/runtime5720098754470623974.scm", 1572880), PairWithPosition.make(PairWithPosition.make(Lit335, PairWithPosition.make(Lit340, PairWithPosition.make(PairWithPosition.make(Lit332, PairWithPosition.make(PairWithPosition.make(Lit7, PairWithPosition.make(Lit341, PairWithPosition.make(Lit342, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1581088), "/tmp/runtime5720098754470623974.scm", 1581084), "/tmp/runtime5720098754470623974.scm", 1581078), PairWithPosition.make(Lit340, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1585174), "/tmp/runtime5720098754470623974.scm", 1581078), "/tmp/runtime5720098754470623974.scm", 1581072), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1581072), "/tmp/runtime5720098754470623974.scm", 1576976), "/tmp/runtime5720098754470623974.scm", 1576970), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1576970), "/tmp/runtime5720098754470623974.scm", 1572880), "/tmp/runtime5720098754470623974.scm", 1572872), PairWithPosition.make(Lit310, PairWithPosition.make(Lit344, PairWithPosition.make(Lit313, PairWithPosition.make(Lit329, PairWithPosition.make(PairWithPosition.make(Lit308, PairWithPosition.make(LList.Empty, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1605692), "/tmp/runtime5720098754470623974.scm", 1605692), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1605691), "/tmp/runtime5720098754470623974.scm", 1605675), "/tmp/runtime5720098754470623974.scm", 1605672), "/tmp/runtime5720098754470623974.scm", 1605648), "/tmp/runtime5720098754470623974.scm", 1605640), PairWithPosition.make(Lit310, PairWithPosition.make(PairWithPosition.make(Lit343, PairWithPosition.make(Lit345, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1613871), "/tmp/runtime5720098754470623974.scm", 1613840), PairWithPosition.make(PairWithPosition.make(Lit335, PairWithPosition.make(Lit344, PairWithPosition.make(PairWithPosition.make(Lit332, PairWithPosition.make(Lit345, PairWithPosition.make(Lit344, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1626134), "/tmp/runtime5720098754470623974.scm", 1622038), "/tmp/runtime5720098754470623974.scm", 1622032), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1622032), "/tmp/runtime5720098754470623974.scm", 1617936), "/tmp/runtime5720098754470623974.scm", 1617930), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1617930), "/tmp/runtime5720098754470623974.scm", 1613840), "/tmp/runtime5720098754470623974.scm", 1613832), PairWithPosition.make(simpleSymbol43, PairWithPosition.make(pairWithPosition3, PairWithPosition.make(PairWithPosition.make(PairWithPosition.make(simpleSymbol42, Pair.make(simpleSymbol40, Pair.make(Pair.make(simpleSymbol41, make16), LList.Empty)), "/tmp/runtime5720098754470623974.scm", 1638411), PairWithPosition.make(Lit346, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1638482), "/tmp/runtime5720098754470623974.scm", 1638410), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1638410), "/tmp/runtime5720098754470623974.scm", 1634320), "/tmp/runtime5720098754470623974.scm", 1634312), PairWithPosition.make(Lit367, PairWithPosition.make(Lit349, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1646627), "/tmp/runtime5720098754470623974.scm", 1646608), PairWithPosition.make(simpleSymbol44, PairWithPosition.make(simpleSymbol45, make17, "/tmp/runtime5720098754470623974.scm", 1650712), "/tmp/runtime5720098754470623974.scm", 1650698), Lit298, PairWithPosition.make(pairWithPosition7, PairWithPosition.make(PairWithPosition.make(make22, PairWithPosition.make(make23, make24, "/tmp/runtime5720098754470623974.scm", 1695759), "/tmp/runtime5720098754470623974.scm", 1691662), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1691662), "/tmp/runtime5720098754470623974.scm", 1671182), PairWithPosition.make(simpleSymbol73, PairWithPosition.make(pairWithPosition8, PairWithPosition.make(simpleSymbol72, PairWithPosition.make(simpleSymbol58, PairWithPosition.make(PairWithPosition.make(simpleSymbol59, make32, "/tmp/runtime5720098754470623974.scm", 1761292), LList.Empty, "/tmp/runtime5720098754470623974.scm", 1761292), "/tmp/runtime5720098754470623974.scm", 1736766), "/tmp/runtime5720098754470623974.scm", 1736763), "/tmp/runtime5720098754470623974.scm", 1724432), "/tmp/runtime5720098754470623974.scm", 1724424), PairWithPosition.make(simpleSymbol74, PairWithPosition.make(make33, make34, "/tmp/runtime5720098754470623974.scm", 1966096), "/tmp/runtime5720098754470623974.scm", 1966088), PairWithPosition.make(simpleSymbol75, PairWithPosition.make(make35, make36, "/tmp/runtime5720098754470623974.scm", 2138128), "/tmp/runtime5720098754470623974.scm", 2138120), PairWithPosition.make((SimpleSymbol) new SimpleSymbol("$define").readResolve(), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2170896), PairWithPosition.make(simpleSymbol76, PairWithPosition.make(make37, make38, "/tmp/runtime5720098754470623974.scm", 2183186), "/tmp/runtime5720098754470623974.scm", 2183178), PairWithPosition.make(Lit310, PairWithPosition.make(PairWithPosition.make(Lit413, PairWithPosition.make(Lit397, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2232361), "/tmp/runtime5720098754470623974.scm", 2232338), PairWithPosition.make(PairWithPosition.make(Lit393, PairWithPosition.make(PairWithPosition.make(Lit301, PairWithPosition.make(PairWithPosition.make(Lit395, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2240542), PairWithPosition.make(PairWithPosition.make(Lit302, PairWithPosition.make(PairWithPosition.make(PairWithPosition.make(Lit341, PairWithPosition.make(PairWithPosition.make(Lit394, PairWithPosition.make(Lit395, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2244648), "/tmp/runtime5720098754470623974.scm", 2244643), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2244643), "/tmp/runtime5720098754470623974.scm", 2244638), PairWithPosition.make(PairWithPosition.make(Lit342, PairWithPosition.make(PairWithPosition.make(Lit399, PairWithPosition.make(Lit395, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2248751), "/tmp/runtime5720098754470623974.scm", 2248745), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2248745), "/tmp/runtime5720098754470623974.scm", 2248734), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2248734), "/tmp/runtime5720098754470623974.scm", 2244637), PairWithPosition.make(PairWithPosition.make(Lit396, PairWithPosition.make(Lit341, PairWithPosition.make(PairWithPosition.make(Lit342, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2252861), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2252861), "/tmp/runtime5720098754470623974.scm", 2252857), "/tmp/runtime5720098754470623974.scm", 2252826), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2252826), "/tmp/runtime5720098754470623974.scm", 2244637), "/tmp/runtime5720098754470623974.scm", 2244632), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2244632), "/tmp/runtime5720098754470623974.scm", 2240542), "/tmp/runtime5720098754470623974.scm", 2240534), PairWithPosition.make(Lit397, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2256918), "/tmp/runtime5720098754470623974.scm", 2240534), "/tmp/runtime5720098754470623974.scm", 2240524), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2240524), "/tmp/runtime5720098754470623974.scm", 2232338), "/tmp/runtime5720098754470623974.scm", 2232330), PairWithPosition.make(Lit310, PairWithPosition.make(PairWithPosition.make(Lit411, PairWithPosition.make(Lit402, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2269221), "/tmp/runtime5720098754470623974.scm", 2269202), PairWithPosition.make(PairWithPosition.make(Lit393, PairWithPosition.make(PairWithPosition.make(Lit301, PairWithPosition.make(PairWithPosition.make(Lit398, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2273310), PairWithPosition.make(PairWithPosition.make(Lit302, PairWithPosition.make(PairWithPosition.make(PairWithPosition.make(Lit333, PairWithPosition.make(PairWithPosition.make(Lit403, PairWithPosition.make(Lit398, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2277429), "/tmp/runtime5720098754470623974.scm", 2277422), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2277422), "/tmp/runtime5720098754470623974.scm", 2277406), PairWithPosition.make(PairWithPosition.make(Lit339, PairWithPosition.make(PairWithPosition.make(Lit404, PairWithPosition.make(Lit398, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2281522), "/tmp/runtime5720098754470623974.scm", 2281514), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2281514), "/tmp/runtime5720098754470623974.scm", 2281502), PairWithPosition.make(PairWithPosition.make(Lit338, PairWithPosition.make(PairWithPosition.make(Lit399, PairWithPosition.make(Lit398, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2285620), "/tmp/runtime5720098754470623974.scm", 2285614), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2285614), "/tmp/runtime5720098754470623974.scm", 2285598), PairWithPosition.make(PairWithPosition.make(Lit400, PairWithPosition.make(PairWithPosition.make(Lit360, PairWithPosition.make(PairWithPosition.make(Lit394, PairWithPosition.make(Lit398, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2289748), "/tmp/runtime5720098754470623974.scm", 2289743), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2289743), "/tmp/runtime5720098754470623974.scm", 2289715), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2289715), "/tmp/runtime5720098754470623974.scm", 2289694), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2289694), "/tmp/runtime5720098754470623974.scm", 2285598), "/tmp/runtime5720098754470623974.scm", 2281502), "/tmp/runtime5720098754470623974.scm", 2277405), PairWithPosition.make(PairWithPosition.make(Lit302, PairWithPosition.make(PairWithPosition.make(PairWithPosition.make(Lit401, PairWithPosition.make(PairWithPosition.make(Lit326, PairWithPosition.make(Lit338, PairWithPosition.make(Lit400, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2306119), "/tmp/runtime5720098754470623974.scm", 2306104), "/tmp/runtime5720098754470623974.scm", 2306098), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2306098), "/tmp/runtime5720098754470623974.scm", 2306080), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2306079), PairWithPosition.make(PairWithPosition.make(Lit335, PairWithPosition.make(PairWithPosition.make(Lit405, PairWithPosition.make(PairWithPosition.make(Lit348, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2314281), PairWithPosition.make(Lit333, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2314288), "/tmp/runtime5720098754470623974.scm", 2314281), "/tmp/runtime5720098754470623974.scm", 2314274), PairWithPosition.make(Lit401, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2314304), "/tmp/runtime5720098754470623974.scm", 2314274), "/tmp/runtime5720098754470623974.scm", 2314268), PairWithPosition.make(PairWithPosition.make(Lit319, PairWithPosition.make(Lit333, PairWithPosition.make(Lit401, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2326596), "/tmp/runtime5720098754470623974.scm", 2326581), "/tmp/runtime5720098754470623974.scm", 2326556), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2326556), "/tmp/runtime5720098754470623974.scm", 2314268), "/tmp/runtime5720098754470623974.scm", 2306079), "/tmp/runtime5720098754470623974.scm", 2306074), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2306074), "/tmp/runtime5720098754470623974.scm", 2277405), "/tmp/runtime5720098754470623974.scm", 2277400), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2277400), "/tmp/runtime5720098754470623974.scm", 2273310), "/tmp/runtime5720098754470623974.scm", 2273302), PairWithPosition.make(Lit402, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2330646), "/tmp/runtime5720098754470623974.scm", 2273302), "/tmp/runtime5720098754470623974.scm", 2273292), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2273292), "/tmp/runtime5720098754470623974.scm", 2269202), "/tmp/runtime5720098754470623974.scm", 2269194), PairWithPosition.make(simpleSymbol77, PairWithPosition.make(make39, make40, "/tmp/runtime5720098754470623974.scm", 2342930), "/tmp/runtime5720098754470623974.scm", 2342922), PairWithPosition.make(simpleSymbol78, PairWithPosition.make(make41, make42, "/tmp/runtime5720098754470623974.scm", 2412562), "/tmp/runtime5720098754470623974.scm", 2412554), PairWithPosition.make(pairWithPosition9, PairWithPosition.make(PairWithPosition.make(PairWithPosition.make(simpleSymbol84, Pair.make(simpleSymbol82, Pair.make(Pair.make(simpleSymbol83, make44), LList.Empty)), "/tmp/runtime5720098754470623974.scm", 2445354), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2445353), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2445353), "/tmp/runtime5720098754470623974.scm", 2445322), PairWithPosition.make(simpleSymbol86, PairWithPosition.make(PairWithPosition.make((SimpleSymbol) new SimpleSymbol("invoke").readResolve(), PairWithPosition.make(PairWithPosition.make(Lit348, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2482195), PairWithPosition.make(PairWithPosition.make(Lit308, PairWithPosition.make((SimpleSymbol) new SimpleSymbol("run").readResolve(), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2482203), "/tmp/runtime5720098754470623974.scm", 2482203), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2482202), "/tmp/runtime5720098754470623974.scm", 2482195), "/tmp/runtime5720098754470623974.scm", 2482187), PairWithPosition.make(PairWithPosition.make(Lit365, PairWithPosition.make((SimpleSymbol) new SimpleSymbol("java.lang.Exception").readResolve(), PairWithPosition.make(PairWithPosition.make(Lit320, PairWithPosition.make(PairWithPosition.make(PairWithPosition.make(Lit296, Pair.make(Lit365, Pair.make(Pair.make(Lit297, Pair.make(Lit351, LList.Empty)), LList.Empty)), "/tmp/runtime5720098754470623974.scm", 2490399), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2490398), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2490398), "/tmp/runtime5720098754470623974.scm", 2490380), PairWithPosition.make(PairWithPosition.make(Lit367, PairWithPosition.make(Lit365, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2494495), "/tmp/runtime5720098754470623974.scm", 2494476), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2494476), "/tmp/runtime5720098754470623974.scm", 2490380), "/tmp/runtime5720098754470623974.scm", 2486294), "/tmp/runtime5720098754470623974.scm", 2486283), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2486283), "/tmp/runtime5720098754470623974.scm", 2482187), "/tmp/runtime5720098754470623974.scm", 2478090), Lit335, PairWithPosition.make(PairWithPosition.make(Lit348, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2498586), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2498586), Lit319, PairWithPosition.make(PairWithPosition.make(Lit348, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2506798), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2506798), PairWithPosition.make(PairWithPosition.make(Lit408, PairWithPosition.make(Lit331, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2514971), "/tmp/runtime5720098754470623974.scm", 2514954), PairWithPosition.make(PairWithPosition.make(Lit378, PairWithPosition.make(PairWithPosition.make(Lit302, PairWithPosition.make(PairWithPosition.make(PairWithPosition.make(Lit412, PairWithPosition.make(PairWithPosition.make(Lit410, PairWithPosition.make(Lit336, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2527270), "/tmp/runtime5720098754470623974.scm", 2527261), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2527261), "/tmp/runtime5720098754470623974.scm", 2527249), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2527248), PairWithPosition.make(PairWithPosition.make(Lit309, PairWithPosition.make(PairWithPosition.make(Lit308, PairWithPosition.make(Lit409, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2547746), "/tmp/runtime5720098754470623974.scm", 2547746), PairWithPosition.make(PairWithPosition.make(Lit301, PairWithPosition.make(LList.Empty, PairWithPosition.make(null, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2547774), "/tmp/runtime5720098754470623974.scm", 2547771), "/tmp/runtime5720098754470623974.scm", 2547763), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2547763), "/tmp/runtime5720098754470623974.scm", 2547745), "/tmp/runtime5720098754470623974.scm", 2547725), PairWithPosition.make(PairWithPosition.make(Lit393, PairWithPosition.make((SimpleSymbol) new SimpleSymbol("force").readResolve(), PairWithPosition.make(PairWithPosition.make(Lit410, PairWithPosition.make(Lit344, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2564134), "/tmp/runtime5720098754470623974.scm", 2564125), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2564125), "/tmp/runtime5720098754470623974.scm", 2564119), "/tmp/runtime5720098754470623974.scm", 2564109), PairWithPosition.make(PairWithPosition.make(Lit411, PairWithPosition.make(Lit412, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2568224), "/tmp/runtime5720098754470623974.scm", 2568205), PairWithPosition.make(PairWithPosition.make(Lit413, PairWithPosition.make(PairWithPosition.make(Lit410, PairWithPosition.make(Lit340, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2592813), "/tmp/runtime5720098754470623974.scm", 2592804), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2592804), "/tmp/runtime5720098754470623974.scm", 2592781), PairWithPosition.make(PairWithPosition.make(Lit414, PairWithPosition.make(Lit412, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2621470), "/tmp/runtime5720098754470623974.scm", 2621453), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2621453), "/tmp/runtime5720098754470623974.scm", 2592781), "/tmp/runtime5720098754470623974.scm", 2568205), "/tmp/runtime5720098754470623974.scm", 2564109), "/tmp/runtime5720098754470623974.scm", 2547725), "/tmp/runtime5720098754470623974.scm", 2527248), "/tmp/runtime5720098754470623974.scm", 2527243), PairWithPosition.make(PairWithPosition.make(Lit365, PairWithPosition.make((SimpleSymbol) new SimpleSymbol("com.google.appinventor.components.runtime.errors.YailRuntimeError").readResolve(), PairWithPosition.make(PairWithPosition.make(Lit367, PairWithPosition.make(Lit365, LList.Empty, "/tmp/runtime5720098754470623974.scm", 2633769), "/tmp/runtime5720098754470623974.scm", 2633750), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2633750), "/tmp/runtime5720098754470623974.scm", 2625558), "/tmp/runtime5720098754470623974.scm", 2625547), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2625547), "/tmp/runtime5720098754470623974.scm", 2527243), "/tmp/runtime5720098754470623974.scm", 2523146), LList.Empty, "/tmp/runtime5720098754470623974.scm", 2523146), "/tmp/runtime5720098754470623974.scm", 2514954)}, 0)}, 5);
        Object[] objArr4 = {Lit295};
        SimpleSymbol simpleSymbol87 = Lit308;
        SimpleSymbol simpleSymbol88 = (SimpleSymbol) new SimpleSymbol("com.google.appinventor.components.runtime.Form").readResolve();
        Lit12 = simpleSymbol88;
        Lit71 = new SyntaxRules(objArr4, new SyntaxRule[]{new SyntaxRule(new SyntaxPattern("\f\u0018\f\u0007\f\u000f\b", new Object[0], 2), "\u0001\u0001", "\u0011\u0018\u0004\t\u0003\t\u000b\u0018\f", new Object[]{Lit74, PairWithPosition.make(PairWithPosition.make(simpleSymbol87, PairWithPosition.make(simpleSymbol88, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1196082), "/tmp/runtime5720098754470623974.scm", 1196082), PairWithPosition.make(Boolean.FALSE, PairWithPosition.make(Boolean.TRUE, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1196132), "/tmp/runtime5720098754470623974.scm", 1196129), "/tmp/runtime5720098754470623974.scm", 1196081)}, 0), new SyntaxRule(new SyntaxPattern("\f\u0018\f\u0007\f\u000f\f\u0017\b", new Object[0], 3), "\u0001\u0001\u0001", "\u0011\u0018\u0004\t\u0003\t\u000b\u0011\u0018\f\u0011\u0018\u0014\b\u0013", new Object[]{Lit74, PairWithPosition.make(Lit308, PairWithPosition.make(Lit12, LList.Empty, "/tmp/runtime5720098754470623974.scm", 1204274), "/tmp/runtime5720098754470623974.scm", 1204274), Boolean.FALSE}, 0)}, 3);
        Object[] objArr5 = {Lit295};
        SimpleSymbol simpleSymbol89 = (SimpleSymbol) new SimpleSymbol("gen-simple-component-type").readResolve();
        Lit40 = simpleSymbol89;
        Lit44 = new SyntaxRules(objArr5, new SyntaxRule[]{new SyntaxRule(new SyntaxPattern("\f\u0018\f\u0007\f\u000f\f\u0017\b", new Object[0], 3), "\u0001\u0001\u0001", "\u0011\u0018\u0004\u0011\u0018\f\t\u0013\u0011\u0018\u0014)\u0011\u0018\u001c\b\u000b\u0018$\b\u0011\u0018,\u0011\u00184¹\u0011\u0018<)\u0011\u0018D\b\u0003)\u0011\u0018\u001c\b\u000b)\u0011\u0018D\b\u0013\u0018L\b\u0011\u0018T)\u0011\u0018D\b\u0003)\u0011\u0018\u001c\b\u000b)\u0011\u0018D\b\u0013\u0018\\", new Object[]{Lit303, Lit310, Lit313, simpleSymbol89, PairWithPosition.make(null, LList.Empty, "/tmp/runtime5720098754470623974.scm", 241741), Lit298, Lit307, Lit45, Lit308, PairWithPosition.make(Boolean.FALSE, LList.Empty, "/tmp/runtime5720098754470623974.scm", 262183), Lit415, PairWithPosition.make(Boolean.FALSE, LList.Empty, "/tmp/runtime5720098754470623974.scm", 278559)}, 0), new SyntaxRule(new SyntaxPattern("\f\u0018\f\u0007\f\u000f\f\u0017\r\u001f\u0018\b\b", new Object[0], 4), "\u0001\u0001\u0001\u0003", "\u0011\u0018\u0004\u0011\u0018\f\t\u0013\u0011\u0018\u0014)\u0011\u0018\u001c\b\u000b\u0018$\b\u0011\u0018,\u0011\u00184ñ\u0011\u0018<)\u0011\u0018D\b\u0003)\u0011\u0018\u001c\b\u000b)\u0011\u0018D\b\u0013\b\u0011\u0018L\t\u0010\b\u001d\u001b\b\u0011\u0018T)\u0011\u0018D\b\u0003)\u0011\u0018\u001c\b\u000b)\u0011\u0018D\b\u0013\b\u0011\u0018L\t\u0010\b\u001d\u001b", new Object[]{Lit303, Lit310, Lit313, Lit40, PairWithPosition.make(null, LList.Empty, "/tmp/runtime5720098754470623974.scm", 290893), Lit298, Lit307, Lit45, Lit308, Lit301, Lit415}, 1)}, 4);
        C0593runtime runtime = $instance;
        android$Mnlog = new ModuleMethod(runtime, 11, Lit39, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        SimpleSymbol simpleSymbol90 = Lit40;
        ModuleMethod moduleMethod = new ModuleMethod(runtime, 12, null, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        moduleMethod.setProperty("source-location", "/tmp/runtime5720098754470623974.scm:40");
        gen$Mnsimple$Mncomponent$Mntype = Macro.make(simpleSymbol90, moduleMethod, $instance);
        add$Mncomponent$Mnwithin$Mnrepl = new ModuleMethod(runtime, 13, Lit45, 16388);
        call$MnInitialize$Mnof$Mncomponents = new ModuleMethod(runtime, 14, Lit46, -4096);
        add$Mninit$Mnthunk = new ModuleMethod(runtime, 15, Lit47, 8194);
        get$Mninit$Mnthunk = new ModuleMethod(runtime, 16, Lit48, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        clear$Mninit$Mnthunks = new ModuleMethod(runtime, 17, Lit49, 0);
        lookup$Mncomponent = new ModuleMethod(runtime, 18, Lit52, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        set$Mnand$Mncoerce$Mnproperty$Ex = new ModuleMethod(runtime, 19, Lit53, 16388);
        get$Mnproperty = new ModuleMethod(runtime, 20, Lit54, 8194);
        coerce$Mnto$Mncomponent$Mnand$Mnverify = new ModuleMethod(runtime, 21, Lit55, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        get$Mnproperty$Mnand$Mncheck = new ModuleMethod(runtime, 22, Lit56, 12291);
        set$Mnand$Mncoerce$Mnproperty$Mnand$Mncheck$Ex = new ModuleMethod(runtime, 23, Lit57, 20485);
        symbol$Mnappend = new ModuleMethod(runtime, 24, Lit76, -4096);
        SimpleSymbol simpleSymbol91 = Lit77;
        ModuleMethod moduleMethod2 = new ModuleMethod(runtime, 25, null, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        moduleMethod2.setProperty("source-location", "/tmp/runtime5720098754470623974.scm:657");
        gen$Mnevent$Mnname = Macro.make(simpleSymbol91, moduleMethod2, $instance);
        SimpleSymbol simpleSymbol92 = Lit80;
        ModuleMethod moduleMethod3 = new ModuleMethod(runtime, 26, null, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        moduleMethod3.setProperty("source-location", "/tmp/runtime5720098754470623974.scm:665");
        gen$Mngeneric$Mnevent$Mnname = Macro.make(simpleSymbol92, moduleMethod3, $instance);
        SimpleSymbol simpleSymbol93 = Lit87;
        ModuleMethod moduleMethod4 = new ModuleMethod(runtime, 27, null, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        moduleMethod4.setProperty("source-location", "/tmp/runtime5720098754470623974.scm:721");
        define$Mnevent = Macro.make(simpleSymbol93, moduleMethod4, $instance);
        SimpleSymbol simpleSymbol94 = Lit96;
        ModuleMethod moduleMethod5 = new ModuleMethod(runtime, 28, null, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        moduleMethod5.setProperty("source-location", "/tmp/runtime5720098754470623974.scm:739");
        define$Mngeneric$Mnevent = Macro.make(simpleSymbol94, moduleMethod5, $instance);
        add$Mnto$Mncurrent$Mnform$Mnenvironment = new ModuleMethod(runtime, 29, Lit109, 8194);
        lookup$Mnin$Mncurrent$Mnform$Mnenvironment = new ModuleMethod(runtime, 30, Lit110, 8193);
        delete$Mnfrom$Mncurrent$Mnform$Mnenvironment = new ModuleMethod(runtime, 32, Lit111, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        rename$Mnin$Mncurrent$Mnform$Mnenvironment = new ModuleMethod(runtime, 33, Lit112, 8194);
        add$Mnglobal$Mnvar$Mnto$Mncurrent$Mnform$Mnenvironment = new ModuleMethod(runtime, 34, Lit113, 8194);
        lookup$Mnglobal$Mnvar$Mnin$Mncurrent$Mnform$Mnenvironment = new ModuleMethod(runtime, 35, Lit114, 8193);
        reset$Mncurrent$Mnform$Mnenvironment = new ModuleMethod(runtime, 37, Lit115, 0);
        foreach = Macro.makeNonHygienic(Lit116, new ModuleMethod(runtime, 38, null, 12291), $instance);
        $Styail$Mnbreak$St = new ModuleMethod(runtime, 39, Lit124, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        forrange = Macro.makeNonHygienic(Lit125, new ModuleMethod(runtime, 40, null, 20485), $instance);
        f258while = Macro.makeNonHygienic(Lit131, new ModuleMethod(runtime, 41, null, -4094), $instance);
        call$Mncomponent$Mnmethod = new ModuleMethod(runtime, 42, Lit149, 16388);
        call$Mncomponent$Mntype$Mnmethod = new ModuleMethod(runtime, 43, Lit150, 20485);
        call$Mnyail$Mnprimitive = new ModuleMethod(runtime, 44, Lit151, 16388);
        sanitize$Mncomponent$Mndata = new ModuleMethod(runtime, 45, Lit152, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        java$Mncollection$Mn$Gryail$Mnlist = new ModuleMethod(runtime, 46, Lit153, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        java$Mncollection$Mn$Grkawa$Mnlist = new ModuleMethod(runtime, 47, Lit154, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        sanitize$Mnatomic = new ModuleMethod(runtime, 48, Lit155, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        signal$Mnruntime$Mnerror = new ModuleMethod(runtime, 49, Lit156, 8194);
        signal$Mnruntime$Mnform$Mnerror = new ModuleMethod(runtime, 50, Lit157, 12291);
        yail$Mnnot = new ModuleMethod(runtime, 51, Lit158, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        call$Mnwith$Mncoerced$Mnargs = new ModuleMethod(runtime, 52, Lit159, 16388);
        $Pcset$Mnand$Mncoerce$Mnproperty$Ex = new ModuleMethod(runtime, 53, Lit160, 16388);
        $Pcset$Mnsubform$Mnlayout$Mnproperty$Ex = new ModuleMethod(runtime, 54, Lit161, 12291);
        generate$Mnruntime$Mntype$Mnerror = new ModuleMethod(runtime, 55, Lit162, 8194);
        show$Mnarglist$Mnno$Mnparens = new ModuleMethod(runtime, 56, Lit163, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        coerce$Mnargs = new ModuleMethod(runtime, 57, Lit164, 12291);
        coerce$Mnarg = new ModuleMethod(runtime, 58, Lit165, 8194);
        coerce$Mnto$Mntext = new ModuleMethod(runtime, 59, Lit166, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        coerce$Mnto$Mninstant = new ModuleMethod(runtime, 60, Lit167, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        coerce$Mnto$Mncomponent = new ModuleMethod(runtime, 61, Lit168, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        coerce$Mnto$Mncomponent$Mnof$Mntype = new ModuleMethod(runtime, 62, Lit169, 8194);
        type$Mn$Grclass = new ModuleMethod(runtime, 63, Lit170, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        coerce$Mnto$Mnnumber = new ModuleMethod(runtime, 64, Lit171, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        coerce$Mnto$Mnstring = new ModuleMethod(runtime, 65, Lit174, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        ModuleMethod moduleMethod6 = new ModuleMethod(runtime, 66, Lit175, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        moduleMethod6.setProperty("source-location", "/tmp/runtime5720098754470623974.scm:1403");
        get$Mndisplay$Mnrepresentation = moduleMethod6;
        ModuleMethod moduleMethod7 = new ModuleMethod(runtime, 67, null, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        moduleMethod7.setProperty("source-location", "/tmp/runtime5720098754470623974.scm:1413");
        lambda$Fn4 = moduleMethod7;
        ModuleMethod moduleMethod8 = new ModuleMethod(runtime, 68, null, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        moduleMethod8.setProperty("source-location", "/tmp/runtime5720098754470623974.scm:1436");
        lambda$Fn7 = moduleMethod8;
        join$Mnstrings = new ModuleMethod(runtime, 69, Lit176, 8194);
        string$Mnreplace = new ModuleMethod(runtime, 70, Lit177, 8194);
        coerce$Mnto$Mnyail$Mnlist = new ModuleMethod(runtime, 71, Lit178, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        coerce$Mnto$Mnboolean = new ModuleMethod(runtime, 72, Lit179, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        is$Mncoercible$Qu = new ModuleMethod(runtime, 73, Lit180, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        all$Mncoercible$Qu = new ModuleMethod(runtime, 74, Lit181, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        boolean$Mn$Grstring = new ModuleMethod(runtime, 75, Lit182, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        padded$Mnstring$Mn$Grnumber = new ModuleMethod(runtime, 76, Lit183, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        $Stformat$Mninexact$St = new ModuleMethod(runtime, 77, Lit184, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        appinventor$Mnnumber$Mn$Grstring = new ModuleMethod(runtime, 78, Lit185, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        yail$Mnequal$Qu = new ModuleMethod(runtime, 79, Lit186, 8194);
        yail$Mnatomic$Mnequal$Qu = new ModuleMethod(runtime, 80, Lit187, 8194);
        as$Mnnumber = new ModuleMethod(runtime, 81, Lit188, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        yail$Mnnot$Mnequal$Qu = new ModuleMethod(runtime, 82, Lit189, 8194);
        process$Mnand$Mndelayed = new ModuleMethod(runtime, 83, Lit190, -4096);
        process$Mnor$Mndelayed = new ModuleMethod(runtime, 84, Lit191, -4096);
        yail$Mnfloor = new ModuleMethod(runtime, 85, Lit192, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        yail$Mnceiling = new ModuleMethod(runtime, 86, Lit193, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        yail$Mnround = new ModuleMethod(runtime, 87, Lit194, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        random$Mnset$Mnseed = new ModuleMethod(runtime, 88, Lit195, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        random$Mnfraction = new ModuleMethod(runtime, 89, Lit196, 0);
        random$Mninteger = new ModuleMethod(runtime, 90, Lit197, 8194);
        ModuleMethod moduleMethod9 = new ModuleMethod(runtime, 91, null, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        moduleMethod9.setProperty("source-location", "/tmp/runtime5720098754470623974.scm:1726");
        lambda$Fn11 = moduleMethod9;
        yail$Mndivide = new ModuleMethod(runtime, 92, Lit198, 8194);
        degrees$Mn$Grradians$Mninternal = new ModuleMethod(runtime, 93, Lit199, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        radians$Mn$Grdegrees$Mninternal = new ModuleMethod(runtime, 94, Lit200, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        degrees$Mn$Grradians = new ModuleMethod(runtime, 95, Lit201, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        radians$Mn$Grdegrees = new ModuleMethod(runtime, 96, Lit202, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        sin$Mndegrees = new ModuleMethod(runtime, 97, Lit203, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        cos$Mndegrees = new ModuleMethod(runtime, 98, Lit204, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        tan$Mndegrees = new ModuleMethod(runtime, 99, Lit205, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        asin$Mndegrees = new ModuleMethod(runtime, 100, Lit206, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        acos$Mndegrees = new ModuleMethod(runtime, 101, Lit207, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        atan$Mndegrees = new ModuleMethod(runtime, 102, Lit208, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        atan2$Mndegrees = new ModuleMethod(runtime, 103, Lit209, 8194);
        string$Mnto$Mnupper$Mncase = new ModuleMethod(runtime, 104, Lit210, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        string$Mnto$Mnlower$Mncase = new ModuleMethod(runtime, 105, Lit211, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        format$Mnas$Mndecimal = new ModuleMethod(runtime, 106, Lit212, 8194);
        is$Mnnumber$Qu = new ModuleMethod(runtime, 107, Lit213, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        is$Mnbase10$Qu = new ModuleMethod(runtime, 108, Lit214, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        is$Mnhexadecimal$Qu = new ModuleMethod(runtime, 109, Lit215, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        is$Mnbinary$Qu = new ModuleMethod(runtime, 110, Lit216, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        math$Mnconvert$Mndec$Mnhex = new ModuleMethod(runtime, 111, Lit217, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        math$Mnconvert$Mnhex$Mndec = new ModuleMethod(runtime, 112, Lit218, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        math$Mnconvert$Mnbin$Mndec = new ModuleMethod(runtime, 113, Lit219, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        math$Mnconvert$Mndec$Mnbin = new ModuleMethod(runtime, 114, Lit220, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        patched$Mnnumber$Mn$Grstring$Mnbinary = new ModuleMethod(runtime, 115, Lit221, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        alternate$Mnnumber$Mn$Grstring$Mnbinary = new ModuleMethod(runtime, 116, Lit222, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        internal$Mnbinary$Mnconvert = new ModuleMethod(runtime, 117, Lit223, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        yail$Mnlist$Qu = new ModuleMethod(runtime, 118, Lit224, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        yail$Mnlist$Mncandidate$Qu = new ModuleMethod(runtime, 119, Lit225, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        yail$Mnlist$Mncontents = new ModuleMethod(runtime, 120, Lit226, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        set$Mnyail$Mnlist$Mncontents$Ex = new ModuleMethod(runtime, 121, Lit227, 8194);
        insert$Mnyail$Mnlist$Mnheader = new ModuleMethod(runtime, 122, Lit228, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        kawa$Mnlist$Mn$Gryail$Mnlist = new ModuleMethod(runtime, 123, Lit229, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        yail$Mnlist$Mn$Grkawa$Mnlist = new ModuleMethod(runtime, 124, Lit230, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        yail$Mnlist$Mnempty$Qu = new ModuleMethod(runtime, 125, Lit231, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        make$Mnyail$Mnlist = new ModuleMethod(runtime, 126, Lit232, -4096);
        yail$Mnlist$Mncopy = new ModuleMethod(runtime, 127, Lit233, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        yail$Mnlist$Mnreverse = new ModuleMethod(runtime, 128, Lit234, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        yail$Mnlist$Mnto$Mncsv$Mntable = new ModuleMethod(runtime, 129, Lit235, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        yail$Mnlist$Mnto$Mncsv$Mnrow = new ModuleMethod(runtime, 130, Lit236, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        convert$Mnto$Mnstrings$Mnfor$Mncsv = new ModuleMethod(runtime, 131, Lit237, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        yail$Mnlist$Mnfrom$Mncsv$Mntable = new ModuleMethod(runtime, 132, Lit238, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        yail$Mnlist$Mnfrom$Mncsv$Mnrow = new ModuleMethod(runtime, 133, Lit239, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        yail$Mnlist$Mnlength = new ModuleMethod(runtime, 134, Lit240, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        yail$Mnlist$Mnindex = new ModuleMethod(runtime, 135, Lit241, 8194);
        yail$Mnlist$Mnget$Mnitem = new ModuleMethod(runtime, 136, Lit242, 8194);
        yail$Mnlist$Mnset$Mnitem$Ex = new ModuleMethod(runtime, 137, Lit243, 12291);
        yail$Mnlist$Mnremove$Mnitem$Ex = new ModuleMethod(runtime, 138, Lit244, 8194);
        yail$Mnlist$Mninsert$Mnitem$Ex = new ModuleMethod(runtime, 139, Lit245, 12291);
        yail$Mnlist$Mnappend$Ex = new ModuleMethod(runtime, 140, Lit246, 8194);
        yail$Mnlist$Mnadd$Mnto$Mnlist$Ex = new ModuleMethod(runtime, 141, Lit247, -4095);
        yail$Mnlist$Mnmember$Qu = new ModuleMethod(runtime, 142, Lit248, 8194);
        yail$Mnlist$Mnpick$Mnrandom = new ModuleMethod(runtime, 143, Lit249, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        yail$Mnfor$Mneach = new ModuleMethod(runtime, 144, Lit250, 8194);
        yail$Mnfor$Mnrange = new ModuleMethod(runtime, 145, Lit251, 16388);
        yail$Mnfor$Mnrange$Mnwith$Mnnumeric$Mnchecked$Mnargs = new ModuleMethod(runtime, 146, Lit252, 16388);
        yail$Mnnumber$Mnrange = new ModuleMethod(runtime, 147, Lit253, 8194);
        yail$Mnalist$Mnlookup = new ModuleMethod(runtime, 148, Lit254, 12291);
        pair$Mnok$Qu = new ModuleMethod(runtime, 149, Lit255, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        yail$Mnlist$Mnjoin$Mnwith$Mnseparator = new ModuleMethod(runtime, 150, Lit256, 8194);
        make$Mndisjunct = new ModuleMethod(runtime, 151, Lit257, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        array$Mn$Grlist = new ModuleMethod(runtime, 152, Lit258, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        string$Mnstarts$Mnat = new ModuleMethod(runtime, 153, Lit259, 8194);
        string$Mncontains = new ModuleMethod(runtime, 154, Lit260, 8194);
        string$Mnsplit$Mnat$Mnfirst = new ModuleMethod(runtime, 155, Lit261, 8194);
        string$Mnsplit$Mnat$Mnfirst$Mnof$Mnany = new ModuleMethod(runtime, 156, Lit262, 8194);
        string$Mnsplit = new ModuleMethod(runtime, 157, Lit263, 8194);
        string$Mnsplit$Mnat$Mnany = new ModuleMethod(runtime, 158, Lit264, 8194);
        string$Mnsplit$Mnat$Mnspaces = new ModuleMethod(runtime, 159, Lit265, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        string$Mnsubstring = new ModuleMethod(runtime, ComponentConstants.TEXTBOX_PREFERRED_WIDTH, Lit266, 12291);
        string$Mntrim = new ModuleMethod(runtime, 161, Lit267, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        string$Mnreplace$Mnall = new ModuleMethod(runtime, 162, Lit268, 12291);
        string$Mnempty$Qu = new ModuleMethod(runtime, 163, Lit269, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        text$Mndeobfuscate = new ModuleMethod(runtime, 164, Lit270, 8194);
        make$Mnexact$Mnyail$Mninteger = new ModuleMethod(runtime, 165, Lit271, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        make$Mncolor = new ModuleMethod(runtime, 166, Lit272, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        split$Mncolor = new ModuleMethod(runtime, 167, Lit273, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        close$Mnscreen = new ModuleMethod(runtime, 168, Lit274, 0);
        close$Mnapplication = new ModuleMethod(runtime, 169, Lit275, 0);
        open$Mnanother$Mnscreen = new ModuleMethod(runtime, 170, Lit276, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        open$Mnanother$Mnscreen$Mnwith$Mnstart$Mnvalue = new ModuleMethod(runtime, 171, Lit277, 8194);
        get$Mnstart$Mnvalue = new ModuleMethod(runtime, 172, Lit278, 0);
        close$Mnscreen$Mnwith$Mnvalue = new ModuleMethod(runtime, 173, Lit279, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        get$Mnplain$Mnstart$Mntext = new ModuleMethod(runtime, 174, Lit280, 0);
        close$Mnscreen$Mnwith$Mnplain$Mntext = new ModuleMethod(runtime, 175, Lit281, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        get$Mnserver$Mnaddress$Mnfrom$Mnwifi = new ModuleMethod(runtime, 176, Lit282, 0);
        in$Mnui = new ModuleMethod(runtime, 177, Lit285, 8194);
        send$Mnto$Mnblock = new ModuleMethod(runtime, 178, Lit286, 8194);
        clear$Mncurrent$Mnform = new ModuleMethod(runtime, 179, Lit287, 0);
        set$Mnform$Mnname = new ModuleMethod(runtime, 180, Lit288, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        remove$Mncomponent = new ModuleMethod(runtime, 181, Lit289, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        rename$Mncomponent = new ModuleMethod(runtime, 182, Lit290, 8194);
        init$Mnruntime = new ModuleMethod(runtime, 183, Lit291, 0);
        set$Mnthis$Mnform = new ModuleMethod(runtime, 184, Lit292, 0);
        clarify = new ModuleMethod(runtime, YaVersion.YOUNG_ANDROID_VERSION, Lit293, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        clarify1 = new ModuleMethod(runtime, 186, Lit294, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
    }

    static Object lambda16(Object stx) {
        Object[] allocVars = SyntaxPattern.allocVars(2, null);
        if (!Lit41.match(stx, allocVars, 0)) {
            return syntax_case.error("syntax-case", stx);
        }
        Object[] objArr = new Object[3];
        objArr[0] = "";
        objArr[1] = "";
        Object execute = Lit42.execute(allocVars, TemplateScope.make());
        try {
            objArr[2] = misc.symbol$To$String((Symbol) execute);
            return std_syntax.datum$To$SyntaxObject(stx, strings.stringAppend(objArr));
        } catch (ClassCastException e) {
            throw new WrongType(e, "symbol->string", 1, execute);
        }
    }

    public static Object addComponentWithinRepl(Object container$Mnname, Object component$Mntype, Object componentName, Object initPropsThunk) {
        frame frame6 = new frame();
        frame6.component$Mnname = componentName;
        frame6.init$Mnprops$Mnthunk = initPropsThunk;
        try {
            Object lookupInCurrentFormEnvironment = lookupInCurrentFormEnvironment((Symbol) container$Mnname);
            try {
                ComponentContainer container = (ComponentContainer) lookupInCurrentFormEnvironment;
                Object obj = frame6.component$Mnname;
                try {
                    frame6.existing$Mncomponent = lookupInCurrentFormEnvironment((Symbol) obj);
                    frame6.component$Mnto$Mnadd = Invoke.make.apply2(component$Mntype, container);
                    Object obj2 = frame6.component$Mnname;
                    try {
                        addToCurrentFormEnvironment((Symbol) obj2, frame6.component$Mnto$Mnadd);
                        return addInitThunk(frame6.component$Mnname, frame6.lambda$Fn1);
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "add-to-current-form-environment", 0, obj2);
                    }
                } catch (ClassCastException e2) {
                    throw new WrongType(e2, "lookup-in-current-form-environment", 0, obj);
                }
            } catch (ClassCastException e3) {
                throw new WrongType(e3, "container", -2, lookupInCurrentFormEnvironment);
            }
        } catch (ClassCastException e4) {
            throw new WrongType(e4, "lookup-in-current-form-environment", 0, container$Mnname);
        }
    }

    public int match4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4, CallContext callContext) {
        switch (moduleMethod.selector) {
            case 13:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.value3 = obj3;
                callContext.value4 = obj4;
                callContext.proc = moduleMethod;
                callContext.f231pc = 4;
                return 0;
            case 19:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.value3 = obj3;
                callContext.value4 = obj4;
                callContext.proc = moduleMethod;
                callContext.f231pc = 4;
                return 0;
            case 42:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.value3 = obj3;
                callContext.value4 = obj4;
                callContext.proc = moduleMethod;
                callContext.f231pc = 4;
                return 0;
            case 44:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.value3 = obj3;
                callContext.value4 = obj4;
                callContext.proc = moduleMethod;
                callContext.f231pc = 4;
                return 0;
            case 52:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.value3 = obj3;
                callContext.value4 = obj4;
                callContext.proc = moduleMethod;
                callContext.f231pc = 4;
                return 0;
            case 53:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.value3 = obj3;
                callContext.value4 = obj4;
                callContext.proc = moduleMethod;
                callContext.f231pc = 4;
                return 0;
            case 145:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.value3 = obj3;
                callContext.value4 = obj4;
                callContext.proc = moduleMethod;
                callContext.f231pc = 4;
                return 0;
            case 146:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.value3 = obj3;
                callContext.value4 = obj4;
                callContext.proc = moduleMethod;
                callContext.f231pc = 4;
                return 0;
            default:
                return super.match4(moduleMethod, obj, obj2, obj3, obj4, callContext);
        }
    }

    public static Object call$MnInitializeOfComponents$V(Object[] argsArray) {
        Object makeList = LList.makeList(argsArray, 0);
        Object obj = makeList;
        while (obj != LList.Empty) {
            try {
                Pair arg0 = (Pair) obj;
                Object init$Mnthunk = getInitThunk(arg0.getCar());
                if (init$Mnthunk != Boolean.FALSE) {
                    Scheme.applyToArgs.apply1(init$Mnthunk);
                }
                obj = arg0.getCdr();
            } catch (ClassCastException e) {
                throw new WrongType(e, "arg0", -2, obj);
            }
        }
        Object arg02 = makeList;
        while (arg02 != LList.Empty) {
            try {
                Pair arg03 = (Pair) arg02;
                Object component$Mnname = arg03.getCar();
                try {
                    ((Form) $Stthis$Mnform$St).callInitialize(lookupInCurrentFormEnvironment((Symbol) component$Mnname));
                    arg02 = arg03.getCdr();
                } catch (ClassCastException e2) {
                    throw new WrongType(e2, "lookup-in-current-form-environment", 0, component$Mnname);
                }
            } catch (ClassCastException e3) {
                throw new WrongType(e3, "arg0", -2, arg02);
            }
        }
        return Values.empty;
    }

    public int matchN(ModuleMethod moduleMethod, Object[] objArr, CallContext callContext) {
        switch (moduleMethod.selector) {
            case 14:
                callContext.values = objArr;
                callContext.proc = moduleMethod;
                callContext.f231pc = 5;
                return 0;
            case 23:
                callContext.values = objArr;
                callContext.proc = moduleMethod;
                callContext.f231pc = 5;
                return 0;
            case 24:
                callContext.values = objArr;
                callContext.proc = moduleMethod;
                callContext.f231pc = 5;
                return 0;
            case 40:
                callContext.values = objArr;
                callContext.proc = moduleMethod;
                callContext.f231pc = 5;
                return 0;
            case 41:
                callContext.values = objArr;
                callContext.proc = moduleMethod;
                callContext.f231pc = 5;
                return 0;
            case 43:
                callContext.values = objArr;
                callContext.proc = moduleMethod;
                callContext.f231pc = 5;
                return 0;
            case 83:
                callContext.values = objArr;
                callContext.proc = moduleMethod;
                callContext.f231pc = 5;
                return 0;
            case 84:
                callContext.values = objArr;
                callContext.proc = moduleMethod;
                callContext.f231pc = 5;
                return 0;
            case 126:
                callContext.values = objArr;
                callContext.proc = moduleMethod;
                callContext.f231pc = 5;
                return 0;
            case 141:
                callContext.values = objArr;
                callContext.proc = moduleMethod;
                callContext.f231pc = 5;
                return 0;
            default:
                return super.matchN(moduleMethod, objArr, callContext);
        }
    }

    public static Object addInitThunk(Object component$Mnname, Object thunk) {
        return Invoke.invokeStatic.applyN(new Object[]{KawaEnvironment, Lit0, $Stinit$Mnthunk$Mnenvironment$St, component$Mnname, thunk});
    }

    public int match2(ModuleMethod moduleMethod, Object obj, Object obj2, CallContext callContext) {
        switch (moduleMethod.selector) {
            case 15:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.proc = moduleMethod;
                callContext.f231pc = 2;
                return 0;
            case 20:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.proc = moduleMethod;
                callContext.f231pc = 2;
                return 0;
            case 29:
                if (!(obj instanceof Symbol)) {
                    return -786431;
                }
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.proc = moduleMethod;
                callContext.f231pc = 2;
                return 0;
            case 30:
                if (!(obj instanceof Symbol)) {
                    return -786431;
                }
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.proc = moduleMethod;
                callContext.f231pc = 2;
                return 0;
            case 33:
                if (!(obj instanceof Symbol)) {
                    return -786431;
                }
                callContext.value1 = obj;
                if (!(obj2 instanceof Symbol)) {
                    return -786430;
                }
                callContext.value2 = obj2;
                callContext.proc = moduleMethod;
                callContext.f231pc = 2;
                return 0;
            case 34:
                if (!(obj instanceof Symbol)) {
                    return -786431;
                }
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.proc = moduleMethod;
                callContext.f231pc = 2;
                return 0;
            case 35:
                if (!(obj instanceof Symbol)) {
                    return -786431;
                }
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.proc = moduleMethod;
                callContext.f231pc = 2;
                return 0;
            case 49:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.proc = moduleMethod;
                callContext.f231pc = 2;
                return 0;
            case 55:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.proc = moduleMethod;
                callContext.f231pc = 2;
                return 0;
            case 58:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.proc = moduleMethod;
                callContext.f231pc = 2;
                return 0;
            case 62:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.proc = moduleMethod;
                callContext.f231pc = 2;
                return 0;
            case 69:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.proc = moduleMethod;
                callContext.f231pc = 2;
                return 0;
            case 70:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.proc = moduleMethod;
                callContext.f231pc = 2;
                return 0;
            case 79:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.proc = moduleMethod;
                callContext.f231pc = 2;
                return 0;
            case 80:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.proc = moduleMethod;
                callContext.f231pc = 2;
                return 0;
            case 82:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.proc = moduleMethod;
                callContext.f231pc = 2;
                return 0;
            case 90:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.proc = moduleMethod;
                callContext.f231pc = 2;
                return 0;
            case 92:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.proc = moduleMethod;
                callContext.f231pc = 2;
                return 0;
            case 103:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.proc = moduleMethod;
                callContext.f231pc = 2;
                return 0;
            case 106:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.proc = moduleMethod;
                callContext.f231pc = 2;
                return 0;
            case 121:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.proc = moduleMethod;
                callContext.f231pc = 2;
                return 0;
            case 135:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.proc = moduleMethod;
                callContext.f231pc = 2;
                return 0;
            case 136:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.proc = moduleMethod;
                callContext.f231pc = 2;
                return 0;
            case 138:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.proc = moduleMethod;
                callContext.f231pc = 2;
                return 0;
            case 140:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.proc = moduleMethod;
                callContext.f231pc = 2;
                return 0;
            case 142:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.proc = moduleMethod;
                callContext.f231pc = 2;
                return 0;
            case 144:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.proc = moduleMethod;
                callContext.f231pc = 2;
                return 0;
            case 147:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.proc = moduleMethod;
                callContext.f231pc = 2;
                return 0;
            case 150:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.proc = moduleMethod;
                callContext.f231pc = 2;
                return 0;
            case 153:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.proc = moduleMethod;
                callContext.f231pc = 2;
                return 0;
            case 154:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.proc = moduleMethod;
                callContext.f231pc = 2;
                return 0;
            case 155:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.proc = moduleMethod;
                callContext.f231pc = 2;
                return 0;
            case 156:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.proc = moduleMethod;
                callContext.f231pc = 2;
                return 0;
            case 157:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.proc = moduleMethod;
                callContext.f231pc = 2;
                return 0;
            case 158:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.proc = moduleMethod;
                callContext.f231pc = 2;
                return 0;
            case 164:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.proc = moduleMethod;
                callContext.f231pc = 2;
                return 0;
            case 171:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.proc = moduleMethod;
                callContext.f231pc = 2;
                return 0;
            case 177:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.proc = moduleMethod;
                callContext.f231pc = 2;
                return 0;
            case 178:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.proc = moduleMethod;
                callContext.f231pc = 2;
                return 0;
            case 182:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.proc = moduleMethod;
                callContext.f231pc = 2;
                return 0;
            default:
                return super.match2(moduleMethod, obj, obj2, callContext);
        }
    }

    public static Object getInitThunk(Object component$Mnname) {
        Object obj = $Stinit$Mnthunk$Mnenvironment$St;
        try {
            try {
                boolean x = ((Environment) obj).isBound((Symbol) component$Mnname);
                if (x) {
                    return Invoke.invokeStatic.apply4(KawaEnvironment, Lit1, $Stinit$Mnthunk$Mnenvironment$St, component$Mnname);
                }
                return x ? Boolean.TRUE : Boolean.FALSE;
            } catch (ClassCastException e) {
                throw new WrongType(e, "gnu.mapping.Environment.isBound(gnu.mapping.Symbol)", 2, component$Mnname);
            }
        } catch (ClassCastException e2) {
            throw new WrongType(e2, "gnu.mapping.Environment.isBound(gnu.mapping.Symbol)", 1, obj);
        }
    }

    public static void clearInitThunks() {
        $Stinit$Mnthunk$Mnenvironment$St = Environment.make("init-thunk-environment");
    }

    public int match0(ModuleMethod moduleMethod, CallContext callContext) {
        switch (moduleMethod.selector) {
            case 17:
                callContext.proc = moduleMethod;
                callContext.f231pc = 0;
                return 0;
            case 37:
                callContext.proc = moduleMethod;
                callContext.f231pc = 0;
                return 0;
            case 89:
                callContext.proc = moduleMethod;
                callContext.f231pc = 0;
                return 0;
            case 168:
                callContext.proc = moduleMethod;
                callContext.f231pc = 0;
                return 0;
            case 169:
                callContext.proc = moduleMethod;
                callContext.f231pc = 0;
                return 0;
            case 172:
                callContext.proc = moduleMethod;
                callContext.f231pc = 0;
                return 0;
            case 174:
                callContext.proc = moduleMethod;
                callContext.f231pc = 0;
                return 0;
            case 176:
                callContext.proc = moduleMethod;
                callContext.f231pc = 0;
                return 0;
            case 179:
                callContext.proc = moduleMethod;
                callContext.f231pc = 0;
                return 0;
            case 183:
                callContext.proc = moduleMethod;
                callContext.f231pc = 0;
                return 0;
            case 184:
                callContext.proc = moduleMethod;
                callContext.f231pc = 0;
                return 0;
            default:
                return super.match0(moduleMethod, callContext);
        }
    }

    public static Object lookupComponent(Object comp$Mnname) {
        try {
            Object verified = lookupInCurrentFormEnvironment((Symbol) comp$Mnname, Boolean.FALSE);
            return verified != Boolean.FALSE ? verified : Lit2;
        } catch (ClassCastException e) {
            throw new WrongType(e, "lookup-in-current-form-environment", 0, comp$Mnname);
        }
    }

    public static Object setAndCoerceProperty$Ex(Object component, Object prop$Mnsym, Object property$Mnvalue, Object property$Mntype) {
        return $PcSetAndCoerceProperty$Ex(coerceToComponentAndVerify(component), prop$Mnsym, property$Mnvalue, property$Mntype);
    }

    public static Object getProperty$1(Object component, Object prop$Mnname) {
        return sanitizeComponentData(Invoke.invoke.apply2(coerceToComponentAndVerify(component), prop$Mnname));
    }

    public static Object coerceToComponentAndVerify(Object possible$Mncomponent) {
        Object component = coerceToComponent(possible$Mncomponent);
        if (component instanceof Component) {
            return component;
        }
        return signalRuntimeError(strings.stringAppend("Cannot find the component: ", getDisplayRepresentation(possible$Mncomponent)), "Problem with application");
    }

    public static Object getPropertyAndCheck(Object possible$Mncomponent, Object component$Mntype, Object prop$Mnname) {
        Object component = coerceToComponentOfType(possible$Mncomponent, component$Mntype);
        if (component instanceof Component) {
            return sanitizeComponentData(Invoke.invoke.apply2(component, prop$Mnname));
        }
        return signalRuntimeError(Format.formatToString(0, "Property getter was expecting a ~A component but got a ~A instead.", component$Mntype, possible$Mncomponent.getClass().getSimpleName()), "Problem with application");
    }

    public int match3(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, CallContext callContext) {
        switch (moduleMethod.selector) {
            case 22:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.value3 = obj3;
                callContext.proc = moduleMethod;
                callContext.f231pc = 3;
                return 0;
            case 38:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.value3 = obj3;
                callContext.proc = moduleMethod;
                callContext.f231pc = 3;
                return 0;
            case 50:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.value3 = obj3;
                callContext.proc = moduleMethod;
                callContext.f231pc = 3;
                return 0;
            case 54:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.value3 = obj3;
                callContext.proc = moduleMethod;
                callContext.f231pc = 3;
                return 0;
            case 57:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.value3 = obj3;
                callContext.proc = moduleMethod;
                callContext.f231pc = 3;
                return 0;
            case 137:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.value3 = obj3;
                callContext.proc = moduleMethod;
                callContext.f231pc = 3;
                return 0;
            case 139:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.value3 = obj3;
                callContext.proc = moduleMethod;
                callContext.f231pc = 3;
                return 0;
            case 148:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.value3 = obj3;
                callContext.proc = moduleMethod;
                callContext.f231pc = 3;
                return 0;
            case ComponentConstants.TEXTBOX_PREFERRED_WIDTH /*160*/:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.value3 = obj3;
                callContext.proc = moduleMethod;
                callContext.f231pc = 3;
                return 0;
            case 162:
                callContext.value1 = obj;
                callContext.value2 = obj2;
                callContext.value3 = obj3;
                callContext.proc = moduleMethod;
                callContext.f231pc = 3;
                return 0;
            default:
                return super.match3(moduleMethod, obj, obj2, obj3, callContext);
        }
    }

    public static Object setAndCoercePropertyAndCheck$Ex(Object possible$Mncomponent, Object comp$Mntype, Object prop$Mnsym, Object property$Mnvalue, Object property$Mntype) {
        Object component = coerceToComponentOfType(possible$Mncomponent, comp$Mntype);
        if (component instanceof Component) {
            return $PcSetAndCoerceProperty$Ex(component, prop$Mnsym, property$Mnvalue, property$Mntype);
        }
        return signalRuntimeError(Format.formatToString(0, "Property setter was expecting a ~A component but got a ~A instead.", comp$Mntype, possible$Mncomponent.getClass().getSimpleName()), "Problem with application");
    }

    public static SimpleSymbol symbolAppend$V(Object[] argsArray) {
        LList symbols = LList.makeList(argsArray, 0);
        Apply apply = Scheme.apply;
        ModuleMethod moduleMethod = strings.string$Mnappend;
        Object obj = LList.Empty;
        Object obj2 = symbols;
        while (obj2 != LList.Empty) {
            try {
                Pair arg0 = (Pair) obj2;
                Object arg02 = arg0.getCdr();
                Object car = arg0.getCar();
                try {
                    obj = Pair.make(misc.symbol$To$String((Symbol) car), obj);
                    obj2 = arg02;
                } catch (ClassCastException e) {
                    throw new WrongType(e, "symbol->string", 1, car);
                }
            } catch (ClassCastException e2) {
                throw new WrongType(e2, "arg0", -2, obj2);
            }
        }
        Object apply2 = apply.apply2(moduleMethod, LList.reverseInPlace(obj));
        try {
            return misc.string$To$Symbol((CharSequence) apply2);
        } catch (ClassCastException e3) {
            throw new WrongType(e3, "string->symbol", 1, apply2);
        }
    }

    static Object lambda17(Object stx) {
        Object[] allocVars = SyntaxPattern.allocVars(3, null);
        if (!Lit78.match(stx, allocVars, 0)) {
            return syntax_case.error("syntax-case", stx);
        }
        return std_syntax.datum$To$SyntaxObject(stx, Lit79.execute(allocVars, TemplateScope.make()));
    }

    static Object lambda18(Object stx) {
        Object[] allocVars = SyntaxPattern.allocVars(3, null);
        if (!Lit81.match(stx, allocVars, 0)) {
            return syntax_case.error("syntax-case", stx);
        }
        return std_syntax.datum$To$SyntaxObject(stx, Lit82.execute(allocVars, TemplateScope.make()));
    }

    static Object lambda19(Object stx) {
        Object[] allocVars = SyntaxPattern.allocVars(5, null);
        if (!Lit88.match(stx, allocVars, 0)) {
            return syntax_case.error("syntax-case", stx);
        }
        TemplateScope make = TemplateScope.make();
        return Quote.append$V(new Object[]{Lit89.execute(allocVars, make), Pair.make(Quote.append$V(new Object[]{Lit90.execute(allocVars, make), Quote.consX$V(new Object[]{symbolAppend$V(new Object[]{Lit91.execute(allocVars, make), Lit92, Lit93.execute(allocVars, make)}), Lit94.execute(allocVars, make)})}), Lit95.execute(allocVars, make))});
    }

    static Object lambda20(Object stx) {
        Object[] allocVars = SyntaxPattern.allocVars(5, null);
        if (!Lit97.match(stx, allocVars, 0)) {
            return syntax_case.error("syntax-case", stx);
        }
        TemplateScope make = TemplateScope.make();
        return Quote.append$V(new Object[]{Lit98.execute(allocVars, make), Pair.make(Quote.append$V(new Object[]{Lit99.execute(allocVars, make), Quote.consX$V(new Object[]{symbolAppend$V(new Object[]{Lit100, Lit101.execute(allocVars, make), Lit92, Lit102.execute(allocVars, make)}), Lit103.execute(allocVars, make)})}), Lit104.execute(allocVars, make))});
    }

    public Object apply1(ModuleMethod moduleMethod, Object obj) {
        switch (moduleMethod.selector) {
            case 11:
                androidLog(obj);
                return Values.empty;
            case 12:
                return lambda16(obj);
            case 16:
                return getInitThunk(obj);
            case 18:
                return lookupComponent(obj);
            case 21:
                return coerceToComponentAndVerify(obj);
            case 25:
                return lambda17(obj);
            case 26:
                return lambda18(obj);
            case 27:
                return lambda19(obj);
            case 28:
                return lambda20(obj);
            case 30:
                try {
                    return lookupInCurrentFormEnvironment((Symbol) obj);
                } catch (ClassCastException e) {
                    throw new WrongType(e, "lookup-in-current-form-environment", 1, obj);
                }
            case 32:
                try {
                    return deleteFromCurrentFormEnvironment((Symbol) obj);
                } catch (ClassCastException e2) {
                    throw new WrongType(e2, "delete-from-current-form-environment", 1, obj);
                }
            case 35:
                try {
                    return lookupGlobalVarInCurrentFormEnvironment((Symbol) obj);
                } catch (ClassCastException e3) {
                    throw new WrongType(e3, "lookup-global-var-in-current-form-environment", 1, obj);
                }
            case 39:
                return $StYailBreak$St(obj);
            case 45:
                return sanitizeComponentData(obj);
            case 46:
                try {
                    return javaCollection$To$YailList((Collection) obj);
                } catch (ClassCastException e4) {
                    throw new WrongType(e4, "java-collection->yail-list", 1, obj);
                }
            case 47:
                try {
                    return javaCollection$To$KawaList((Collection) obj);
                } catch (ClassCastException e5) {
                    throw new WrongType(e5, "java-collection->kawa-list", 1, obj);
                }
            case 48:
                return sanitizeAtomic(obj);
            case 51:
                return yailNot(obj) ? Boolean.TRUE : Boolean.FALSE;
            case 56:
                return showArglistNoParens(obj);
            case 59:
                return coerceToText(obj);
            case 60:
                return coerceToInstant(obj);
            case 61:
                return coerceToComponent(obj);
            case 63:
                return type$To$Class(obj);
            case 64:
                return coerceToNumber(obj);
            case 65:
                return coerceToString(obj);
            case 66:
                return getDisplayRepresentation(obj);
            case 67:
                return lambda4(obj);
            case 68:
                return lambda7(obj);
            case 71:
                return coerceToYailList(obj);
            case 72:
                return coerceToBoolean(obj);
            case 73:
                return isIsCoercible(obj) ? Boolean.TRUE : Boolean.FALSE;
            case 74:
                return isAllCoercible(obj);
            case 75:
                return boolean$To$String(obj);
            case 76:
                return paddedString$To$Number(obj);
            case 77:
                return $StFormatInexact$St(obj);
            case 78:
                return appinventorNumber$To$String(obj);
            case 81:
                return asNumber(obj);
            case 85:
                return yailFloor(obj);
            case 86:
                return yailCeiling(obj);
            case 87:
                return yailRound(obj);
            case 88:
                return randomSetSeed(obj);
            case 91:
                return lambda11(obj);
            case 93:
                return degrees$To$RadiansInternal(obj);
            case 94:
                return radians$To$DegreesInternal(obj);
            case 95:
                return degrees$To$Radians(obj);
            case 96:
                return radians$To$Degrees(obj);
            case 97:
                return Double.valueOf(sinDegrees(obj));
            case 98:
                return Double.valueOf(cosDegrees(obj));
            case 99:
                return Double.valueOf(tanDegrees(obj));
            case 100:
                return asinDegrees(obj);
            case 101:
                return acosDegrees(obj);
            case 102:
                return atanDegrees(obj);
            case 104:
                return stringToUpperCase(obj);
            case 105:
                return stringToLowerCase(obj);
            case 107:
                return isIsNumber(obj);
            case 108:
                return isIsBase10(obj) ? Boolean.TRUE : Boolean.FALSE;
            case 109:
                return isIsHexadecimal(obj) ? Boolean.TRUE : Boolean.FALSE;
            case 110:
                return isIsBinary(obj) ? Boolean.TRUE : Boolean.FALSE;
            case 111:
                return mathConvertDecHex(obj);
            case 112:
                return mathConvertHexDec(obj);
            case 113:
                return mathConvertBinDec(obj);
            case 114:
                return mathConvertDecBin(obj);
            case 115:
                return patchedNumber$To$StringBinary(obj);
            case 116:
                return alternateNumber$To$StringBinary(obj);
            case 117:
                return internalBinaryConvert(obj);
            case 118:
                return isYailList(obj);
            case 119:
                return isYailListCandidate(obj);
            case 120:
                return yailListContents(obj);
            case 122:
                return insertYailListHeader(obj);
            case 123:
                return kawaList$To$YailList(obj);
            case 124:
                return yailList$To$KawaList(obj);
            case 125:
                return isYailListEmpty(obj);
            case 127:
                return yailListCopy(obj);
            case 128:
                return yailListReverse(obj);
            case 129:
                return yailListToCsvTable(obj);
            case 130:
                return yailListToCsvRow(obj);
            case 131:
                return convertToStringsForCsv(obj);
            case 132:
                return yailListFromCsvTable(obj);
            case 133:
                return yailListFromCsvRow(obj);
            case 134:
                return Integer.valueOf(yailListLength(obj));
            case 143:
                return yailListPickRandom(obj);
            case 149:
                return isPairOk(obj);
            case 151:
                return makeDisjunct(obj);
            case 152:
                return array$To$List(obj);
            case 159:
                return stringSplitAtSpaces(obj);
            case 161:
                return stringTrim(obj);
            case 163:
                return isStringEmpty(obj);
            case 165:
                return makeExactYailInteger(obj);
            case 166:
                return makeColor(obj);
            case 167:
                return splitColor(obj);
            case 170:
                openAnotherScreen(obj);
                return Values.empty;
            case 173:
                closeScreenWithValue(obj);
                return Values.empty;
            case 175:
                closeScreenWithPlainText(obj);
                return Values.empty;
            case 180:
                return setFormName(obj);
            case 181:
                return removeComponent(obj);
            case YaVersion.YOUNG_ANDROID_VERSION /*185*/:
                return clarify(obj);
            case 186:
                return clarify1(obj);
            default:
                return super.apply1(moduleMethod, obj);
        }
    }

    public static Object addToCurrentFormEnvironment(Symbol name, Object object) {
        if ($Stthis$Mnform$St != null) {
            return Invoke.invokeStatic.applyN(new Object[]{KawaEnvironment, Lit0, SlotGet.getSlotValue(false, $Stthis$Mnform$St, "form-environment", "form$Mnenvironment", "getFormEnvironment", "isFormEnvironment", Scheme.instance), name, object});
        }
        return Invoke.invokeStatic.applyN(new Object[]{KawaEnvironment, Lit0, $Sttest$Mnenvironment$St, name, object});
    }

    public static Object lookupInCurrentFormEnvironment(Symbol name, Object default$Mnvalue) {
        Object env = $Stthis$Mnform$St != null ? SlotGet.getSlotValue(false, $Stthis$Mnform$St, "form-environment", "form$Mnenvironment", "getFormEnvironment", "isFormEnvironment", Scheme.instance) : $Sttest$Mnenvironment$St;
        try {
            if (((Environment) env).isBound(name)) {
                return Invoke.invokeStatic.apply4(KawaEnvironment, Lit1, env, name);
            }
            return default$Mnvalue;
        } catch (ClassCastException e) {
            throw new WrongType(e, "gnu.mapping.Environment.isBound(gnu.mapping.Symbol)", 1, env);
        }
    }

    public static Object deleteFromCurrentFormEnvironment(Symbol name) {
        if ($Stthis$Mnform$St != null) {
            return Invoke.invokeStatic.apply4(KawaEnvironment, Lit3, SlotGet.getSlotValue(false, $Stthis$Mnform$St, "form-environment", "form$Mnenvironment", "getFormEnvironment", "isFormEnvironment", Scheme.instance), name);
        }
        return Invoke.invokeStatic.apply4(KawaEnvironment, Lit3, $Sttest$Mnenvironment$St, name);
    }

    public static Object renameInCurrentFormEnvironment(Symbol old$Mnname, Symbol new$Mnname) {
        if (Scheme.isEqv.apply2(old$Mnname, new$Mnname) != Boolean.FALSE) {
            return Values.empty;
        }
        Object old$Mnvalue = lookupInCurrentFormEnvironment(old$Mnname);
        if ($Stthis$Mnform$St != null) {
            Invoke.invokeStatic.applyN(new Object[]{KawaEnvironment, Lit0, SlotGet.getSlotValue(false, $Stthis$Mnform$St, "form-environment", "form$Mnenvironment", "getFormEnvironment", "isFormEnvironment", Scheme.instance), new$Mnname, old$Mnvalue});
        } else {
            Invoke.invokeStatic.applyN(new Object[]{KawaEnvironment, Lit0, $Sttest$Mnenvironment$St, new$Mnname, old$Mnvalue});
        }
        return deleteFromCurrentFormEnvironment(old$Mnname);
    }

    public static Object addGlobalVarToCurrentFormEnvironment(Symbol name, Object object) {
        if ($Stthis$Mnform$St != null) {
            Invoke.invokeStatic.applyN(new Object[]{KawaEnvironment, Lit0, SlotGet.getSlotValue(false, $Stthis$Mnform$St, "global-var-environment", "global$Mnvar$Mnenvironment", "getGlobalVarEnvironment", "isGlobalVarEnvironment", Scheme.instance), name, object});
        } else {
            Invoke.invokeStatic.applyN(new Object[]{KawaEnvironment, Lit0, $Sttest$Mnglobal$Mnvar$Mnenvironment$St, name, object});
        }
        return null;
    }

    public static Object lookupGlobalVarInCurrentFormEnvironment(Symbol name, Object default$Mnvalue) {
        Object env = $Stthis$Mnform$St != null ? SlotGet.getSlotValue(false, $Stthis$Mnform$St, "global-var-environment", "global$Mnvar$Mnenvironment", "getGlobalVarEnvironment", "isGlobalVarEnvironment", Scheme.instance) : $Sttest$Mnglobal$Mnvar$Mnenvironment$St;
        try {
            if (((Environment) env).isBound(name)) {
                return Invoke.invokeStatic.apply4(KawaEnvironment, Lit1, env, name);
            }
            return default$Mnvalue;
        } catch (ClassCastException e) {
            throw new WrongType(e, "gnu.mapping.Environment.isBound(gnu.mapping.Symbol)", 1, env);
        }
    }

    public static void resetCurrentFormEnvironment() {
        if ($Stthis$Mnform$St != null) {
            Object form$Mnname = SlotGet.getSlotValue(false, $Stthis$Mnform$St, "form-name-symbol", "form$Mnname$Mnsymbol", "getFormNameSymbol", "isFormNameSymbol", Scheme.instance);
            try {
                SlotSet.set$Mnfield$Ex.apply3($Stthis$Mnform$St, "form-environment", Environment.make(misc.symbol$To$String((Symbol) form$Mnname)));
                try {
                    addToCurrentFormEnvironment((Symbol) form$Mnname, $Stthis$Mnform$St);
                    SlotSet slotSet = SlotSet.set$Mnfield$Ex;
                    Object obj = $Stthis$Mnform$St;
                    String str = "global-var-environment";
                    Object[] objArr = new Object[2];
                    try {
                        objArr[0] = misc.symbol$To$String((Symbol) form$Mnname);
                        objArr[1] = "-global-vars";
                        FString stringAppend = strings.stringAppend(objArr);
                        slotSet.apply3(obj, str, Environment.make(stringAppend == null ? null : stringAppend.toString()));
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "symbol->string", 1, form$Mnname);
                    }
                } catch (ClassCastException e2) {
                    throw new WrongType(e2, "add-to-current-form-environment", 0, form$Mnname);
                }
            } catch (ClassCastException e3) {
                throw new WrongType(e3, "symbol->string", 1, form$Mnname);
            }
        } else {
            $Sttest$Mnenvironment$St = Environment.make("test-env");
            Invoke.invoke.apply3(Environment.getCurrent(), "addParent", $Sttest$Mnenvironment$St);
            $Sttest$Mnglobal$Mnvar$Mnenvironment$St = Environment.make("test-global-var-env");
        }
    }

    static Object lambda21(Object arg$Mnname, Object bodyform, Object list$Mnof$Mnargs) {
        return Quote.append$V(new Object[]{Lit117, Pair.make(Quote.append$V(new Object[]{Lit118, Pair.make(Lit119, Pair.make(Quote.append$V(new Object[]{Lit120, Pair.make(Pair.make(Quote.append$V(new Object[]{Lit121, Pair.make(Quote.append$V(new Object[]{Lit122, Pair.make(Quote.consX$V(new Object[]{arg$Mnname, LList.Empty}), Quote.consX$V(new Object[]{bodyform, LList.Empty}))}), LList.Empty)}), LList.Empty), Pair.make(Quote.append$V(new Object[]{Lit123, Quote.consX$V(new Object[]{list$Mnof$Mnargs, LList.Empty})}), LList.Empty))}), LList.Empty))}), LList.Empty)});
    }

    public static Object $StYailBreak$St(Object ignore) {
        return signalRuntimeError("Break should be run only from within a loop", "Bad use of Break");
    }

    static Object lambda22(Object lambda$Mnarg$Mnname, Object body$Mnform, Object start, Object end, Object step) {
        return Quote.append$V(new Object[]{Lit126, Pair.make(Quote.append$V(new Object[]{Lit127, Pair.make(Lit128, Pair.make(Quote.append$V(new Object[]{Lit129, Pair.make(Quote.append$V(new Object[]{Lit130, Pair.make(Quote.consX$V(new Object[]{lambda$Mnarg$Mnname, LList.Empty}), Quote.consX$V(new Object[]{body$Mnform, LList.Empty}))}), Quote.consX$V(new Object[]{start, Quote.consX$V(new Object[]{end, Quote.consX$V(new Object[]{step, LList.Empty})})}))}), LList.Empty))}), LList.Empty)});
    }

    static Object lambda23$V(Object condition, Object body, Object[] argsArray) {
        LList rest = LList.makeList(argsArray, 0);
        return Quote.append$V(new Object[]{Lit132, Pair.make(Pair.make(Quote.append$V(new Object[]{Lit133, Pair.make(Quote.append$V(new Object[]{Lit134, Pair.make(Lit135, Pair.make(Quote.append$V(new Object[]{Lit136, Pair.make(Quote.append$V(new Object[]{Lit137, Quote.consX$V(new Object[]{condition, Pair.make(Quote.append$V(new Object[]{Lit138, Pair.make(Quote.append$V(new Object[]{Lit139, Quote.consX$V(new Object[]{body, rest})}), Lit140)}), Lit141)})}), LList.Empty)}), LList.Empty))}), LList.Empty)}), LList.Empty), Lit142)});
    }

    public static Object callComponentMethod(Object component$Mnname, Object method$Mnname, Object arglist, Object typelist) {
        Object result;
        Object applyN;
        Object coerced$Mnargs = coerceArgs(method$Mnname, arglist, typelist);
        if (isAllCoercible(coerced$Mnargs) != Boolean.FALSE) {
            try {
                Apply apply = Scheme.apply;
                Invoke invoke = Invoke.invoke;
                Object[] objArr = new Object[2];
                objArr[0] = lookupInCurrentFormEnvironment((Symbol) component$Mnname);
                objArr[1] = Quote.consX$V(new Object[]{method$Mnname, Quote.append$V(new Object[]{coerced$Mnargs, LList.Empty})});
                applyN = apply.apply2(invoke, Quote.consX$V(objArr));
            } catch (ClassCastException e) {
                throw new WrongType(e, "lookup-in-current-form-environment", 0, component$Mnname);
            } catch (PermissionException exception) {
                Invoke invoke2 = Invoke.invoke;
                Object[] objArr2 = new Object[5];
                objArr2[0] = Form.getActiveForm();
                objArr2[1] = "dispatchPermissionDeniedEvent";
                try {
                    objArr2[2] = lookupInCurrentFormEnvironment((Symbol) component$Mnname);
                    objArr2[3] = method$Mnname;
                    objArr2[4] = exception;
                    applyN = invoke2.applyN(objArr2);
                } catch (ClassCastException e2) {
                    throw new WrongType(e2, "lookup-in-current-form-environment", 0, component$Mnname);
                }
            }
            result = applyN;
        } else {
            result = generateRuntimeTypeError(method$Mnname, arglist);
        }
        return sanitizeComponentData(result);
    }

    public static Object callComponentTypeMethod(Object possible$Mncomponent, Object component$Mntype, Object method$Mnname, Object arglist, Object typelist) {
        Object result;
        Object coerced$Mnargs = coerceArgs(method$Mnname, arglist, C0605lists.cdr.apply1(typelist));
        Object component$Mnvalue = coerceToComponentOfType(possible$Mncomponent, component$Mntype);
        if (!(component$Mnvalue instanceof Component)) {
            return generateRuntimeTypeError(method$Mnname, LList.list1(getDisplayRepresentation(possible$Mncomponent)));
        }
        if (isAllCoercible(coerced$Mnargs) != Boolean.FALSE) {
            result = Scheme.apply.apply2(Invoke.invoke, Quote.consX$V(new Object[]{component$Mnvalue, Quote.consX$V(new Object[]{method$Mnname, Quote.append$V(new Object[]{coerced$Mnargs, LList.Empty})})}));
        } else {
            result = generateRuntimeTypeError(method$Mnname, arglist);
        }
        return sanitizeComponentData(result);
    }

    public static Object callYailPrimitive(Object prim, Object arglist, Object typelist, Object codeblocks$Mnname) {
        Object coerced$Mnargs = coerceArgs(codeblocks$Mnname, arglist, typelist);
        if (isAllCoercible(coerced$Mnargs) != Boolean.FALSE) {
            return Scheme.apply.apply2(prim, coerced$Mnargs);
        }
        return generateRuntimeTypeError(codeblocks$Mnname, arglist);
    }

    public static Object sanitizeComponentData(Object data) {
        if (strings.isString(data) || isYailList(data) != Boolean.FALSE) {
            return data;
        }
        if (C0605lists.isList(data)) {
            return kawaList$To$YailList(data);
        }
        if (!(data instanceof Collection)) {
            return sanitizeAtomic(data);
        }
        try {
            return javaCollection$To$YailList((Collection) data);
        } catch (ClassCastException e) {
            throw new WrongType(e, "java-collection->yail-list", 0, data);
        }
    }

    public static Object javaCollection$To$YailList(Collection collection) {
        return kawaList$To$YailList(javaCollection$To$KawaList(collection));
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Collection, code=java.util.Collection<java.lang.Object>, for r6v0, types: [java.util.Collection<java.lang.Object>, java.util.Collection] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object javaCollection$To$KawaList(java.util.Collection<java.lang.Object> r6) {
        /*
            java.util.Iterator r0 = r6.iterator()
            gnu.lists.LList r1 = gnu.lists.LList.Empty
        L_0x0006:
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L_0x0013
            gnu.lists.LList r1 = (gnu.lists.LList) r1     // Catch:{ ClassCastException -> 0x0020 }
            gnu.lists.LList r2 = kawa.lib.C0605lists.reverse$Ex(r1)
            return r2
        L_0x0013:
            java.lang.Object r2 = r0.next()
            java.lang.Object r2 = sanitizeComponentData(r2)
            gnu.lists.Pair r1 = kawa.lib.C0605lists.cons(r2, r1)
            goto L_0x0006
        L_0x0020:
            r2 = move-exception
            gnu.mapping.WrongType r3 = new gnu.mapping.WrongType
            java.lang.String r4 = "reverse!"
            r5 = 1
            r3.<init>(r2, r4, r5, r1)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.youngandroid.C0593runtime.javaCollection$To$KawaList(java.util.Collection):java.lang.Object");
    }

    public static Object sanitizeAtomic(Object arg) {
        if (arg == null || Values.empty == arg) {
            return null;
        }
        if (numbers.isNumber(arg)) {
            return Arithmetic.asNumeric(arg);
        }
        return arg;
    }

    public static Object signalRuntimeError(Object message, Object error$Mntype) {
        String str = null;
        String obj = message == null ? null : message.toString();
        if (error$Mntype != null) {
            str = error$Mntype.toString();
        }
        throw new YailRuntimeError(obj, str);
    }

    public static Object signalRuntimeFormError(Object function$Mnname, Object error$Mnnumber, Object message) {
        return Invoke.invoke.applyN(new Object[]{$Stthis$Mnform$St, "runtimeFormErrorOccurredEvent", function$Mnname, error$Mnnumber, message});
    }

    public static boolean yailNot(Object foo) {
        return ((foo != Boolean.FALSE ? 1 : 0) + 1) & true;
    }

    public static Object callWithCoercedArgs(Object func, Object arglist, Object typelist, Object codeblocks$Mnname) {
        Object coerced$Mnargs = coerceArgs(codeblocks$Mnname, arglist, typelist);
        if (isAllCoercible(coerced$Mnargs) != Boolean.FALSE) {
            return Scheme.apply.apply2(func, coerced$Mnargs);
        }
        return generateRuntimeTypeError(codeblocks$Mnname, arglist);
    }

    public static Object $PcSetAndCoerceProperty$Ex(Object comp, Object prop$Mnname, Object property$Mnvalue, Object property$Mntype) {
        androidLog(Format.formatToString(0, "coercing for setting property ~A -- value ~A to type ~A", prop$Mnname, property$Mnvalue, property$Mntype));
        Object coerced$Mnarg = coerceArg(property$Mnvalue, property$Mntype);
        androidLog(Format.formatToString(0, "coerced property value was: ~A ", coerced$Mnarg));
        if (isAllCoercible(LList.list1(coerced$Mnarg)) == Boolean.FALSE) {
            return generateRuntimeTypeError(prop$Mnname, LList.list1(property$Mnvalue));
        }
        try {
            return Invoke.invoke.apply3(comp, prop$Mnname, coerced$Mnarg);
        } catch (PermissionException exception) {
            return Invoke.invoke.applyN(new Object[]{Form.getActiveForm(), "dispatchPermissionDeniedEvent", comp, prop$Mnname, exception});
        }
    }

    public static Object $PcSetSubformLayoutProperty$Ex(Object layout, Object prop$Mnname, Object value) {
        return Invoke.invoke.apply3(layout, prop$Mnname, value);
    }

    public static Object generateRuntimeTypeError(Object proc$Mnname, Object arglist) {
        androidLog(Format.formatToString(0, "arglist is: ~A ", arglist));
        Object string$Mnname = coerceToString(proc$Mnname);
        Object[] objArr = new Object[4];
        objArr[0] = "The operation ";
        objArr[1] = string$Mnname;
        Object[] objArr2 = new Object[2];
        objArr2[0] = " cannot accept the argument~P: ";
        try {
            objArr2[1] = Integer.valueOf(C0605lists.length((LList) arglist));
            objArr[2] = Format.formatToString(0, objArr2);
            objArr[3] = showArglistNoParens(arglist);
            return signalRuntimeError(strings.stringAppend(objArr), strings.stringAppend("Bad arguments to ", string$Mnname));
        } catch (ClassCastException e) {
            throw new WrongType(e, "length", 1, arglist);
        }
    }

    public static Object showArglistNoParens(Object args) {
        Object obj = LList.Empty;
        Object arg0 = args;
        while (arg0 != LList.Empty) {
            try {
                Pair arg02 = (Pair) arg0;
                Object arg03 = arg02.getCdr();
                obj = Pair.make(getDisplayRepresentation(arg02.getCar()), obj);
                arg0 = arg03;
            } catch (ClassCastException e) {
                throw new WrongType(e, "arg0", -2, arg0);
            }
        }
        LList elements = LList.reverseInPlace(obj);
        Object obj2 = LList.Empty;
        Object arg04 = elements;
        while (arg04 != LList.Empty) {
            try {
                Pair arg05 = (Pair) arg04;
                Object arg06 = arg05.getCdr();
                obj2 = Pair.make(strings.stringAppend("[", arg05.getCar(), "]"), obj2);
                arg04 = arg06;
            } catch (ClassCastException e2) {
                throw new WrongType(e2, "arg0", -2, arg04);
            }
        }
        Object obj3 = "";
        for (Object reverseInPlace = LList.reverseInPlace(obj2); !C0605lists.isNull(reverseInPlace); reverseInPlace = C0605lists.cdr.apply1(reverseInPlace)) {
            obj3 = strings.stringAppend(obj3, ", ", C0605lists.car.apply1(reverseInPlace));
        }
        return obj3;
    }

    public static Object coerceArgs(Object procedure$Mnname, Object arglist, Object typelist) {
        if (!C0605lists.isNull(typelist)) {
            try {
                try {
                    if (C0605lists.length((LList) arglist) != C0605lists.length((LList) typelist)) {
                        return signalRuntimeError(strings.stringAppend("The arguments ", showArglistNoParens(arglist), " are the wrong number of arguments for ", getDisplayRepresentation(procedure$Mnname)), strings.stringAppend("Wrong number of arguments for", getDisplayRepresentation(procedure$Mnname)));
                    }
                    Object obj = LList.Empty;
                    Object arg0 = arglist;
                    Object obj2 = typelist;
                    while (arg0 != LList.Empty && obj2 != LList.Empty) {
                        try {
                            Pair arg02 = (Pair) arg0;
                            try {
                                Pair arg1 = (Pair) obj2;
                                Object arg03 = arg02.getCdr();
                                Object arg12 = arg1.getCdr();
                                obj = Pair.make(coerceArg(arg02.getCar(), arg1.getCar()), obj);
                                obj2 = arg12;
                                arg0 = arg03;
                            } catch (ClassCastException e) {
                                throw new WrongType(e, "arg1", -2, obj2);
                            }
                        } catch (ClassCastException e2) {
                            throw new WrongType(e2, "arg0", -2, arg0);
                        }
                    }
                    return LList.reverseInPlace(obj);
                } catch (ClassCastException e3) {
                    throw new WrongType(e3, "length", 1, typelist);
                }
            } catch (ClassCastException e4) {
                throw new WrongType(e4, "length", 1, arglist);
            }
        } else if (C0605lists.isNull(arglist)) {
            return arglist;
        } else {
            return signalRuntimeError(strings.stringAppend("The procedure ", procedure$Mnname, " expects no arguments, but it was called with the arguments: ", showArglistNoParens(arglist)), strings.stringAppend("Wrong number of arguments for", procedure$Mnname));
        }
    }

    public static Object coerceArg(Object arg, Object type) {
        Object arg2 = sanitizeAtomic(arg);
        if (IsEqual.apply(type, Lit4)) {
            return coerceToNumber(arg2);
        }
        if (IsEqual.apply(type, Lit5)) {
            return coerceToText(arg2);
        }
        if (IsEqual.apply(type, Lit6)) {
            return coerceToBoolean(arg2);
        }
        if (IsEqual.apply(type, Lit7)) {
            return coerceToYailList(arg2);
        }
        if (IsEqual.apply(type, Lit8)) {
            return coerceToInstant(arg2);
        }
        if (IsEqual.apply(type, Lit9)) {
            return coerceToComponent(arg2);
        }
        return !IsEqual.apply(type, Lit10) ? coerceToComponentOfType(arg2, type) : arg2;
    }

    public static Object coerceToText(Object arg) {
        if (arg == null) {
            return Lit2;
        }
        return coerceToString(arg);
    }

    public static Object coerceToInstant(Object arg) {
        return arg instanceof Calendar ? arg : Lit2;
    }

    public static Object coerceToComponent(Object arg) {
        if (strings.isString(arg)) {
            if (strings.isString$Eq(arg, "")) {
                return null;
            }
            try {
                return lookupComponent(misc.string$To$Symbol((CharSequence) arg));
            } catch (ClassCastException e) {
                throw new WrongType(e, "string->symbol", 1, arg);
            }
        } else if (arg instanceof Component) {
            return arg;
        } else {
            return misc.isSymbol(arg) ? lookupComponent(arg) : Lit2;
        }
    }

    public static Object coerceToComponentOfType(Object arg, Object type) {
        Object component = coerceToComponent(arg);
        if (component == Lit2) {
            return Lit2;
        }
        return Scheme.apply.apply2(Scheme.instanceOf, LList.list2(arg, type$To$Class(type))) == Boolean.FALSE ? Lit2 : component;
    }

    public static Object type$To$Class(Object type$Mnname) {
        return type$Mnname == Lit11 ? Lit12 : type$Mnname;
    }

    public static Object coerceToNumber(Object arg) {
        if (numbers.isNumber(arg)) {
            return arg;
        }
        if (!strings.isString(arg)) {
            return Lit2;
        }
        Object x = paddedString$To$Number(arg);
        if (x == Boolean.FALSE) {
            x = Lit2;
        }
        return x;
    }

    public static Object coerceToString(Object arg) {
        frame0 frame02 = new frame0();
        frame02.arg = arg;
        if (frame02.arg == null) {
            return "*nothing*";
        }
        if (strings.isString(frame02.arg)) {
            return frame02.arg;
        }
        if (numbers.isNumber(frame02.arg)) {
            return appinventorNumber$To$String(frame02.arg);
        }
        if (misc.isBoolean(frame02.arg)) {
            return boolean$To$String(frame02.arg);
        }
        if (isYailList(frame02.arg) != Boolean.FALSE) {
            return coerceToString(yailList$To$KawaList(frame02.arg));
        }
        if (!C0605lists.isList(frame02.arg)) {
            return ports.callWithOutputString(frame02.lambda$Fn3);
        }
        if (Form.getActiveForm().ShowListsAsJson()) {
            Object arg0 = frame02.arg;
            Object obj = LList.Empty;
            while (arg0 != LList.Empty) {
                try {
                    Pair arg02 = (Pair) arg0;
                    Object arg03 = arg02.getCdr();
                    obj = Pair.make(((Procedure) get$Mnjson$Mndisplay$Mnrepresentation).apply1(arg02.getCar()), obj);
                    arg0 = arg03;
                } catch (ClassCastException e) {
                    throw new WrongType(e, "arg0", -2, arg0);
                }
            }
            return strings.stringAppend("[", joinStrings(LList.reverseInPlace(obj), ", "), "]");
        }
        Object arg04 = frame02.arg;
        Object obj2 = LList.Empty;
        while (arg04 != LList.Empty) {
            try {
                Pair arg05 = (Pair) arg04;
                Object arg06 = arg05.getCdr();
                obj2 = Pair.make(coerceToString(arg05.getCar()), obj2);
                arg04 = arg06;
            } catch (ClassCastException e2) {
                throw new WrongType(e2, "arg0", -2, arg04);
            }
        }
        frame02.pieces = LList.reverseInPlace(obj2);
        return ports.callWithOutputString(frame02.lambda$Fn2);
    }

    public static Object getDisplayRepresentation(Object arg) {
        if (Form.getActiveForm().ShowListsAsJson()) {
            return ((Procedure) get$Mnjson$Mndisplay$Mnrepresentation).apply1(arg);
        }
        return ((Procedure) get$Mnoriginal$Mndisplay$Mnrepresentation).apply1(arg);
    }

    static Object lambda4(Object arg) {
        frame1 frame12 = new frame1();
        frame12.arg = arg;
        if (Scheme.numEqu.apply2(frame12.arg, Lit13) != Boolean.FALSE) {
            return "+infinity";
        }
        if (Scheme.numEqu.apply2(frame12.arg, Lit14) != Boolean.FALSE) {
            return "-infinity";
        }
        if (frame12.arg == null) {
            return "*nothing*";
        }
        if (misc.isSymbol(frame12.arg)) {
            Object obj = frame12.arg;
            try {
                return misc.symbol$To$String((Symbol) obj);
            } catch (ClassCastException e) {
                throw new WrongType(e, "symbol->string", 1, obj);
            }
        } else if (strings.isString(frame12.arg)) {
            if (strings.isString$Eq(frame12.arg, "")) {
                return "*empty-string*";
            }
            return frame12.arg;
        } else if (numbers.isNumber(frame12.arg)) {
            return appinventorNumber$To$String(frame12.arg);
        } else {
            if (misc.isBoolean(frame12.arg)) {
                return boolean$To$String(frame12.arg);
            }
            if (isYailList(frame12.arg) != Boolean.FALSE) {
                return getDisplayRepresentation(yailList$To$KawaList(frame12.arg));
            }
            if (!C0605lists.isList(frame12.arg)) {
                return ports.callWithOutputString(frame12.lambda$Fn6);
            }
            Object arg0 = frame12.arg;
            Object obj2 = LList.Empty;
            while (arg0 != LList.Empty) {
                try {
                    Pair arg02 = (Pair) arg0;
                    Object arg03 = arg02.getCdr();
                    obj2 = Pair.make(getDisplayRepresentation(arg02.getCar()), obj2);
                    arg0 = arg03;
                } catch (ClassCastException e2) {
                    throw new WrongType(e2, "arg0", -2, arg0);
                }
            }
            frame12.pieces = LList.reverseInPlace(obj2);
            return ports.callWithOutputString(frame12.lambda$Fn5);
        }
    }

    static Object lambda7(Object arg) {
        frame2 frame22 = new frame2();
        frame22.arg = arg;
        if (Scheme.numEqu.apply2(frame22.arg, Lit15) != Boolean.FALSE) {
            return "+infinity";
        }
        if (Scheme.numEqu.apply2(frame22.arg, Lit16) != Boolean.FALSE) {
            return "-infinity";
        }
        if (frame22.arg == null) {
            return "*nothing*";
        }
        if (misc.isSymbol(frame22.arg)) {
            Object obj = frame22.arg;
            try {
                return misc.symbol$To$String((Symbol) obj);
            } catch (ClassCastException e) {
                throw new WrongType(e, "symbol->string", 1, obj);
            }
        } else if (strings.isString(frame22.arg)) {
            return strings.stringAppend("\"", frame22.arg, "\"");
        } else if (numbers.isNumber(frame22.arg)) {
            return appinventorNumber$To$String(frame22.arg);
        } else {
            if (misc.isBoolean(frame22.arg)) {
                return boolean$To$String(frame22.arg);
            }
            if (isYailList(frame22.arg) != Boolean.FALSE) {
                return ((Procedure) get$Mnjson$Mndisplay$Mnrepresentation).apply1(yailList$To$KawaList(frame22.arg));
            }
            if (!C0605lists.isList(frame22.arg)) {
                return ports.callWithOutputString(frame22.lambda$Fn8);
            }
            Object arg0 = frame22.arg;
            Object obj2 = LList.Empty;
            while (arg0 != LList.Empty) {
                try {
                    Pair arg02 = (Pair) arg0;
                    Object arg03 = arg02.getCdr();
                    obj2 = Pair.make(((Procedure) get$Mnjson$Mndisplay$Mnrepresentation).apply1(arg02.getCar()), obj2);
                    arg0 = arg03;
                } catch (ClassCastException e2) {
                    throw new WrongType(e2, "arg0", -2, arg0);
                }
            }
            return strings.stringAppend("[", joinStrings(LList.reverseInPlace(obj2), ", "), "]");
        }
    }

    public static Object joinStrings(Object list$Mnof$Mnstrings, Object separator) {
        try {
            return JavaJoinListOfStrings.joinStrings((List) list$Mnof$Mnstrings, separator == null ? null : separator.toString());
        } catch (ClassCastException e) {
            throw new WrongType(e, "com.google.appinventor.components.runtime.util.JavaJoinListOfStrings.joinStrings(java.util.List,java.lang.String)", 1, list$Mnof$Mnstrings);
        }
    }

    public static Object stringReplace(Object original, Object replacement$Mntable) {
        if (C0605lists.isNull(replacement$Mntable)) {
            return original;
        }
        if (strings.isString$Eq(original, C0605lists.caar.apply1(replacement$Mntable))) {
            return C0605lists.cadar.apply1(replacement$Mntable);
        }
        return stringReplace(original, C0605lists.cdr.apply1(replacement$Mntable));
    }

    public static Object coerceToYailList(Object arg) {
        return isYailList(arg) != Boolean.FALSE ? arg : Lit2;
    }

    public static Object coerceToBoolean(Object arg) {
        return misc.isBoolean(arg) ? arg : Lit2;
    }

    public static boolean isIsCoercible(Object x) {
        return ((x == Lit2 ? 1 : 0) + 1) & true;
    }

    public static Object isAllCoercible(Object args) {
        if (C0605lists.isNull(args)) {
            return Boolean.TRUE;
        }
        boolean x = isIsCoercible(C0605lists.car.apply1(args));
        if (x) {
            return isAllCoercible(C0605lists.cdr.apply1(args));
        }
        return x ? Boolean.TRUE : Boolean.FALSE;
    }

    public static String boolean$To$String(Object b) {
        return b != Boolean.FALSE ? "true" : "false";
    }

    public static Object paddedString$To$Number(Object s) {
        return numbers.string$To$Number(s.toString().trim());
    }

    public static String $StFormatInexact$St(Object n) {
        try {
            return YailNumberToString.format(((Number) n).doubleValue());
        } catch (ClassCastException e) {
            throw new WrongType(e, "com.google.appinventor.components.runtime.util.YailNumberToString.format(double)", 1, n);
        }
    }

    public static Object appinventorNumber$To$String(Object n) {
        frame3 frame32 = new frame3();
        frame32.f45n = n;
        if (!numbers.isReal(frame32.f45n)) {
            return ports.callWithOutputString(frame32.lambda$Fn9);
        }
        if (numbers.isInteger(frame32.f45n)) {
            return ports.callWithOutputString(frame32.lambda$Fn10);
        }
        if (!numbers.isExact(frame32.f45n)) {
            return $StFormatInexact$St(frame32.f45n);
        }
        Object obj = frame32.f45n;
        try {
            return appinventorNumber$To$String(numbers.exact$To$Inexact((Number) obj));
        } catch (ClassCastException e) {
            throw new WrongType(e, "exact->inexact", 1, obj);
        }
    }

    public static Object isYailEqual(Object x1, Object x2) {
        boolean x = C0605lists.isNull(x1);
        if (!x ? x : C0605lists.isNull(x2)) {
            return Boolean.TRUE;
        }
        boolean x3 = C0605lists.isNull(x1);
        if (!x3 ? C0605lists.isNull(x2) : x3) {
            return Boolean.FALSE;
        }
        boolean x4 = ((C0605lists.isPair(x1) ? 1 : 0) + true) & true;
        if (!x4 ? x4 : !C0605lists.isPair(x2)) {
            return isYailAtomicEqual(x1, x2);
        }
        boolean x5 = ((C0605lists.isPair(x1) ? 1 : 0) + true) & true;
        if (!x5 ? !C0605lists.isPair(x2) : x5) {
            return Boolean.FALSE;
        }
        Object x6 = isYailEqual(C0605lists.car.apply1(x1), C0605lists.car.apply1(x2));
        if (x6 != Boolean.FALSE) {
            return isYailEqual(C0605lists.cdr.apply1(x1), C0605lists.cdr.apply1(x2));
        }
        return x6;
    }

    public static Object isYailAtomicEqual(Object x1, Object x2) {
        if (IsEqual.apply(x1, x2)) {
            return Boolean.TRUE;
        }
        Object nx1 = asNumber(x1);
        if (nx1 == Boolean.FALSE) {
            return nx1;
        }
        Object nx2 = asNumber(x2);
        if (nx2 != Boolean.FALSE) {
            return Scheme.numEqu.apply2(nx1, nx2);
        }
        return nx2;
    }

    public static Object asNumber(Object x) {
        Object nx = coerceToNumber(x);
        return nx == Lit2 ? Boolean.FALSE : nx;
    }

    public static boolean isYailNotEqual(Object x1, Object x2) {
        return ((isYailEqual(x1, x2) != Boolean.FALSE ? 1 : 0) + 1) & true;
    }

    public static Object processAndDelayed$V(Object[] argsArray) {
        Object[] objArr;
        Object makeList = LList.makeList(argsArray, 0);
        while (!C0605lists.isNull(makeList)) {
            Object conjunct = Scheme.applyToArgs.apply1(C0605lists.car.apply1(makeList));
            Object coerced$Mnconjunct = coerceToBoolean(conjunct);
            if (!isIsCoercible(coerced$Mnconjunct)) {
                FString stringAppend = strings.stringAppend("The AND operation cannot accept the argument ", getDisplayRepresentation(conjunct), " because it is neither true nor false");
                String str = "Bad argument to AND";
                if (str instanceof Object[]) {
                    objArr = (Object[]) str;
                } else {
                    objArr = new Object[]{str};
                }
                return signalRuntimeError(stringAppend, strings.stringAppend(objArr));
            } else if (coerced$Mnconjunct == Boolean.FALSE) {
                return coerced$Mnconjunct;
            } else {
                makeList = C0605lists.cdr.apply1(makeList);
            }
        }
        return Boolean.TRUE;
    }

    public static Object processOrDelayed$V(Object[] argsArray) {
        Object[] objArr;
        Object makeList = LList.makeList(argsArray, 0);
        while (!C0605lists.isNull(makeList)) {
            Object disjunct = Scheme.applyToArgs.apply1(C0605lists.car.apply1(makeList));
            Object coerced$Mndisjunct = coerceToBoolean(disjunct);
            if (!isIsCoercible(coerced$Mndisjunct)) {
                FString stringAppend = strings.stringAppend("The OR operation cannot accept the argument ", getDisplayRepresentation(disjunct), " because it is neither true nor false");
                String str = "Bad argument to OR";
                if (str instanceof Object[]) {
                    objArr = (Object[]) str;
                } else {
                    objArr = new Object[]{str};
                }
                return signalRuntimeError(stringAppend, strings.stringAppend(objArr));
            } else if (coerced$Mndisjunct != Boolean.FALSE) {
                return coerced$Mndisjunct;
            } else {
                makeList = C0605lists.cdr.apply1(makeList);
            }
        }
        return Boolean.FALSE;
    }

    public static Number yailFloor(Object x) {
        try {
            return numbers.inexact$To$Exact(numbers.floor(LangObjType.coerceRealNum(x)));
        } catch (ClassCastException e) {
            throw new WrongType(e, "floor", 1, x);
        }
    }

    public static Number yailCeiling(Object x) {
        try {
            return numbers.inexact$To$Exact(numbers.ceiling(LangObjType.coerceRealNum(x)));
        } catch (ClassCastException e) {
            throw new WrongType(e, "ceiling", 1, x);
        }
    }

    public static Number yailRound(Object x) {
        try {
            return numbers.inexact$To$Exact(numbers.round(LangObjType.coerceRealNum(x)));
        } catch (ClassCastException e) {
            throw new WrongType(e, "round", 1, x);
        }
    }

    public static Object randomSetSeed(Object seed) {
        if (numbers.isNumber(seed)) {
            try {
                $Strandom$Mnnumber$Mngenerator$St.setSeed(((Number) seed).longValue());
                return Values.empty;
            } catch (ClassCastException e) {
                throw new WrongType(e, "java.util.Random.setSeed(long)", 2, seed);
            }
        } else if (strings.isString(seed)) {
            return randomSetSeed(paddedString$To$Number(seed));
        } else {
            if (C0605lists.isList(seed)) {
                return randomSetSeed(C0605lists.car.apply1(seed));
            }
            if (Boolean.TRUE == seed) {
                return randomSetSeed(Lit17);
            }
            if (Boolean.FALSE == seed) {
                return randomSetSeed(Lit18);
            }
            return randomSetSeed(Lit18);
        }
    }

    public static double randomFraction() {
        return $Strandom$Mnnumber$Mngenerator$St.nextDouble();
    }

    public static Object randomInteger(Object low, Object high) {
        try {
            RealNum low2 = numbers.ceiling(LangObjType.coerceRealNum(low));
            try {
                RealNum low3 = numbers.floor(LangObjType.coerceRealNum(high));
                while (Scheme.numGrt.apply2(low2, low3) != Boolean.FALSE) {
                    RealNum high2 = low2;
                    low2 = low3;
                    low3 = high2;
                }
                Object clow = ((Procedure) clip$Mnto$Mnjava$Mnint$Mnrange).apply1(low2);
                Object chigh = ((Procedure) clip$Mnto$Mnjava$Mnint$Mnrange).apply1(low3);
                AddOp addOp = AddOp.$Pl;
                Random random = $Strandom$Mnnumber$Mngenerator$St;
                Object apply2 = AddOp.$Pl.apply2(Lit17, AddOp.$Mn.apply2(chigh, clow));
                try {
                    Object apply22 = addOp.apply2(Integer.valueOf(random.nextInt(((Number) apply2).intValue())), clow);
                    try {
                        return numbers.inexact$To$Exact((Number) apply22);
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "inexact->exact", 1, apply22);
                    }
                } catch (ClassCastException e2) {
                    throw new WrongType(e2, "java.util.Random.nextInt(int)", 2, apply2);
                }
            } catch (ClassCastException e3) {
                throw new WrongType(e3, "floor", 1, high);
            }
        } catch (ClassCastException e4) {
            throw new WrongType(e4, "ceiling", 1, low);
        }
    }

    static Object lambda11(Object x) {
        return numbers.max(lowest, numbers.min(x, highest));
    }

    public static Object yailDivide(Object n, Object d) {
        Object apply2 = Scheme.numEqu.apply2(d, Lit18);
        try {
            boolean x = ((Boolean) apply2).booleanValue();
            if (!x ? x : Scheme.numEqu.apply2(n, Lit18) != Boolean.FALSE) {
                signalRuntimeFormError("Division", ERROR_DIVISION_BY_ZERO, n);
                return n;
            } else if (Scheme.numEqu.apply2(d, Lit18) != Boolean.FALSE) {
                signalRuntimeFormError("Division", ERROR_DIVISION_BY_ZERO, n);
                Object apply22 = DivideOp.$Sl.apply2(n, d);
                try {
                    return numbers.exact$To$Inexact((Number) apply22);
                } catch (ClassCastException e) {
                    throw new WrongType(e, "exact->inexact", 1, apply22);
                }
            } else {
                Object apply23 = DivideOp.$Sl.apply2(n, d);
                try {
                    return numbers.exact$To$Inexact((Number) apply23);
                } catch (ClassCastException e2) {
                    throw new WrongType(e2, "exact->inexact", 1, apply23);
                }
            }
        } catch (ClassCastException e3) {
            throw new WrongType(e3, "x", -2, apply2);
        }
    }

    public static Object degrees$To$RadiansInternal(Object degrees) {
        return DivideOp.$Sl.apply2(MultiplyOp.$St.apply2(degrees, Lit21), Lit22);
    }

    public static Object radians$To$DegreesInternal(Object radians) {
        return DivideOp.$Sl.apply2(MultiplyOp.$St.apply2(radians, Lit22), Lit21);
    }

    public static Object degrees$To$Radians(Object degrees) {
        Object rads = DivideOp.modulo.apply2(degrees$To$RadiansInternal(degrees), Lit23);
        if (Scheme.numGEq.apply2(rads, Lit21) != Boolean.FALSE) {
            return AddOp.$Mn.apply2(rads, Lit24);
        }
        return rads;
    }

    public static Object radians$To$Degrees(Object radians) {
        return DivideOp.modulo.apply2(radians$To$DegreesInternal(radians), Lit25);
    }

    public static double sinDegrees(Object degrees) {
        Object degrees$To$RadiansInternal = degrees$To$RadiansInternal(degrees);
        try {
            return numbers.sin(((Number) degrees$To$RadiansInternal).doubleValue());
        } catch (ClassCastException e) {
            throw new WrongType(e, "sin", 1, degrees$To$RadiansInternal);
        }
    }

    public static double cosDegrees(Object degrees) {
        Object degrees$To$RadiansInternal = degrees$To$RadiansInternal(degrees);
        try {
            return numbers.cos(((Number) degrees$To$RadiansInternal).doubleValue());
        } catch (ClassCastException e) {
            throw new WrongType(e, "cos", 1, degrees$To$RadiansInternal);
        }
    }

    public static double tanDegrees(Object degrees) {
        Object degrees$To$RadiansInternal = degrees$To$RadiansInternal(degrees);
        try {
            return numbers.tan(((Number) degrees$To$RadiansInternal).doubleValue());
        } catch (ClassCastException e) {
            throw new WrongType(e, "tan", 1, degrees$To$RadiansInternal);
        }
    }

    public static Object asinDegrees(Object y) {
        try {
            return radians$To$DegreesInternal(Double.valueOf(numbers.asin(((Number) y).doubleValue())));
        } catch (ClassCastException e) {
            throw new WrongType(e, "asin", 1, y);
        }
    }

    public static Object acosDegrees(Object y) {
        try {
            return radians$To$DegreesInternal(Double.valueOf(numbers.acos(((Number) y).doubleValue())));
        } catch (ClassCastException e) {
            throw new WrongType(e, "acos", 1, y);
        }
    }

    public static Object atanDegrees(Object ratio) {
        return radians$To$DegreesInternal(numbers.atan.apply1(ratio));
    }

    public static Object atan2Degrees(Object y, Object x) {
        return radians$To$DegreesInternal(numbers.atan.apply2(y, x));
    }

    public static String stringToUpperCase(Object s) {
        return s.toString().toUpperCase();
    }

    public static String stringToLowerCase(Object s) {
        return s.toString().toLowerCase();
    }

    public static Object formatAsDecimal(Object number, Object places) {
        Object[] objArr;
        if (Scheme.numEqu.apply2(places, Lit18) != Boolean.FALSE) {
            return yailRound(number);
        }
        boolean x = numbers.isInteger(places);
        if (!x ? x : Scheme.numGrt.apply2(places, Lit18) != Boolean.FALSE) {
            return Format.formatToString(0, strings.stringAppend("~,", appinventorNumber$To$String(places), "f"), number);
        }
        FString stringAppend = strings.stringAppend("format-as-decimal was called with ", getDisplayRepresentation(places), " as the number of decimal places.  This number must be a non-negative integer.");
        String str = "Bad number of decimal places for format as decimal";
        if (str instanceof Object[]) {
            objArr = (Object[]) str;
        } else {
            objArr = new Object[]{str};
        }
        return signalRuntimeError(stringAppend, strings.stringAppend(objArr));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        if (r0 != false) goto L_0x0008;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Boolean isIsNumber(java.lang.Object r3) {
        /*
            boolean r0 = kawa.lib.numbers.isNumber(r3)
            if (r0 == 0) goto L_0x000b
            if (r0 == 0) goto L_0x0019
        L_0x0008:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
        L_0x000a:
            return r1
        L_0x000b:
            boolean r0 = kawa.lib.strings.isString(r3)
            if (r0 == 0) goto L_0x001c
            java.lang.Object r1 = paddedString$To$Number(r3)
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            if (r1 != r2) goto L_0x0008
        L_0x0019:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto L_0x000a
        L_0x001c:
            if (r0 == 0) goto L_0x0019
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.youngandroid.C0593runtime.isIsNumber(java.lang.Object):java.lang.Boolean");
    }

    public static boolean isIsBase10(Object arg) {
        try {
            boolean x = Pattern.matches("[0123456789]*", (CharSequence) arg);
            if (!x) {
                return x;
            }
            return ((isStringEmpty(arg) != Boolean.FALSE ? 1 : 0) + 1) & true;
        } catch (ClassCastException e) {
            throw new WrongType(e, "java.util.regex.Pattern.matches(java.lang.String,java.lang.CharSequence)", 2, arg);
        }
    }

    public static boolean isIsHexadecimal(Object arg) {
        try {
            boolean x = Pattern.matches("[0-9a-fA-F]*", (CharSequence) arg);
            if (!x) {
                return x;
            }
            return ((isStringEmpty(arg) != Boolean.FALSE ? 1 : 0) + 1) & true;
        } catch (ClassCastException e) {
            throw new WrongType(e, "java.util.regex.Pattern.matches(java.lang.String,java.lang.CharSequence)", 2, arg);
        }
    }

    public static boolean isIsBinary(Object arg) {
        try {
            boolean x = Pattern.matches("[01]*", (CharSequence) arg);
            if (!x) {
                return x;
            }
            return ((isStringEmpty(arg) != Boolean.FALSE ? 1 : 0) + 1) & true;
        } catch (ClassCastException e) {
            throw new WrongType(e, "java.util.regex.Pattern.matches(java.lang.String,java.lang.CharSequence)", 2, arg);
        }
    }

    public static Object mathConvertDecHex(Object x) {
        if (isIsBase10(x)) {
            try {
                Object string$To$Number = numbers.string$To$Number((CharSequence) x);
                try {
                    return stringToUpperCase(numbers.number$To$String((Number) string$To$Number, 16));
                } catch (ClassCastException e) {
                    throw new WrongType(e, "number->string", 1, string$To$Number);
                }
            } catch (ClassCastException e2) {
                throw new WrongType(e2, "string->number", 1, x);
            }
        } else {
            return signalRuntimeError(Format.formatToString(0, "Convert base 10 to hex: '~A' is not a positive integer", getDisplayRepresentation(x)), "Argument is not a positive integer");
        }
    }

    public static Object mathConvertHexDec(Object x) {
        if (isIsHexadecimal(x)) {
            return numbers.string$To$Number(stringToUpperCase(x), 16);
        }
        return signalRuntimeError(Format.formatToString(0, "Convert hex to base 10: '~A' is not a hexadecimal number", getDisplayRepresentation(x)), "Invalid hexadecimal number");
    }

    public static Object mathConvertBinDec(Object x) {
        if (isIsBinary(x)) {
            try {
                return numbers.string$To$Number((CharSequence) x, 2);
            } catch (ClassCastException e) {
                throw new WrongType(e, "string->number", 1, x);
            }
        } else {
            return signalRuntimeError(Format.formatToString(0, "Convert binary to base 10: '~A' is not a  binary number", getDisplayRepresentation(x)), "Invalid binary number");
        }
    }

    public static Object mathConvertDecBin(Object x) {
        if (isIsBase10(x)) {
            try {
                return patchedNumber$To$StringBinary(numbers.string$To$Number((CharSequence) x));
            } catch (ClassCastException e) {
                throw new WrongType(e, "string->number", 1, x);
            }
        } else {
            return signalRuntimeError(Format.formatToString(0, "Convert base 10 to binary: '~A' is not a positive integer", getDisplayRepresentation(x)), "Argument is not a positive integer");
        }
    }

    public static Object patchedNumber$To$StringBinary(Object x) {
        try {
            if (Scheme.numLss.apply2(numbers.abs((Number) x), Lit26) == Boolean.FALSE) {
                return alternateNumber$To$StringBinary(x);
            }
            try {
                return numbers.number$To$String((Number) x, 2);
            } catch (ClassCastException e) {
                throw new WrongType(e, "number->string", 1, x);
            }
        } catch (ClassCastException e2) {
            throw new WrongType(e2, "abs", 1, x);
        }
    }

    public static Object alternateNumber$To$StringBinary(Object x) {
        try {
            Number abs = numbers.abs((Number) x);
            try {
                RealNum clean$Mnx = numbers.floor(LangObjType.coerceRealNum(abs));
                Object converted$Mnclean$Mnx = internalBinaryConvert(clean$Mnx);
                if (clean$Mnx.doubleValue() >= 0.0d) {
                    return converted$Mnclean$Mnx;
                }
                return strings.stringAppend("-", converted$Mnclean$Mnx);
            } catch (ClassCastException e) {
                throw new WrongType(e, "floor", 1, (Object) abs);
            }
        } catch (ClassCastException e2) {
            throw new WrongType(e2, "abs", 1, x);
        }
    }

    public static Object internalBinaryConvert(Object x) {
        if (Scheme.numEqu.apply2(x, Lit18) != Boolean.FALSE) {
            return "0";
        }
        if (Scheme.numEqu.apply2(x, Lit17) != Boolean.FALSE) {
            return "1";
        }
        return strings.stringAppend(internalBinaryConvert(DivideOp.quotient.apply2(x, Lit19)), internalBinaryConvert(DivideOp.remainder.apply2(x, Lit19)));
    }

    public static Object isYailList(Object x) {
        Object x2 = isYailListCandidate(x);
        if (x2 != Boolean.FALSE) {
            return x instanceof YailList ? Boolean.TRUE : Boolean.FALSE;
        }
        return x2;
    }

    public static Object isYailListCandidate(Object x) {
        boolean x2 = C0605lists.isPair(x);
        return x2 ? IsEqual.apply(C0605lists.car.apply1(x), Lit27) ? Boolean.TRUE : Boolean.FALSE : x2 ? Boolean.TRUE : Boolean.FALSE;
    }

    public static Object yailListContents(Object yail$Mnlist) {
        return C0605lists.cdr.apply1(yail$Mnlist);
    }

    public static void setYailListContents$Ex(Object yail$Mnlist, Object contents) {
        try {
            C0605lists.setCdr$Ex((Pair) yail$Mnlist, contents);
        } catch (ClassCastException e) {
            throw new WrongType(e, "set-cdr!", 1, yail$Mnlist);
        }
    }

    public static Object insertYailListHeader(Object x) {
        return Invoke.invokeStatic.apply3(YailList, Lit28, x);
    }

    public static Object kawaList$To$YailList(Object x) {
        if (C0605lists.isNull(x)) {
            return new YailList();
        }
        if (!C0605lists.isPair(x)) {
            return sanitizeAtomic(x);
        }
        if (isYailList(x) != Boolean.FALSE) {
            return x;
        }
        Object obj = LList.Empty;
        Object arg0 = x;
        while (arg0 != LList.Empty) {
            try {
                Pair arg02 = (Pair) arg0;
                Object arg03 = arg02.getCdr();
                obj = Pair.make(kawaList$To$YailList(arg02.getCar()), obj);
                arg0 = arg03;
            } catch (ClassCastException e) {
                throw new WrongType(e, "arg0", -2, arg0);
            }
        }
        return YailList.makeList((List) LList.reverseInPlace(obj));
    }

    public static Object yailList$To$KawaList(Object data) {
        if (isYailList(data) == Boolean.FALSE) {
            return data;
        }
        Object arg0 = yailListContents(data);
        Object obj = LList.Empty;
        while (arg0 != LList.Empty) {
            try {
                Pair arg02 = (Pair) arg0;
                Object arg03 = arg02.getCdr();
                obj = Pair.make(yailList$To$KawaList(arg02.getCar()), obj);
                arg0 = arg03;
            } catch (ClassCastException e) {
                throw new WrongType(e, "arg0", -2, arg0);
            }
        }
        return LList.reverseInPlace(obj);
    }

    public static Object isYailListEmpty(Object x) {
        Object x2 = isYailList(x);
        if (x2 != Boolean.FALSE) {
            return C0605lists.isNull(yailListContents(x)) ? Boolean.TRUE : Boolean.FALSE;
        }
        return x2;
    }

    public static YailList makeYailList$V(Object[] argsArray) {
        return YailList.makeList((List) LList.makeList(argsArray, 0));
    }

    public static Object yailListCopy(Object yl) {
        if (isYailListEmpty(yl) != Boolean.FALSE) {
            return new YailList();
        }
        if (!C0605lists.isPair(yl)) {
            return yl;
        }
        Object arg0 = yailListContents(yl);
        Object obj = LList.Empty;
        while (arg0 != LList.Empty) {
            try {
                Pair arg02 = (Pair) arg0;
                Object arg03 = arg02.getCdr();
                obj = Pair.make(yailListCopy(arg02.getCar()), obj);
                arg0 = arg03;
            } catch (ClassCastException e) {
                throw new WrongType(e, "arg0", -2, arg0);
            }
        }
        return YailList.makeList((List) LList.reverseInPlace(obj));
    }

    public static Object yailListReverse(Object yl) {
        if (isYailList(yl) == Boolean.FALSE) {
            return signalRuntimeError("Argument value to \"reverse list\" must be a list", "Expecting list");
        }
        Object yailListContents = yailListContents(yl);
        try {
            return insertYailListHeader(C0605lists.reverse((LList) yailListContents));
        } catch (ClassCastException e) {
            throw new WrongType(e, "reverse", 1, yailListContents);
        }
    }

    public static Object yailListToCsvTable(Object yl) {
        if (isYailList(yl) == Boolean.FALSE) {
            return signalRuntimeError("Argument value to \"list to csv table\" must be a list", "Expecting list");
        }
        Apply apply = Scheme.apply;
        ModuleMethod moduleMethod = make$Mnyail$Mnlist;
        Object arg0 = yailListContents(yl);
        Object obj = LList.Empty;
        while (arg0 != LList.Empty) {
            try {
                Pair arg02 = (Pair) arg0;
                Object arg03 = arg02.getCdr();
                obj = Pair.make(convertToStringsForCsv(arg02.getCar()), obj);
                arg0 = arg03;
            } catch (ClassCastException e) {
                throw new WrongType(e, "arg0", -2, arg0);
            }
        }
        Object apply2 = apply.apply2(moduleMethod, LList.reverseInPlace(obj));
        try {
            return CsvUtil.toCsvTable((YailList) apply2);
        } catch (ClassCastException e2) {
            throw new WrongType(e2, "com.google.appinventor.components.runtime.util.CsvUtil.toCsvTable(com.google.appinventor.components.runtime.util.YailList)", 1, apply2);
        }
    }

    public static Object yailListToCsvRow(Object yl) {
        if (isYailList(yl) == Boolean.FALSE) {
            return signalRuntimeError("Argument value to \"list to csv row\" must be a list", "Expecting list");
        }
        Object convertToStringsForCsv = convertToStringsForCsv(yl);
        try {
            return CsvUtil.toCsvRow((YailList) convertToStringsForCsv);
        } catch (ClassCastException e) {
            throw new WrongType(e, "com.google.appinventor.components.runtime.util.CsvUtil.toCsvRow(com.google.appinventor.components.runtime.util.YailList)", 1, convertToStringsForCsv);
        }
    }

    public static Object convertToStringsForCsv(Object yl) {
        if (isYailListEmpty(yl) != Boolean.FALSE) {
            return yl;
        }
        if (isYailList(yl) == Boolean.FALSE) {
            return makeYailList$V(new Object[]{yl});
        }
        Apply apply = Scheme.apply;
        ModuleMethod moduleMethod = make$Mnyail$Mnlist;
        Object arg0 = yailListContents(yl);
        Object obj = LList.Empty;
        while (arg0 != LList.Empty) {
            try {
                Pair arg02 = (Pair) arg0;
                Object arg03 = arg02.getCdr();
                obj = Pair.make(coerceToString(arg02.getCar()), obj);
                arg0 = arg03;
            } catch (ClassCastException e) {
                throw new WrongType(e, "arg0", -2, arg0);
            }
        }
        return apply.apply2(moduleMethod, LList.reverseInPlace(obj));
    }

    public static Object yailListFromCsvTable(Object str) {
        try {
            return CsvUtil.fromCsvTable(str == null ? null : str.toString());
        } catch (Exception exception) {
            return signalRuntimeError("Cannot parse text argument to \"list from csv table\" as a CSV-formatted table", exception.getMessage());
        }
    }

    public static Object yailListFromCsvRow(Object str) {
        try {
            return CsvUtil.fromCsvRow(str == null ? null : str.toString());
        } catch (Exception exception) {
            return signalRuntimeError("Cannot parse text argument to \"list from csv row\" as CSV-formatted row", exception.getMessage());
        }
    }

    public static int yailListLength(Object yail$Mnlist) {
        Object yailListContents = yailListContents(yail$Mnlist);
        try {
            return C0605lists.length((LList) yailListContents);
        } catch (ClassCastException e) {
            throw new WrongType(e, "length", 1, yailListContents);
        }
    }

    public static Object yailListIndex(Object object, Object yail$Mnlist) {
        Object obj = Lit17;
        for (Object yailListContents = yailListContents(yail$Mnlist); !C0605lists.isNull(yailListContents); yailListContents = C0605lists.cdr.apply1(yailListContents)) {
            if (isYailEqual(object, C0605lists.car.apply1(yailListContents)) != Boolean.FALSE) {
                return obj;
            }
            obj = AddOp.$Pl.apply2(obj, Lit17);
        }
        return Lit18;
    }

    public static Object yailListGetItem(Object yail$Mnlist, Object index) {
        if (Scheme.numLss.apply2(index, Lit17) != Boolean.FALSE) {
            signalRuntimeError(Format.formatToString(0, "Select list item: Attempt to get item number ~A, of the list ~A.  The minimum valid item number is 1.", index, getDisplayRepresentation(yail$Mnlist)), "List index smaller than 1");
        }
        int len = yailListLength(yail$Mnlist);
        if (Scheme.numGrt.apply2(index, Integer.valueOf(len)) != Boolean.FALSE) {
            return signalRuntimeError(Format.formatToString(0, "Select list item: Attempt to get item number ~A of a list of length ~A: ~A", index, Integer.valueOf(len), getDisplayRepresentation(yail$Mnlist)), "Select list item: List index too large");
        }
        Object yailListContents = yailListContents(yail$Mnlist);
        Object apply2 = AddOp.$Mn.apply2(index, Lit17);
        try {
            return C0605lists.listRef(yailListContents, ((Number) apply2).intValue());
        } catch (ClassCastException e) {
            throw new WrongType(e, "list-ref", 2, apply2);
        }
    }

    public static void yailListSetItem$Ex(Object yail$Mnlist, Object index, Object value) {
        if (Scheme.numLss.apply2(index, Lit17) != Boolean.FALSE) {
            signalRuntimeError(Format.formatToString(0, "Replace list item: Attempt to replace item number ~A of the list ~A.  The minimum valid item number is 1.", index, getDisplayRepresentation(yail$Mnlist)), "List index smaller than 1");
        }
        int len = yailListLength(yail$Mnlist);
        if (Scheme.numGrt.apply2(index, Integer.valueOf(len)) != Boolean.FALSE) {
            signalRuntimeError(Format.formatToString(0, "Replace list item: Attempt to replace item number ~A of a list of length ~A: ~A", index, Integer.valueOf(len), getDisplayRepresentation(yail$Mnlist)), "List index too large");
        }
        Object yailListContents = yailListContents(yail$Mnlist);
        Object apply2 = AddOp.$Mn.apply2(index, Lit17);
        try {
            Object listTail = C0605lists.listTail(yailListContents, ((Number) apply2).intValue());
            try {
                C0605lists.setCar$Ex((Pair) listTail, value);
            } catch (ClassCastException e) {
                throw new WrongType(e, "set-car!", 1, listTail);
            }
        } catch (ClassCastException e2) {
            throw new WrongType(e2, "list-tail", 2, apply2);
        }
    }

    public static void yailListRemoveItem$Ex(Object yail$Mnlist, Object index) {
        Object index2 = coerceToNumber(index);
        if (index2 == Lit2) {
            signalRuntimeError(Format.formatToString(0, "Remove list item: index -- ~A -- is not a number", getDisplayRepresentation(index)), "Bad list index");
        }
        if (isYailListEmpty(yail$Mnlist) != Boolean.FALSE) {
            signalRuntimeError(Format.formatToString(0, "Remove list item: Attempt to remove item ~A of an empty list", getDisplayRepresentation(index)), "Invalid list operation");
        }
        if (Scheme.numLss.apply2(index2, Lit17) != Boolean.FALSE) {
            signalRuntimeError(Format.formatToString(0, "Remove list item: Attempt to remove item ~A of the list ~A.  The minimum valid item number is 1.", index2, getDisplayRepresentation(yail$Mnlist)), "List index smaller than 1");
        }
        int len = yailListLength(yail$Mnlist);
        if (Scheme.numGrt.apply2(index2, Integer.valueOf(len)) != Boolean.FALSE) {
            signalRuntimeError(Format.formatToString(0, "Remove list item: Attempt to remove item ~A of a list of length ~A: ~A", index2, Integer.valueOf(len), getDisplayRepresentation(yail$Mnlist)), "List index too large");
        }
        Object apply2 = AddOp.$Mn.apply2(index2, Lit17);
        try {
            Object pair$Mnpointing$Mnto$Mndeletion = C0605lists.listTail(yail$Mnlist, ((Number) apply2).intValue());
            try {
                C0605lists.setCdr$Ex((Pair) pair$Mnpointing$Mnto$Mndeletion, C0605lists.cddr.apply1(pair$Mnpointing$Mnto$Mndeletion));
            } catch (ClassCastException e) {
                throw new WrongType(e, "set-cdr!", 1, pair$Mnpointing$Mnto$Mndeletion);
            }
        } catch (ClassCastException e2) {
            throw new WrongType(e2, "list-tail", 2, apply2);
        }
    }

    public static void yailListInsertItem$Ex(Object yail$Mnlist, Object index, Object item) {
        Object index2 = coerceToNumber(index);
        if (index2 == Lit2) {
            signalRuntimeError(Format.formatToString(0, "Insert list item: index (~A) is not a number", getDisplayRepresentation(index)), "Bad list index");
        }
        if (Scheme.numLss.apply2(index2, Lit17) != Boolean.FALSE) {
            signalRuntimeError(Format.formatToString(0, "Insert list item: Attempt to insert item ~A into the list ~A.  The minimum valid item number is 1.", index2, getDisplayRepresentation(yail$Mnlist)), "List index smaller than 1");
        }
        int len$Pl1 = yailListLength(yail$Mnlist) + 1;
        if (Scheme.numGrt.apply2(index2, Integer.valueOf(len$Pl1)) != Boolean.FALSE) {
            signalRuntimeError(Format.formatToString(0, "Insert list item: Attempt to insert item ~A into the list ~A.  The maximum valid item number is ~A.", index2, getDisplayRepresentation(yail$Mnlist), Integer.valueOf(len$Pl1)), "List index too large");
        }
        Object contents = yailListContents(yail$Mnlist);
        if (Scheme.numEqu.apply2(index2, Lit17) != Boolean.FALSE) {
            setYailListContents$Ex(yail$Mnlist, C0605lists.cons(item, contents));
            return;
        }
        Object apply2 = AddOp.$Mn.apply2(index2, Lit19);
        try {
            Object at$Mnitem = C0605lists.listTail(contents, ((Number) apply2).intValue());
            try {
                C0605lists.setCdr$Ex((Pair) at$Mnitem, C0605lists.cons(item, C0605lists.cdr.apply1(at$Mnitem)));
            } catch (ClassCastException e) {
                throw new WrongType(e, "set-cdr!", 1, at$Mnitem);
            }
        } catch (ClassCastException e2) {
            throw new WrongType(e2, "list-tail", 2, apply2);
        }
    }

    public static void yailListAppend$Ex(Object yail$Mnlist$MnA, Object yail$Mnlist$MnB) {
        Object yailListContents = yailListContents(yail$Mnlist$MnA);
        try {
            Object listTail = C0605lists.listTail(yail$Mnlist$MnA, C0605lists.length((LList) yailListContents));
            try {
                C0605lists.setCdr$Ex((Pair) listTail, lambda12listCopy(yailListContents(yail$Mnlist$MnB)));
            } catch (ClassCastException e) {
                throw new WrongType(e, "set-cdr!", 1, listTail);
            }
        } catch (ClassCastException e2) {
            throw new WrongType(e2, "length", 1, yailListContents);
        }
    }

    public static Object lambda12listCopy(Object l) {
        if (C0605lists.isNull(l)) {
            return LList.Empty;
        }
        return C0605lists.cons(C0605lists.car.apply1(l), lambda12listCopy(C0605lists.cdr.apply1(l)));
    }

    public static void yailListAddToList$Ex$V(Object yail$Mnlist, Object[] argsArray) {
        yailListAppend$Ex(yail$Mnlist, Scheme.apply.apply2(make$Mnyail$Mnlist, LList.makeList(argsArray, 0)));
    }

    public Object applyN(ModuleMethod moduleMethod, Object[] objArr) {
        switch (moduleMethod.selector) {
            case 14:
                return call$MnInitializeOfComponents$V(objArr);
            case 23:
                return setAndCoercePropertyAndCheck$Ex(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
            case 24:
                return symbolAppend$V(objArr);
            case 40:
                return lambda22(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
            case 41:
                Object obj = objArr[0];
                Object obj2 = objArr[1];
                int length = objArr.length - 2;
                Object[] objArr2 = new Object[length];
                while (true) {
                    length--;
                    if (length < 0) {
                        return lambda23$V(obj, obj2, objArr2);
                    }
                    objArr2[length] = objArr[length + 2];
                }
            case 43:
                return callComponentTypeMethod(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
            case 83:
                return processAndDelayed$V(objArr);
            case 84:
                return processOrDelayed$V(objArr);
            case 126:
                return makeYailList$V(objArr);
            case 141:
                Object obj3 = objArr[0];
                int length2 = objArr.length - 1;
                Object[] objArr3 = new Object[length2];
                while (true) {
                    length2--;
                    if (length2 < 0) {
                        yailListAddToList$Ex$V(obj3, objArr3);
                        return Values.empty;
                    }
                    objArr3[length2] = objArr[length2 + 1];
                }
            default:
                return super.applyN(moduleMethod, objArr);
        }
    }

    public static Boolean isYailListMember(Object object, Object yail$Mnlist) {
        return C0605lists.member(object, yailListContents(yail$Mnlist), yail$Mnequal$Qu) != Boolean.FALSE ? Boolean.TRUE : Boolean.FALSE;
    }

    public static Object yailListPickRandom(Object yail$Mnlist) {
        Object[] objArr;
        if (isYailListEmpty(yail$Mnlist) != Boolean.FALSE) {
            String str = "Pick random item: Attempt to pick a random element from an empty list";
            if (str instanceof Object[]) {
                objArr = (Object[]) str;
            } else {
                objArr = new Object[]{str};
            }
            signalRuntimeError(Format.formatToString(0, objArr), "Invalid list operation");
        }
        return yailListGetItem(yail$Mnlist, randomInteger(Lit17, Integer.valueOf(yailListLength(yail$Mnlist))));
    }

    public static Object yailForEach(Object proc, Object yail$Mnlist) {
        Object verified$Mnlist = coerceToYailList(yail$Mnlist);
        if (verified$Mnlist == Lit2) {
            return signalRuntimeError(Format.formatToString(0, "The second argument to foreach is not a list.  The second argument is: ~A", getDisplayRepresentation(yail$Mnlist)), "Bad list argument to foreach");
        }
        Object arg0 = yailListContents(verified$Mnlist);
        while (arg0 != LList.Empty) {
            try {
                Pair arg02 = (Pair) arg0;
                Scheme.applyToArgs.apply2(proc, arg02.getCar());
                arg0 = arg02.getCdr();
            } catch (ClassCastException e) {
                throw new WrongType(e, "arg0", -2, arg0);
            }
        }
        return null;
    }

    public static Object yailForRange(Object proc, Object start, Object end, Object step) {
        Object nstart = coerceToNumber(start);
        Object nend = coerceToNumber(end);
        Object nstep = coerceToNumber(step);
        if (nstart == Lit2) {
            signalRuntimeError(Format.formatToString(0, "For range: the start value -- ~A -- is not a number", getDisplayRepresentation(start)), "Bad start value");
        }
        if (nend == Lit2) {
            signalRuntimeError(Format.formatToString(0, "For range: the end value -- ~A -- is not a number", getDisplayRepresentation(end)), "Bad end value");
        }
        if (nstep == Lit2) {
            signalRuntimeError(Format.formatToString(0, "For range: the step value -- ~A -- is not a number", getDisplayRepresentation(step)), "Bad step value");
        }
        return yailForRangeWithNumericCheckedArgs(proc, nstart, nend, nstep);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0049, code lost:
        if (r3 != false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006f, code lost:
        if (r3 == false) goto L_0x0071;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b0 A[LOOP:0: B:31:0x0080->B:46:0x00b0, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object yailForRangeWithNumericCheckedArgs(java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            r6 = 0
            r8 = -2
            gnu.kawa.functions.NumberCompare r4 = kawa.standard.Scheme.numEqu
            gnu.math.IntNum r5 = Lit18
            java.lang.Object r5 = r4.apply2(r12, r5)
            r0 = r5
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ ClassCastException -> 0x00bc }
            r4 = r0
            boolean r3 = r4.booleanValue()     // Catch:{ ClassCastException -> 0x00bc }
            if (r3 == 0) goto L_0x0025
            gnu.kawa.functions.NumberCompare r4 = kawa.standard.Scheme.numEqu
            java.lang.Object r4 = r4.apply2(r10, r11)
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            if (r4 == r5) goto L_0x0027
        L_0x001e:
            gnu.kawa.functions.ApplyToArgs r4 = kawa.standard.Scheme.applyToArgs
            java.lang.Object r4 = r4.apply2(r9, r10)
        L_0x0024:
            return r4
        L_0x0025:
            if (r3 != 0) goto L_0x001e
        L_0x0027:
            gnu.kawa.functions.NumberCompare r4 = kawa.standard.Scheme.numLss
            java.lang.Object r5 = r4.apply2(r10, r11)
            r0 = r5
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ ClassCastException -> 0x00c5 }
            r4 = r0
            boolean r3 = r4.booleanValue()     // Catch:{ ClassCastException -> 0x00c5 }
            if (r3 == 0) goto L_0x0047
            gnu.kawa.functions.NumberCompare r4 = kawa.standard.Scheme.numLEq
            gnu.math.IntNum r5 = Lit18
            java.lang.Object r5 = r4.apply2(r12, r5)
            r0 = r5
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ ClassCastException -> 0x00ce }
            r4 = r0
            boolean r3 = r4.booleanValue()     // Catch:{ ClassCastException -> 0x00ce }
        L_0x0047:
            if (r3 == 0) goto L_0x004d
            if (r3 == 0) goto L_0x0071
        L_0x004b:
            r4 = r6
            goto L_0x0024
        L_0x004d:
            gnu.kawa.functions.NumberCompare r4 = kawa.standard.Scheme.numGrt
            java.lang.Object r5 = r4.apply2(r10, r11)
            r0 = r5
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ ClassCastException -> 0x00d7 }
            r4 = r0
            boolean r3 = r4.booleanValue()     // Catch:{ ClassCastException -> 0x00d7 }
            if (r3 == 0) goto L_0x006d
            gnu.kawa.functions.NumberCompare r4 = kawa.standard.Scheme.numGEq
            gnu.math.IntNum r5 = Lit18
            java.lang.Object r5 = r4.apply2(r12, r5)
            r0 = r5
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ ClassCastException -> 0x00e0 }
            r4 = r0
            boolean r3 = r4.booleanValue()     // Catch:{ ClassCastException -> 0x00e0 }
        L_0x006d:
            if (r3 == 0) goto L_0x008a
            if (r3 != 0) goto L_0x004b
        L_0x0071:
            gnu.kawa.functions.NumberCompare r4 = kawa.standard.Scheme.numLss
            gnu.math.IntNum r5 = Lit18
            java.lang.Object r4 = r4.apply2(r12, r5)
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            if (r4 == r5) goto L_0x00ad
            gnu.kawa.functions.NumberCompare r2 = kawa.standard.Scheme.numLss
        L_0x007f:
            r1 = r10
        L_0x0080:
            java.lang.Object r4 = r2.apply2(r1, r11)
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            if (r4 == r5) goto L_0x00b0
            r4 = r6
            goto L_0x0024
        L_0x008a:
            gnu.kawa.functions.NumberCompare r4 = kawa.standard.Scheme.numEqu
            java.lang.Object r4 = r4.apply2(r10, r11)
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch:{ ClassCastException -> 0x00e9 }
            if (r4 == r5) goto L_0x00a8
            r4 = 1
        L_0x0095:
            int r4 = r4 + 1
            r3 = r4 & 1
            if (r3 == 0) goto L_0x00aa
            gnu.kawa.functions.NumberCompare r4 = kawa.standard.Scheme.numEqu
            gnu.math.IntNum r5 = Lit18
            java.lang.Object r4 = r4.apply2(r12, r5)
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            if (r4 == r5) goto L_0x0071
            goto L_0x004b
        L_0x00a8:
            r4 = 0
            goto L_0x0095
        L_0x00aa:
            if (r3 == 0) goto L_0x0071
            goto L_0x004b
        L_0x00ad:
            gnu.kawa.functions.NumberCompare r2 = kawa.standard.Scheme.numGrt
            goto L_0x007f
        L_0x00b0:
            gnu.kawa.functions.ApplyToArgs r4 = kawa.standard.Scheme.applyToArgs
            r4.apply2(r9, r1)
            gnu.kawa.functions.AddOp r4 = gnu.kawa.functions.AddOp.$Pl
            java.lang.Object r1 = r4.apply2(r1, r12)
            goto L_0x0080
        L_0x00bc:
            r4 = move-exception
            gnu.mapping.WrongType r6 = new gnu.mapping.WrongType
            java.lang.String r7 = "x"
            r6.<init>(r4, r7, r8, r5)
            throw r6
        L_0x00c5:
            r4 = move-exception
            gnu.mapping.WrongType r6 = new gnu.mapping.WrongType
            java.lang.String r7 = "x"
            r6.<init>(r4, r7, r8, r5)
            throw r6
        L_0x00ce:
            r4 = move-exception
            gnu.mapping.WrongType r6 = new gnu.mapping.WrongType
            java.lang.String r7 = "x"
            r6.<init>(r4, r7, r8, r5)
            throw r6
        L_0x00d7:
            r4 = move-exception
            gnu.mapping.WrongType r6 = new gnu.mapping.WrongType
            java.lang.String r7 = "x"
            r6.<init>(r4, r7, r8, r5)
            throw r6
        L_0x00e0:
            r4 = move-exception
            gnu.mapping.WrongType r6 = new gnu.mapping.WrongType
            java.lang.String r7 = "x"
            r6.<init>(r4, r7, r8, r5)
            throw r6
        L_0x00e9:
            r5 = move-exception
            gnu.mapping.WrongType r6 = new gnu.mapping.WrongType
            java.lang.String r7 = "x"
            r6.<init>(r5, r7, r8, r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.youngandroid.C0593runtime.yailForRangeWithNumericCheckedArgs(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public Object apply4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4) {
        switch (moduleMethod.selector) {
            case 13:
                return addComponentWithinRepl(obj, obj2, obj3, obj4);
            case 19:
                return setAndCoerceProperty$Ex(obj, obj2, obj3, obj4);
            case 42:
                return callComponentMethod(obj, obj2, obj3, obj4);
            case 44:
                return callYailPrimitive(obj, obj2, obj3, obj4);
            case 52:
                return callWithCoercedArgs(obj, obj2, obj3, obj4);
            case 53:
                return $PcSetAndCoerceProperty$Ex(obj, obj2, obj3, obj4);
            case 145:
                return yailForRange(obj, obj2, obj3, obj4);
            case 146:
                return yailForRangeWithNumericCheckedArgs(obj, obj2, obj3, obj4);
            default:
                return super.apply4(moduleMethod, obj, obj2, obj3, obj4);
        }
    }

    public static Object yailNumberRange(Object low, Object high) {
        try {
            try {
                return kawaList$To$YailList(lambda13loop(numbers.inexact$To$Exact(numbers.ceiling(LangObjType.coerceRealNum(low))), numbers.inexact$To$Exact(numbers.floor(LangObjType.coerceRealNum(high)))));
            } catch (ClassCastException e) {
                throw new WrongType(e, "floor", 1, high);
            }
        } catch (ClassCastException e2) {
            throw new WrongType(e2, "ceiling", 1, low);
        }
    }

    public static Object lambda13loop(Object a, Object b) {
        if (Scheme.numGrt.apply2(a, b) != Boolean.FALSE) {
            return LList.Empty;
        }
        return C0605lists.cons(a, lambda13loop(AddOp.$Pl.apply2(a, Lit17), b));
    }

    public static Object yailAlistLookup(Object key, Object yail$Mnlist$Mnof$Mnpairs, Object obj) {
        androidLog(Format.formatToString(0, "List alist lookup key is  ~A and table is ~A", key, yail$Mnlist$Mnof$Mnpairs));
        Object pairs$Mnto$Mncheck = yailListContents(yail$Mnlist$Mnof$Mnpairs);
        while (!C0605lists.isNull(pairs$Mnto$Mncheck)) {
            if (isPairOk(C0605lists.car.apply1(pairs$Mnto$Mncheck)) == Boolean.FALSE) {
                return signalRuntimeError(Format.formatToString(0, "Lookup in pairs: the list ~A is not a well-formed list of pairs", getDisplayRepresentation(yail$Mnlist$Mnof$Mnpairs)), "Invalid list of pairs");
            } else if (isYailEqual(key, C0605lists.car.apply1(yailListContents(C0605lists.car.apply1(pairs$Mnto$Mncheck)))) != Boolean.FALSE) {
                return C0605lists.cadr.apply1(yailListContents(C0605lists.car.apply1(pairs$Mnto$Mncheck)));
            } else {
                pairs$Mnto$Mncheck = C0605lists.cdr.apply1(pairs$Mnto$Mncheck);
            }
        }
        return obj;
    }

    public static Object isPairOk(Object candidate$Mnpair) {
        Object x = isYailList(candidate$Mnpair);
        if (x == Boolean.FALSE) {
            return x;
        }
        Object yailListContents = yailListContents(candidate$Mnpair);
        try {
            return C0605lists.length((LList) yailListContents) == 2 ? Boolean.TRUE : Boolean.FALSE;
        } catch (ClassCastException e) {
            throw new WrongType(e, "length", 1, yailListContents);
        }
    }

    public static Object yailListJoinWithSeparator(Object yail$Mnlist, Object separator) {
        return joinStrings(yailListContents(yail$Mnlist), separator);
    }

    public static Object makeDisjunct(Object x) {
        String str = null;
        if (C0605lists.isNull(C0605lists.cdr.apply1(x))) {
            Object apply1 = C0605lists.car.apply1(x);
            if (apply1 != null) {
                str = apply1.toString();
            }
            return Pattern.quote(str);
        }
        Object[] objArr = new Object[2];
        Object apply12 = C0605lists.car.apply1(x);
        if (apply12 != null) {
            str = apply12.toString();
        }
        objArr[0] = Pattern.quote(str);
        objArr[1] = strings.stringAppend("|", makeDisjunct(C0605lists.cdr.apply1(x)));
        return strings.stringAppend(objArr);
    }

    public static Object array$To$List(Object arr) {
        try {
            return insertYailListHeader(LList.makeList((Object[]) arr, 0));
        } catch (ClassCastException e) {
            throw new WrongType(e, "gnu.lists.LList.makeList(java.lang.Object[],int)", 1, arr);
        }
    }

    public static int stringStartsAt(Object text, Object piece) {
        return text.toString().indexOf(piece.toString()) + 1;
    }

    public static Boolean stringContains(Object text, Object piece) {
        return stringStartsAt(text, piece) == 0 ? Boolean.FALSE : Boolean.TRUE;
    }

    public static Object stringSplitAtFirst(Object text, Object at) {
        return array$To$List(text.toString().split(Pattern.quote(at == null ? null : at.toString()), 2));
    }

    public static Object stringSplitAtFirstOfAny(Object text, Object at) {
        if (C0605lists.isNull(yailListContents(at))) {
            return signalRuntimeError("split at first of any: The list of places to split at is empty.", "Invalid text operation");
        }
        String obj = text.toString();
        Object makeDisjunct = makeDisjunct(yailListContents(at));
        return array$To$List(obj.split(makeDisjunct == null ? null : makeDisjunct.toString(), 2));
    }

    public static Object stringSplit(Object text, Object at) {
        return array$To$List(text.toString().split(Pattern.quote(at == null ? null : at.toString())));
    }

    public static Object stringSplitAtAny(Object text, Object at) {
        if (C0605lists.isNull(yailListContents(at))) {
            return signalRuntimeError("split at any: The list of places to split at is empty.", "Invalid text operation");
        }
        String obj = text.toString();
        Object makeDisjunct = makeDisjunct(yailListContents(at));
        return array$To$List(obj.split(makeDisjunct == null ? null : makeDisjunct.toString(), -1));
    }

    public static Object stringSplitAtSpaces(Object text) {
        return array$To$List(text.toString().trim().split("\\s+", -1));
    }

    public static Object stringSubstring(Object wholestring, Object start, Object length) {
        try {
            int len = strings.stringLength((CharSequence) wholestring);
            if (Scheme.numLss.apply2(start, Lit17) != Boolean.FALSE) {
                return signalRuntimeError(Format.formatToString(0, "Segment: Start is less than 1 (~A).", start), "Invalid text operation");
            } else if (Scheme.numLss.apply2(length, Lit18) != Boolean.FALSE) {
                return signalRuntimeError(Format.formatToString(0, "Segment: Length is negative (~A).", length), "Invalid text operation");
            } else if (Scheme.numGrt.apply2(AddOp.$Pl.apply2(AddOp.$Mn.apply2(start, Lit17), length), Integer.valueOf(len)) != Boolean.FALSE) {
                return signalRuntimeError(Format.formatToString(0, "Segment: Start (~A) + length (~A) - 1 exceeds text length (~A).", start, length, Integer.valueOf(len)), "Invalid text operation");
            } else {
                try {
                    CharSequence charSequence = (CharSequence) wholestring;
                    Object apply2 = AddOp.$Mn.apply2(start, Lit17);
                    try {
                        int intValue = ((Number) apply2).intValue();
                        Object apply22 = AddOp.$Pl.apply2(AddOp.$Mn.apply2(start, Lit17), length);
                        try {
                            return strings.substring(charSequence, intValue, ((Number) apply22).intValue());
                        } catch (ClassCastException e) {
                            throw new WrongType(e, "substring", 3, apply22);
                        }
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "substring", 2, apply2);
                    }
                } catch (ClassCastException e3) {
                    throw new WrongType(e3, "substring", 1, wholestring);
                }
            }
        } catch (ClassCastException e4) {
            throw new WrongType(e4, "string-length", 1, wholestring);
        }
    }

    public static String stringTrim(Object text) {
        return text.toString().trim();
    }

    public static String stringReplaceAll(Object text, Object substring, Object replacement) {
        return text.toString().replaceAll(Pattern.quote(substring.toString()), replacement.toString());
    }

    public Object apply3(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3) {
        switch (moduleMethod.selector) {
            case 22:
                return getPropertyAndCheck(obj, obj2, obj3);
            case 38:
                return lambda21(obj, obj2, obj3);
            case 50:
                return signalRuntimeFormError(obj, obj2, obj3);
            case 54:
                return $PcSetSubformLayoutProperty$Ex(obj, obj2, obj3);
            case 57:
                return coerceArgs(obj, obj2, obj3);
            case 137:
                yailListSetItem$Ex(obj, obj2, obj3);
                return Values.empty;
            case 139:
                yailListInsertItem$Ex(obj, obj2, obj3);
                return Values.empty;
            case 148:
                return yailAlistLookup(obj, obj2, obj3);
            case ComponentConstants.TEXTBOX_PREFERRED_WIDTH /*160*/:
                return stringSubstring(obj, obj2, obj3);
            case 162:
                return stringReplaceAll(obj, obj2, obj3);
            default:
                return super.apply3(moduleMethod, obj, obj2, obj3);
        }
    }

    public static Object isStringEmpty(Object text) {
        try {
            return strings.stringLength((CharSequence) text) == 0 ? Boolean.TRUE : Boolean.FALSE;
        } catch (ClassCastException e) {
            throw new WrongType(e, "string-length", 1, text);
        }
    }

    public static Object textDeobfuscate(Object text, Object confounder) {
        frame4 frame42 = new frame4();
        frame42.text = text;
        frame42.f46lc = confounder;
        ModuleMethod moduleMethod = frame42.cont$Fn12;
        CallCC.callcc.apply1(frame42.cont$Fn12);
        Object obj = Lit18;
        LList lList = LList.Empty;
        Object obj2 = frame42.text;
        try {
            Integer valueOf = Integer.valueOf(strings.stringLength((CharSequence) obj2));
            while (true) {
                NumberCompare numberCompare = Scheme.numGEq;
                Object obj3 = frame42.text;
                try {
                    if (numberCompare.apply2(obj, Integer.valueOf(strings.stringLength((CharSequence) obj3))) != Boolean.FALSE) {
                        break;
                    }
                    Object obj4 = frame42.text;
                    try {
                        try {
                            int c = characters.char$To$Integer(Char.make(strings.stringRef((CharSequence) obj4, ((Number) obj).intValue())));
                            Object b = BitwiseOp.and.apply2(BitwiseOp.xor.apply2(Integer.valueOf(c), AddOp.$Mn.apply2(valueOf, obj)), Lit29);
                            Object b2 = BitwiseOp.and.apply2(BitwiseOp.xor.apply2(Integer.valueOf(c >> 8), obj), Lit29);
                            Object b3 = BitwiseOp.and.apply2(BitwiseOp.ior.apply2(BitwiseOp.ashiftl.apply2(b2, Lit30), b), Lit29);
                            BitwiseOp bitwiseOp = BitwiseOp.and;
                            BitwiseOp bitwiseOp2 = BitwiseOp.xor;
                            Object obj5 = frame42.f46lc;
                            try {
                                try {
                                    LList cons = C0605lists.cons(bitwiseOp.apply2(bitwiseOp2.apply2(b3, Integer.valueOf(characters.char$To$Integer(Char.make(strings.stringRef((CharSequence) obj5, ((Number) obj).intValue()))))), Lit29), lList);
                                    obj = AddOp.$Pl.apply2(Lit17, obj);
                                    lList = cons;
                                } catch (ClassCastException e) {
                                    WrongType wrongType = new WrongType(e, "string-ref", 2, obj);
                                    throw wrongType;
                                }
                            } catch (ClassCastException e2) {
                                WrongType wrongType2 = new WrongType(e2, "string-ref", 1, obj5);
                                throw wrongType2;
                            }
                        } catch (ClassCastException e3) {
                            WrongType wrongType3 = new WrongType(e3, "string-ref", 2, obj);
                            throw wrongType3;
                        }
                    } catch (ClassCastException e4) {
                        WrongType wrongType4 = new WrongType(e4, "string-ref", 1, obj4);
                        throw wrongType4;
                    }
                } catch (ClassCastException e5) {
                    WrongType wrongType5 = new WrongType(e5, "string-length", 1, obj3);
                    throw wrongType5;
                }
            }
            try {
                Object reverse = C0605lists.reverse(lList);
                Object obj6 = LList.Empty;
                while (reverse != LList.Empty) {
                    try {
                        Pair arg0 = (Pair) reverse;
                        Object arg02 = arg0.getCdr();
                        Object car = arg0.getCar();
                        try {
                            obj6 = Pair.make(characters.integer$To$Char(((Number) car).intValue()), obj6);
                            reverse = arg02;
                        } catch (ClassCastException e6) {
                            WrongType wrongType6 = new WrongType(e6, "integer->char", 1, car);
                            throw wrongType6;
                        }
                    } catch (ClassCastException e7) {
                        WrongType wrongType7 = new WrongType(e7, "arg0", -2, reverse);
                        throw wrongType7;
                    }
                }
                return strings.list$To$String(LList.reverseInPlace(obj6));
            } catch (ClassCastException e8) {
                WrongType wrongType8 = new WrongType(e8, "reverse", 1, (Object) lList);
                throw wrongType8;
            }
        } catch (ClassCastException e9) {
            WrongType wrongType9 = new WrongType(e9, "string-length", 1, obj2);
            throw wrongType9;
        }
    }

    public static Number makeExactYailInteger(Object x) {
        Object coerceToNumber = coerceToNumber(x);
        try {
            return numbers.exact(numbers.round(LangObjType.coerceRealNum(coerceToNumber)));
        } catch (ClassCastException e) {
            throw new WrongType(e, "round", 1, coerceToNumber);
        }
    }

    public static Object makeColor(Object color$Mncomponents) {
        Number alpha;
        Number red = makeExactYailInteger(yailListGetItem(color$Mncomponents, Lit17));
        Number green = makeExactYailInteger(yailListGetItem(color$Mncomponents, Lit19));
        Number blue = makeExactYailInteger(yailListGetItem(color$Mncomponents, Lit34));
        if (yailListLength(color$Mncomponents) > 3) {
            alpha = makeExactYailInteger(yailListGetItem(color$Mncomponents, Lit35));
        } else {
            Object obj = $Stalpha$Mnopaque$St;
            try {
                alpha = (Number) obj;
            } catch (ClassCastException e) {
                throw new WrongType(e, "alpha", -2, obj);
            }
        }
        return BitwiseOp.ior.apply2(BitwiseOp.ior.apply2(BitwiseOp.ior.apply2(BitwiseOp.ashiftl.apply2(BitwiseOp.and.apply2(alpha, $Stmax$Mncolor$Mncomponent$St), $Stcolor$Mnalpha$Mnposition$St), BitwiseOp.ashiftl.apply2(BitwiseOp.and.apply2(red, $Stmax$Mncolor$Mncomponent$St), $Stcolor$Mnred$Mnposition$St)), BitwiseOp.ashiftl.apply2(BitwiseOp.and.apply2(green, $Stmax$Mncolor$Mncomponent$St), $Stcolor$Mngreen$Mnposition$St)), BitwiseOp.ashiftl.apply2(BitwiseOp.and.apply2(blue, $Stmax$Mncolor$Mncomponent$St), $Stcolor$Mnblue$Mnposition$St));
    }

    public static Object splitColor(Object color) {
        Number intcolor = makeExactYailInteger(color);
        return kawaList$To$YailList(LList.list4(BitwiseOp.and.apply2(BitwiseOp.ashiftr.apply2(intcolor, $Stcolor$Mnred$Mnposition$St), $Stmax$Mncolor$Mncomponent$St), BitwiseOp.and.apply2(BitwiseOp.ashiftr.apply2(intcolor, $Stcolor$Mngreen$Mnposition$St), $Stmax$Mncolor$Mncomponent$St), BitwiseOp.and.apply2(BitwiseOp.ashiftr.apply2(intcolor, $Stcolor$Mnblue$Mnposition$St), $Stmax$Mncolor$Mncomponent$St), BitwiseOp.and.apply2(BitwiseOp.ashiftr.apply2(intcolor, $Stcolor$Mnalpha$Mnposition$St), $Stmax$Mncolor$Mncomponent$St)));
    }

    public static void closeScreen() {
        Form.finishActivity();
    }

    public static void closeApplication() {
        Form.finishApplication();
    }

    public static void openAnotherScreen(Object screen$Mnname) {
        Object coerceToString = coerceToString(screen$Mnname);
        Form.switchForm(coerceToString == null ? null : coerceToString.toString());
    }

    public static void openAnotherScreenWithStartValue(Object screen$Mnname, Object start$Mnvalue) {
        Object coerceToString = coerceToString(screen$Mnname);
        Form.switchFormWithStartValue(coerceToString == null ? null : coerceToString.toString(), start$Mnvalue);
    }

    public static Object getStartValue() {
        return sanitizeComponentData(Form.getStartValue());
    }

    public static void closeScreenWithValue(Object result) {
        Form.finishActivityWithResult(result);
    }

    public static String getPlainStartText() {
        return Form.getStartText();
    }

    public static void closeScreenWithPlainText(Object string) {
        Form.finishActivityWithTextResult(string == null ? null : string.toString());
    }

    public static String getServerAddressFromWifi() {
        Object slotValue = SlotGet.getSlotValue(false, Scheme.applyToArgs.apply1(GetNamedPart.getNamedPart.apply2(((Context) $Stthis$Mnform$St).getSystemService(Context.WIFI_SERVICE), Lit37)), "ipAddress", "ipAddress", "getIpAddress", "isIpAddress", Scheme.instance);
        try {
            return Formatter.formatIpAddress(((Number) slotValue).intValue());
        } catch (ClassCastException e) {
            throw new WrongType(e, "android.text.format.Formatter.formatIpAddress(int)", 1, slotValue);
        }
    }

    public static Object inUi(Object blockid, Object promise) {
        frame5 frame52 = new frame5();
        frame52.blockid = blockid;
        frame52.promise = promise;
        $Stthis$Mnis$Mnthe$Mnrepl$St = Boolean.TRUE;
        return Scheme.applyToArgs.apply2(GetNamedPart.getNamedPart.apply2($Stui$Mnhandler$St, Lit38), thread.runnable(frame52.lambda$Fn13));
    }

    public static Object sendToBlock(Object blockid, Object message) {
        String str = null;
        Object good = C0605lists.car.apply1(message);
        Object value = C0605lists.cadr.apply1(message);
        String obj = blockid == null ? null : blockid.toString();
        String obj2 = good == null ? null : good.toString();
        if (value != null) {
            str = value.toString();
        }
        RetValManager.appendReturnValue(obj, obj2, str);
        return Values.empty;
    }

    public static Object clearCurrentForm() {
        if ($Stthis$Mnform$St == null) {
            return Values.empty;
        }
        clearInitThunks();
        resetCurrentFormEnvironment();
        EventDispatcher.unregisterAllEventsForDelegation();
        return Invoke.invoke.apply2($Stthis$Mnform$St, "clear");
    }

    public static Object setFormName(Object form$Mnname) {
        return Invoke.invoke.apply3($Stthis$Mnform$St, "setFormName", form$Mnname);
    }

    public static Object removeComponent(Object component$Mnname) {
        try {
            SimpleSymbol component$Mnsymbol = misc.string$To$Symbol((CharSequence) component$Mnname);
            Object component$Mnobject = lookupInCurrentFormEnvironment(component$Mnsymbol);
            deleteFromCurrentFormEnvironment(component$Mnsymbol);
            return $Stthis$Mnform$St != null ? Invoke.invoke.apply3($Stthis$Mnform$St, "deleteComponent", component$Mnobject) : Values.empty;
        } catch (ClassCastException e) {
            throw new WrongType(e, "string->symbol", 1, component$Mnname);
        }
    }

    public static Object renameComponent(Object old$Mncomponent$Mnname, Object new$Mncomponent$Mnname) {
        try {
            try {
                return renameInCurrentFormEnvironment(misc.string$To$Symbol((CharSequence) old$Mncomponent$Mnname), misc.string$To$Symbol((CharSequence) new$Mncomponent$Mnname));
            } catch (ClassCastException e) {
                throw new WrongType(e, "string->symbol", 1, new$Mncomponent$Mnname);
            }
        } catch (ClassCastException e2) {
            throw new WrongType(e2, "string->symbol", 1, old$Mncomponent$Mnname);
        }
    }

    public Object apply2(ModuleMethod moduleMethod, Object obj, Object obj2) {
        switch (moduleMethod.selector) {
            case 15:
                return addInitThunk(obj, obj2);
            case 20:
                return getProperty$1(obj, obj2);
            case 29:
                try {
                    return addToCurrentFormEnvironment((Symbol) obj, obj2);
                } catch (ClassCastException e) {
                    throw new WrongType(e, "add-to-current-form-environment", 1, obj);
                }
            case 30:
                try {
                    return lookupInCurrentFormEnvironment((Symbol) obj, obj2);
                } catch (ClassCastException e2) {
                    throw new WrongType(e2, "lookup-in-current-form-environment", 1, obj);
                }
            case 33:
                try {
                    try {
                        return renameInCurrentFormEnvironment((Symbol) obj, (Symbol) obj2);
                    } catch (ClassCastException e3) {
                        throw new WrongType(e3, "rename-in-current-form-environment", 2, obj2);
                    }
                } catch (ClassCastException e4) {
                    throw new WrongType(e4, "rename-in-current-form-environment", 1, obj);
                }
            case 34:
                try {
                    return addGlobalVarToCurrentFormEnvironment((Symbol) obj, obj2);
                } catch (ClassCastException e5) {
                    throw new WrongType(e5, "add-global-var-to-current-form-environment", 1, obj);
                }
            case 35:
                try {
                    return lookupGlobalVarInCurrentFormEnvironment((Symbol) obj, obj2);
                } catch (ClassCastException e6) {
                    throw new WrongType(e6, "lookup-global-var-in-current-form-environment", 1, obj);
                }
            case 49:
                return signalRuntimeError(obj, obj2);
            case 55:
                return generateRuntimeTypeError(obj, obj2);
            case 58:
                return coerceArg(obj, obj2);
            case 62:
                return coerceToComponentOfType(obj, obj2);
            case 69:
                return joinStrings(obj, obj2);
            case 70:
                return stringReplace(obj, obj2);
            case 79:
                return isYailEqual(obj, obj2);
            case 80:
                return isYailAtomicEqual(obj, obj2);
            case 82:
                return isYailNotEqual(obj, obj2) ? Boolean.TRUE : Boolean.FALSE;
            case 90:
                return randomInteger(obj, obj2);
            case 92:
                return yailDivide(obj, obj2);
            case 103:
                return atan2Degrees(obj, obj2);
            case 106:
                return formatAsDecimal(obj, obj2);
            case 121:
                setYailListContents$Ex(obj, obj2);
                return Values.empty;
            case 135:
                return yailListIndex(obj, obj2);
            case 136:
                return yailListGetItem(obj, obj2);
            case 138:
                yailListRemoveItem$Ex(obj, obj2);
                return Values.empty;
            case 140:
                yailListAppend$Ex(obj, obj2);
                return Values.empty;
            case 142:
                return isYailListMember(obj, obj2);
            case 144:
                return yailForEach(obj, obj2);
            case 147:
                return yailNumberRange(obj, obj2);
            case 150:
                return yailListJoinWithSeparator(obj, obj2);
            case 153:
                return Integer.valueOf(stringStartsAt(obj, obj2));
            case 154:
                return stringContains(obj, obj2);
            case 155:
                return stringSplitAtFirst(obj, obj2);
            case 156:
                return stringSplitAtFirstOfAny(obj, obj2);
            case 157:
                return stringSplit(obj, obj2);
            case 158:
                return stringSplitAtAny(obj, obj2);
            case 164:
                return textDeobfuscate(obj, obj2);
            case 171:
                openAnotherScreenWithStartValue(obj, obj2);
                return Values.empty;
            case 177:
                return inUi(obj, obj2);
            case 178:
                return sendToBlock(obj, obj2);
            case 182:
                return renameComponent(obj, obj2);
            default:
                return super.apply2(moduleMethod, obj, obj2);
        }
    }

    public static void initRuntime() {
        setThisForm();
        $Stui$Mnhandler$St = new Handler();
    }

    public static void setThisForm() {
        $Stthis$Mnform$St = Form.getActiveForm();
    }

    public Object apply0(ModuleMethod moduleMethod) {
        switch (moduleMethod.selector) {
            case 17:
                clearInitThunks();
                return Values.empty;
            case 37:
                resetCurrentFormEnvironment();
                return Values.empty;
            case 89:
                return Double.valueOf(randomFraction());
            case 168:
                closeScreen();
                return Values.empty;
            case 169:
                closeApplication();
                return Values.empty;
            case 172:
                return getStartValue();
            case 174:
                return getPlainStartText();
            case 176:
                return getServerAddressFromWifi();
            case 179:
                return clearCurrentForm();
            case 183:
                initRuntime();
                return Values.empty;
            case 184:
                setThisForm();
                return Values.empty;
            default:
                return super.apply0(moduleMethod);
        }
    }

    public static Object clarify(Object sl) {
        return clarify1(yailListContents(sl));
    }

    public static Object clarify1(Object sl) {
        Object sp;
        if (C0605lists.isNull(sl)) {
            return LList.Empty;
        }
        if (IsEqual.apply(C0605lists.car.apply1(sl), "")) {
            sp = "<empty>";
        } else if (IsEqual.apply(C0605lists.car.apply1(sl), " ")) {
            sp = "<space>";
        } else {
            sp = C0605lists.car.apply1(sl);
        }
        return C0605lists.cons(sp, clarify1(C0605lists.cdr.apply1(sl)));
    }
}
