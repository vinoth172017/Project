package Testegdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsonmethods {
@Test
public void login() {
	System.out.println("Login the application");
}
@Test(dependsOnMethods= {"login"})
public void search() {
	System.out.println("searching the malar application");
	Assert.assertEquals("abc", "xyz");
}
@Test(dependsOnMethods= {"search"},alwaysRun=true)
public void logout() {
	System.out.println("logut the application");
}
}
