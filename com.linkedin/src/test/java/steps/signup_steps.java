package steps;

import com.main_java.signup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class signup_steps {
		signup sign = new signup();
		
	@Given("^launch an chrome browser$")
	public void launch_an_chrome_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 sign.url();
		
	}

	@When("^the user opens linked sigup page$")
	public void the_user_opens_linked_sigup_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	sign.linkedin_signup();
		
	}

	@Then("^the user enter the email or phone number and password$")
	public void the_user_enter_the_email_or_phone_number_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 sign.signupp();
		
	}

	@Then("^click i agree & join$")
	public void click_i_agree_join() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 sign.agree();
	
	}

}
