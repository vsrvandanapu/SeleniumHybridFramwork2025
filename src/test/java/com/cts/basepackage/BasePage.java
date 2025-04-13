package com.cts.basepackage;

import org.openqa.selenium.WebDriver;

public class BasePage {
	
	//  Common code for all the pages
	protected WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver=driver;
	}

	

}
