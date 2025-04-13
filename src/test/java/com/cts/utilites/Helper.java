package com.cts.utilites;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cts.basepackage.BaseTest;

public class Helper extends BaseTest{
	
	public static String getCurrentTime() {
		DateFormat dateFormat = new SimpleDateFormat("YYYY_MM_dd_HH_mm_ss");
		Date d = new Date();
		return dateFormat.format(d);
	}
	public static void screenShot() {
		String path = System.getProperty("user.dir")+"\\ScreenShots\\SalesForce_"+getCurrentTime()+".png";
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(srcFile, new File(path));
		} catch (IOException e) {
			System.out.println("Failed to Capture the screen shot");
		}

	}

	public static void waitTo(long seconds) {
		try {
			Thread.sleep(1000*seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static WebElement waitForWebElement(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(element));
		return ele;
	}
	public static WebElement waitForWebElement(WebDriver driver, By byLocator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(byLocator));
		return ele;
	}
	public static WebElement waitForWebElement(WebDriver driver, By byLocator, int time) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(byLocator));
		return ele;
	}
	
	public static void acceptAlert(WebDriver driver, int time) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.alertIsPresent()).accept();
	}
	public static void dismissAlert(WebDriver driver, int time) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.alertIsPresent()).dismiss();
	}
}
