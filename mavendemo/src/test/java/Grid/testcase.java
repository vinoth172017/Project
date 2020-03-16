package Grid;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testcase {
	WebDriver driver;
	String Baseurl, nodeurl;
	@BeforeTest
	public void setup() throws MalformedURLException
	{
		Baseurl="https://www.google.com/";
		nodeurl="http://192.168.1.204:5567/wd/hub";
		DesiredCapabilities capablity = DesiredCapabilities.chrome();
		capablity.setBrowserName("chrome");
		capablity.setPlatform(Platform.WINDOWS);
		driver =new RemoteWebDriver(new URL(nodeurl),capablity);
	}
	public void aftertest()
	{
		driver.quit();
	}
@Test
public void simpletest() 
{
	driver.get(Baseurl);
	String a= driver.getTitle();
	System.out.println("Title of the page "+a);
}
}
	
