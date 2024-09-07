package com.qa.view_cart.page;

import java.io.IOError;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.view_cart.TestBase.TestBase;

public class SignInPage extends TestBase {

	
	@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
    WebElement openSignInPage;
	
	@FindBy(id="email")
	WebElement enterEmailAddress;
	
	@FindBy(id="passwd")
	WebElement enterPassword;
	
	@FindBy(xpath="//*[@id=\"SubmitLogin\"]/span")
	WebElement signIn;
	
	public SignInPage() throws IOException{
		PageFactory.initElements(driver, this);
	}
	
	public void openSignInPage() {
		openSignInPage.click();	
	}
	
	public void enterEmail(String email) {
		enterEmailAddress.sendKeys(email);
	}
	
	public void enterPass(String pass) {
		enterPassword.sendKeys(pass);
	}
	
	
	public void clickOnSignInBtn() {
		signIn.click();
	}
	
	
}



