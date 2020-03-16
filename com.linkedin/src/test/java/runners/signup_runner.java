package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/features/linkedin.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@tc02_linkedinsignuppage"},
		glue = {"steps"},
		monochrome = true
		)

public class signup_runner {

}
