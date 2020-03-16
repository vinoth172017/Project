package fileuploaddemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class webtable {
	@Test
	public void table()
	{

System.setProperty("webdriver.chrome.driver", "C:\\selenium_packages\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get("https://www.softwaretestingmaterial.com/automation-testing-vs-manual-testing/");
List  col = driver.findElements(By.xpath(".//*[@id=\"tablepress-31\"]/thead/tr/th"));
System.out.println("No of cols are : " +col.size()); 
//No.of rows 
List  rows = driver.findElements(By.xpath(".//*[@id=\"tablepress-31\"]/tbody/tr/td")); 
System.out.println("No of rows are : " + rows.size());

	
	}

}
