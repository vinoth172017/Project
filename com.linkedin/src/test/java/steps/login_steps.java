package steps;

import com.main_java.login;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login_steps {
	login log = new login();
	
	@Given("^the user launched the chrome browser$")
	public void the_user_launched_the_chrome_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    log.url();
	}

	@When("^the user opens linkedin login page$")
	public void the_user_opens_linkedin_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		log.Linkedin_login();
		
	  
	}

	@Then("^the uset enter the username and password$")
	public void the_uset_enter_the_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 log.usernaame();
		
	}

	@Then("^click login the user should navigate to Linkedin home page$")
	public void click_login_the_user_should_navigate_to_Linkedin_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 log.submit();
		//throw new PendingException();
	   
	}

}
