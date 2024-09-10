package com.qa.view_cart.util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import com.aventstack.extentreports.reporter.configuration.Theme;

import com.qa.view_cart.TestBase.TestBase;
import com.qa.view_cart.page.SignInPage;

public class UtilClass extends TestBase {

	public static SignInPage signIn;
	
	
	public UtilClass() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

//	######################## Sign In Page functinality #################################
	
	
	
	public void SignInPageFunctinality() throws IOException {
	    signIn = new SignInPage();
	   
		signIn.openSignInPage();
		signIn.enterEmail(prop.getProperty("uname"));
		signIn.enterPass(prop.getProperty("pass"));
		signIn.clickOnSignInBtn();
		
		
	}
	
	
//	########################### extent Report #######################################
	
	

	TestBase testbase;
	ExtentSparkRepoter  htmlReporter;
	ExtentReports reports;
	ExtentTest test;
	
	public void configureReport()
	{
		
		String timestamp = new SimpleDateFormat("yyyy.mm.dd.hh.mm.ss").format(new Date());
		String reportName = "MyStoreTestReport-" + timestamp + ".html";
		htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "//Reports//" + reportName);
		reports = new ExtentReports();
		reports.attachReporter(htmlReporter);
		
		//add system information/environment info to reports
		reports.setSystemInfo("Machine:", "testpc1");
		reports.setSystemInfo("OS", "windows 11");
//		reports.setSystemInfo("browser:", testbase.Initilization());
		reports.setSystemInfo("user name:", "Prachi");
		
		//configuration to change look and feel of report
		htmlReporter.config().setDocumentTitle("Extent Listener Report Demo");
		htmlReporter.config().setReportName("This is my First Report");
		htmlReporter.config().setTheme(Theme.STANDARD);
		
		
	}

	
	
//	############################# user method to capture screen shot #####################################
		public File captureScreenShot(String testName) throws IOException {
			// step1: convert webdriver object to TakesScreenshot interface
			TakesScreenshot screenshot = ((TakesScreenshot) driver);

			// step2: call getScreenshotAs method to create image file

			File src = screenshot.getScreenshotAs(OutputType.FILE);

			File dest = new File(System.getProperty("user.dir") + "\\listner\\" + testName + ".png");

			// step3: copy image file to destination
			FileUtils.copyFile(src, dest);

			return dest;
		}	
	
}
