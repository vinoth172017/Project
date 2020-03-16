package com.TestCase;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import com.BaseClass.WapperClass;
import com.Pages.RoyalCaribbean;


public class RoyalCaribbean_TestCase extends WapperClass {
	
@BeforeClass
public void startup()
	{
		Launchapp("chrome","https://www.royalcaribbean.com/alaska-cruises");
	}

@Test
public void  alska() throws InterruptedException 
{
	RoyalCaribbean rc =new RoyalCaribbean(driver);
	int b=rc.checklink();
	rc.PlanCruise();
	String a=rc.royal();
	if(a.equals("Royal Suite") && b==1) {
		Assert.assertTrue(true);	
	}
	else {
		Assert.assertTrue(false);
	}
}

@AfterClass
public void Close()
	{
		CloseBrowser();
	}
}

