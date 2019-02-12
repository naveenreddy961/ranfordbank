package com.ranford.pagelibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class Hooks 
{
public static WebDriver driver;
@Before
public static void launchbrowser()
{
	System.setProperty("webdriver.chrome.driver", "E:\\testing\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
			
}
public static void takescreenshort(Scenario s)
{
	if(s.isFailed())
	{
		TakesScreenshot screen=(TakesScreenshot)driver;
		byte[] bi=screen.getScreenshotAs(OutputType.BYTES);
		s.embed(bi, "png/image");
	}
}
}	
