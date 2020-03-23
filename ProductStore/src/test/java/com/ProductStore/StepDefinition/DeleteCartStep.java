package com.ProductStore.StepDefinition;

import com.ProductStore.pagesobjects.DeleteCartPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DeleteCartStep {
		//Delete from cart
		DeleteCartPage deletefromcart=new DeleteCartPage();
		//Delete from cart
		
		@Given("^the user launch the chrome application$")
		public void the_user_launch_the_chrome_application() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			deletefromcart.launchBrowser("chrome");
		}
		
		
		@When("^user opens Product store homepages$")
		public void user_opens_Product_store_homepages() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			deletefromcart.productStore();
		}

		@Then("^user clicks cart$")
		public void user_clicks_cart() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			deletefromcart.cart();
		}

		@Then("^delete the product in cart$")
		public void delete_the_product_in_cart() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			deletefromcart.delete();
			deletefromcart.exitBrowser();
		}

}
