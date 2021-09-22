package co.com.tcs.training.retomobileoutlook.interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ItemSend {
    public static final Target VERIFY_EMAIL= Target.the("Verify email").locatedBy("(//*[contains(@text,'{0}')])[1]");
}
