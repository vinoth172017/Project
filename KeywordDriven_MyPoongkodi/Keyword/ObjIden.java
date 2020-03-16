package Keyword;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
     
public class ObjIden {
	WebDriver driver;
	By searchword=By.name("q");
	public void OpenBrow()
	{	
		System.setProperty("webdriver.chrome.driver","C:\\selenium_packages\\chromedriver.exe");
		driver=new ChromeDriver();
	}
    public void SetUrl()
    {
    	driver.manage().window().maximize();
		driver.get("https://google.com");
    }
    public void Search(String st)
    {
    driver.findElement(searchword).sendKeys(st);		
    }
    public void enter()
    {
    driver.findElement(searchword).sendKeys(Keys.ENTER);		
    }
    
    public void closeBrow()
    {
    	driver.close();
    }
}
