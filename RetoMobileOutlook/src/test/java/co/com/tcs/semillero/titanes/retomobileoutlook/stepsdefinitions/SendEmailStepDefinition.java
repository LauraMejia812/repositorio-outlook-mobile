package co.com.tcs.semillero.titanes.retomobileoutlook.stepsdefinitions;

import co.com.tcs.semillero.titanes.retomobileoutlook.utils.TheApp;
import cucumber.api.java.Before;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

public class SendEmailStepDefinition {

    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("User");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(TheApp.enElTelefono().getMyDriver()));
    }

}

