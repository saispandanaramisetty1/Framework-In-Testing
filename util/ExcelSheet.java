package com.util;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet 
{
	public static String readDataFromExcel(String sheetName,int rowNumber,int columnNumber)
	{
		try 
		{
			File file = new File("./ExcelSheet/PageFactoryExcel.xlsx");
			FileInputStream fis = new FileInputStream(file);
			Workbook wb = WorkbookFactory.create(fis);
			String data = wb.getSheet(sheetName).getRow(rowNumber).getCell(columnNumber).getStringCellValue();
			return data;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return null;
	}
}
