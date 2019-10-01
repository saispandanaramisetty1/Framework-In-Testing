package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.basetest.BaseTest;
import com.util.CommonMethods;

public class Login extends BaseTest 
{
	@FindBy(xpath="//I[@class='icon-arrow']")
	public static WebElement arrowIcon;
	@FindBy(xpath="//INPUT[@id='input_11']")
	public static WebElement userNameBox;
	@FindBy(xpath="//INPUT[@id='input_12']")
	public static WebElement passwordBox;
	@FindBy(xpath="//BUTTON[@class='btn signin-btn'][text()='Sign in']")
	public static WebElement signIn;
	@FindBy(xpath="(//A[@href='/interviewer/drives'])[1]")
	public static WebElement interviews;
	@FindBy(xpath="//I[@class='icon-card-drop-down-arrow3']")
	public static WebElement arrowDropdown1;
	@FindBy(xpath="(//I[@class='icon-card-drop-down-arrow3'])[1]")
	public static WebElement arrowDropdown2;
	@FindBy(xpath="//B[text()='Give FeedBack']")
	public static WebElement feedback;
	@FindBy(xpath="//INPUT[@id='rating-0']")
	public static WebElement testingBox;
	@FindBy(xpath="//TEXTAREA[@id='comment-0']")
	public static WebElement comments1Box;
	@FindBy(xpath="//INPUT[@id='rating-1']")
	public static WebElement javaBox;
	@FindBy(xpath="//TEXTAREA[@id='comment-1']")
	public static WebElement comments2Box;
	@FindBy(xpath="//TEXTAREA[@class='']")
	public static WebElement oCommentsBox;
	@FindBy(xpath="//LABEL[@for='agreementcheckbox'][text()='Is recommended?']")
	public static WebElement checkbox;
	@FindBy(xpath="//BUTTON[@class='btn waves-effect waves-light'][text()='Submit']")
	public static WebElement submit;
	@FindBy(xpath="(//SPAN[@class='navbar-option-txt'][text()='My Connections'][text()='My Connections'])[1]")
	public static WebElement connections;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/h6[1]/a[1]")
	public static WebElement profile;
	@FindBy(xpath="(//SPAN[@class='navbar-option-txt'][text()='Articles'][text()='Articles'])[1]")
	public static WebElement readArticles;
	@FindBy(xpath="(//BUTTON[@class='btn read-articles-btn'][text()='Read'][text()='Read'])[1]")
	public static WebElement read;
	@FindBy(xpath="(//SPAN[@class='navbar-option-txt'][text()='Bulletins'][text()='Bulletins'])[1]")
	public static WebElement points;
	@FindBy(xpath="//H6[@class='suggested-bulletin-page-link'][text()='Suggested Bulletins']")
	public static WebElement bPage;
	@FindBy(xpath="(//SPAN[@class='navbar-option-txt'][text()='Messages'][text()='Messages'])[1]")
	public static WebElement messages;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/h6[1]")
	public static WebElement readMessage;
	public void login(String userName,String password) 
	{
		CommonMethods.clickable(arrowIcon);
		CommonMethods.enter(userNameBox, userName);
		CommonMethods.enter(passwordBox, password);
		CommonMethods.clickable(signIn);
		
	}
	public void registerForDrives(String testing,String comments1, String java,String comments2, String oComments) throws Exception
	{
		Thread.sleep(3000);
		CommonMethods.clickable(interviews);
		CommonMethods.clickable(arrowDropdown1);
		CommonMethods.clickable(arrowDropdown2);
		CommonMethods.clickable(feedback);
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.navigate().refresh();
		CommonMethods.enter(testingBox, testing);
		CommonMethods.enter(comments1Box, comments1);
		CommonMethods.enter(javaBox, java);
		CommonMethods.enter(comments2Box, comments2);
		CommonMethods.enter(oCommentsBox, oComments);
		CommonMethods.clickable(checkbox);
		
	}
	public void connections() throws Exception
	{
		Thread.sleep(3000);
		CommonMethods.clickable(connections);
		CommonMethods.clickable(profile);
	}
	public void readArticles() throws Exception
	{
		Thread.sleep(3000);
		CommonMethods.clickable(readArticles);
		CommonMethods.clickable(read);
		
	}
	public void bulletinPoints() throws Exception
	{
		Thread.sleep(3000);
		CommonMethods.clickable(points);
		CommonMethods.clickable(bPage);
		
	}
	public void feedbackWithoutGivingDetails() throws Exception
	{
		Thread.sleep(3000);
		CommonMethods.clickable(interviews);
		CommonMethods.clickable(arrowDropdown1);
		CommonMethods.clickable(arrowDropdown2);
		CommonMethods.clickable(feedback);
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.navigate().refresh();
		CommonMethods.clickable(submit);
	}
	public void messages() throws Exception
	{
		Thread.sleep(3000);
		CommonMethods.clickable(messages);
		CommonMethods.clickable(readMessage);
	}

}
