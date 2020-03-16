package com.automationtest.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features/Sample.feature"}, glue = {
        "com.automationtest.stepdefinitions"}, monochrome = true, plugin = {"pretty", "json:target/report.json", "html:target/report"})
public class TestRunner {
}
