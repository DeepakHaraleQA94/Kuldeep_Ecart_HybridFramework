package com.qa.view_cart.TestPage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.view_cart.TestBase.TestBase;
import com.qa.view_cart.page.SignUpPage;
import com.qa.view_cart.util.UtilClass;

public class SignUpTestPage extends TestBase{
	SignUpPage signup;
	
	String path1 = System.getProperty("user.dir");
	String path2 = "\\src\\main\\java\\com\\qa\\view_cart\\datasheet\\SignUp.xlsx";
	String BookName ="Sheet1";
	public SignUpTestPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void setup() throws IOException {
		Initialization();
		signup = new SignUpPage();
	}
	
	@DataProvider
	public Object[][] getdata() throws IOException {
		UtilClass util = new UtilClass();
		Object[][] data = util.getDataFromExcel(path1+path2,BookName);
		     return data;                            
	}
	
	@Test(dataProvider = "getdata")
	public void validateSignUpPage(String Fname, String Lname, String Pass) throws InterruptedException {
		signup.clickOnSignIn();
		String actual = driver.getTitle();
		Assert.assertEquals(actual, "Login - My Shop");
		Thread.sleep(6000);
		signup.enterEmail();
		signup.clickOnCreateAcc();
		Thread.sleep(3000);
		signup.clickOnGender();
		signup.enterFirstName(Fname);
		signup.enterLastName(Lname);
		signup.enterSignupPassword(Pass);
		signup.DOB1(1);
		signup.DOB2(2);
		signup.DOB3(3);
		signup.clickOnsubmit();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	

	
}
