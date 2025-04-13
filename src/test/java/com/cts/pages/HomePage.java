package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cts.basepackage.BasePage;
import com.cts.utilites.Helper;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	private By arrowUserNav =By.xpath("//div[@id='userNav-arrow']");
	private By lnkLogout =By.xpath("//a[text()='Logout']");
	private By tabLeads = By.xpath("//a[text()='Leads']");
	
	public void logoutFromApplication() {
		Helper.waitTo(3);
		driver.findElement(arrowUserNav).click();
		Helper.waitTo(3);
		
		driver.findElement(lnkLogout).click();
	}
	
    public LeadsPage clickOnTheLeadsTab() {
    	driver.findElement(tabLeads).click();
    	return new LeadsPage(driver);
    }
}
