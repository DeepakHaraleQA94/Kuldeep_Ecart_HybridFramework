package com.qa.view_cart.util;

import java.io.IOException;

import org.testng.annotations.Test;

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

}
