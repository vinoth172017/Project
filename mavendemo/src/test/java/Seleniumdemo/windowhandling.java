package Seleniumdemo;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class windowhandling {
	@Test
	public void irtclogin()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_packages\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("CONTACT US")).click();
		Set<String>winHandles=driver.getWindowHandles();
		System.out.println("The number of window handles are "+winHandles.size());
		for(String winHandle:winHandles) 
		{
			driver.switchTo().window(winHandle);
		}
		String title=driver.getTitle();
		System.out.println("The page title is "+title);
		driver.quit();
	}
	}
