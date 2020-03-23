package com.ProductStore.StepDefinition;

import com.ProductStore.pagesobjects.DescriptionPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DescriptionStep {
	

	DescriptionPage description=new DescriptionPage();

	//To get description of the product
		
	@Given("^user launch chrome application$")
	public void user_launch_chrome_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		description.launchBrowser("chrome");
	}
	
		@When("^The User opens product Store homepage$")
		public void the_User_opens_product_Store_homepage() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			description.productStore();
		}

		@Then("^User gets the description of the specific product$")
		public void user_gets_the_description_of_the_specific_product() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			description.getDescription();
			description.exitBrowser();;
		}
}
