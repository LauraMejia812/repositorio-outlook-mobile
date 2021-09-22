package co.com.tcs.training.retomobileoutlook.interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class OutlookPage {
    public static final Target TEXT_OUTLOOK= Target.the("Capture text Outlook").locatedBy("//*[@class='android.widget.TextView' and @instance='0']");
    public static final Target BUTTON_INTRODUCTION= Target.the("Select button introduction").locatedBy("//*[@class='android.widget.Button' and @instance='0']");
    public static final Target EMAIL= Target.the("input email").locatedBy("//*[@class='android.widget.EditText' and @instance='0']");
    public static final Target BUTTON_SIGUIENT= Target.the("Select button 'continuar'").locatedBy("//*[@class='android.widget.Button' and @instance='5']");
    public static final Target PASSWORD= Target.the("input password").locatedBy("//*[@class='android.widget.EditText' and @instance='0']");
    public static final Target BUTTON_LOGIN= Target.the("Select button login").locatedBy("//*[@class='android.widget.Button' and @instance='0']");
    public static final Target BUTTON_SKIP= Target.the("Select button 'omitir'").locatedBy("//*[@class='android.widget.Button' and @instance='0']");
    public static final Target BUTTON_NEW= Target.the("Select button 'nuevo correo'").locatedBy("//*[@class='android.widget.ImageButton' and @instance='1']");
}
