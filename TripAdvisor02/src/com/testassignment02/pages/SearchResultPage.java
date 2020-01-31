package com.testassignment02.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testassignment02.driverscript.DriverScript;

public class SearchResultPage extends DriverScript {
	public SearchResultPage(WebDriver oBrowser)
	{
		
		PageFactory.initElements(oBrowser, this);
		
	}
	@FindBy(xpath="//*[text()='Write a review']")
	private WebElement writereview;
	public WebElement getwritereview()
	{
		return writereview;
	}
	
	public void writeReview()
	{
		try
		{
			String parentid=oBrowser.getWindowHandle();
			System.out.println(parentid);
			Set<String> oset=oBrowser.getWindowHandles();
			System.out.println(oset);
			Iterator<String> it=oset.iterator();
			while(it.hasNext())
			{
				String childwindow=it.next();
				if(!parentid.equalsIgnoreCase(childwindow))
				{
					oBrowser.switchTo().window(childwindow);
					
				}
			}
			JavascriptExecutor js=(JavascriptExecutor)oBrowser;
			js.executeScript("window.scrollBy(0,2500)");
			Thread.sleep(4000);
			getwritereview().click();

		}catch(Exception e)
		{
			System.out.println(e);
		}
			
	}
}
			
