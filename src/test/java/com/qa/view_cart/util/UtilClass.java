package com.qa.view_cart.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
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
	
	
//	########################### get screenshot  #######################################
	
	
	public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException{
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		// after execution, you could see a folder "FailedTestsScreenshots"
		// under src folder
		String destination = System.getProperty("user.dir") + "\\FailedTestsScreenshots\\" + screenshotName + dateName
				+ ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
	}

	
	
//	############################# Use method for capture screen shot #####################################
public static String takeScreenshot(String testName) {
		
		File sourceScreenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destinationScreenshotFile = new File(System.getProperty("user.dir")+"\\Screenshots\\"+testName+".png");
		try {
			FileUtils.copyFile(sourceScreenshotFile, destinationScreenshotFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return destinationScreenshotFile.getAbsolutePath();
	
	}
		
		
		
//		######################################### Data Provider################################
		
	
		public Object[][] getDataFromExcel(String path, String excelName) throws IOException {
			String path1 = System.getProperty("user.dir");

			String path2 = "\\src\\main\\java\\com\\qa\\view_cart\\datasheet\\login.xlsx";
			FileInputStream excelPath = new FileInputStream(path);

			
			XSSFWorkbook actionOnExcel = new XSSFWorkbook(excelPath);
			XSSFSheet excelNo = actionOnExcel.getSheet(excelName);
			
			Object data[][]= new Object[excelNo.getLastRowNum()][excelNo.getRow(0).getLastCellNum()];
			for(int i=1;i<excelNo.getLastRowNum();i++) {
				for(int j=0;j<excelNo.getRow(1).getLastCellNum();j++) {
					System.out.println(excelNo.getRow(i).getCell(j).getStringCellValue());
					data[i][j] = excelNo.getRow(i).getCell(j).getStringCellValue();
				}
			
			}
			return data;
		}
		
		

//		###################### extent report ######################
		
		public static ExtentReports getExtentReport() {
			
			ExtentReports report = new ExtentReports();
			
			File extentReportFile = new File(System.getProperty("user.dir")+"\\ExtentReports\\eReport.html");
			
			ExtentSparkReporter sparkReporter = new ExtentSparkReporter(extentReportFile);
			
			report.attachReporter(sparkReporter);
			
			return report;
			
		}
}
