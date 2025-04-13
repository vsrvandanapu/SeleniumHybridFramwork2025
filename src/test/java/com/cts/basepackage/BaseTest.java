package com.cts.basepackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.cts.factory.DriverManager;

public class BaseTest {

	protected static WebDriver driver;
	// Common for all the test classes
	@BeforeMethod
	public void setupBrowser() {
		driver = new DriverManager().initializeDriver();
		
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	// Excel Reading
	   public static HashMap<String, String> excelreading() throws FileNotFoundException, IOException {
	        //E:\Workspace8AM\HybridFramework\src\test\resources\TestData\data.xlsx
	        XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\TestData\\data.xlsx"));
	        XSSFSheet sh = wb.getSheetAt(0);
	        int rows = sh.getLastRowNum();
	        HashMap<String, String> data = new HashMap<String, String>();
	        for (int r = 0; r <= rows; r++) {
	            String key = sh.getRow(r).getCell(0).getStringCellValue();
	            String value = sh.getRow(r).getCell(1).getStringCellValue();
	            data.put(key, value);

	        }
	        return data;
	    }
}
