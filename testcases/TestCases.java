package com.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.basetest.BaseTest;
import com.pages.Login;
import com.relevantcodes.extentreports.LogStatus;
import com.util.ExcelSheet;

public class TestCases extends BaseTest
{
	public static Login login = PageFactory.initElements(BaseTest.driver, Login.class);
	@Test(priority=1)
	public static void invalidLogin()
	{
		etest = reports.startTest("testcase2");
		String userName = ExcelSheet.readDataFromExcel("PageFactoryExcel", 2, 1);
		String password = ExcelSheet.readDataFromExcel("PageFactoryExcel", 2, 2);
		Login login = PageFactory.initElements(BaseTest.driver, Login.class);
		login.login(userName,password);
		driver.navigate().refresh();
		etest.log(LogStatus.INFO, "In test one");
		etest.log(LogStatus.PASS, "Test is passed");
	}
	@Test(priority=2)
	public static void validLogin() 
	{
		etest = reports.startTest("testcase1");
		String userName = ExcelSheet.readDataFromExcel("PageFactoryExcel", 1, 1);
		String password = ExcelSheet.readDataFromExcel("PageFactoryExcel", 1, 2);
		login.login(userName,password);
		etest.log(LogStatus.INFO, "In test two");
		etest.log(LogStatus.PASS, "Test is passed");	
	}
	@Test(priority=3)
	public static void interviews() throws Exception
	{
		etest = reports.startTest("testcase3");
		String testing = ExcelSheet.readDataFromExcel("PageFactoryExcel", 3, 1);
		String comments1 = ExcelSheet.readDataFromExcel("PageFactoryExcel", 3, 2);
		String java = ExcelSheet.readDataFromExcel("PageFactoryExcel", 3, 3);
		String comments2 = ExcelSheet.readDataFromExcel("PageFactoryExcel", 3, 4);
		String oComments = ExcelSheet.readDataFromExcel("PageFactoryExcel", 3, 5);
		login.registerForDrives(testing,comments1, java,comments2,oComments);
		etest.log(LogStatus.INFO, "In test three");
		etest.log(LogStatus.PASS,"Test is passed");
		
	}
	@Test(priority=4)
	public static void myConnections() throws Exception
	{
		etest = reports.startTest("testcase4");
		login.connections();
		etest.log(LogStatus.INFO, "In test four");
		etest.log(LogStatus.PASS,"Test is passed");
	}
	@Test(priority=5)
	public static void articles() throws Exception
	{
		etest = reports.startTest("testcase5");
		login.readArticles();
		etest.log(LogStatus.INFO, "In test five");
		etest.log(LogStatus.PASS,"Test is passed");
	}
	@Test(priority=6)
	public static void bulletins() throws Exception
	{
		etest = reports.startTest("testcase6");
		login.bulletinPoints();
		etest.log(LogStatus.INFO, "In test six");
		etest.log(LogStatus.PASS,"Test is passed");
	}
	@Test(priority=7)
	public static void feedbackForm() throws Exception
	{
		etest = reports.startTest("testcase7");
		login.feedbackWithoutGivingDetails();
		etest.log(LogStatus.INFO, "In test seven");
		etest.log(LogStatus.PASS,"Test is passed");
	}
	@Test(priority=8)
	public static void messageBox() throws Exception 
	{
		etest = reports.startTest("testcase7");
		login.messages();
		etest.log(LogStatus.INFO, "In test seven");
		etest.log(LogStatus.PASS,"Test is passed");
		
	}
}
