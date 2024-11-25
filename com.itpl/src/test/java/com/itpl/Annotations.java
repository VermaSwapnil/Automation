package com.itpl;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeSuite
	public void beforeSuite()
	{
		Reporter.log("Before Suite-->Server connections",true);
	}
	
	@BeforeTest
	public void beforetest()
	{
		Reporter.log("Before Tests-->Database connections",true);
	}
	
	@BeforeClass
	public void beforeClass()
	{
		Reporter.log("Before Class-->Launch Browser",true);
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		Reporter.log("Before Method-->Login",true);
	}
	
	@Test
	public void testScript()
	{
		Reporter.log("Test-->Execute test script");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		Reporter.log("After Method-->Logout",true);
	}
	
	@AfterClass
	public void afterClass()
	{
		Reporter.log("After Class-->Close browser",true);
	}
	
	@AfterTest
	public void afterTest()
	{
		Reporter.log("After Test-->Close database",true);
	}
	
	@AfterSuite
	public void afterSuite()
	{
		Reporter.log("After Suite-->Close Server",true);
	}
	
}
