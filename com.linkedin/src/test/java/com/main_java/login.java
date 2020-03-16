package com.main_java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	WebDriver driver; 
	
	public void url() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_packages\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		

	}

	public void Linkedin_login()
	{
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		System.out.println(driver.getTitle());
	}
	
	public void usernaame()
	{
		driver.findElement(By.id("username")).sendKeys("Anbu");
		driver.findElement(By.id("password")).sendKeys("DD");
	}
	
	public void submit()
	{
		driver.findElement(By.xpath("//*[@id=\"app__container\"]/main/div/form/div[3]/button")).click();
		driver.close();
	}
}
