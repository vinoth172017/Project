package com.ProductStore.StepDefinition;

import com.ProductStore.pagesobjects.SelectLaptopPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SelectLaptopStep {
	//To select a laptop
		SelectLaptopPage laptop=new SelectLaptopPage();
		//To select a laptop
		
		@Given("^user launch the chrome application$")
		public void user_launch_the_chrome_application() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			laptop.launchBrowser("chrome");
		}
		
		@When("^User opens Product store homepage$")
		public void user_opens_Product_store_homepage() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			laptop.productStore();
		}

		@Then("^User clicks laptop tab$")
		public void user_clicks_laptop_tab() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			laptop.laptop();
		}

		@Then("^User selects a laptop and gets price of specific laptop$")
		public void user_selects_a_laptop_and_gets_price_of_specific_laptop() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			Thread.sleep(3000);
			laptop.value();
			laptop.exit();
		}

		

}
