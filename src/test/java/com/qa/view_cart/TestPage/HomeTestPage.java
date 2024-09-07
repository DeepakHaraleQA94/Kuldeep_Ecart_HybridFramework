package com.qa.view_cart.TestPage;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.view_cart.TestBase.TestBase;
import com.qa.view_cart.page.HomePage;
import com.qa.view_cart.page.SignInPage;
import com.qa.view_cart.util.UtilClass;

public class HomeTestPage extends TestBase 

{
	SignInPage signIn;
	UtilClass util;
	HomePage home;
	public HomeTestPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void setup() throws IOException {
		Initialization();
		signIn = new SignInPage();
		
	 util = new UtilClass();
	 util.SignInPageFunctinality();
	
	home= new HomePage();
	}
	
	@Test
	public void validateHomepageElement() throws InterruptedException
	{
		home.clickOnHomePageButton();
		home.contactUsVisible();
		home.signOutVisible();
		home.profileNameVisible();
		home.cartVisible();
		home.searchBoxVisible();
		home.searchButtonVisible();
		home.womenPageVisible();
		home.dressPageVisible();
		home.tshirtPageVisible();
		home.blogpageVisible();
		Thread.sleep(10000);
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(home.shopnowButtonVisible());
		
		home.shopnowButtonVisible();
		home.popularButtonVisible();
		home.bestSellerButtonVisible();
		home.newsLetterVisible();
		home.enterEmailVisible();
		home.categoryVisible();
		home.informationVisible();
		home.myAccountVisible();
		home.followUsVisible();
		home.storeInformationVisible();
		
		
	}

	
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
