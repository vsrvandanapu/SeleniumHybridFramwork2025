package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cts.basepackage.BasePage;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	private By txtboxUserName = By.id("username");
	private By txtboxPassword = By.name("pw");
	private By btnLogin= By.cssSelector("#Login");
	
	public void typeUserName() {
		driver.findElement(txtboxUserName).sendKeys("srinivas@cisolutions.com");
	}
	public void typePassword() {
		driver.findElement(txtboxPassword).sendKeys("Selenium@1");
	}
	public void clickOnLoginButton() {
		driver.findElement(btnLogin).click();
	}
	public HomePage loginToTheApplication() {
		driver.findElement(txtboxUserName).sendKeys("srinivas@cisolutions.com");
		driver.findElement(txtboxPassword).sendKeys("Selenium@1");
		driver.findElement(btnLogin).click();
		return new HomePage(driver);
	}
	public HomePage loginToTheApplication(String userName, String password) {
		driver.findElement(txtboxUserName).sendKeys(userName);
		driver.findElement(txtboxPassword).sendKeys(password);
		driver.findElement(btnLogin).click();
		return new HomePage(driver);
	}
	/*
	 public void loginToTheApplication() {
		driver.findElement(txtboxUserName).sendKeys("srinivas@cisolutions.com");
		driver.findElement(txtboxPassword).sendKeys("Selenium@1");
		driver.findElement(btnLogin).click();
	}
	 public void loginToTheApplication(String userName, String password) {
		driver.findElement(txtboxUserName).sendKeys(userName);
		driver.findElement(txtboxPassword).sendKeys(password);
		driver.findElement(btnLogin).click();
	}
	 */
}
