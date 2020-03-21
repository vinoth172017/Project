package com.taskmanagement.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/main/resources/feature/Taskmanagement.Feature",
plugin = {"pretty", "html:reports/cucumber-html-report","json:reports/cucumber-html-report/jsonreport"},
glue = {"com.taskmanagement.stepdefinition"},
monochrome = true
)
public class TaskMangementRunner {

	}

