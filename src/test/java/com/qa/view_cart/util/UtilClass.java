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
		
		
		
//		######################################### Data Provider################################
		@Test
	
		public void getDataFromExcel() throws IOException {
			String path1 = System.getProperty("user.dir");
//			System.out.println(path1);
			String path2 = "\\src\\main\\java\\com\\qa\\view_cart\\datasheet\\login.xlsx";
//			FileInputStream excelPath = new FileInputStream(path1+path2);
			FileInputStream excelpath = new FileInputStream("C:\\ATT\\All Repository\\TDDFrameWork-Ali\\src\\main\\java\\com\\jala\\qa\\testdata\\Excel.xlsx");
			
			XSSFWorkbook actionOnExcel = new XSSFWorkbook(excelpath);
			XSSFSheet excelNo = actionOnExcel.getSheet("Sheet1");
			
			Object data[][]= new Object[excelNo.getLastRowNum()][excelNo.getRow(0).getLastCellNum()];
			for(int i=1;i<excelNo.getLastRowNum();i++) {
				for(int j=0;j<excelNo.getRow(0).getLastCellNum();j++) {
					System.out.println(excelNo.getRow(i).getCell(j).getStringCellValue());
//					data[i][j] = excelNo.getRow(i).getCell(j).getStringCellValue();
				}
			
			}
		}
		
		
	
}
