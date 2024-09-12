package com.qa.view_cart.TestPage;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.view_cart.TestBase.TestBase;
import com.qa.view_cart.page.SignInPage;
import com.qa.view_cart.util.UtilClass;

public class SignInTestPage extends TestBase {
	SignInPage signIn;
	
	String path1 = System.getProperty("user.dir");
	String path2 = "\\src\\main\\java\\com\\qa\\view_cart\\datasheet\\login.xlsx";
	String bookName ="Sheet2";
	
	public SignInTestPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@BeforeMethod
	public void setup() throws IOException {
		Initialization();
		 signIn = new SignInPage();
	}
	
//	@DataProvider
//	public Object[][] addData() {
//		Object data[][]= {{"xyz","pqr"},
//			                        {"abc","rts"}};
//		return data;
//	}
	
	@DataProvider
	public Object[][] addData() throws IOException {
		UtilClass util = new UtilClass();
		Object[][] data = util.getDataFromExcel(path1+path2, bookName);
		return data;
	}
	
	@Test(dataProvider = "addData")
	public void validateSignInPage(String uname, String pass ) {
		signIn.openSignInPage();
		signIn.enterEmail(uname);
		signIn.enterPass(pass);
		signIn.clickOnSignInBtn();
		
	}
	

	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
}
