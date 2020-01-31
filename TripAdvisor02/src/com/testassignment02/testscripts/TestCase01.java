package com.testassignment02.testscripts;

import com.testassignment02.driverscript.DriverScript;
import com.testassignment02.pages.HomePage;
import com.testassignment02.pages.ReviewPage;
import com.testassignment02.pages.SearchResultPage;

public class TestCase01 extends DriverScript
{
	
	public void scenarios()
	{
	
	oBrowser=ApplicationDependent.launchApp("chrome");
	
	ApplicationDependent.navigate();
	oPage=new HomePage(oBrowser);
	oPage.clickOnSearch();
	oPage.clickOnSearchAndwrite();
	oPage.clickOnSearchButton();
	oPage.clickOnFirstSearch();
	searchresultPage=new SearchResultPage(oBrowser);
	searchresultPage.writeReview();
	reviewPage=new ReviewPage(oBrowser);
	reviewPage.userReview();
	
	}
	
	
}
