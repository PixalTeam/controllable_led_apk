package gnu.kawa.functions;

import gnu.mapping.Namespace;
import gnu.mapping.Symbol;
import java.text.BreakIterator;

public class UnicodeUtils {

    /* renamed from: Cc */
    static final Symbol f59Cc;

    /* renamed from: Cf */
    static final Symbol f60Cf;

    /* renamed from: Cn */
    static final Symbol f61Cn;

    /* renamed from: Co */
    static final Symbol f62Co;

    /* renamed from: Cs */
    static final Symbol f63Cs;

    /* renamed from: Ll */
    static final Symbol f64Ll;

    /* renamed from: Lm */
    static final Symbol f65Lm;

    /* renamed from: Lo */
    static final Symbol f66Lo;

    /* renamed from: Lt */
    static final Symbol f67Lt;

    /* renamed from: Lu */
    static final Symbol f68Lu;

    /* renamed from: Mc */
    static final Symbol f69Mc;

    /* renamed from: Me */
    static final Symbol f70Me;

    /* renamed from: Mn */
    static final Symbol f71Mn;

    /* renamed from: Nd */
    static final Symbol f72Nd;

    /* renamed from: Nl */
    static final Symbol f73Nl;

    /* renamed from: No */
    static final Symbol f74No;

    /* renamed from: Pc */
    static final Symbol f75Pc;

    /* renamed from: Pd */
    static final Symbol f76Pd;

    /* renamed from: Pe */
    static final Symbol f77Pe;

    /* renamed from: Pf */
    static final Symbol f78Pf;

    /* renamed from: Pi */
    static final Symbol f79Pi;

    /* renamed from: Po */
    static final Symbol f80Po;

    /* renamed from: Ps */
    static final Symbol f81Ps;

    /* renamed from: Sc */
    static final Symbol f82Sc;

    /* renamed from: Sk */
    static final Symbol f83Sk;

    /* renamed from: Sm */
    static final Symbol f84Sm;

    /* renamed from: So */
    static final Symbol f85So;

    /* renamed from: Zl */
    static final Symbol f86Zl;

    /* renamed from: Zp */
    static final Symbol f87Zp;

    /* renamed from: Zs */
    static final Symbol f88Zs;

    public static boolean isWhitespace(int ch) {
        if (ch == 32 || (ch >= 9 && ch <= 13)) {
            return true;
        }
        if (ch < 133) {
            return false;
        }
        if (ch == 133 || ch == 160 || ch == 5760 || ch == 6158) {
            return true;
        }
        if (ch < 8192 || ch > 12288) {
            return false;
        }
        if (ch <= 8202 || ch == 8232 || ch == 8233 || ch == 8239 || ch == 8287 || ch == 12288) {
            return true;
        }
        return false;
    }

    public static String capitalize(String str) {
        StringBuilder sbuf = new StringBuilder();
        BreakIterator wb = BreakIterator.getWordInstance();
        wb.setText(str);
        int start = wb.first();
        for (int end = wb.next(); end != -1; end = wb.next()) {
            boolean isWord = false;
            int p = start;
            while (true) {
                if (p >= end) {
                    break;
                } else if (Character.isLetter(str.codePointAt(p))) {
                    isWord = true;
                    break;
                } else {
                    p++;
                }
            }
            if (!isWord) {
                sbuf.append(str, start, end);
            } else {
                sbuf.append(Character.toTitleCase(str.charAt(start)));
                sbuf.append(str.substring(start + 1, end).toLowerCase());
            }
            start = end;
        }
        return sbuf.toString();
    }

    public static String foldCase(CharSequence str) {
        int len = str.length();
        if (len == 0) {
            return "";
        }
        StringBuilder sbuf = null;
        int start = 0;
        int i = 0;
        while (true) {
            int ch = i == len ? -1 : str.charAt(i);
            boolean sigma = ch == 931 || ch == 963 || ch == 962;
            if (ch < 0 || ch == 304 || ch == 305 || sigma) {
                if (sbuf == null && ch >= 0) {
                    sbuf = new StringBuilder();
                }
                if (i > start) {
                    String converted = str.subSequence(start, i).toString().toUpperCase().toLowerCase();
                    if (sbuf == null) {
                        return converted;
                    }
                    sbuf.append(converted);
                }
                if (ch < 0) {
                    return sbuf.toString();
                }
                if (sigma) {
                    ch = 963;
                }
                sbuf.append((char) ch);
                start = i + 1;
            }
            i++;
        }
    }

    public static Symbol generalCategory(int ch) {
        switch (Character.getType(ch)) {
            case 1:
                return f68Lu;
            case 2:
                return f64Ll;
            case 3:
                return f67Lt;
            case 4:
                return f65Lm;
            case 5:
                return f66Lo;
            case 6:
                return f71Mn;
            case 7:
                return f70Me;
            case 8:
                return f69Mc;
            case 9:
                return f72Nd;
            case 10:
                return f73Nl;
            case 11:
                return f74No;
            case 12:
                return f88Zs;
            case 13:
                return f86Zl;
            case 14:
                return f87Zp;
            case 15:
                return f59Cc;
            case 16:
                return f60Cf;
            case 18:
                return f62Co;
            case 19:
                return f63Cs;
            case 20:
                return f76Pd;
            case 21:
                return f81Ps;
            case 22:
                return f77Pe;
            case 23:
                return f75Pc;
            case 24:
                return f80Po;
            case 25:
                return f84Sm;
            case 26:
                return f82Sc;
            case 27:
                return f83Sk;
            case 28:
                return f85So;
            case 29:
                return f79Pi;
            case 30:
                return f78Pf;
            default:
                return f61Cn;
        }
    }

    static {
        Namespace empty = Namespace.EmptyNamespace;
        f69Mc = empty.getSymbol("Mc");
        f75Pc = empty.getSymbol("Pc");
        f59Cc = empty.getSymbol("Cc");
        f82Sc = empty.getSymbol("Sc");
        f76Pd = empty.getSymbol("Pd");
        f72Nd = empty.getSymbol("Nd");
        f70Me = empty.getSymbol("Me");
        f77Pe = empty.getSymbol("Pe");
        f78Pf = empty.getSymbol("Pf");
        f60Cf = empty.getSymbol("Cf");
        f79Pi = empty.getSymbol("Pi");
        f73Nl = empty.getSymbol("Nl");
        f86Zl = empty.getSymbol("Zl");
        f64Ll = empty.getSymbol("Ll");
        f84Sm = empty.getSymbol("Sm");
        f65Lm = empty.getSymbol("Lm");
        f83Sk = empty.getSymbol("Sk");
        f71Mn = empty.getSymbol("Mn");
        f66Lo = empty.getSymbol("Lo");
        f74No = empty.getSymbol("No");
        f80Po = empty.getSymbol("Po");
        f85So = empty.getSymbol("So");
        f87Zp = empty.getSymbol("Zp");
        f62Co = empty.getSymbol("Co");
        f88Zs = empty.getSymbol("Zs");
        f81Ps = empty.getSymbol("Ps");
        f63Cs = empty.getSymbol("Cs");
        f67Lt = empty.getSymbol("Lt");
        f61Cn = empty.getSymbol("Cn");
        f68Lu = empty.getSymbol("Lu");
    }
}
