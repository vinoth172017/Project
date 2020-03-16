package fileuploaddemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class fileupload {
	@Test
	public void upload() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_packages\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get("http://www.tinyupload.com/");
driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[1]/input[2]")).sendKeys("C:\\Users\\BLTuser.BLT037\\Desktop\\testq\\assesment question from batch 1.pdf");
driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[1]/textarea")).sendKeys("File_Uploadddddddd");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[1]/img")).click();

	}

}
