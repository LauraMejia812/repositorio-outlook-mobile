package co.com.tcs.training.retomobileoutlook.tasks;

import co.com.tcs.training.retomobileoutlook.interactions.Swipe;
import co.com.tcs.training.retomobileoutlook.interactions.Wait;
import co.com.tcs.training.retomobileoutlook.interfaces.OutlookMainComponent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Logout implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Swipe.travel(85,178,85,178),
                Wait.just(10000),
                Swipe.travel(100,2108,100,2108),
                Click.on(OutlookMainComponent.ACOUNT),
                Swipe.travel(485,1095,488,718),
                Click.on(OutlookMainComponent.LOGOUT),
                Click.on(OutlookMainComponent.LOGOUT_CONFIRM));
    }
    public static Logout toLogout(){
        return new Logout();
    }
}
