package com.ProductStore.StepDefinition;

import org.junit.Assert;

import com.ProductStore.pagesobjects.CheckForPhoneNumberPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class CheckForPhoneNumberStep {
	//To check for valid phonenumber
		CheckForPhoneNumberPage phonenumber=new CheckForPhoneNumberPage();
		
		@Given("^the user launch chrome application$")
		public void user_launch_chrome_application() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			phonenumber.launchBrowser("chrome");
		}
		
		@When("^User opens product Store homepage$")
		public void user_opens_product_Store_homepage() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			phonenumber.productStore();
		}

		@Then("^User checks if the number is valid$")
		public void user_checks_if_the_number_is_valid() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			String ab=phonenumber.check();
			String phone_number="440 123456";
			Assert.assertEquals(phone_number,ab);
			System.out.println("Valid");
			Thread.sleep(3000);
			phonenumber.exitApplication();
		}

}
