package co.com.tcs.training.retomobileoutlook.interactions;
import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class Wait implements Interaction {

    private int miliseg;

    public Wait(int miliseg) {
        this.miliseg = miliseg;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        new InternalSystemClock().pauseFor(miliseg);
    }

    public static Wait just(int miliseg){
        return new Wait(miliseg);
    }
}
