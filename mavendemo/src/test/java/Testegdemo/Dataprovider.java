package Testegdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	@Test(dataProvider = "Testdata") 
	public void login(String username, String password) { 
	 driver.findElement(By.id("username")).sendKeys(username); 
	 driver.findElement(By.id("password")).sendKeys(password); 
	 driver.close(); 
	 } 
	public ChromeDriver driver; 
	@BeforeMethod 
	public void beforeMethod() { 
	System.setProperty("webdriver.chrome.driver", "C:\\selenium_packages\\chromedriver.exe");
	 driver = new ChromeDriver(); 
	 driver.manage().window().maximize(); 
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin"); 
	 } 
	@DataProvider (name= "Testdata") 
	public Object[][] getdata() { 
	 Object[][] data = new Object[3][2] ; 
	 data [0][0] = "Riyaz"; 
	 data [0][1] ="12345"; 
	 data [1][0] ="Sanjeev"; 
	 data [1][1] ="456789"; 
	 data [2][0] ="Sathya"; 
	 data [2][1] ="hero";  
	return data; 
	 } 
	}