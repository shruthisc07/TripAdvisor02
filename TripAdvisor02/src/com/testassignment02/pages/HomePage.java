package com.testassignment02.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public static WebDriver oBrowser;

	
	public HomePage(WebDriver oBrowser)
	{
		
		PageFactory.initElements(oBrowser, this);
		
	}
	
	@FindBy(xpath="//*[@class='brand-global-nav-action-search-Search__label--3PRUD']")
	private WebElement searchbox;
	public WebElement getsearch()
	{
		return searchbox;
	}
	private WebElement mainSearch;
	public WebElement getclickonsearchicon()
	{
		return mainSearch;
	}
	@FindBy(xpath="//*[@id='SEARCH_BUTTON_CONTENT']")
	private WebElement osearchbutton;
	public WebElement getclickOnSearchButton()
	{
		return osearchbutton;
	}

	@FindBy(xpath="//*[text()='Club Mahindra Madikeri, Coorg']")
	private WebElement clickonfristsearch;
	public WebElement getclickonfristsearch()
	{
		return clickonfristsearch;
	}
	
	
	

	
		public void clickOnSearch() 
		{
			try 
			{
			getsearch().click();
			Thread.sleep(5000);
			System.out.println("clicked on search");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		public void clickOnSearchAndwrite()
		{
			try {
			getclickonsearchicon().sendKeys("Club Mahindra");
			System.out.println("searching for clubmahindra");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		public void clickOnSearchButton()
		{
			try
			{
			getclickOnSearchButton().click();
			Thread.sleep(5000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	
		public void clickOnFirstSearch()
		{
			try
			{
			getclickonfristsearch().click();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		}
	
		

