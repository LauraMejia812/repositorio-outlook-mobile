package co.com.tcs.training.retomobileoutlook.tasks;

import co.com.tcs.training.retomobileoutlook.interactions.Swipe;
import co.com.tcs.training.retomobileoutlook.interactions.Wait;
import co.com.tcs.training.retomobileoutlook.interfaces.NewEmailSection;
import co.com.tcs.training.retomobileoutlook.interfaces.OutlookPage;
import co.com.tcs.training.retomobileoutlook.models.TextEmail;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SendPowerTwo implements Task {
   private TextEmail objText;

    public SendPowerTwo(TextEmail objText) {
        this.objText = objText;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(OutlookPage.BUTTON_NEW),
                Enter.theValue(objText.getEmailContact()).into(NewEmailSection.CONTACT),
                Click.on(NewEmailSection.CONTACT_CLICK),
                Enter.theValue(objText.getAffair()).into(NewEmailSection.AFFAIR),
                Enter.theValue(objText.getMessage()).into(NewEmailSection.MESSAGE),
                Click.on(NewEmailSection.ATTACHED),
                Click.on(NewEmailSection.SELECT_ATTACHED),
                Click.on(NewEmailSection.POWER_POINT),
                Click.on(NewEmailSection.ATTACHED_POWERPOINT),
                Click.on(NewEmailSection.BUTTON_SEND),
                Wait.just(5000),
                Swipe.travel(85,178,85,178),
                Wait.just(5000),
                Swipe.travel(474,662,474,662));
    }

    public static SendPowerTwo toSendPowerTwo(TextEmail objText){
        return new SendPowerTwo(objText);
    }
}
