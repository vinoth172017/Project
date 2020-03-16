package autotest.seleniumutil;
import autotest.globalconfig.TestConfig;
import autotest.junitTestUtil.TestValidation;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static autotest.globalconfig.TestConfig.TIME_LIMIT;
import static autotest.globalconfig.TestConfig.screenshotpath;

public class SeleniumUI {
    private WebDriver driver;
    private WebElement element;
    private Actions actions;

    /**
     * Initalize Driver object using Constructor
     *
     * @param driver
     */
    public SeleniumUI(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Maximize Window
     */
    public void windowsMaximize() {
        driver.manage().window().maximize();
    }

    /**
     * Description: Return current Element
     *
     * @return
     */
    public WebElement getWebElement() {
        return element;
    }

    /**
     * Return of List of WebElement
     *
     * @param locator
     * @return
     */
    public List<WebElement> getUIElement(By locator) {
        return driver.findElements(locator);
    }

    /**
     * Description: Condition to Check Wait and Find Element
     *
     * @param locator
     * @return
     * @throws Exception
     */
    public WebElement waitAndFindElement(By locator) throws Exception {
        return findElementConditionusingLocator(locator).getWebElement();
    }

    /**
     * Description: Get Value from Textbox
     *
     * @param locator
     * @return
     * @throws Exception
     */
    public String getValue(By locator) throws Exception {

        return element.getAttribute("value");
    }

    /**
     * Description: Get value from Label
     *
     * @return
     * @throws Exception
     */
    public String getText(){
        return element.getText();
    }

    /**
     * Description: Enter text in texbox
     *
     * @param text
     * @throws Exception
     */
    public void enterData(String text) throws Exception {
        element.sendKeys(text);
    }


    /**
     * Description: Clear textbox
     *
     * @param locator
     * @throws Exception
     */
    public void clear(By locator) throws Exception {
        element.clear();
    }

    /**
     * Description: Click on element
     *
     * @param locator
     * @throws Exception
     */
    public void clickOn(By locator) throws Exception {
        element.click();
    }

    /**
     * Description: Get Title
     *
     * @return
     * @throws Exception
     */
    public String titleVerification() {
        return driver.getTitle();
    }

    /**
     * Description: Select dropdownlist
     *
     * @param option
     * @throws Exception
     */
    public void select(String option) throws Exception {
        Select select = new Select(element);
        select.selectByVisibleText(option);
    }

    /**
     * Get first Selected Value
     *
     * @return
     * @throws Exception
     */
    public String getSelectedValue() throws Exception {
        return new Select(element).getFirstSelectedOption().getText();
    }

    /**
     * Description: FindElement Using Locator
     *
     * @param locator
     * @return
     * @throws Exception
     */
    //////////////////////////  Wait for Element Present with By locator////////////////////////
    public SeleniumUI findElementConditionusingLocator(By locator) throws Exception {
        long end = System.currentTimeMillis() + TIME_LIMIT;
        while (true) {
            try {
                element = driver.findElement(locator);
                if (element.isDisplayed()) break;
            } catch (Exception e) {
                if (System.currentTimeMillis() >= end) {
                    System.out.println("\n***" + locator + " Not Found..***");
                    throw new Exception("Element not found");
                }
            }
        }
        return this;
    }

    /**
     * Description: FindElement Using WebElement
     *
     * @return
     * @throws Exception
     */
    //////////////////////////  Wait for Element Present with By locator////////////////////////
    public SeleniumUI findElementConditionusingWebElement(WebElement webElement) throws Exception {
        long end = System.currentTimeMillis() + TIME_LIMIT;
        while (true) {
            try {
                if (webElement.isDisplayed()) {
                    element = webElement;
                }
                break;
            } catch (Exception e) {
                if (System.currentTimeMillis() >= end) {
                    System.out.println("\n***" + element + " Not Found..***");
                    throw new Exception("Element not found");
                }
            }

        }
        return this;
    }

    /**
     * @param webElement
     * @return
     * @throws Exception
     */
    public static List<WebElement> waitForElementPresentinList(WebElement webElement) throws Exception {
        List<WebElement> elements = null;
        long end = System.currentTimeMillis() + TIME_LIMIT;
        while (elements.isEmpty()) {
            try {
                elements = webElement.findElements((By.tagName("option")));
                if (elements.isEmpty()) break;
            } catch (Exception e) {
                if (System.currentTimeMillis() >= end) throw e;
            }
        }
        return elements;
    }


    /**
     * Hold Script using Thread.sleep
     *
     * @param iTimeInMillis
     */
    public void pause(final int iTimeInMillis) {
        try {
            Thread.sleep(iTimeInMillis);
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * Description: Accept Alerts
     *
     * @throws Exception
     */
    public void acceptAlert() throws Exception {
        try {
            driver.switchTo().alert().accept();
        } catch (Exception e) {
            throw new Exception("No Alert Present");
        }
    }

    /**
     * Description: Accept Alert based on sending text
     *
     * @param text
     * @return
     * @throws Exception
     */
    public boolean acceptAlertknown(String text) throws Exception {
        try {
            if (text == driver.switchTo().alert().getText()) {
                driver.switchTo().alert().accept();
            }
        } catch (Exception e) {
            throw new Exception("No Alert Present");
        }
        return false;
    }

    /**
     * Description: Cancel Alert
     *
     * @throws Exception
     */
    public void cancelAlert() throws Exception {
        try {
            driver.switchTo().alert().dismiss();
        } catch (Exception e) {
            throw new Exception("No Alert Present");
        }
    }

    /**
     * Description: Cancel Alert
     *
     * @return
     * @throws Exception
     */
    public String getAlertText() throws Exception {
        String text;
        try {
            text = driver.switchTo().alert().getText();
        } catch (Exception e) {
            throw new Exception("No Alert Present");
        }
        return text;
    }

    /**
     * Verify Element is present
     *
     * @param locator
     * @throws Exception
     */
    public void verifyElementPresent(By locator) throws Exception {
        if (!(TestValidation.isElementDisplayed(findElementConditionusingLocator(locator).getWebElement()))) ;
        throw new Error("Element not found");
    }

    /**
     * Refresh current page
     */
    public void refresh() {
        driver.navigate().refresh();
    }

    /**
     * Verify Text present
     *
     * @param text
     */
    public void verifyTextPresent(String text) {
        try {
            getUIElement(By.xpath("//*[contains(.,'" + text + "')]"));
        } catch (Exception e) {
            throw new Error("Verification Error: <Text>" + text + " Not Found");
        }
    }

    /**
     * Quit browser
     */
    public void quitBrowser() {
        driver.quit();
    }

    /**
     * Open Browser and launch url
     *
     * @param url
     * @throws Exception
     */
    public void launchBrowser(String url) {
        driver.get(url);
    }

    /**
     * Implicit wait based on hard coded millisecs
     *
     * @return
     */
    public SeleniumUI implicit_wait() {
        driver.manage().timeouts().implicitlyWait(TIME_LIMIT, TimeUnit.MILLISECONDS);
        return this;
    }

    /**
     * Take screenshot of current page
     *
     * @param classname
     */
    public void screenshot(String classname) {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        //The below method will save the screen shot in d drive with test method name
        try {
            FileHandler.copy(scrFile, new File(screenshotpath + classname + ".png"));
            System.out.println("***Placed screen shot in " + screenshotpath + " ***");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Implicit wait based on supplied milli seconds
     *
     * @param timeunit
     * @return
     */
    public SeleniumUI implicitWait(long timeunit) {
        driver.manage().timeouts().implicitlyWait(timeunit, TimeUnit.SECONDS);
        return this;
    }

    /**
     * Explicit wait based on availability of elements with supplied conditions
     *
     * @param webElement
     * @param timeout
     * @param typeofElementConditions "visibilityOf","alertisPresent","elementTobeClickable"
     * @return
     */
    public SeleniumUI explicitWait(WebElement webElement, long timeout, String typeofElementConditions) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            switch (typeofElementConditions) {
                case "visibilityOf":
                    wait.until(ExpectedConditions.visibilityOf(webElement));
                    break;
                case "alertIsPresent":
                    wait.until(ExpectedConditions.alertIsPresent());
                    break;
                case "elementToBeClickable":
                    wait.until(ExpectedConditions.elementToBeClickable(webElement));
                    break;
                default:
                    break;
            }
            element = webElement;
        } catch (Exception e) {
            Assert.fail("Element not Found" + e.getMessage());
        }
        return this;
    }

    /**
     * Explicit wait based on availability of elements with supplied conditions
     *
     * @param locator
     * @param timeout
     * @param typeofElementConditions "visibilityOf","alertisPresent","elementTobeClickable"
     * @return
     */
    public SeleniumUI explicitWait(By locator, long timeout, String typeofElementConditions) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            switch (typeofElementConditions) {
                case "visibilityOf":
                    wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
                    break;
                case "alertIsPresent":
                    wait.until(ExpectedConditions.alertIsPresent());
                    break;
                case "elementToBeClickable":
                    wait.until(ExpectedConditions.elementToBeClickable(locator));
                    break;
                default:
                    break;
            }
            element = driver.findElement(locator);
        } catch (Exception e) {
            Assert.fail("Element not Found" + e.getMessage());
        }
        return this;
    }

    /**
     * Double Click on element
     *
     * @param element
     */
    public void doubleClick(WebElement element) {
        actions.doubleClick(element).build().perform();
    }

    /**
     * Drag and Drop the element
     *
     * @param dragValue
     * @param dropValue
     */
    public void mouseDragAndDrop(WebElement dragValue, WebElement dropValue) {
        actions = new Actions(driver);
        actions.dragAndDrop(dragValue, dropValue).build().perform();
    }


}
