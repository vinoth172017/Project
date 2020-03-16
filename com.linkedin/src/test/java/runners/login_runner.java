package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/features/linkedin.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@tc01_Linkedinloginpage"},
		glue = {"steps"},
		monochrome = true
		)

public class login_runner {

}
