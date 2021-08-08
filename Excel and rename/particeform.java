package StepDefinition;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Excel.Excelutility;

public class particeform {
	public static void main(String []args) throws IOException {
	for(int a=0;a<9;a++) {
	try {
		List<Map<String,String>> testDataInMap=Excelutility.getTestDataInMap("sheet1");
		System.out.println(testDataInMap.get(a).get("Firstname"));
		System.out.println(testDataInMap.get(a).get("Email"));
		System.out.println(testDataInMap.get(a).get("Gender"));
		System.out.println(testDataInMap.get(a).get("Mobile"));
		System.out.println(testDataInMap.get(a).get("Subjects"));
		System.out.println(testDataInMap.get(a).get("Hobbies"));
		System.out.println(testDataInMap.get(a).get("Current addres"));
		System.out.println(testDataInMap.get(a).get("State"));
		System.out.println(testDataInMap.get(a).get("City"));
		
	}catch(FileNotFoundException e) {
		e.printStackTrace();
		
	}
	}
//	WebDriver driver;	
//	System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
//	
//	 driver= new ChromeDriver();
//     driver.manage().window().maximize();
//     driver.get("https://itera-qa.azurewebsites.net/home/automation");
//     driver.findElement(By.id("name")).sendKeys("jhfad");
//     driver.findElement(By.id("lastName")).sendKeys("fsf");
//     driver.findElement(By.id("userEmail")).sendKeys("sfs@mail.com");
//     driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
//     driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")).click();
//     driver.findElement(By.id("userNumber")).sendKeys("8978767656");
//     driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]")).sendKeys("jhgfhj");
//     driver.findElement(By.xpath("//*[@id=\"hobbies-checkbox-1\"]")).click();
//     driver.findElement(By.id("currentAddress")).sendKeys("fsfsf");
//     driver.findElement(By.id("currentAddress")).sendKeys(Keys.TAB);
//     driver.findElement(By.id("currentAddress")).sendKeys("NCR");
//     driver.findElement(By.xpath("//*[@id=\"state\"]/div")).click();
//     driver.findElement(By.xpath("//*[@id=\"state\"]/div")).sendKeys(Keys.ENTER);
//     driver.findElement(By.xpath("//*[@id=\"city\"]/div")).click();
//     driver.findElement(By.xpath("//*[@id=\"city\"]/div")).sendKeys(Keys.ENTER);
//     driver.findElement(By.id("submit")).click();
}
}
