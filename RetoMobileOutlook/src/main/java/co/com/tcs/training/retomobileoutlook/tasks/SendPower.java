package co.com.tcs.training.retomobileoutlook.tasks;

import co.com.tcs.training.retomobileoutlook.interfaces.NewEmailSection;
import co.com.tcs.training.retomobileoutlook.interfaces.OutlookPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SendPower implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(OutlookPage.BUTTON_NEW),
                Click.on(NewEmailSection.ATTACHED),
                Click.on(NewEmailSection.SELECT_ATTACHED),
                Click.on(NewEmailSection.POWER_POINT),
                Click.on(NewEmailSection.ATTACHED_POWERPOINT));
    }

    public static SendPower toSendPower(){
        return new SendPower();
    }
}
