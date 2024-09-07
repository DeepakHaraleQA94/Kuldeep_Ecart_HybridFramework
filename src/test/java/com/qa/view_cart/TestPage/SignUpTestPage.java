package com.qa.view_cart.TestPage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.view_cart.TestBase.TestBase;
import com.qa.view_cart.page.SignUpPage;

public class SignUpTestPage extends TestBase{
	SignUpPage signup;
	public SignUpTestPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void setup() throws IOException {
		Initialization();
		signup = new SignUpPage();
	}
	
	@Test
	public void validateSignUpPage() throws InterruptedException {
		signup.clickOnSignIn();
		String actual = driver.getTitle();
		Assert.assertEquals(actual, "Login - My Shop");
		Thread.sleep(6000);
		signup.enterEmail();
		signup.clickOnCreateAcc();
		Thread.sleep(3000);
		signup.clickOnGender();
		signup.enterFirstName("dipak");
		signup.enterLastName("xyz");
		signup.enterSignupPassword("ast123");
		signup.DOB(4, 6, 5);
		signup.clickOnsubmit();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	

	
}
