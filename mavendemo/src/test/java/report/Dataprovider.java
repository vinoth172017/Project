package report;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
	
public class Dataprovider()
{
	public void check()
	{
		@Test(dataProvider = "Testdata") 
		public void login(String username, String password) { 
			 driver.findElement(By.name("username")).sendKeys(username); 
			 driver.findElement(By.name("password")).sendKeys(password); 
		 driver.close(); 
		 } 
		public ChromeDriver driver; 
		@BeforeMethod 
		public void beforeMethod() { 
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
		 driver = new ChromeDriver(); 
		 driver.manage().window().maximize(); 
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("https://www.myntra.com/");
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


