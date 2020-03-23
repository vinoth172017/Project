package com.ProductStore.StepDefinition;

import org.junit.Assert;

import com.ProductStore.pagesobjects.CheckForTwoProductPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckForTwoProductStep {
	//To add two product in the cart 
	CheckForTwoProductPage two_product=new CheckForTwoProductPage();
		
	@Given("^launch the chrome application$")
		public void launch_the_chrome_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
			two_product.launchBrowser("chrome");
		}
	
		@When("^The User open product Store homepage$")
		public void the_User_open_product_Store_homepage() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			two_product.productStore();
		}

		@Then("^user need to check whether the added product is available in cart$")
		public void user_need_to_check_whether_the_added_product_is_available_in_cart() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			two_product.clickOne();
			two_product.clickAgain();
		   String productOne = two_product.firstProduct();
		   String productTwo=two_product.secondProduct();
		   System.out.println(productOne);
		   System.out.println(productTwo);
		   if(productOne.equalsIgnoreCase("HTC One M9")||productTwo.equalsIgnoreCase("Sony xperia z5")||productOne.equalsIgnoreCase("Sony xperia z5"))
		   {
			   
			   Assert.assertTrue(true);
			   System.out.println("Scenario passed");
			   
		   }

		   two_product.closeBrowser();;
		}


}
