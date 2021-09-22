package co.com.tcs.training.retomobileoutlook.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.targets.Target;

public class VerifyEmail implements Question <Boolean> {

    private Target target;

    public VerifyEmail(Target target) {

        this.target = target;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(target).viewedBy(actor).asBoolean();

    }
    public static  VerifyEmail toVerifyEmail(Target target){

        return new VerifyEmail(target);
    }
}
