package co.com.tcs.training.retomobileoutlook.questions;

import co.com.tcs.training.retomobileoutlook.interfaces.OutlookPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TextOutlook implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(OutlookPage.TEXT_OUTLOOK).viewedBy(actor).asString();
    }
    public static TextOutlook toTextOutlook(){
        return new TextOutlook();
    }
}
