package com.testassignment02.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.testassignment02.driverscript.DriverScript;

public class ReviewPage extends DriverScript {
	public ReviewPage(WebDriver oBrowser)
	{
		
		PageFactory.initElements(oBrowser, this);
		
	}

	public void userReview()
	{
		String str=oBrowser.getWindowHandle();
		Set<String> ostring=oBrowser.getWindowHandles();
		Iterator<String> it=ostring.iterator();
		while(it.hasNext())
		{
			String childwindow=it.next();
			if(!str.equalsIgnoreCase(childwindow))
			{
				oBrowser.switchTo().window(childwindow);
			}
		}
		System.out.println(oBrowser.getCurrentUrl());
	}
}
