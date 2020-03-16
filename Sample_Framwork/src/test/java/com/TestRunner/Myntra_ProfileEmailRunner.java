package com.TestRunner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		format="com.cucumber.listener.ExtentCucumberFormatter:reports/Extentreports/report.html",
		features = "src/main/resources/feature/Testcase.feature",
				plugin = {"pretty", "html:reports/cucumber-html-report","json:reports/cucumber-html-report/jsonreport"},
		tags = {"@TC03_Mytra"},
		glue = {"com.Stepdefinition"},
		monochrome = true
		)

public class Myntra_ProfileEmailRunner {
	
	@AfterClass
    public static void setup() {
        Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Windows");
        Reporter.setTestRunnerOutput("Sample test runner output message");

}
}
