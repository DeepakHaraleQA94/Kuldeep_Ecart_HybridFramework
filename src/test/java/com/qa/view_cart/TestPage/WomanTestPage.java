package com.qa.view_cart.TestPage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.view_cart.TestBase.TestBase;
import com.qa.view_cart.page.SignInPage;
import com.qa.view_cart.page.WomenPage;
import com.qa.view_cart.util.UtilClass;

public class WomanTestPage extends TestBase{
	SignInPage signIn;
	UtilClass util;
	 WomenPage women;
	public WomanTestPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void setup() throws IOException {
		Initialization();
//		signIn = new SignInPage();
	 util = new UtilClass();
	 util.SignInPageFunctinality();
	  women = new WomenPage();
	}

	@Test
	public void validateWomenFunctionality() throws InterruptedException {
		women.clickOnWomenButton();
		women.clickOnPrinntedDress();
		Thread.sleep(3000);
		Assert.fail();
		women.selectSizeOfDress();
		women.clickOnAddTocart();
		
	}
	
	
//	@AfterMethod
//	public void tearDown() {
//		driver.close();
//		driver.quit();
//	}
}
