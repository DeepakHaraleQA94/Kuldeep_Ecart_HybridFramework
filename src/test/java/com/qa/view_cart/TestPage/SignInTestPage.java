package com.qa.view_cart.TestPage;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.view_cart.TestBase.TestBase;
import com.qa.view_cart.page.SignInPage;

public class SignInTestPage extends TestBase {
	SignInPage signIn;
	public SignInTestPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@BeforeMethod
	public void setup() throws IOException {
		Initialization();
		 signIn = new SignInPage();
	}
	
	@Test
	public void validateSignInPage() {
		signIn.openSignInPage();
		signIn.enterEmail(prop.getProperty("uname"));
		signIn.enterPass(prop.getProperty("pass"));
		signIn.clickOnSignInBtn();
		
	}
	

	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
}
