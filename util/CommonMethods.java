package com.util;

import org.openqa.selenium.WebElement;

public class CommonMethods
{
	public static void enter(WebElement element,String data)
	{
		element.sendKeys(data);
	}
	public static void clickable(WebElement arrowIcon)
	{
		arrowIcon.click();
	}
	public static void enterInt(WebElement element,int data)
	{
		String data1 = String.valueOf(data); 
		element.sendKeys(data1);
	}
}
