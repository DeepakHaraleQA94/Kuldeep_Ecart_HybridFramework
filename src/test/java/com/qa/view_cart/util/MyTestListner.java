package com.qa.view_cart.util;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.qa.view_cart.TestBase.TestBase;


public class MyTestListner extends TestBase implements ITestListener {
	UtilClass util;
	ExtentReports report = UtilClass.getExtentReport();
	ExtentTest eTest;
public MyTestListner() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}



public void onTestStart(ITestResult result) {
	String testName = result.getName();
	eTest = report.createTest(testName);
	eTest.log(Status.INFO,testName+" execution started");
	
}
	
public void onTestSuccess(ITestResult result) {
	
	String testName = result.getName();
	eTest.log(Status.PASS,testName+" got successfully executed");
	
}
	


public void onTestFailure(ITestResult result) {
	
	String testName = result.getName();
	eTest.log(Status.FAIL,testName+" got failed");
	
	
	try {
		driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
	} catch (IllegalArgumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (NoSuchFieldException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SecurityException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	eTest.addScreenCaptureFromPath(util.takeScreenshot(testName),testName);
	eTest.log(Status.INFO,result.getThrowable());
}



public void onTestSkipped(ITestResult result) {
	
	String testName = result.getName();
	eTest.log(Status.SKIP,testName+" got skipped");
	eTest.log(Status.INFO,result.getThrowable());
	
}

public void onFinish(ITestContext context) {
	
	report.flush();
	
	File eReportFile = new File(System.getProperty("user.dir")+"\\ExtentReports\\eReport.html");
	
	try {
		Desktop.getDesktop().browse(eReportFile.toURI());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

}
