package co.com.tcs.training.retomobileoutlook.tasks;
import co.com.tcs.training.retomobileoutlook.interactions.Swipe;
import co.com.tcs.training.retomobileoutlook.interactions.Wait;
import co.com.tcs.training.retomobileoutlook.interfaces.NewEmailSection;
import co.com.tcs.training.retomobileoutlook.interfaces.OutlookPage;
import co.com.tcs.training.retomobileoutlook.models.TextImage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SendImage implements Task {
    private TextImage objimage;

    public SendImage(TextImage objimage) {
        this.objimage = objimage;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(OutlookPage.BUTTON_NEW),
                Click.on(NewEmailSection.ATTACHED),
                Click.on(NewEmailSection.PHOTOS),
                Click.on(NewEmailSection.PHOTOS_SELECT),
                Click.on(NewEmailSection.SIZE_IMAGE),
                Enter.theValue(objimage.getEmailContact()).into(NewEmailSection.CONTACT),
                Click.on(NewEmailSection.CONTACT_CLICK),
                Enter.theValue(objimage.getAffair()).into(NewEmailSection.AFFAIR),
                Click.on(NewEmailSection.BUTTON_SEND),
                Wait.just(5000),
                Swipe.travel(85,178,85,178),
                Wait.just(5000),
                Swipe.travel(474,662,474,662));
    }

    public static SendImage toSendImage(TextImage objimage){
        return new SendImage(objimage);
    }
}
