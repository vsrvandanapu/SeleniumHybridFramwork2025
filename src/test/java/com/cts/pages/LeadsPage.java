package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.cts.basepackage.BasePage;

public class LeadsPage extends BasePage {

	public LeadsPage(WebDriver driver) {
		super(driver);
	}

	private By btnNew = By.xpath("//input[@title='New']");
	private By txtboxFirstName = By.xpath("//input[@id='name_firstlea2']");
	private By txtboxLastName = By.xpath("//input[@id='name_lastlea2']");
	private By txtboxCompanyName = By.xpath("//input[@id='lea3']");
	private By dropdownLeadSource = By.xpath("//select[@id='lea13']");
	private By txtareaDescription = By.xpath("//textarea[@id='lea17']");
	private By btnSave = By.xpath("((//input[@title='Save'])[2]");

	public LeadsPage clickOnNewLeadButton() {
		driver.findElement(btnNew).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return this;
	}

	public LeadsPage fillTheLeadInfo() {
		driver.findElement(txtboxFirstName).sendKeys("Kavitha");
		driver.findElement(txtboxLastName).sendKeys("G");
		driver.findElement(txtboxCompanyName).sendKeys("CTS");
		Select selLeadStatus = new Select(driver.findElement(dropdownLeadSource));
		selLeadStatus.selectByIndex(1);
		driver.findElement(txtareaDescription).sendKeys("This is a Lead description");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return this;
	}
	public LeadsPage fillTheLeadInfo(String fName, String lName, String cName, String description) {
		driver.findElement(txtboxFirstName).sendKeys(fName);
		driver.findElement(txtboxLastName).sendKeys(lName);
		driver.findElement(txtboxCompanyName).sendKeys(cName);
		Select selLeadStatus = new Select(driver.findElement(dropdownLeadSource));
		selLeadStatus.selectByIndex(1);
		driver.findElement(txtareaDescription).sendKeys(description);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return this;
	}
	public LeadsPage createLeadClickOnSaveButton() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(btnSave).click();
		return this;
	}

	/*
	 public void clickOnNewLeadButton() {
		driver.findElement(btnNew).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void fillTheLeadInfo() {
		driver.findElement(txtboxFirstName).sendKeys("Kavitha");
		driver.findElement(txtboxLastName).sendKeys("G");
		driver.findElement(txtboxCompanyName).sendKeys("CTS");
		Select selLeadStatus = new Select(driver.findElement(dropdownLeadSource));
		selLeadStatus.selectByIndex(1);
		driver.findElement(txtareaDescription).sendKeys("This is a Lead description");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void createLeadClickOnSaveButton() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(btnSave).click();
	}
	 */
}
