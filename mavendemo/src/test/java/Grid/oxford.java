package Grid;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class oxford {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_packages\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://academic.oup.com/");
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("header-account-info-user-fullname")).click();
		driver.findElement(By.id("user_LoginFormPopup")).sendKeys("mahalakshmi.c98@gmail.com");
		driver.findElement(By.id("pass_LoginFormPopup")).sendKeys("Maha@12345");
		driver.findElement(By.id("pass_LoginFormPopup")).sendKeys(Keys.TAB);
		driver.findElement(By.id("pass_LoginFormPopup")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		driver.findElement(By.id("header-account-info-user-fullname")).click();
	}

}
