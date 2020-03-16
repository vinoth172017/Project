package autotest.junitTestUtil;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TestValidation {

    public static void verifyEquals(String expected, String actual) {
        try {
            Assert.assertEquals(expected,actual);
        } catch (AssertionError e) {
            Assert.fail("Verification Error: expected:<" + expected + "> but was:<" + actual + ">" + e.getMessage());
        }
    }

    public static void verifyEqal(String expected, String actual) {
        try {
            Assert.assertEquals(expected, actual);
        } catch (AssertionError | Exception e) {
            Assert.fail("Condition Not met" + e.getMessage());
        }
    }

    public static void verifyTrue(boolean actual) throws Exception {
        try {
            Assert.assertTrue(actual);
        } catch (AssertionError | Exception er) {
            throw new Error("Verification Error: expected:<true> but was:<false>" + er.getMessage());
        }
    }

    //////////////////////////verify Contant Equals in List ////////////////////////
    public static void verifyEquals(List<Object> expected, List<Object> actual) throws Exception {
        if (!expected.equals(actual))
            throw new Error("Verification Error: <expected>" + expected + " <actual> <" + actual + "> Found");

    }

    public static Boolean isElementDisplayed(WebElement element) {
        boolean status = false;
        if (element.isDisplayed()) {
            status = true;
        }
        return status;
    }

    //////////////////////////verify Contant Equals in List ////////////////////////
    public void verifyContentEquals(List<Object> expected, List<Object> actual) throws Exception {
        for (Object obj : expected) {
            if (!actual.contains(obj))
                throw new Error("Verification Error: <expected>" + expected + " <actual> <" + actual + "> Found");

        }

    }

}

