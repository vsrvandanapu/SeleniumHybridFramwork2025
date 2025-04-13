package com.cts.factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.cts.constants.DriverType;

public class DriverManager {
	


	 public WebDriver initializeDriver() {
		
		WebDriver driver = null;
//		String browser = System.getProperty("browser");
		String browser = System.getProperty("browser", "CHROME");
		switch (DriverType.valueOf(browser)) {
		case CHROME:
			driver = new ChromeDriver();
			break;
		case FIREFOX:
			driver = new FirefoxDriver();
			break;
		case EDGE:
			driver = new EdgeDriver();
			break;
		
		}
		ConfigProvider config = new ConfigProvider();
		int waitTime = Integer.parseInt(config.getKeyValue("imp_wait"));
		driver.get(config.getKeyValue("testSiteURL"));
//		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
//		Integer val = config.getKeyValue("imp_wait");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(waitTime));
		return driver;
		
	}

	 /*
	   public WebDriver initializeDriver() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		return driver;
		
	}
	  */

}
