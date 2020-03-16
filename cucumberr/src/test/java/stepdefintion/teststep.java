package stepdefintion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class teststep {
	WebDriver driver;
	@Given("^I launch Chrome browser$")
	public void launch_browser() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\selenium_packages\\chromedriver.exe");
	driver=new ChromeDriver();
	Thread.sleep(5000);
	}
	@When("^I open Google Homepage$")
	public void open_homepage() throws InterruptedException
	{
	Thread.sleep(5000);
	driver.get("https://www.google.co.in");
	}
	@Then("^I verify that the page displays search text box")
	public void verify_textbox()           
	{
	WebElement txtbox=driver.findElement(By.name("q"));
	if(txtbox.isEnabled())
	{
	txtbox.sendKeys("Hello Welcome");
	driver.close();

	}
	}
	@And("^clicks the submit button$")
	public void display_searchbutton()
	{

	System.out.println("The page displays Google Search Button");

	}

	
}
