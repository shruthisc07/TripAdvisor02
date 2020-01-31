package com.testassignment02.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.testassignment02.driverscript.DriverScript;
import com.testassignment02.pages.HomePage;



public class ApplicationDependent extends DriverScript {
	public static WebDriver oBrowser;
	/**
	 * @param args
	 * Created By:
	 * Created Date:
	 * Modified By:
	 * Reviewed By:
	 * Return Value:
	 * Parameters:
	 * Description:
	 */
	static WebDriver launchApp(String strBrowser)
	{
		
		try {
			switch(strBrowser.toLowerCase())
			{
				case "chrome":
					System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Library\\drivers\\chromedriver.exe");
					oBrowser = new ChromeDriver();
					break;
				case "ie":
					System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\Library\\drivers\\IEDriverServer.exe");
					oBrowser = new InternetExplorerDriver();
					break;
				case "ff":
					System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Library\\drivers\\geckodriver.exe");
					oBrowser = new FirefoxDriver();
					break;
				default:
					System.out.println("Fail,Executing 'launchApp' method Invalid browser name '"+strBrowser);
			}
			//oPage=new HomePage(oBrowser);
			
			if(oBrowser!=null)
			{
				oBrowser.manage().window().maximize();
				
			}else {
				System.out.println("invalid"); 
				
			}
			
		}catch(Exception e)
		{
			System.out.println("Fail,Executing 'launchApp' method Exception while executing 'launchApp' method. "+e.getMessage());
		}
		return oBrowser;	
		
	}
	
	/**
	 * @param args
	 * Created By:
	 * Created Date:
	 * Modified By:
	 * Reviewed By:
	 * Return Value:
	 * Parameters:
	 * Description:
	 */

	 static void navigate()
	{
		try
		{
			oBrowser.get("https://www.tripadvisor.in/");
			Thread.sleep(5000);
			System.out.println("page navigated successfully"); 
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
