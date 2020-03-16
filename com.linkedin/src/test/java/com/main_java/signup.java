package com.main_java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class signup {
WebDriver driver; 
WebElement cucumber;
	
	public void url() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_packages\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	}

	public void linkedin_signup()
	{
		driver.get("https://www.linkedin.com/signup/cold-join?trk=guest_homepage-basic_nav-header-join");
		System.out.println(driver.getTitle());

	}
	
	public void signupp()
	{
		driver.findElement(By.id("email-or-phone")).sendKeys("1234567890");
		driver.findElement(By.id("password")).sendKeys("123abc");
	}
	public void agree()
	{
		driver.findElement(By.xpath("//*[@id=\"join-form-submit\"]")).click();
		driver.close();
	}

}
