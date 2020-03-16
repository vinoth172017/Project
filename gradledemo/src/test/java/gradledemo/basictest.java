package gradledemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class basictest {
	@Test
	public void login() {
	System.setProperty("webdriver.chrome.driver", "C:\\selenium_packages\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	}
}
