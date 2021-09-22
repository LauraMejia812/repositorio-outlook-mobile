package co.com.tcs.training.retomobileoutlook.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(features = "src/test/resources/features/send_email.feature",
        snippets = SnippetType.CAMELCASE,
        glue = "co.com.tcs.training.retomobileoutlook.stepsdefinitions",
        tags = "@PageLoads")
public class SendEmailRunner {
}
