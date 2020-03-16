package com.automationtest.pageobjects;
import autotest.seleniumutil.SeleniumUI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.logging.Logger;

import static autotest.junitTestUtil.TestValidation.verifyEquals;


public class DashBoardPage extends SeleniumUI {
    private static final Logger LOG = Logger.getLogger(DashBoardPage.class.getName());
    private By roleText = By.id("welcome");
    private String DashboardLoginVerification = "Welcome Admin";

    /**
     * Initalize Driver object using Constructor
     * @param driver
     */
    public DashBoardPage(WebDriver driver) {
        super(driver);
    }

    private String getRoleText() {
        LOG.info("Searching element by using Locator" + roleText);
        return explicitWait(roleText, 1000, "visibilityOf").getText();
    }

    public void verifyDashboardLogin() {
        verifyEquals(getRoleText(), DashboardLoginVerification);
        LOG.info("Actual vs Expected is Success");
    }
}
