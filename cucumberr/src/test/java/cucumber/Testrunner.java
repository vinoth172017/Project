package cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class Testrunner {
/// I AM RUNNING WITH CUCUMBER CLASS
	@RunWith(Cucumber.class)
	@CucumberOptions(features="C:/Users/BLTuser.BLT037/eclipse-workspace/cucumberr/feature/testcase.feature", glue="stepdefinition")
	public class Testrunner_googlehomepage
	{
	}

	
}
