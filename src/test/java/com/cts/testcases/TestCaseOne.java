package com.cts.testcases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.cts.basepackage.BaseTest;
import com.cts.factory.ExcelReader;
import com.cts.pages.HomePage;
import com.cts.pages.LeadsPage;
import com.cts.pages.LoginPage;
import com.cts.utilites.Helper;

public class TestCaseOne extends BaseTest{

	@Test
	public void loginAndLogout() throws InterruptedException {

		LoginPage loginPage = new LoginPage(driver);
		HomePage homePage =loginPage.loginToTheApplication(ExcelReader.excelreading().get("userName"),ExcelReader.excelreading().get("password"));
		Helper.screenShot();
		Helper.waitTo(3);
		homePage.logoutFromApplication();
		
		/*
 		driver.findElement(By.id("username")).sendKeys("srinivas@cisolutions.com");
		driver.findElement(By.name("pw")).sendKeys("Selenium@1");
		driver.findElement(By.cssSelector("#Login")).click();
		driver.findElement(By.xpath("//div[@id='userNav-arrow']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		 */
		
		/*
		 LoginPage loginPage = new LoginPage(driver);
		loginPage.loginToTheApplication();
		Thread.sleep(5000);
		HomePage homePage = new HomePage(driver);
		homePage.logoutFromApplication();
		 */
		
	}

	@Test
	public void loginAndCreateLead() throws FileNotFoundException, IOException {
	
		LoginPage loginPage = new LoginPage(driver);
		HomePage homePage = loginPage.loginToTheApplication();
		Helper.screenShot();
		Helper.waitTo(3);
		LeadsPage leadsPage = homePage.clickOnTheLeadsTab().
				clickOnNewLeadButton().
				fillTheLeadInfo(ExcelReader.excelreading().get("fName"), ExcelReader.excelreading().get("lName"), ExcelReader.excelreading().get("cName"), ExcelReader.excelreading().get("description")).
				createLeadClickOnSaveButton();
		Helper.screenShot();
		/*
		 		LeadsPage leadsPage = homePage.clickOnTheLeadsTab().
				clickOnNewLeadButton().
				fillTheLeadInfo(excelreading().get("fName"), excelreading().get("lName"), excelreading().get("cName"), excelreading().get("description")).
				createLeadClickOnSaveButton();
		 */
		Helper.waitTo(3);
		homePage.logoutFromApplication();
		/*
		 LeadsPage leadsPage = homePage.clickOnTheLeadsTab();
		Thread.sleep(2000);
		leadsPage.clickOnNewLeadButton();
		Thread.sleep(2000);
		leadsPage.fillTheLeadInfo();
		leadsPage.createLeadClickOnSaveButton();
		 */
		/*
		 driver.findElement(By.id("username")).sendKeys("srinivas@cisolutions.com");
		driver.findElement(By.name("pw")).sendKeys("Selenium@1");
		driver.findElement(By.cssSelector("#Login")).click();
		driver.findElement(By.xpath("//a[@title='Leads Tab']")).click();
		driver.findElement(By.xpath("//input[@title='New']")).click();
		driver.findElement(By.xpath("//input[@id='name_firstlea2']")).sendKeys("Kavitha");
		driver.findElement(By.xpath("//input[@id='name_lastlea2']")).sendKeys("VV");
		driver.findElement(By.xpath("//input[@id='lea3']")).sendKeys("CIS");
		WebElement leadStatus = driver.findElement(By.xpath("//select[@id='lea13']"));
		Select sel = new Select(leadStatus);
		sel.selectByIndex(2);
		driver.findElement(By.xpath("//textarea[@id='lea17']")).sendKeys("This is a new Lead");
		driver.findElement(By.xpath("(//input[@title='Save'])[2]")).click();
		driver.findElement(By.xpath("//div[@id='userNav-arrow']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		 */
		/*
		 	LoginPage loginPage = new LoginPage(driver);
		loginPage.loginToTheApplication();
		Thread.sleep(2000);
		HomePage homePage = new HomePage(driver);
		homePage.clickOnTheLeadsTab();
		Thread.sleep(2000);
		LeadsPage leadsPage = new LeadsPage(driver);
		leadsPage.clickOnNewLeadButton();
		Thread.sleep(2000);
		leadsPage.fillTheLeadInfo();
		leadsPage.createLeadClickOnSaveButton();
		Thread.sleep(2000);
		homePage.logoutFromApplication();
		 */
	}
}
