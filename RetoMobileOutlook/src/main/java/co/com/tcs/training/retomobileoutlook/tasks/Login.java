package co.com.tcs.training.retomobileoutlook.tasks;

import co.com.tcs.training.retomobileoutlook.interfaces.OutlookMainComponent;
import co.com.tcs.training.retomobileoutlook.interfaces.OutlookPage;
import co.com.tcs.training.retomobileoutlook.models.Credentials;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Login implements Task {
    private Credentials objcredentials;

    public Login(Credentials objcredentials) {
        this.objcredentials = objcredentials;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(OutlookPage.BUTTON_INTRODUCTION),
                Enter.theValue(objcredentials.getEmail()).into(OutlookPage.EMAIL),
                Click.on(OutlookPage.BUTTON_SIGUIENT),
                Enter.theValue(objcredentials.getPassword()).into(OutlookPage.PASSWORD),
                Click.on(OutlookPage.BUTTON_LOGIN),
                Click.on(OutlookPage.BUTTON_SKIP),
                Click.on(OutlookPage.BUTTON_SKIP)
                );
    }
    public static Login toLogin(Credentials objcredentials){
        return new Login(objcredentials);
    }
}
