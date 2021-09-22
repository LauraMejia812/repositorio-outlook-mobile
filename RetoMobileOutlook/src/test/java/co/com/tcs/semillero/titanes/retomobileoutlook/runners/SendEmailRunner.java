package co.com.tcs.semillero.titanes.retomobileoutlook.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(features = "src\\test\\resources\\features\\Send_Message.feature",
        snippets= SnippetType.CAMELCASE,
        glue ="co.com.tcs.semillero.titanes.retomobileoutlook.stepsdefinitions",
        tags="")
public class SendEmailRunner {
}
