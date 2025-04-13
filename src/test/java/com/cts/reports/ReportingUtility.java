package com.cts.reports;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.cts.basepackage.BaseTest;

public class ReportingUtility extends BaseTest implements ITestListener {

	public ExtentSparkReporter sparkReporter; // Create HTML Files
	public ExtentReports extent; // System Information
	public ExtentTest test; // updation of test status in Reports

	public void onStart(ITestContext context) {
		// Before <test> tag of XML file
		DateFormat dateFormat = new SimpleDateFormat("YYYY_MM_dd_HH_mm_ss");
		Date d = new Date();
		String filePath = dateFormat.format(d);
		//C:\Users\A1\Desktop\Workspace\HybridFrameWork\src\test\resources\MyReports
		sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "\\src\\test\\resources\\MyReports\\MyExtenetReport_"+filePath+".html");
		sparkReporter.config().setDocumentTitle("Automation Report");
		sparkReporter.config().setTheme(Theme.DARK);
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		extent.setSystemInfo("Environment ", "QA");
		extent.setSystemInfo("Automation Tester", "Kavitha");
		extent.setSystemInfo("Build No: ", "CIS-1234Ver");
		extent.setSystemInfo("Oraganization : ", "CTS");
	}

	public void onTestStart(ITestResult result) {
		
		
	}

	public void onTestSuccess(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.PASS, "Test case is Passed.." + result.getName());
	}

	public void onTestFailure(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.FAIL, "Test case is failed.." + result.getName());
		

	}

	public void onTestSkipped(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.SKIP, "Test case is skipped.." + result.getName());
	}


	public void onFinish(ITestContext context) {
		extent.flush();		
	}

}
