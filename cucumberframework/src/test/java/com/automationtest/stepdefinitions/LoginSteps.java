package com.automationtest.stepdefinitions;

import autotest.testconfig.DriverConfig;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import com.automationtest.pageobjects.*;

import java.util.List;

public class LoginSteps {
    private WebDriver driver;
    private DriverConfig driverConfig = new DriverConfig();
    private LoginPage loginPage;
    private DashBoardPage dashBoardPage;

    @Before
    public void init() {
        try {
            driver = driverConfig.initiateLocalExecution("firefox");
            loginPage = new LoginPage(driver);
            dashBoardPage = new DashBoardPage(driver);
            Assert.assertNotNull(driver);
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

    @After
    public void tearDown() {
        driver.quit();
    }


    @Given("I login as {string} role on OrangeHRMS App")
    public void i_login_as_role_on_OrangeHRMS_App(String role, io.cucumber.datatable.DataTable dataTable) {
        try {
            if (role.equalsIgnoreCase("admin")) {
                List<String> dbTable = dataTable.asList();
                String userName = dbTable.get(0);
                String password = dbTable.get(1);
                loginPage.loginFunctionality(userName, password);
            }
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

    @Then("Login must be Success")
    public void login_must_be_Success() {
        // Write code here that turns the phrase above into concrete actions
        dashBoardPage.verifyDashboardLogin();
    }

    @Then("Login must be Failure and return the error message {string}")
    public void login_must_be_Failure_and_return_the_error_message(String actualResults) {
        loginPage.validateCredentials(actualResults);

    }

}
