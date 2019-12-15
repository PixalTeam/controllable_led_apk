package appinventor.ai_gumbraise.Evaluation;

import android.os.Bundle;
import android.support.p000v4.app.FragmentTransaction;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.AppInventorCompatActivity;
import com.google.appinventor.components.runtime.BluetoothClient;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.HorizontalScrollArrangement;
import com.google.appinventor.components.runtime.Image;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.ListPicker;
import com.google.appinventor.components.runtime.Notifier;
import com.google.appinventor.components.runtime.Slider;
import com.google.appinventor.components.runtime.TextBox;
import com.google.appinventor.components.runtime.errors.PermissionException;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.RetValManager;
import com.google.appinventor.components.runtime.util.RuntimeErrorAlert;
import com.google.youngandroid.C0593runtime;
import gnu.expr.Language;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleInfo;
import gnu.expr.ModuleMethod;
import gnu.kawa.functions.Apply;
import gnu.kawa.functions.Format;
import gnu.kawa.functions.GetNamedPart;
import gnu.kawa.functions.IsEqual;
import gnu.kawa.reflect.Invoke;
import gnu.kawa.reflect.SlotGet;
import gnu.kawa.reflect.SlotSet;
import gnu.lists.Consumer;
import gnu.lists.FString;
import gnu.lists.LList;
import gnu.lists.Pair;
import gnu.lists.PairWithPosition;
import gnu.lists.VoidConsumer;
import gnu.mapping.CallContext;
import gnu.mapping.Environment;
import gnu.mapping.SimpleSymbol;
import gnu.mapping.Symbol;
import gnu.mapping.Values;
import gnu.mapping.WrongType;
import gnu.math.IntNum;
import kawa.lang.Promise;
import kawa.lib.C0605lists;
import kawa.lib.misc;
import kawa.lib.strings;
import kawa.standard.Scheme;
import kawa.standard.require;

