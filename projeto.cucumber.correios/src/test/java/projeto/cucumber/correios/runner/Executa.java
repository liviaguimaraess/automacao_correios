package projeto.cucumber.correios.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "src/test/resources", glue = "projeto.cucumber.correios.steps", monochrome = true, dryRun = false, snippets = SnippetType.CAMELCASE, tags = "@regressivos", plugin = {
				"pretty", "html:target/cucumber-reports.html" }

)

public class Executa {

}
