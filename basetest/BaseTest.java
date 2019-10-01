package com.basetest;



import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseTest 
{
	
	public static WebDriver driver;
	public static ExtentReports reports;
	public static ExtentTest etest;
	public static Logger logger;
	@BeforeSuite
	@Parameters("browser")
	public void baseTest(String browser)
	{
		reports = new ExtentReports("./Reports/ExtentReports.html");
		Logger logger = Logger.getLogger(BaseTest.class.getName());
		DOMConfigurator.configure("log4j.xml");
		logger.info("starting of the browser");
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else 
		{
			System.setProperty("webdriver.firefox.driver", "./Drivers/firefoxdriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get("https://yoaspire.com");
		driver.manage().window().maximize();
	}
	
	@AfterSuite
	public void baseClose()
	{
		reports.endTest(etest);
		reports.flush();
		
	}
}
