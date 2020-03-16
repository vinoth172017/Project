package com.automationtest.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CalculatorStepDefinition {
    private static int c;

    @Given("I enter Addition for two numbers {int} {int}")
    public void i_enter_Addition_for_two_numbers(Integer a, Integer b) {
        c = a + b;

    }

    @Then("The result is {int}")
    public void the_result_is(int result) {
        System.out.println("The expected value is: "+result);
        Assert.assertEquals(result, c);
    }
}
