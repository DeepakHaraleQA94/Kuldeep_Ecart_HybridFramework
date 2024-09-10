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
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
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
