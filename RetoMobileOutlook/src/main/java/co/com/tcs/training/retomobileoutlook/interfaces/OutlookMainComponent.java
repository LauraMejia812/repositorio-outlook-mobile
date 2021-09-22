package co.com.tcs.training.retomobileoutlook.interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class OutlookMainComponent {
    public static final Target ACOUNT= Target.the("Select acount").locatedBy("//*[@class='android.widget.LinearLayout' and @instance='7']");
    public static final Target LOGOUT= Target.the("LOGOUT").locatedBy("//*[@class='android.widget.LinearLayout' and @instance='30']");
    public static final Target LOGOUT_CONFIRM= Target.the(" Confirm LOGOUT").locatedBy("//*[@class='android.widget.Button' and @instance='1']");
    public static final Target SENDS= Target.the("Select option Sends").locatedBy("//*[@class='android.widget.TextView' and @instance='26']");
}