/* compiled from: Screen1.yail */
public class Screen1 extends Form implements Runnable {
    static final SimpleSymbol Lit0 = ((SimpleSymbol) new SimpleSymbol("Screen1").readResolve());
    static final SimpleSymbol Lit1 = ((SimpleSymbol) new SimpleSymbol("getMessage").readResolve());
    static final SimpleSymbol Lit10 = ((SimpleSymbol) new SimpleSymbol("TitleVisible").readResolve());
    static final SimpleSymbol Lit100 = ((SimpleSymbol) new SimpleSymbol("MinValue").readResolve());
    static final SimpleSymbol Lit101 = ((SimpleSymbol) new SimpleSymbol("ThumbPosition").readResolve());
    static final FString Lit102 = new FString("com.google.appinventor.components.runtime.Slider");
    static final SimpleSymbol Lit103 = ((SimpleSymbol) new SimpleSymbol("SendText").readResolve());
    static final SimpleSymbol Lit104 = ((SimpleSymbol) new SimpleSymbol("$thumbPosition").readResolve());
    static final PairWithPosition Lit105 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1576446340980_0.7002514431625473-0/youngandroidproject/../src/appinventor/ai_gumbraise/Evaluation/Screen1.yail", 761965);
    static final SimpleSymbol Lit106 = ((SimpleSymbol) new SimpleSymbol("SliderGreen$PositionChanged").readResolve());
    static final SimpleSymbol Lit107 = ((SimpleSymbol) new SimpleSymbol("PositionChanged").readResolve());
    static final FString Lit108 = new FString("com.google.appinventor.components.runtime.Slider");
    static final SimpleSymbol Lit109 = ((SimpleSymbol) new SimpleSymbol("SliderYellow").readResolve());
    static final SimpleSymbol Lit11 = ((SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve());
    static final IntNum Lit110;
    static final FString Lit111 = new FString("com.google.appinventor.components.runtime.Slider");
    static final PairWithPosition Lit112 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit4, LList.Empty, "/tmp/1576446340980_0.7002514431625473-0/youngandroidproject/../src/appinventor/ai_gumbraise/Evaluation/Screen1.yail", 831665), "/tmp/1576446340980_0.7002514431625473-0/youngandroidproject/../src/appinventor/ai_gumbraise/Evaluation/Screen1.yail", 831659);
    static final PairWithPosition Lit113 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1576446340980_0.7002514431625473-0/youngandroidproject/../src/appinventor/ai_gumbraise/Evaluation/Screen1.yail", 831682);
    static final SimpleSymbol Lit114 = ((SimpleSymbol) new SimpleSymbol("SliderYellow$PositionChanged").readResolve());
    static final FString Lit115 = new FString("com.google.appinventor.components.runtime.Slider");
    static final SimpleSymbol Lit116 = ((SimpleSymbol) new SimpleSymbol("SliderRed").readResolve());
    static final IntNum Lit117;
    static final FString Lit118 = new FString("com.google.appinventor.components.runtime.Slider");
    static final PairWithPosition Lit119 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit4, LList.Empty, "/tmp/1576446340980_0.7002514431625473-0/youngandroidproject/../src/appinventor/ai_gumbraise/Evaluation/Screen1.yail", 901297), "/tmp/1576446340980_0.7002514431625473-0/youngandroidproject/../src/appinventor/ai_gumbraise/Evaluation/Screen1.yail", 901291);
    static final FString Lit12 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final PairWithPosition Lit120 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1576446340980_0.7002514431625473-0/youngandroidproject/../src/appinventor/ai_gumbraise/Evaluation/Screen1.yail", 901314);
    static final SimpleSymbol Lit121 = ((SimpleSymbol) new SimpleSymbol("SliderRed$PositionChanged").readResolve());
    static final FString Lit122 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit123 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement7").readResolve());
    static final IntNum Lit124 = IntNum.make(16777215);
    static final FString Lit125 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit126 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final SimpleSymbol Lit127 = ((SimpleSymbol) new SimpleSymbol("GreenBox").readResolve());
    static final IntNum Lit128 = IntNum.make(16777215);
    static final SimpleSymbol Lit129 = ((SimpleSymbol) new SimpleSymbol("Hint").readResolve());
    static final SimpleSymbol Lit13 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement1").readResolve());
    static final IntNum Lit130;
    static final FString Lit131 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final FString Lit132 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final SimpleSymbol Lit133 = ((SimpleSymbol) new SimpleSymbol("YellowBox").readResolve());
    static final IntNum Lit134 = IntNum.make(16777215);
    static final IntNum Lit135;
    static final FString Lit136 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final FString Lit137 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final SimpleSymbol Lit138 = ((SimpleSymbol) new SimpleSymbol("RedBox").readResolve());
    static final IntNum Lit139 = IntNum.make(16777215);
    static final SimpleSymbol Lit14 = ((SimpleSymbol) new SimpleSymbol("AlignHorizontal").readResolve());
    static final IntNum Lit140;
    static final FString Lit141 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final FString Lit142 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit143 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement8").readResolve());
    static final FString Lit144 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit145 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit146 = ((SimpleSymbol) new SimpleSymbol("Button1").readResolve());
    static final IntNum Lit147;
    static final IntNum Lit148 = IntNum.make(32);
    static final IntNum Lit149 = IntNum.make(100);
    static final IntNum Lit15 = IntNum.make(2);
    static final IntNum Lit150;
    static final FString Lit151 = new FString("com.google.appinventor.components.runtime.Button");
    static final PairWithPosition Lit152;
    static final SimpleSymbol Lit153 = ((SimpleSymbol) new SimpleSymbol("Button1$Click").readResolve());
    static final SimpleSymbol Lit154 = ((SimpleSymbol) new SimpleSymbol("Click").readResolve());
    static final FString Lit155 = new FString("com.google.appinventor.components.runtime.BluetoothClient");
    static final FString Lit156 = new FString("com.google.appinventor.components.runtime.BluetoothClient");
    static final FString Lit157 = new FString("com.google.appinventor.components.runtime.Notifier");
    static final FString Lit158 = new FString("com.google.appinventor.components.runtime.Notifier");
    static final SimpleSymbol Lit159 = ((SimpleSymbol) new SimpleSymbol("get-simple-name").readResolve());
    static final SimpleSymbol Lit16 = ((SimpleSymbol) new SimpleSymbol("AlignVertical").readResolve());
    static final SimpleSymbol Lit160 = ((SimpleSymbol) new SimpleSymbol("android-log-form").readResolve());
    static final SimpleSymbol Lit161 = ((SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve());
    static final SimpleSymbol Lit162 = ((SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve());
    static final SimpleSymbol Lit163 = ((SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve());
    static final SimpleSymbol Lit164 = ((SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve());
    static final SimpleSymbol Lit165 = ((SimpleSymbol) new SimpleSymbol("add-to-events").readResolve());
    static final SimpleSymbol Lit166 = ((SimpleSymbol) new SimpleSymbol("add-to-components").readResolve());
    static final SimpleSymbol Lit167 = ((SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve());
    static final SimpleSymbol Lit168 = ((SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve());
    static final SimpleSymbol Lit169 = ((SimpleSymbol) new SimpleSymbol("send-error").readResolve());
    static final IntNum Lit17 = IntNum.make(3);
    static final SimpleSymbol Lit170 = ((SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve());
    static final SimpleSymbol Lit171 = ((SimpleSymbol) new SimpleSymbol("dispatchGenericEvent").readResolve());
    static final SimpleSymbol Lit172 = ((SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve());
    static final IntNum Lit18 = IntNum.make(16777215);
    static final SimpleSymbol Lit19 = ((SimpleSymbol) new SimpleSymbol("Width").readResolve());
    static final SimpleSymbol Lit2 = ((SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve());
    static final IntNum Lit20 = IntNum.make(-2);
    static final FString Lit21 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit22 = new FString("com.google.appinventor.components.runtime.Image");
    static final SimpleSymbol Lit23 = ((SimpleSymbol) new SimpleSymbol("Logo").readResolve());
    static final SimpleSymbol Lit24 = ((SimpleSymbol) new SimpleSymbol("Height").readResolve());
    static final IntNum Lit25 = IntNum.make(75);
    static final SimpleSymbol Lit26 = ((SimpleSymbol) new SimpleSymbol("Picture").readResolve());
    static final SimpleSymbol Lit27 = ((SimpleSymbol) new SimpleSymbol("RotationAngle").readResolve());
    static final IntNum Lit28 = IntNum.make(0);
    static final FString Lit29 = new FString("com.google.appinventor.components.runtime.Image");
    static final SimpleSymbol Lit3 = ((SimpleSymbol) new SimpleSymbol("AppName").readResolve());
    static final FString Lit30 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit31 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement5").readResolve());
    static final IntNum Lit32;
    static final FString Lit33 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit34 = new FString("com.google.appinventor.components.runtime.ListPicker");
    static final SimpleSymbol Lit35 = ((SimpleSymbol) new SimpleSymbol("Connexion").readResolve());
    static final IntNum Lit36;
    static final SimpleSymbol Lit37 = ((SimpleSymbol) new SimpleSymbol("FontSize").readResolve());
    static final IntNum Lit38 = IntNum.make(25);
    static final SimpleSymbol Lit39 = ((SimpleSymbol) new SimpleSymbol("ItemBackgroundColor").readResolve());
    static final SimpleSymbol Lit4;
    static final IntNum Lit40 = IntNum.make(16777215);
    static final SimpleSymbol Lit41 = ((SimpleSymbol) new SimpleSymbol("ItemTextColor").readResolve());
    static final IntNum Lit42 = IntNum.make(16777215);
    static final SimpleSymbol Lit43 = ((SimpleSymbol) new SimpleSymbol("Text").readResolve());
    static final SimpleSymbol Lit44 = ((SimpleSymbol) new SimpleSymbol("TextColor").readResolve());
    static final IntNum Lit45;
    static final FString Lit46 = new FString("com.google.appinventor.components.runtime.ListPicker");
    static final SimpleSymbol Lit47 = ((SimpleSymbol) new SimpleSymbol("Elements").readResolve());
    static final SimpleSymbol Lit48 = ((SimpleSymbol) new SimpleSymbol("BluetoothClient1").readResolve());
    static final SimpleSymbol Lit49 = ((SimpleSymbol) new SimpleSymbol("AddressesAndNames").readResolve());
    static final SimpleSymbol Lit5 = ((SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve());
    static final SimpleSymbol Lit50 = ((SimpleSymbol) new SimpleSymbol("list").readResolve());
    static final SimpleSymbol Lit51 = ((SimpleSymbol) new SimpleSymbol("Connexion$BeforePicking").readResolve());
    static final SimpleSymbol Lit52 = ((SimpleSymbol) new SimpleSymbol("BeforePicking").readResolve());
    static final SimpleSymbol Lit53 = ((SimpleSymbol) new SimpleSymbol("Connect").readResolve());
    static final SimpleSymbol Lit54 = ((SimpleSymbol) new SimpleSymbol("Selection").readResolve());
    static final PairWithPosition Lit55 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1576446340980_0.7002514431625473-0/youngandroidproject/../src/appinventor/ai_gumbraise/Evaluation/Screen1.yail", 311414);
    static final SimpleSymbol Lit56 = ((SimpleSymbol) new SimpleSymbol("Notifier1").readResolve());
    static final SimpleSymbol Lit57 = ((SimpleSymbol) new SimpleSymbol("ShowAlert").readResolve());
    static final PairWithPosition Lit58 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1576446340980_0.7002514431625473-0/youngandroidproject/../src/appinventor/ai_gumbraise/Evaluation/Screen1.yail", 311514);
    static final SimpleSymbol Lit59 = ((SimpleSymbol) new SimpleSymbol("BluetoothName").readResolve());
    static final IntNum Lit6;
    static final PairWithPosition Lit60 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1576446340980_0.7002514431625473-0/youngandroidproject/../src/appinventor/ai_gumbraise/Evaluation/Screen1.yail", 311730);
    static final SimpleSymbol Lit61 = ((SimpleSymbol) new SimpleSymbol("Connexion$AfterPicking").readResolve());
    static final SimpleSymbol Lit62 = ((SimpleSymbol) new SimpleSymbol("AfterPicking").readResolve());
    static final FString Lit63 = new FString("com.google.appinventor.components.runtime.HorizontalScrollArrangement");
    static final SimpleSymbol Lit64 = ((SimpleSymbol) new SimpleSymbol("HorizontalScrollArrangement1").readResolve());
    static final IntNum Lit65 = IntNum.make(16777215);
    static final FString Lit66 = new FString("com.google.appinventor.components.runtime.HorizontalScrollArrangement");
    static final FString Lit67 = new FString("com.google.appinventor.components.runtime.Label");
    static final IntNum Lit68 = IntNum.make(20);
    static final SimpleSymbol Lit69 = ((SimpleSymbol) new SimpleSymbol("TextAlignment").readResolve());
    static final SimpleSymbol Lit7 = ((SimpleSymbol) new SimpleSymbol("number").readResolve());
    static final IntNum Lit70 = IntNum.make(1);
    static final IntNum Lit71;
    static final FString Lit72 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit73 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit74 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement6").readResolve());
    static final IntNum Lit75 = IntNum.make(16777215);
    static final FString Lit76 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit77 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit78 = ((SimpleSymbol) new SimpleSymbol("Green").readResolve());
    static final SimpleSymbol Lit79 = ((SimpleSymbol) new SimpleSymbol("FontBold").readResolve());
    static final SimpleSymbol Lit8 = ((SimpleSymbol) new SimpleSymbol("ScreenOrientation").readResolve());
    static final IntNum Lit80;
    static final FString Lit81 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit82 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit83 = ((SimpleSymbol) new SimpleSymbol("Yellow").readResolve());
    static final IntNum Lit84;
    static final FString Lit85 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit86 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit87 = ((SimpleSymbol) new SimpleSymbol("Red").readResolve());
    static final IntNum Lit88;
    static final FString Lit89 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit9 = ((SimpleSymbol) new SimpleSymbol("Title").readResolve());
    static final FString Lit90 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit91 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement3").readResolve());
    static final IntNum Lit92 = IntNum.make(16777215);
    static final FString Lit93 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit94 = new FString("com.google.appinventor.components.runtime.Slider");
    static final SimpleSymbol Lit95 = ((SimpleSymbol) new SimpleSymbol("SliderGreen").readResolve());
    static final SimpleSymbol Lit96 = ((SimpleSymbol) new SimpleSymbol("ColorLeft").readResolve());
    static final IntNum Lit97;
    static final SimpleSymbol Lit98 = ((SimpleSymbol) new SimpleSymbol("MaxValue").readResolve());
    static final IntNum Lit99 = IntNum.make(255);
    public static Screen1 Screen1;
    static final ModuleMethod lambda$Fn1 = null;
    static final ModuleMethod lambda$Fn10 = null;
    static final ModuleMethod lambda$Fn11 = null;
    static final ModuleMethod lambda$Fn12 = null;
    static final ModuleMethod lambda$Fn13 = null;
    static final ModuleMethod lambda$Fn14 = null;
    static final ModuleMethod lambda$Fn15 = null;
    static final ModuleMethod lambda$Fn16 = null;
    static final ModuleMethod lambda$Fn17 = null;
    static final ModuleMethod lambda$Fn18 = null;
    static final ModuleMethod lambda$Fn19 = null;
    static final ModuleMethod lambda$Fn2 = null;
    static final ModuleMethod lambda$Fn20 = null;
    static final ModuleMethod lambda$Fn21 = null;
    static final ModuleMethod lambda$Fn22 = null;
    static final ModuleMethod lambda$Fn23 = null;
    static final ModuleMethod lambda$Fn24 = null;
    static final ModuleMethod lambda$Fn25 = null;
    static final ModuleMethod lambda$Fn26 = null;
    static final ModuleMethod lambda$Fn27 = null;
    static final ModuleMethod lambda$Fn28 = null;
    static final ModuleMethod lambda$Fn29 = null;
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn30 = null;
    static final ModuleMethod lambda$Fn31 = null;
    static final ModuleMethod lambda$Fn32 = null;
    static final ModuleMethod lambda$Fn33 = null;
    static final ModuleMethod lambda$Fn34 = null;
    static final ModuleMethod lambda$Fn35 = null;
    static final ModuleMethod lambda$Fn36 = null;
    static final ModuleMethod lambda$Fn37 = null;
    static final ModuleMethod lambda$Fn38 = null;
    static final ModuleMethod lambda$Fn39 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn40 = null;
    static final ModuleMethod lambda$Fn41 = null;
    static final ModuleMethod lambda$Fn42 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public BluetoothClient BluetoothClient1;
    public Label BluetoothName;
    public Button Button1;
    public final ModuleMethod Button1$Click;
    public ListPicker Connexion;
    public final ModuleMethod Connexion$AfterPicking;
    public final ModuleMethod Connexion$BeforePicking;
    public Label Green;
    public TextBox GreenBox;
    public HorizontalArrangement HorizontalArrangement1;
    public HorizontalArrangement HorizontalArrangement3;
    public HorizontalArrangement HorizontalArrangement5;
    public HorizontalArrangement HorizontalArrangement6;
    public HorizontalArrangement HorizontalArrangement7;
    public HorizontalArrangement HorizontalArrangement8;
    public HorizontalScrollArrangement HorizontalScrollArrangement1;
    public Image Logo;
    public Notifier Notifier1;
    public Label Red;
    public TextBox RedBox;
    public Slider SliderGreen;
    public final ModuleMethod SliderGreen$PositionChanged;
    public Slider SliderRed;
    public final ModuleMethod SliderRed$PositionChanged;
    public Slider SliderYellow;
    public final ModuleMethod SliderYellow$PositionChanged;
    public Label Yellow;
    public TextBox YellowBox;
    public final ModuleMethod add$Mnto$Mncomponents;
    public final ModuleMethod add$Mnto$Mnevents;
    public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
    public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
    public final ModuleMethod android$Mnlog$Mnform;
    public LList components$Mnto$Mncreate;
    public final ModuleMethod dispatchEvent;
    public final ModuleMethod dispatchGenericEvent;
    public LList events$Mnto$Mnregister;
    public LList form$Mndo$Mnafter$Mncreation;
    public Environment form$Mnenvironment;
    public Symbol form$Mnname$Mnsymbol;
    public final ModuleMethod get$Mnsimple$Mnname;
    public Environment global$Mnvar$Mnenvironment;
    public LList global$Mnvars$Mnto$Mncreate;
    public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod lookup$Mnhandler;
    public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod onCreate;
    public final ModuleMethod process$Mnexception;
    public final ModuleMethod send$Mnerror;

    /* compiled from: Screen1.yail */
    public class frame extends ModuleBody {
        Screen1 $main = this;

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 1:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 1;
                    return 0;
                case 2:
                    if (!(obj instanceof Screen1)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 1;
                    return 0;
                case 3:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 1;
                    return 0;
                case 5:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 1;
                    return 0;
                case 7:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 1;
                    return 0;
                case 12:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 1;
                    return 0;
                case 13:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 1;
                    return 0;
                case 14:
                    if (!(obj instanceof Screen1)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 1;
                    return 0;
                case 47:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 1;
                    return 0;
                case 50:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 1;
                    return 0;
                case 53:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 1;
                    return 0;
                default:
                    return super.match1(moduleMethod, obj, callContext);
            }
        }

        public int match2(ModuleMethod moduleMethod, Object obj, Object obj2, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 4:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 2;
                    return 0;
                case 5:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 2;
                    return 0;
                case 8:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 2;
                    return 0;
                case 9:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 2;
                    return 0;
                case 11:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 2;
                    return 0;
                case 17:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 2;
                    return 0;
                default:
                    return super.match2(moduleMethod, obj, obj2, callContext);
            }
        }

        public int match4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 10:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 4;
                    return 0;
                case 15:
                    if (!(obj instanceof Screen1)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    if (!(obj2 instanceof Component)) {
                        return -786430;
                    }
                    callContext.value2 = obj2;
                    if (!(obj3 instanceof String)) {
                        return -786429;
                    }
                    callContext.value3 = obj3;
                    if (!(obj4 instanceof String)) {
                        return -786428;
                    }
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 4;
                    return 0;
                case 16:
                    if (!(obj instanceof Screen1)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    if (!(obj2 instanceof Component)) {
                        return -786430;
                    }
                    callContext.value2 = obj2;
                    if (!(obj3 instanceof String)) {
                        return -786429;
                    }
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 4;
                    return 0;
                default:
                    return super.match4(moduleMethod, obj, obj2, obj3, obj4, callContext);
            }
        }

        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            switch (moduleMethod.selector) {
                case 1:
                    return this.$main.getSimpleName(obj);
                case 2:
                    try {
                        this.$main.onCreate((Bundle) obj);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "onCreate", 1, obj);
                    }
                case 3:
                    this.$main.androidLogForm(obj);
                    return Values.empty;
                case 5:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj);
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "lookup-in-form-environment", 1, obj);
                    }
                case 7:
                    try {
                        return this.$main.isBoundInFormEnvironment((Symbol) obj) ? Boolean.TRUE : Boolean.FALSE;
                    } catch (ClassCastException e3) {
                        throw new WrongType(e3, "is-bound-in-form-environment", 1, obj);
                    }
                case 12:
                    this.$main.addToFormDoAfterCreation(obj);
                    return Values.empty;
                case 13:
                    this.$main.sendError(obj);
                    return Values.empty;
                case 14:
                    this.$main.processException(obj);
                    return Values.empty;
                case 47:
                    return this.$main.SliderGreen$PositionChanged(obj);
                case 50:
                    return this.$main.SliderYellow$PositionChanged(obj);
                case 53:
                    return this.$main.SliderRed$PositionChanged(obj);
                default:
                    return super.apply1(moduleMethod, obj);
            }
        }

        public Object apply4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4) {
            boolean z = true;
            switch (moduleMethod.selector) {
                case 10:
                    this.$main.addToComponents(obj, obj2, obj3, obj4);
                    return Values.empty;
                case 15:
                    try {
                        try {
                            try {
                                try {
                                    return this.$main.dispatchEvent((Component) obj, (String) obj2, (String) obj3, (Object[]) obj4) ? Boolean.TRUE : Boolean.FALSE;
                                } catch (ClassCastException e) {
                                    throw new WrongType(e, "dispatchEvent", 4, obj4);
                                }
                            } catch (ClassCastException e2) {
                                throw new WrongType(e2, "dispatchEvent", 3, obj3);
                            }
                        } catch (ClassCastException e3) {
                            throw new WrongType(e3, "dispatchEvent", 2, obj2);
                        }
                    } catch (ClassCastException e4) {
                        throw new WrongType(e4, "dispatchEvent", 1, obj);
                    }
                case 16:
                    Screen1 screen1 = this.$main;
                    try {
                        Component component = (Component) obj;
                        try {
                            String str = (String) obj2;
                            try {
                                if (obj3 == Boolean.FALSE) {
                                    z = false;
                                }
                                try {
                                    screen1.dispatchGenericEvent(component, str, z, (Object[]) obj4);
                                    return Values.empty;
                                } catch (ClassCastException e5) {
                                    throw new WrongType(e5, "dispatchGenericEvent", 4, obj4);
                                }
                            } catch (ClassCastException e6) {
                                throw new WrongType(e6, "dispatchGenericEvent", 3, obj3);
                            }
                        } catch (ClassCastException e7) {
                            throw new WrongType(e7, "dispatchGenericEvent", 2, obj2);
                        }
                    } catch (ClassCastException e8) {
                        throw new WrongType(e8, "dispatchGenericEvent", 1, obj);
                    }
                default:
                    return super.apply4(moduleMethod, obj, obj2, obj3, obj4);
            }
        }

        public Object apply2(ModuleMethod moduleMethod, Object obj, Object obj2) {
            switch (moduleMethod.selector) {
                case 4:
                    try {
                        this.$main.addToFormEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "add-to-form-environment", 1, obj);
                    }
                case 5:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj, obj2);
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "lookup-in-form-environment", 1, obj);
                    }
                case 8:
                    try {
                        this.$main.addToGlobalVarEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e3) {
                        throw new WrongType(e3, "add-to-global-var-environment", 1, obj);
                    }
                case 9:
                    this.$main.addToEvents(obj, obj2);
                    return Values.empty;
                case 11:
                    this.$main.addToGlobalVars(obj, obj2);
                    return Values.empty;
                case 17:
                    return this.$main.lookupHandler(obj, obj2);
                default:
                    return super.apply2(moduleMethod, obj, obj2);
            }
        }

        public Object apply0(ModuleMethod moduleMethod) {
            switch (moduleMethod.selector) {
                case 18:
                    return Screen1.lambda2();
                case 19:
                    this.$main.$define();
                    return Values.empty;
                case 20:
                    return Screen1.lambda3();
                case 21:
                    return Screen1.lambda4();
                case 22:
                    return Screen1.lambda5();
                case 23:
                    return Screen1.lambda6();
                case 24:
                    return Screen1.lambda7();
                case 25:
                    return Screen1.lambda8();
                case 26:
                    return Screen1.lambda9();
                case 27:
                    return Screen1.lambda10();
                case 28:
                    return Screen1.lambda11();
                case 29:
                    return this.$main.Connexion$BeforePicking();
                case 30:
                    return this.$main.Connexion$AfterPicking();
                case 31:
                    return Screen1.lambda12();
                case 32:
                    return Screen1.lambda13();
                case 33:
                    return Screen1.lambda14();
                case 34:
                    return Screen1.lambda15();
                case 35:
                    return Screen1.lambda16();
                case 36:
                    return Screen1.lambda17();
                case 37:
                    return Screen1.lambda18();
                case 38:
                    return Screen1.lambda19();
                case 39:
                    return Screen1.lambda20();
                case 40:
                    return Screen1.lambda21();
                case 41:
                    return Screen1.lambda22();
                case 42:
                    return Screen1.lambda23();
                case 43:
                    return Screen1.lambda24();
                case 44:
                    return Screen1.lambda25();
                case 45:
                    return Screen1.lambda26();
                case 46:
                    return Screen1.lambda27();
                case 48:
                    return Screen1.lambda28();
                case 49:
                    return Screen1.lambda29();
                case 51:
                    return Screen1.lambda30();
                case 52:
                    return Screen1.lambda31();
                case 54:
                    return Screen1.lambda32();
                case 55:
                    return Screen1.lambda33();
                case 56:
                    return Screen1.lambda34();
                case 57:
                    return Screen1.lambda35();
                case 58:
                    return Screen1.lambda36();
                case 59:
                    return Screen1.lambda37();
                case 60:
                    return Screen1.lambda38();
                case 61:
                    return Screen1.lambda39();
                case 62:
                    return Screen1.lambda40();
                case 63:
                    return Screen1.lambda41();
                case 64:
                    return Screen1.lambda42();
                case 65:
                    return Screen1.lambda43();
                case 66:
                    return this.$main.Button1$Click();
                default:
                    return super.apply0(moduleMethod);
            }
        }

        public int match0(ModuleMethod moduleMethod, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 18:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 19:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 20:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 21:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 22:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 23:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 24:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 25:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 26:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 27:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 28:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 29:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 30:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 31:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 32:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 33:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 34:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 35:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 36:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 37:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 38:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 39:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 40:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 41:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 42:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 43:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 44:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 45:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 46:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 48:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 49:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 51:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 52:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 54:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 55:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 56:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 57:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 58:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 59:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 60:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 61:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 62:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 63:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 64:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 65:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                case 66:
                    callContext.proc = moduleMethod;
                    callContext.f231pc = 0;
                    return 0;
                default:
                    return super.match0(moduleMethod, callContext);
            }
        }
    }

    static {
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit4 = simpleSymbol;
        Lit152 = PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1576446340980_0.7002514431625473-0/youngandroidproject/../src/appinventor/ai_gumbraise/Evaluation/Screen1.yail", 1261677);
        int[] iArr = new int[2];
        iArr[0] = -1;
        Lit150 = IntNum.make(iArr);
        int[] iArr2 = new int[2];
        iArr2[0] = -16777216;
        Lit147 = IntNum.make(iArr2);
        int[] iArr3 = new int[2];
        iArr3[0] = -1;
        Lit140 = IntNum.make(iArr3);
        int[] iArr4 = new int[2];
        iArr4[0] = -1;
        Lit135 = IntNum.make(iArr4);
        int[] iArr5 = new int[2];
        iArr5[0] = -1;
        Lit130 = IntNum.make(iArr5);
        int[] iArr6 = new int[2];
        iArr6[0] = -65536;
        Lit117 = IntNum.make(iArr6);
        int[] iArr7 = new int[2];
        iArr7[0] = -256;
        Lit110 = IntNum.make(iArr7);
        int[] iArr8 = new int[2];
        iArr8[0] = -16711936;
        Lit97 = IntNum.make(iArr8);
        int[] iArr9 = new int[2];
        iArr9[0] = -65536;
        Lit88 = IntNum.make(iArr9);
        int[] iArr10 = new int[2];
        iArr10[0] = -256;
        Lit84 = IntNum.make(iArr10);
        int[] iArr11 = new int[2];
        iArr11[0] = -16711936;
        Lit80 = IntNum.make(iArr11);
        int[] iArr12 = new int[2];
        iArr12[0] = -1;
        Lit71 = IntNum.make(iArr12);
        int[] iArr13 = new int[2];
        iArr13[0] = -1;
        Lit45 = IntNum.make(iArr13);
        int[] iArr14 = new int[2];
        iArr14[0] = -16119286;
        Lit36 = IntNum.make(iArr14);
        int[] iArr15 = new int[2];
        iArr15[0] = -16777216;
        Lit32 = IntNum.make(iArr15);
        int[] iArr16 = new int[2];
        iArr16[0] = -16777216;
        Lit6 = IntNum.make(iArr16);
    }

    public Screen1() {
        ModuleInfo.register(this);
        frame frame2 = new frame();
        this.get$Mnsimple$Mnname = new ModuleMethod(frame2, 1, Lit159, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.onCreate = new ModuleMethod(frame2, 2, "onCreate", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = new ModuleMethod(frame2, 3, Lit160, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(frame2, 4, Lit161, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 5, Lit162, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 7, Lit163, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(frame2, 8, Lit164, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(frame2, 9, Lit165, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(frame2, 10, Lit166, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(frame2, 11, Lit167, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(frame2, 12, Lit168, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = new ModuleMethod(frame2, 13, Lit169, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = new ModuleMethod(frame2, 14, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.dispatchEvent = new ModuleMethod(frame2, 15, Lit170, 16388);
        this.dispatchGenericEvent = new ModuleMethod(frame2, 16, Lit171, 16388);
        this.lookup$Mnhandler = new ModuleMethod(frame2, 17, Lit172, 8194);
        ModuleMethod moduleMethod = new ModuleMethod(frame2, 18, null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime5328723459319226085.scm:622");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(frame2, 19, "$define", 0);
        lambda$Fn2 = new ModuleMethod(frame2, 20, null, 0);
        lambda$Fn3 = new ModuleMethod(frame2, 21, null, 0);
        lambda$Fn4 = new ModuleMethod(frame2, 22, null, 0);
        lambda$Fn5 = new ModuleMethod(frame2, 23, null, 0);
        lambda$Fn6 = new ModuleMethod(frame2, 24, null, 0);
        lambda$Fn7 = new ModuleMethod(frame2, 25, null, 0);
        lambda$Fn8 = new ModuleMethod(frame2, 26, null, 0);
        lambda$Fn9 = new ModuleMethod(frame2, 27, null, 0);
        lambda$Fn10 = new ModuleMethod(frame2, 28, null, 0);
        this.Connexion$BeforePicking = new ModuleMethod(frame2, 29, Lit51, 0);
        this.Connexion$AfterPicking = new ModuleMethod(frame2, 30, Lit61, 0);
        lambda$Fn11 = new ModuleMethod(frame2, 31, null, 0);
        lambda$Fn12 = new ModuleMethod(frame2, 32, null, 0);
        lambda$Fn13 = new ModuleMethod(frame2, 33, null, 0);
        lambda$Fn14 = new ModuleMethod(frame2, 34, null, 0);
        lambda$Fn15 = new ModuleMethod(frame2, 35, null, 0);
        lambda$Fn16 = new ModuleMethod(frame2, 36, null, 0);
        lambda$Fn17 = new ModuleMethod(frame2, 37, null, 0);
        lambda$Fn18 = new ModuleMethod(frame2, 38, null, 0);
        lambda$Fn19 = new ModuleMethod(frame2, 39, null, 0);
        lambda$Fn20 = new ModuleMethod(frame2, 40, null, 0);
        lambda$Fn21 = new ModuleMethod(frame2, 41, null, 0);
        lambda$Fn22 = new ModuleMethod(frame2, 42, null, 0);
        lambda$Fn23 = new ModuleMethod(frame2, 43, null, 0);
        lambda$Fn24 = new ModuleMethod(frame2, 44, null, 0);
        lambda$Fn25 = new ModuleMethod(frame2, 45, null, 0);
        lambda$Fn26 = new ModuleMethod(frame2, 46, null, 0);
        this.SliderGreen$PositionChanged = new ModuleMethod(frame2, 47, Lit106, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        lambda$Fn27 = new ModuleMethod(frame2, 48, null, 0);
        lambda$Fn28 = new ModuleMethod(frame2, 49, null, 0);
        this.SliderYellow$PositionChanged = new ModuleMethod(frame2, 50, Lit114, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        lambda$Fn29 = new ModuleMethod(frame2, 51, null, 0);
        lambda$Fn30 = new ModuleMethod(frame2, 52, null, 0);
        this.SliderRed$PositionChanged = new ModuleMethod(frame2, 53, Lit121, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        lambda$Fn31 = new ModuleMethod(frame2, 54, null, 0);
        lambda$Fn32 = new ModuleMethod(frame2, 55, null, 0);
        lambda$Fn33 = new ModuleMethod(frame2, 56, null, 0);
        lambda$Fn34 = new ModuleMethod(frame2, 57, null, 0);
        lambda$Fn35 = new ModuleMethod(frame2, 58, null, 0);
        lambda$Fn36 = new ModuleMethod(frame2, 59, null, 0);
        lambda$Fn37 = new ModuleMethod(frame2, 60, null, 0);
        lambda$Fn38 = new ModuleMethod(frame2, 61, null, 0);
        lambda$Fn39 = new ModuleMethod(frame2, 62, null, 0);
        lambda$Fn40 = new ModuleMethod(frame2, 63, null, 0);
        lambda$Fn41 = new ModuleMethod(frame2, 64, null, 0);
        lambda$Fn42 = new ModuleMethod(frame2, 65, null, 0);
        this.Button1$Click = new ModuleMethod(frame2, 66, Lit153, 0);
    }

    public Object lookupInFormEnvironment(Symbol symbol) {
        return lookupInFormEnvironment(symbol, Boolean.FALSE);
    }

    public void run() {
        CallContext instance = CallContext.getInstance();
        Consumer consumer = instance.consumer;
        instance.consumer = VoidConsumer.instance;
        try {
            run(instance);
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        ModuleBody.runCleanup(instance, th, consumer);
    }

    public final void run(CallContext $ctx) {
        String obj;
        Consumer $result = $ctx.consumer;
        Object find = require.find("com.google.youngandroid.runtime");
        try {
            ((Runnable) find).run();
            this.$Stdebug$Mnform$St = Boolean.FALSE;
            this.form$Mnenvironment = Environment.make(misc.symbol$To$String(Lit0));
            FString stringAppend = strings.stringAppend(misc.symbol$To$String(Lit0), "-global-vars");
            if (stringAppend == null) {
                obj = null;
            } else {
                obj = stringAppend.toString();
            }
            this.global$Mnvar$Mnenvironment = Environment.make(obj);
            Screen1 = null;
            this.form$Mnname$Mnsymbol = Lit0;
            this.events$Mnto$Mnregister = LList.Empty;
            this.components$Mnto$Mncreate = LList.Empty;
            this.global$Mnvars$Mnto$Mncreate = LList.Empty;
            this.form$Mndo$Mnafter$Mncreation = LList.Empty;
            Object find2 = require.find("com.google.youngandroid.runtime");
            try {
                ((Runnable) find2).run();
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    C0593runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "Led Test Bright", Lit4);
                    C0593runtime.setAndCoerceProperty$Ex(Lit0, Lit5, Lit6, Lit7);
                    C0593runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "portrait", Lit4);
                    C0593runtime.setAndCoerceProperty$Ex(Lit0, Lit9, "Screen1", Lit4);
                    Values.writeValues(C0593runtime.setAndCoerceProperty$Ex(Lit0, Lit10, Boolean.FALSE, Lit11), $result);
                } else {
                    addToFormDoAfterCreation(new Promise(lambda$Fn2));
                }
                this.HorizontalArrangement1 = null;
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0593runtime.addComponentWithinRepl(Lit0, Lit12, Lit13, lambda$Fn3), $result);
                } else {
                    addToComponents(Lit0, Lit21, Lit13, lambda$Fn4);
                }
                this.Logo = null;
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0593runtime.addComponentWithinRepl(Lit13, Lit22, Lit23, lambda$Fn5), $result);
                } else {
                    addToComponents(Lit13, Lit29, Lit23, lambda$Fn6);
                }
                this.HorizontalArrangement5 = null;
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0593runtime.addComponentWithinRepl(Lit13, Lit30, Lit31, lambda$Fn7), $result);
                } else {
                    addToComponents(Lit13, Lit33, Lit31, lambda$Fn8);
                }
                this.Connexion = null;
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0593runtime.addComponentWithinRepl(Lit13, Lit34, Lit35, lambda$Fn9), $result);
                } else {
                    addToComponents(Lit13, Lit46, Lit35, lambda$Fn10);
                }
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    C0593runtime.addToCurrentFormEnvironment(Lit51, this.Connexion$BeforePicking);
                } else {
                    addToFormEnvironment(Lit51, this.Connexion$BeforePicking);
                }
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0593runtime.$Stthis$Mnform$St, "Connexion", "BeforePicking");
                } else {
                    addToEvents(Lit35, Lit52);
                }
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    C0593runtime.addToCurrentFormEnvironment(Lit61, this.Connexion$AfterPicking);
                } else {
                    addToFormEnvironment(Lit61, this.Connexion$AfterPicking);
                }
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0593runtime.$Stthis$Mnform$St, "Connexion", "AfterPicking");
                } else {
                    addToEvents(Lit35, Lit62);
                }
                this.HorizontalScrollArrangement1 = null;
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0593runtime.addComponentWithinRepl(Lit0, Lit63, Lit64, lambda$Fn11), $result);
                } else {
                    addToComponents(Lit0, Lit66, Lit64, lambda$Fn12);
                }
                this.BluetoothName = null;
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0593runtime.addComponentWithinRepl(Lit64, Lit67, Lit59, lambda$Fn13), $result);
                } else {
                    addToComponents(Lit64, Lit72, Lit59, lambda$Fn14);
                }
                this.HorizontalArrangement6 = null;
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0593runtime.addComponentWithinRepl(Lit0, Lit73, Lit74, lambda$Fn15), $result);
                } else {
                    addToComponents(Lit0, Lit76, Lit74, lambda$Fn16);
                }
                this.Green = null;
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0593runtime.addComponentWithinRepl(Lit74, Lit77, Lit78, lambda$Fn17), $result);
                } else {
                    addToComponents(Lit74, Lit81, Lit78, lambda$Fn18);
                }
                this.Yellow = null;
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0593runtime.addComponentWithinRepl(Lit74, Lit82, Lit83, lambda$Fn19), $result);
                } else {
                    addToComponents(Lit74, Lit85, Lit83, lambda$Fn20);
                }
                this.Red = null;
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0593runtime.addComponentWithinRepl(Lit74, Lit86, Lit87, lambda$Fn21), $result);
                } else {
                    addToComponents(Lit74, Lit89, Lit87, lambda$Fn22);
                }
                this.HorizontalArrangement3 = null;
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0593runtime.addComponentWithinRepl(Lit0, Lit90, Lit91, lambda$Fn23), $result);
                } else {
                    addToComponents(Lit0, Lit93, Lit91, lambda$Fn24);
                }
                this.SliderGreen = null;
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0593runtime.addComponentWithinRepl(Lit91, Lit94, Lit95, lambda$Fn25), $result);
                } else {
                    addToComponents(Lit91, Lit102, Lit95, lambda$Fn26);
                }
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    C0593runtime.addToCurrentFormEnvironment(Lit106, this.SliderGreen$PositionChanged);
                } else {
                    addToFormEnvironment(Lit106, this.SliderGreen$PositionChanged);
                }
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0593runtime.$Stthis$Mnform$St, "SliderGreen", "PositionChanged");
                } else {
                    addToEvents(Lit95, Lit107);
                }
                this.SliderYellow = null;
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0593runtime.addComponentWithinRepl(Lit91, Lit108, Lit109, lambda$Fn27), $result);
                } else {
                    addToComponents(Lit91, Lit111, Lit109, lambda$Fn28);
                }
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    C0593runtime.addToCurrentFormEnvironment(Lit114, this.SliderYellow$PositionChanged);
                } else {
                    addToFormEnvironment(Lit114, this.SliderYellow$PositionChanged);
                }
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0593runtime.$Stthis$Mnform$St, "SliderYellow", "PositionChanged");
                } else {
                    addToEvents(Lit109, Lit107);
                }
                this.SliderRed = null;
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0593runtime.addComponentWithinRepl(Lit91, Lit115, Lit116, lambda$Fn29), $result);
                } else {
                    addToComponents(Lit91, Lit118, Lit116, lambda$Fn30);
                }
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    C0593runtime.addToCurrentFormEnvironment(Lit121, this.SliderRed$PositionChanged);
                } else {
                    addToFormEnvironment(Lit121, this.SliderRed$PositionChanged);
                }
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0593runtime.$Stthis$Mnform$St, "SliderRed", "PositionChanged");
                } else {
                    addToEvents(Lit116, Lit107);
                }
                this.HorizontalArrangement7 = null;
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0593runtime.addComponentWithinRepl(Lit0, Lit122, Lit123, lambda$Fn31), $result);
                } else {
                    addToComponents(Lit0, Lit125, Lit123, lambda$Fn32);
                }
                this.GreenBox = null;
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0593runtime.addComponentWithinRepl(Lit123, Lit126, Lit127, lambda$Fn33), $result);
                } else {
                    addToComponents(Lit123, Lit131, Lit127, lambda$Fn34);
                }
                this.YellowBox = null;
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0593runtime.addComponentWithinRepl(Lit123, Lit132, Lit133, lambda$Fn35), $result);
                } else {
                    addToComponents(Lit123, Lit136, Lit133, lambda$Fn36);
                }
                this.RedBox = null;
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0593runtime.addComponentWithinRepl(Lit123, Lit137, Lit138, lambda$Fn37), $result);
                } else {
                    addToComponents(Lit123, Lit141, Lit138, lambda$Fn38);
                }
                this.HorizontalArrangement8 = null;
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0593runtime.addComponentWithinRepl(Lit0, Lit142, Lit143, lambda$Fn39), $result);
                } else {
                    addToComponents(Lit0, Lit144, Lit143, lambda$Fn40);
                }
                this.Button1 = null;
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0593runtime.addComponentWithinRepl(Lit143, Lit145, Lit146, lambda$Fn41), $result);
                } else {
                    addToComponents(Lit143, Lit151, Lit146, lambda$Fn42);
                }
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    C0593runtime.addToCurrentFormEnvironment(Lit153, this.Button1$Click);
                } else {
                    addToFormEnvironment(Lit153, this.Button1$Click);
                }
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0593runtime.$Stthis$Mnform$St, "Button1", "Click");
                } else {
                    addToEvents(Lit146, Lit154);
                }
                this.BluetoothClient1 = null;
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0593runtime.addComponentWithinRepl(Lit0, Lit155, Lit48, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit156, Lit48, Boolean.FALSE);
                }
                this.Notifier1 = null;
                if (C0593runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0593runtime.addComponentWithinRepl(Lit0, Lit157, Lit56, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit158, Lit56, Boolean.FALSE);
                }
                C0593runtime.initRuntime();
            } catch (ClassCastException e) {
                throw new WrongType(e, "java.lang.Runnable.run()", 1, find2);
            }
        } catch (ClassCastException e2) {
            throw new WrongType(e2, "java.lang.Runnable.run()", 1, find);
        }
    }

    static Object lambda3() {
        C0593runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "Led Test Bright", Lit4);
        C0593runtime.setAndCoerceProperty$Ex(Lit0, Lit5, Lit6, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "portrait", Lit4);
        C0593runtime.setAndCoerceProperty$Ex(Lit0, Lit9, "Screen1", Lit4);
        return C0593runtime.setAndCoerceProperty$Ex(Lit0, Lit10, Boolean.FALSE, Lit11);
    }

    static Object lambda4() {
        C0593runtime.setAndCoerceProperty$Ex(Lit13, Lit14, Lit15, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit13, Lit16, Lit17, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit13, Lit5, Lit18, Lit7);
        return C0593runtime.setAndCoerceProperty$Ex(Lit13, Lit19, Lit20, Lit7);
    }

    static Object lambda5() {
        C0593runtime.setAndCoerceProperty$Ex(Lit13, Lit14, Lit15, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit13, Lit16, Lit17, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit13, Lit5, Lit18, Lit7);
        return C0593runtime.setAndCoerceProperty$Ex(Lit13, Lit19, Lit20, Lit7);
    }

    static Object lambda6() {
        C0593runtime.setAndCoerceProperty$Ex(Lit23, Lit24, Lit25, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit23, Lit26, "56673328.png", Lit4);
        C0593runtime.setAndCoerceProperty$Ex(Lit23, Lit27, Lit28, Lit7);
        return C0593runtime.setAndCoerceProperty$Ex(Lit23, Lit19, Lit25, Lit7);
    }

    static Object lambda7() {
        C0593runtime.setAndCoerceProperty$Ex(Lit23, Lit24, Lit25, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit23, Lit26, "56673328.png", Lit4);
        C0593runtime.setAndCoerceProperty$Ex(Lit23, Lit27, Lit28, Lit7);
        return C0593runtime.setAndCoerceProperty$Ex(Lit23, Lit19, Lit25, Lit7);
    }

    static Object lambda8() {
        C0593runtime.setAndCoerceProperty$Ex(Lit31, Lit5, Lit32, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit31, Lit24, Lit20, Lit7);
        return C0593runtime.setAndCoerceProperty$Ex(Lit31, Lit19, Lit20, Lit7);
    }

    static Object lambda9() {
        C0593runtime.setAndCoerceProperty$Ex(Lit31, Lit5, Lit32, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit31, Lit24, Lit20, Lit7);
        return C0593runtime.setAndCoerceProperty$Ex(Lit31, Lit19, Lit20, Lit7);
    }

    static Object lambda10() {
        C0593runtime.setAndCoerceProperty$Ex(Lit35, Lit5, Lit36, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit35, Lit37, Lit38, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit35, Lit24, Lit20, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit35, Lit39, Lit40, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit35, Lit41, Lit42, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit35, Lit43, "Bluetooth", Lit4);
        return C0593runtime.setAndCoerceProperty$Ex(Lit35, Lit44, Lit45, Lit7);
    }

    static Object lambda11() {
        C0593runtime.setAndCoerceProperty$Ex(Lit35, Lit5, Lit36, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit35, Lit37, Lit38, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit35, Lit24, Lit20, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit35, Lit39, Lit40, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit35, Lit41, Lit42, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit35, Lit43, "Bluetooth", Lit4);
        return C0593runtime.setAndCoerceProperty$Ex(Lit35, Lit44, Lit45, Lit7);
    }

    public Object Connexion$BeforePicking() {
        C0593runtime.setThisForm();
        return C0593runtime.setAndCoerceProperty$Ex(Lit35, Lit47, C0593runtime.getProperty$1(Lit48, Lit49), Lit50);
    }

    public Object Connexion$AfterPicking() {
        C0593runtime.setThisForm();
        if (C0593runtime.callComponentMethod(Lit48, Lit53, LList.list1(C0593runtime.getProperty$1(Lit35, Lit54)), Lit55) == Boolean.FALSE) {
            return C0593runtime.callComponentMethod(Lit56, Lit57, LList.list1("Impossible d'établir la connexion"), Lit60);
        }
        C0593runtime.callComponentMethod(Lit56, Lit57, LList.list1("Connecté"), Lit58);
        return C0593runtime.setAndCoerceProperty$Ex(Lit59, Lit43, C0593runtime.getProperty$1(Lit35, Lit54), Lit4);
    }

    static Object lambda12() {
        C0593runtime.setAndCoerceProperty$Ex(Lit64, Lit16, Lit15, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit64, Lit5, Lit65, Lit7);
        return C0593runtime.setAndCoerceProperty$Ex(Lit64, Lit19, Lit20, Lit7);
    }

    static Object lambda13() {
        C0593runtime.setAndCoerceProperty$Ex(Lit64, Lit16, Lit15, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit64, Lit5, Lit65, Lit7);
        return C0593runtime.setAndCoerceProperty$Ex(Lit64, Lit19, Lit20, Lit7);
    }

    static Object lambda14() {
        C0593runtime.setAndCoerceProperty$Ex(Lit59, Lit37, Lit68, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit59, Lit69, Lit70, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit59, Lit44, Lit71, Lit7);
        return C0593runtime.setAndCoerceProperty$Ex(Lit59, Lit19, Lit20, Lit7);
    }

    static Object lambda15() {
        C0593runtime.setAndCoerceProperty$Ex(Lit59, Lit37, Lit68, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit59, Lit69, Lit70, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit59, Lit44, Lit71, Lit7);
        return C0593runtime.setAndCoerceProperty$Ex(Lit59, Lit19, Lit20, Lit7);
    }

    static Object lambda16() {
        C0593runtime.setAndCoerceProperty$Ex(Lit74, Lit5, Lit75, Lit7);
        return C0593runtime.setAndCoerceProperty$Ex(Lit74, Lit19, Lit20, Lit7);
    }

    static Object lambda17() {
        C0593runtime.setAndCoerceProperty$Ex(Lit74, Lit5, Lit75, Lit7);
        return C0593runtime.setAndCoerceProperty$Ex(Lit74, Lit19, Lit20, Lit7);
    }

    static Object lambda18() {
        C0593runtime.setAndCoerceProperty$Ex(Lit78, Lit79, Boolean.TRUE, Lit11);
        C0593runtime.setAndCoerceProperty$Ex(Lit78, Lit37, Lit68, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit78, Lit43, "Green", Lit4);
        C0593runtime.setAndCoerceProperty$Ex(Lit78, Lit69, Lit70, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit78, Lit44, Lit80, Lit7);
        return C0593runtime.setAndCoerceProperty$Ex(Lit78, Lit19, Lit20, Lit7);
    }

    static Object lambda19() {
        C0593runtime.setAndCoerceProperty$Ex(Lit78, Lit79, Boolean.TRUE, Lit11);
        C0593runtime.setAndCoerceProperty$Ex(Lit78, Lit37, Lit68, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit78, Lit43, "Green", Lit4);
        C0593runtime.setAndCoerceProperty$Ex(Lit78, Lit69, Lit70, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit78, Lit44, Lit80, Lit7);
        return C0593runtime.setAndCoerceProperty$Ex(Lit78, Lit19, Lit20, Lit7);
    }

    static Object lambda20() {
        C0593runtime.setAndCoerceProperty$Ex(Lit83, Lit79, Boolean.TRUE, Lit11);
        C0593runtime.setAndCoerceProperty$Ex(Lit83, Lit37, Lit68, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit83, Lit43, "Yellow", Lit4);
        C0593runtime.setAndCoerceProperty$Ex(Lit83, Lit69, Lit70, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit83, Lit44, Lit84, Lit7);
        return C0593runtime.setAndCoerceProperty$Ex(Lit83, Lit19, Lit20, Lit7);
    }

    static Object lambda21() {
        C0593runtime.setAndCoerceProperty$Ex(Lit83, Lit79, Boolean.TRUE, Lit11);
        C0593runtime.setAndCoerceProperty$Ex(Lit83, Lit37, Lit68, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit83, Lit43, "Yellow", Lit4);
        C0593runtime.setAndCoerceProperty$Ex(Lit83, Lit69, Lit70, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit83, Lit44, Lit84, Lit7);
        return C0593runtime.setAndCoerceProperty$Ex(Lit83, Lit19, Lit20, Lit7);
    }

    static Object lambda22() {
        C0593runtime.setAndCoerceProperty$Ex(Lit87, Lit79, Boolean.TRUE, Lit11);
        C0593runtime.setAndCoerceProperty$Ex(Lit87, Lit37, Lit68, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit87, Lit43, "Red", Lit4);
        C0593runtime.setAndCoerceProperty$Ex(Lit87, Lit69, Lit70, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit87, Lit44, Lit88, Lit7);
        return C0593runtime.setAndCoerceProperty$Ex(Lit87, Lit19, Lit20, Lit7);
    }

    static Object lambda23() {
        C0593runtime.setAndCoerceProperty$Ex(Lit87, Lit79, Boolean.TRUE, Lit11);
        C0593runtime.setAndCoerceProperty$Ex(Lit87, Lit37, Lit68, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit87, Lit43, "Red", Lit4);
        C0593runtime.setAndCoerceProperty$Ex(Lit87, Lit69, Lit70, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit87, Lit44, Lit88, Lit7);
        return C0593runtime.setAndCoerceProperty$Ex(Lit87, Lit19, Lit20, Lit7);
    }

    static Object lambda24() {
        C0593runtime.setAndCoerceProperty$Ex(Lit91, Lit5, Lit92, Lit7);
        return C0593runtime.setAndCoerceProperty$Ex(Lit91, Lit19, Lit20, Lit7);
    }

    static Object lambda25() {
        C0593runtime.setAndCoerceProperty$Ex(Lit91, Lit5, Lit92, Lit7);
        return C0593runtime.setAndCoerceProperty$Ex(Lit91, Lit19, Lit20, Lit7);
    }

    static Object lambda26() {
        C0593runtime.setAndCoerceProperty$Ex(Lit95, Lit96, Lit97, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit95, Lit98, Lit99, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit95, Lit100, Lit28, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit95, Lit101, Lit28, Lit7);
        return C0593runtime.setAndCoerceProperty$Ex(Lit95, Lit19, Lit20, Lit7);
    }

    static Object lambda27() {
        C0593runtime.setAndCoerceProperty$Ex(Lit95, Lit96, Lit97, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit95, Lit98, Lit99, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit95, Lit100, Lit28, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit95, Lit101, Lit28, Lit7);
        return C0593runtime.setAndCoerceProperty$Ex(Lit95, Lit19, Lit20, Lit7);
    }

    public Object SliderGreen$PositionChanged(Object $thumbPosition) {
        Object obj;
        Object $thumbPosition2 = C0593runtime.sanitizeComponentData($thumbPosition);
        C0593runtime.setThisForm();
        SimpleSymbol simpleSymbol = Lit48;
        SimpleSymbol simpleSymbol2 = Lit103;
        if ($thumbPosition2 instanceof Package) {
            obj = C0593runtime.signalRuntimeError(strings.stringAppend("The variable ", C0593runtime.getDisplayRepresentation(Lit104), " is not bound in the current context"), "Unbound Variable");
        } else {
            obj = $thumbPosition2;
        }
        C0593runtime.callComponentMethod(simpleSymbol, simpleSymbol2, LList.list1(obj), Lit105);
        SimpleSymbol simpleSymbol3 = Lit78;
        SimpleSymbol simpleSymbol4 = Lit43;
        if ($thumbPosition2 instanceof Package) {
            $thumbPosition2 = C0593runtime.signalRuntimeError(strings.stringAppend("The variable ", C0593runtime.getDisplayRepresentation(Lit104), " is not bound in the current context"), "Unbound Variable");
        }
        return C0593runtime.setAndCoerceProperty$Ex(simpleSymbol3, simpleSymbol4, $thumbPosition2, Lit4);
    }

    static Object lambda28() {
        C0593runtime.setAndCoerceProperty$Ex(Lit109, Lit96, Lit110, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit109, Lit98, Lit99, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit109, Lit100, Lit28, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit109, Lit101, Lit28, Lit7);
        return C0593runtime.setAndCoerceProperty$Ex(Lit109, Lit19, Lit20, Lit7);
    }

    static Object lambda29() {
        C0593runtime.setAndCoerceProperty$Ex(Lit109, Lit96, Lit110, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit109, Lit98, Lit99, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit109, Lit100, Lit28, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit109, Lit101, Lit28, Lit7);
        return C0593runtime.setAndCoerceProperty$Ex(Lit109, Lit19, Lit20, Lit7);
    }

    public Object SliderYellow$PositionChanged(Object $thumbPosition) {
        Object obj;
        Object $thumbPosition2 = C0593runtime.sanitizeComponentData($thumbPosition);
        C0593runtime.setThisForm();
        SimpleSymbol simpleSymbol = Lit48;
        SimpleSymbol simpleSymbol2 = Lit103;
        ModuleMethod moduleMethod = strings.string$Mnappend;
        String str = "/Y:";
        if ($thumbPosition2 instanceof Package) {
            obj = C0593runtime.signalRuntimeError(strings.stringAppend("The variable ", C0593runtime.getDisplayRepresentation(Lit104), " is not bound in the current context"), "Unbound Variable");
        } else {
            obj = $thumbPosition2;
        }
        C0593runtime.callComponentMethod(simpleSymbol, simpleSymbol2, LList.list1(C0593runtime.callYailPrimitive(moduleMethod, LList.list2(str, obj), Lit112, "join")), Lit113);
        SimpleSymbol simpleSymbol3 = Lit83;
        SimpleSymbol simpleSymbol4 = Lit43;
        if ($thumbPosition2 instanceof Package) {
            $thumbPosition2 = C0593runtime.signalRuntimeError(strings.stringAppend("The variable ", C0593runtime.getDisplayRepresentation(Lit104), " is not bound in the current context"), "Unbound Variable");
        }
        return C0593runtime.setAndCoerceProperty$Ex(simpleSymbol3, simpleSymbol4, $thumbPosition2, Lit4);
    }

    static Object lambda30() {
        C0593runtime.setAndCoerceProperty$Ex(Lit116, Lit96, Lit117, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit116, Lit98, Lit99, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit116, Lit100, Lit28, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit116, Lit101, Lit28, Lit7);
        return C0593runtime.setAndCoerceProperty$Ex(Lit116, Lit19, Lit20, Lit7);
    }

    static Object lambda31() {
        C0593runtime.setAndCoerceProperty$Ex(Lit116, Lit96, Lit117, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit116, Lit98, Lit99, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit116, Lit100, Lit28, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit116, Lit101, Lit28, Lit7);
        return C0593runtime.setAndCoerceProperty$Ex(Lit116, Lit19, Lit20, Lit7);
    }

    public Object SliderRed$PositionChanged(Object $thumbPosition) {
        Object obj;
        Object $thumbPosition2 = C0593runtime.sanitizeComponentData($thumbPosition);
        C0593runtime.setThisForm();
        SimpleSymbol simpleSymbol = Lit48;
        SimpleSymbol simpleSymbol2 = Lit103;
        ModuleMethod moduleMethod = strings.string$Mnappend;
        String str = "/R:";
        if ($thumbPosition2 instanceof Package) {
            obj = C0593runtime.signalRuntimeError(strings.stringAppend("The variable ", C0593runtime.getDisplayRepresentation(Lit104), " is not bound in the current context"), "Unbound Variable");
        } else {
            obj = $thumbPosition2;
        }
        C0593runtime.callComponentMethod(simpleSymbol, simpleSymbol2, LList.list1(C0593runtime.callYailPrimitive(moduleMethod, LList.list2(str, obj), Lit119, "join")), Lit120);
        SimpleSymbol simpleSymbol3 = Lit87;
        SimpleSymbol simpleSymbol4 = Lit43;
        if ($thumbPosition2 instanceof Package) {
            $thumbPosition2 = C0593runtime.signalRuntimeError(strings.stringAppend("The variable ", C0593runtime.getDisplayRepresentation(Lit104), " is not bound in the current context"), "Unbound Variable");
        }
        return C0593runtime.setAndCoerceProperty$Ex(simpleSymbol3, simpleSymbol4, $thumbPosition2, Lit4);
    }

    static Object lambda32() {
        C0593runtime.setAndCoerceProperty$Ex(Lit123, Lit14, Lit17, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit123, Lit5, Lit124, Lit7);
        return C0593runtime.setAndCoerceProperty$Ex(Lit123, Lit19, Lit20, Lit7);
    }

    static Object lambda33() {
        C0593runtime.setAndCoerceProperty$Ex(Lit123, Lit14, Lit17, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit123, Lit5, Lit124, Lit7);
        return C0593runtime.setAndCoerceProperty$Ex(Lit123, Lit19, Lit20, Lit7);
    }

    static Object lambda34() {
        C0593runtime.setAndCoerceProperty$Ex(Lit127, Lit5, Lit128, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit127, Lit79, Boolean.TRUE, Lit11);
        C0593runtime.setAndCoerceProperty$Ex(Lit127, Lit129, "Hint for TextBox1", Lit4);
        C0593runtime.setAndCoerceProperty$Ex(Lit127, Lit44, Lit130, Lit7);
        return C0593runtime.setAndCoerceProperty$Ex(Lit127, Lit19, Lit20, Lit7);
    }

    static Object lambda35() {
        C0593runtime.setAndCoerceProperty$Ex(Lit127, Lit5, Lit128, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit127, Lit79, Boolean.TRUE, Lit11);
        C0593runtime.setAndCoerceProperty$Ex(Lit127, Lit129, "Hint for TextBox1", Lit4);
        C0593runtime.setAndCoerceProperty$Ex(Lit127, Lit44, Lit130, Lit7);
        return C0593runtime.setAndCoerceProperty$Ex(Lit127, Lit19, Lit20, Lit7);
    }

    static Object lambda36() {
        C0593runtime.setAndCoerceProperty$Ex(Lit133, Lit5, Lit134, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit133, Lit79, Boolean.TRUE, Lit11);
        C0593runtime.setAndCoerceProperty$Ex(Lit133, Lit129, "Hint for TextBox3", Lit4);
        C0593runtime.setAndCoerceProperty$Ex(Lit133, Lit69, Lit70, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit133, Lit44, Lit135, Lit7);
        return C0593runtime.setAndCoerceProperty$Ex(Lit133, Lit19, Lit20, Lit7);
    }

    static Object lambda37() {
        C0593runtime.setAndCoerceProperty$Ex(Lit133, Lit5, Lit134, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit133, Lit79, Boolean.TRUE, Lit11);
        C0593runtime.setAndCoerceProperty$Ex(Lit133, Lit129, "Hint for TextBox3", Lit4);
        C0593runtime.setAndCoerceProperty$Ex(Lit133, Lit69, Lit70, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit133, Lit44, Lit135, Lit7);
        return C0593runtime.setAndCoerceProperty$Ex(Lit133, Lit19, Lit20, Lit7);
    }

    static Object lambda38() {
        C0593runtime.setAndCoerceProperty$Ex(Lit138, Lit5, Lit139, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit138, Lit79, Boolean.TRUE, Lit11);
        C0593runtime.setAndCoerceProperty$Ex(Lit138, Lit129, "Hint for TextBox2", Lit4);
        C0593runtime.setAndCoerceProperty$Ex(Lit138, Lit69, Lit70, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit138, Lit44, Lit140, Lit7);
        return C0593runtime.setAndCoerceProperty$Ex(Lit138, Lit19, Lit20, Lit7);
    }

    static Object lambda39() {
        C0593runtime.setAndCoerceProperty$Ex(Lit138, Lit5, Lit139, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit138, Lit79, Boolean.TRUE, Lit11);
        C0593runtime.setAndCoerceProperty$Ex(Lit138, Lit129, "Hint for TextBox2", Lit4);
        C0593runtime.setAndCoerceProperty$Ex(Lit138, Lit69, Lit70, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit138, Lit44, Lit140, Lit7);
        return C0593runtime.setAndCoerceProperty$Ex(Lit138, Lit19, Lit20, Lit7);
    }

    static Object lambda40() {
        return C0593runtime.setAndCoerceProperty$Ex(Lit143, Lit19, Lit20, Lit7);
    }

    static Object lambda41() {
        return C0593runtime.setAndCoerceProperty$Ex(Lit143, Lit19, Lit20, Lit7);
    }

    static Object lambda42() {
        C0593runtime.setAndCoerceProperty$Ex(Lit146, Lit5, Lit147, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit146, Lit79, Boolean.TRUE, Lit11);
        C0593runtime.setAndCoerceProperty$Ex(Lit146, Lit37, Lit148, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit146, Lit24, Lit149, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit146, Lit43, "Envoyer", Lit4);
        C0593runtime.setAndCoerceProperty$Ex(Lit146, Lit44, Lit150, Lit7);
        return C0593runtime.setAndCoerceProperty$Ex(Lit146, Lit19, Lit20, Lit7);
    }

    static Object lambda43() {
        C0593runtime.setAndCoerceProperty$Ex(Lit146, Lit5, Lit147, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit146, Lit79, Boolean.TRUE, Lit11);
        C0593runtime.setAndCoerceProperty$Ex(Lit146, Lit37, Lit148, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit146, Lit24, Lit149, Lit7);
        C0593runtime.setAndCoerceProperty$Ex(Lit146, Lit43, "Envoyer", Lit4);
        C0593runtime.setAndCoerceProperty$Ex(Lit146, Lit44, Lit150, Lit7);
        return C0593runtime.setAndCoerceProperty$Ex(Lit146, Lit19, Lit20, Lit7);
    }

    public Object Button1$Click() {
        C0593runtime.setThisForm();
        C0593runtime.callComponentMethod(Lit48, Lit103, LList.list1(C0593runtime.getProperty$1(Lit127, Lit43)), Lit152);
        return C0593runtime.setAndCoerceProperty$Ex(Lit95, Lit101, C0593runtime.getProperty$1(Lit127, Lit43), Lit7);
    }

    public String getSimpleName(Object object) {
        return object.getClass().getSimpleName();
    }

    public void onCreate(Bundle icicle) {
        AppInventorCompatActivity.setClassicModeFromYail(true);
        super.onCreate(icicle);
    }

    public void androidLogForm(Object message) {
    }

    public void addToFormEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.form$Mnenvironment, object));
        this.form$Mnenvironment.put(name, object);
    }

    public Object lookupInFormEnvironment(Symbol name, Object default$Mnvalue) {
        boolean x = ((this.form$Mnenvironment == null ? 1 : 0) + 1) & true;
        if (x) {
            if (!this.form$Mnenvironment.isBound(name)) {
                return default$Mnvalue;
            }
        } else if (!x) {
            return default$Mnvalue;
        }
        return this.form$Mnenvironment.get(name);
    }

    public boolean isBoundInFormEnvironment(Symbol name) {
        return this.form$Mnenvironment.isBound(name);
    }

    public void addToGlobalVarEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.global$Mnvar$Mnenvironment, object));
        this.global$Mnvar$Mnenvironment.put(name, object);
    }

    public void addToEvents(Object component$Mnname, Object event$Mnname) {
        this.events$Mnto$Mnregister = C0605lists.cons(C0605lists.cons(component$Mnname, event$Mnname), this.events$Mnto$Mnregister);
    }

    public void addToComponents(Object container$Mnname, Object component$Mntype, Object component$Mnname, Object init$Mnthunk) {
        this.components$Mnto$Mncreate = C0605lists.cons(LList.list4(container$Mnname, component$Mntype, component$Mnname, init$Mnthunk), this.components$Mnto$Mncreate);
    }

    public void addToGlobalVars(Object var, Object val$Mnthunk) {
        this.global$Mnvars$Mnto$Mncreate = C0605lists.cons(LList.list2(var, val$Mnthunk), this.global$Mnvars$Mnto$Mncreate);
    }

    public void addToFormDoAfterCreation(Object thunk) {
        this.form$Mndo$Mnafter$Mncreation = C0605lists.cons(thunk, this.form$Mndo$Mnafter$Mncreation);
    }

    public void sendError(Object error) {
        RetValManager.sendError(error == null ? null : error.toString());
    }

    public void processException(Object ex) {
        Object apply1 = Scheme.applyToArgs.apply1(GetNamedPart.getNamedPart.apply2(ex, Lit1));
        RuntimeErrorAlert.alert(this, apply1 == null ? null : apply1.toString(), ex instanceof YailRuntimeError ? ((YailRuntimeError) ex).getErrorType() : "Runtime Error", "End Application");
    }

    public boolean dispatchEvent(Component componentObject, String registeredComponentName, String eventName, Object[] args) {
        boolean x;
        SimpleSymbol registeredObject = misc.string$To$Symbol(registeredComponentName);
        if (!isBoundInFormEnvironment(registeredObject)) {
            EventDispatcher.unregisterEventForDelegation(this, registeredComponentName, eventName);
            return false;
        } else if (lookupInFormEnvironment(registeredObject) != componentObject) {
            return false;
        } else {
            try {
                Scheme.apply.apply2(lookupHandler(registeredComponentName, eventName), LList.makeList(args, 0));
                return true;
            } catch (PermissionException exception) {
                exception.printStackTrace();
                if (this == componentObject) {
                    x = true;
                } else {
                    x = false;
                }
                if (!x ? x : IsEqual.apply(eventName, "PermissionNeeded")) {
                    processException(exception);
                } else {
                    PermissionDenied(componentObject, eventName, exception.getPermissionNeeded());
                }
                return false;
            } catch (Throwable exception2) {
                androidLogForm(exception2.getMessage());
                exception2.printStackTrace();
                processException(exception2);
                return false;
            }
        }
    }

    public void dispatchGenericEvent(Component componentObject, String eventName, boolean notAlreadyHandled, Object[] args) {
        Boolean bool;
        boolean x = true;
        Object handler = lookupInFormEnvironment(misc.string$To$Symbol(strings.stringAppend("any$", getSimpleName(componentObject), "$", eventName)));
        if (handler != Boolean.FALSE) {
            try {
                Apply apply = Scheme.apply;
                if (notAlreadyHandled) {
                    bool = Boolean.TRUE;
                } else {
                    bool = Boolean.FALSE;
                }
                apply.apply2(handler, C0605lists.cons(componentObject, C0605lists.cons(bool, LList.makeList(args, 0))));
            } catch (PermissionException exception) {
                exception.printStackTrace();
                if (this != componentObject) {
                    x = false;
                }
                if (!x ? x : IsEqual.apply(eventName, "PermissionNeeded")) {
                    processException(exception);
                } else {
                    PermissionDenied(componentObject, eventName, exception.getPermissionNeeded());
                }
            } catch (Throwable exception2) {
                androidLogForm(exception2.getMessage());
                exception2.printStackTrace();
                processException(exception2);
            }
        }
    }

    public Object lookupHandler(Object componentName, Object eventName) {
        String str = null;
        String obj = componentName == null ? null : componentName.toString();
        if (eventName != null) {
            str = eventName.toString();
        }
        return lookupInFormEnvironment(misc.string$To$Symbol(EventDispatcher.makeFullEventName(obj, str)));
    }

    public void $define() {
        Object reverse;
        Object obj;
        Object reverse2;
        Object obj2;
        Object obj3;
        Object var;
        Object component$Mnname;
        Object obj4;
        Language.setDefaults(Scheme.getInstance());
        try {
            run();
        } catch (Exception exception) {
            androidLogForm(exception.getMessage());
            processException(exception);
        }
        Screen1 = this;
        addToFormEnvironment(Lit0, this);
        Object obj5 = this.events$Mnto$Mnregister;
        while (obj5 != LList.Empty) {
            try {
                Pair arg0 = (Pair) obj5;
                Object event$Mninfo = arg0.getCar();
                Object apply1 = C0605lists.car.apply1(event$Mninfo);
                String obj6 = apply1 == null ? null : apply1.toString();
                Object apply12 = C0605lists.cdr.apply1(event$Mninfo);
                EventDispatcher.registerEventForDelegation(this, obj6, apply12 == null ? null : apply12.toString());
                obj5 = arg0.getCdr();
            } catch (ClassCastException e) {
                WrongType wrongType = new WrongType(e, "arg0", -2, obj5);
                throw wrongType;
            }
        }
        try {
            LList components = C0605lists.reverse(this.components$Mnto$Mncreate);
            addToGlobalVars(Lit2, lambda$Fn1);
            reverse = C0605lists.reverse(this.form$Mndo$Mnafter$Mncreation);
            while (reverse != LList.Empty) {
                Pair arg02 = (Pair) reverse;
                misc.force(arg02.getCar());
                reverse = arg02.getCdr();
            }
            obj = components;
            while (obj != LList.Empty) {
                Pair arg03 = (Pair) obj;
                Object component$Mninfo = arg03.getCar();
                component$Mnname = C0605lists.caddr.apply1(component$Mninfo);
                C0605lists.cadddr.apply1(component$Mninfo);
                Object component$Mnobject = Invoke.make.apply2(C0605lists.cadr.apply1(component$Mninfo), lookupInFormEnvironment((Symbol) C0605lists.car.apply1(component$Mninfo)));
                SlotSet.set$Mnfield$Ex.apply3(this, component$Mnname, component$Mnobject);
                addToFormEnvironment((Symbol) component$Mnname, component$Mnobject);
                obj = arg03.getCdr();
            }
            reverse2 = C0605lists.reverse(this.global$Mnvars$Mnto$Mncreate);
            while (reverse2 != LList.Empty) {
                Pair arg04 = (Pair) reverse2;
                Object var$Mnval = arg04.getCar();
                var = C0605lists.car.apply1(var$Mnval);
                addToGlobalVarEnvironment((Symbol) var, Scheme.applyToArgs.apply1(C0605lists.cadr.apply1(var$Mnval)));
                reverse2 = arg04.getCdr();
            }
            Object obj7 = components;
            obj2 = obj7;
            while (obj2 != LList.Empty) {
                Pair arg05 = (Pair) obj2;
                Object component$Mninfo2 = arg05.getCar();
                C0605lists.caddr.apply1(component$Mninfo2);
                Object init$Mnthunk = C0605lists.cadddr.apply1(component$Mninfo2);
                if (init$Mnthunk != Boolean.FALSE) {
                    Scheme.applyToArgs.apply1(init$Mnthunk);
                }
                obj2 = arg05.getCdr();
            }
            obj3 = obj7;
            while (obj3 != LList.Empty) {
                Pair arg06 = (Pair) obj3;
                Object component$Mninfo3 = arg06.getCar();
                Object component$Mnname2 = C0605lists.caddr.apply1(component$Mninfo3);
                C0605lists.cadddr.apply1(component$Mninfo3);
                callInitialize(SlotGet.field.apply2(this, component$Mnname2));
                obj3 = arg06.getCdr();
            }
        } catch (ClassCastException e2) {
            WrongType wrongType2 = new WrongType(e2, "arg0", -2, obj3);
            throw wrongType2;
        } catch (ClassCastException e3) {
            WrongType wrongType3 = new WrongType(e3, "arg0", -2, obj2);
            throw wrongType3;
        } catch (ClassCastException e4) {
            WrongType wrongType4 = new WrongType(e4, "add-to-global-var-environment", 0, var);
            throw wrongType4;
        } catch (ClassCastException e5) {
            WrongType wrongType5 = new WrongType(e5, "arg0", -2, reverse2);
            throw wrongType5;
        } catch (ClassCastException e6) {
            WrongType wrongType6 = new WrongType(e6, "add-to-form-environment", 0, component$Mnname);
            throw wrongType6;
        } catch (ClassCastException e7) {
            WrongType wrongType7 = new WrongType(e7, "lookup-in-form-environment", 0, obj4);
            throw wrongType7;
        } catch (ClassCastException e8) {
            WrongType wrongType8 = new WrongType(e8, "arg0", -2, obj);
            throw wrongType8;
        } catch (ClassCastException e9) {
            WrongType wrongType9 = new WrongType(e9, "arg0", -2, reverse);
            throw wrongType9;
        } catch (YailRuntimeError exception2) {
            processException(exception2);
        }
    }

    public static SimpleSymbol lambda1symbolAppend$V(Object[] argsArray) {
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

    static Object lambda2() {
        return null;
    }
}
