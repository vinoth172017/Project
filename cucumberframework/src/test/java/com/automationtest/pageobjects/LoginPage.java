package com.automationtest.pageobjects;

import autotest.junitTestUtil.TestValidation;
import autotest.seleniumutil.SeleniumUI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.logging.Logger;

public class LoginPage extends SeleniumUI {
    private static final Logger LOG = Logger.getLogger(LoginPage.class.getName());
    private By txtUserName = By.name("txtUsername");
    private By txtPassword = By.name("txtPassword");
    private By loginButton = By.name("Submit");
    private By LoginError = By.id("spanMessage");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void loginFunctionality(String username, String password) {
        getUserName().sendKeys(username);
        LOG.info("Entered value in Username: " + username);
        getPassword().sendKeys(password);
        LOG.info("Entered value in Password: " + password);
        getLoginButton().click();
        LOG.info("Click on Login Button");
    }

    public void validateCredentials(String actualResults) {
        TestValidation.verifyEquals("Invalid credentials", getLoginError().getText());
    }

    private WebElement getUserName() {
        LOG.info("Searching element by using Locator" + txtUserName);
        return explicitWait(txtUserName, 5, "visibilityOf").getWebElement();
    }

    private WebElement getPassword() {
        LOG.info("Searching element by using Locator" + txtPassword);
        return explicitWait(txtPassword, 5, "visibilityOf").getWebElement();
    }

    private WebElement getLoginButton() {
        LOG.info("Searching element by using Locator" + loginButton);
        return explicitWait(loginButton, 5, "visibilityOf").getWebElement();
    }

    private WebElement getLoginError() {
        LOG.info("Searching element by using Locator" + loginButton);
        return explicitWait(LoginError, 5, "visibilityOf").getWebElement();
    }
}
