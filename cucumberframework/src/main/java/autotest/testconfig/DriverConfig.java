package autotest.testconfig;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverConfig extends GlobalConfig {
    private WebDriver driver;
    private String browserType;

    /**
     * Execute Test in Local Machine
     *
     * @param browserType
     * @return
     */
    public WebDriver initiateLocalExecution(String browserType) {
        try {
            this.browserType = browserType;
            if (browserType.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/" +
                        "chromedriver.exe");
                driver = new ChromeDriver();
            } else if (browserType.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/" +
                        "geckodriver.exe");
                driver = new FirefoxDriver();
            }
            driver.get(URL);
            driver.manage().window().maximize();
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
        return driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public String getBrowserType() {
        return browserType;
    }
}
