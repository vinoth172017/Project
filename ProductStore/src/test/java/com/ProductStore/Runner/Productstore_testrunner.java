package com.ProductStore.Runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/features/Productstores.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@Tc01_DeleteCart,@Tc02_SelectLaptop,@Tc03_To_check_phone_number,@Tc04_To_get_description,@Tc05_To_add_two_product"},
		glue = {"com.ProductStore.StepDefinition"},
		monochrome = true
		)
public class Productstore_testrunner {

}
