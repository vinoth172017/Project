package Seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class keyboard {
	
	@Test
	public void key()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_packages\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.linkedin.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/nav/a[3]")).click();
		driver.findElement(By.id("username")).sendKeys("bro");
		Actions action= new Actions(driver);
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys("123");
		//action.sendKeys(Keys.ENTER).perform();
		action.sendKeys(Keys.RETURN).perform();
	}
	

}
