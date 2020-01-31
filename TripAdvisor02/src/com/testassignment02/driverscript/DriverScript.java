package com.testassignment02.driverscript;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


import com.testassignment02.pages.HomePage;
import com.testassignment02.pages.ReviewPage;
import com.testassignment02.pages.SearchResultPage;
import com.testassignment02.testscripts.ApplicationDependent;
import com.testassignment02.testscripts.TestCase01;

public class DriverScript {


	public static WebDriver oBrowser;
	public static ApplicationDependent appDep=null;
	public static HomePage oPage=null;
	public static SearchResultPage searchresultPage=null;
	public static ReviewPage reviewPage=null;
	
	public static TestCase01 testcase1=null;
	
	@BeforeSuite
	public void startAutomationSuite()
	{
		try
		{
			
			
			appDep=new ApplicationDependent();
			testcase1=new TestCase01();
			
			
		 
		
	}catch(Exception e)
		{
		System.out.println(e);
		}}
	
	@Test
	public void executeTestScenarios()
	{

		testcase1.scenarios();
	try
	{
		
		
		
		
	}catch(Exception e)
	{
		System.out.println(e); 
		
	}
	}
		
}
