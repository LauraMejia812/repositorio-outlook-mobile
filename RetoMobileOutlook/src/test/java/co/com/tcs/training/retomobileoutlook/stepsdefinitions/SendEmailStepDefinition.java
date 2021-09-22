package co.com.tcs.training.retomobileoutlook.stepsdefinitions;

import co.com.tcs.training.retomobileoutlook.interfaces.ItemSend;
import co.com.tcs.training.retomobileoutlook.models.Credentials;
import co.com.tcs.training.retomobileoutlook.models.TextEmail;
import co.com.tcs.training.retomobileoutlook.models.TextImage;
import co.com.tcs.training.retomobileoutlook.questions.TextOutlook;
import co.com.tcs.training.retomobileoutlook.questions.VerifyEmail;
import co.com.tcs.training.retomobileoutlook.tasks.*;
import co.com.tcs.training.retomobileoutlook.utils.TheApp;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import java.util.List;

public class SendEmailStepDefinition {

    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("User");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(TheApp.enElTelefono().getMyDriver()));
    }

    @Given("^the user logs in$")
    public void theUserLogsIn(List<Credentials> objcredentials) {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.toLogin(objcredentials.get(0)));
    }

    @Then("^He looks at the message (.*)$")
    public void heLooksAtTheMessageBandejaDeEntrada(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TextOutlook.toTextOutlook(), Matchers.is(Matchers.equalTo(message))));
    }


    @When("^the user sends an email to a contact and log out$")
    public void theUserSendsAnEmailToAContactAndLogOut(List<TextEmail> objText) {
        OnStage.theActorInTheSpotlight().attemptsTo(SendEmail.toSendEmail(objText.get(0)));
    }
    @Then("^the user sees that the email was (.*)$")
    public void theUserSeesThatTheEmailWasPruebaOutlook(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyEmail.toVerifyEmail(ItemSend.VERIFY_EMAIL.of(message))));
    }


    @When("^the user sends an power document to a contact and log out$")
    public void theUserSendsAnExcelDocumentToAContactAndLogOut(List<TextEmail> objText) {
        OnStage.theActorInTheSpotlight().attemptsTo(SendPower.toSendPower());
        OnStage.theActorInTheSpotlight().attemptsTo(SendEmail.toSendEmail(objText.get(0)));
    }
    @Then("^it validate that the message (.*)$")
    public void itValidateThatTheMessagePowerpoint(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyEmail.toVerifyEmail(ItemSend.VERIFY_EMAIL.of(message))));
    }


    @When("^the user sends a image to a contact and log out$")
    public void theUserSendsAImageToAContactAndLogOut(List<TextImage> objimage) {
        OnStage.theActorInTheSpotlight().attemptsTo(SendImage.toSendImage(objimage.get(0)));
    }
    @Then("^the user look the email (.*)$")
    public void theUserLookTheEmailImage(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyEmail.toVerifyEmail(ItemSend.VERIFY_EMAIL.of(message))));
    }

    @When("^the user send a event to a contact and log out$")
    public void theUserSendAEventToAContactAndLogOut(List<TextEmail> objText) {
        OnStage.theActorInTheSpotlight().attemptsTo(SendEvent.toSendEvent(objText.get(0)));
    }
    @Then("^the user look was (.*)$")
    public void theUserLookWasEvent(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyEmail.toVerifyEmail(ItemSend.VERIFY_EMAIL.of(message))));
    }


    @When("^the user sends an email to two contact and log out$")
    public void theUserSendsAnEmailToTwoContactAndLogOut(List<TextEmail> objText) {
        OnStage.theActorInTheSpotlight().attemptsTo(SendPowerTwo.toSendPowerTwo(objText.get(0)));
    }
    @Then("^he user look email (.*)$")
    public void heUserLookEmailPruebaOutlook(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyEmail.toVerifyEmail(ItemSend.VERIFY_EMAIL.of(message))));
    }


    @When("^the user sends an powerpoint document to two contact and log out$")
    public void theUserSendsAnPowerpointDocumentToTwoContactAndLogOut(List<TextEmail> objText) {
        OnStage.theActorInTheSpotlight().attemptsTo(SendPowerTwo.toSendPowerTwo(objText.get(0)));
    }
    @Then("^the user validates the message (.*)$")
    public void theUserValidatesTheMessageDocumentopowerpoint(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyEmail.toVerifyEmail(ItemSend.VERIFY_EMAIL.of(message))));
    }


    @When("^the user sends an image to two contact and log out$")
    public void theUserSendsAnImageToTwoContactAndLogOut(List<TextImage> objimage) {
        OnStage.theActorInTheSpotlight().attemptsTo(SendImage.toSendImage(objimage.get(0)));
    }
    @Then("^he validates the message (.*)$")
    public void heValidatesTheMessageImage2(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyEmail.toVerifyEmail(ItemSend.VERIFY_EMAIL.of(message))));
    }


    @When("^the user send a event to two contact and log out$")
    public void theUserSendAEventToTwoContactAndLogOut(List<TextEmail> objText) {
        OnStage.theActorInTheSpotlight().attemptsTo(SendEvent.toSendEvent(objText.get(0)));
    }
    @Then("^the user validates the email was (.*)$")
    public void theUserValidatesTheEmailWasEvent2(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyEmail.toVerifyEmail(ItemSend.VERIFY_EMAIL.of(message))));
    }


    @When("^the user sends an email to three contact and log out$")
    public void theUserSendsAnEmailToThreeContactAndLogOut(List<TextEmail> objText) {
        OnStage.theActorInTheSpotlight().attemptsTo(SendPowerTwo.toSendPowerTwo(objText.get(0)));
    }
    @Then("^he validates the email was (.*)$")
    public void heValidatesTheEmailWasPruebaOutlook3(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyEmail.toVerifyEmail(ItemSend.VERIFY_EMAIL.of(message))));
    }


    @When("^the user sends an powerpoint document to three contact and log out$")
    public void theUserSendsAnPowerpointDocumentToThreeContactAndLogOut(List<TextEmail> objText) {
        OnStage.theActorInTheSpotlight().attemptsTo(SendPowerTwo.toSendPowerTwo(objText.get(0)));
    }
    @Then("^the user validates was (.*)$")
    public void theUserValidatesWasDocumentopowerpoint3(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyEmail.toVerifyEmail(ItemSend.VERIFY_EMAIL.of(message))));
    }


    @When("^the user sends an event to three contact and log out$")
    public void theUserSendsAnEventToThreeContactAndLogOut(List<TextEmail> objText) {
        OnStage.theActorInTheSpotlight().attemptsTo(SendEvent.toSendEvent(objText.get(0)));
    }
    @Then("^he validates was (.*)$")
    public void heValidatesWasEvento3(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyEmail.toVerifyEmail(ItemSend.VERIFY_EMAIL.of(message))));
    }


    @When("^the user sends an image to three contact and log out$")
    public void theUserSendsAnImageToThreeContactAndLogOut(List<TextImage> objimage) {
        OnStage.theActorInTheSpotlight().attemptsTo(SendImage.toSendImage(objimage.get(0)));
    }
    @Then("^it is validated that the email was sent (.*)$")
    public void itIsValidateThatTheEmailWasSentImage3(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyEmail.toVerifyEmail(ItemSend.VERIFY_EMAIL.of(message))));
    }

    @After
    public void SignOf(){
        OnStage.theActorInTheSpotlight().attemptsTo(Logout.toLogout());
    }
}
