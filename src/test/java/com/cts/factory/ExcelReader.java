package com.cts.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.cts.basepackage.BaseTest;

public class ExcelReader extends BaseTest {
	
	  public static HashMap<String, String> excelreading()  {
	        //E:\Workspace8AM\HybridFramework\src\test\resources\TestData\data.xlsx
	        XSSFWorkbook wb = null;
			try {
				wb = new XSSFWorkbook(new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\TestData\\data.xlsx"));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
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

