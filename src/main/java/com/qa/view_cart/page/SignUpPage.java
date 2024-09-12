package com.qa.view_cart.page;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.view_cart.TestBase.TestBase;

import net.bytebuddy.utility.RandomString;

public class SignUpPage extends TestBase {

	@FindBy(className = "login")
	WebElement clickOnSignIn;

	@FindBy(id = "email_create")
	WebElement enterMail;

	@FindBy(id = "SubmitCreate")
	WebElement createAccount;

	@FindBy(id = "id_gender1")
	WebElement titleMR;

	@FindBy(id = "id_gender2")
	WebElement titleMRs;

	@FindBy(id = "customer_firstname")
	WebElement Fname;

	@FindBy(id = "customer_lastname")
	WebElement Lname;

//	@FindBy(id = "email")
//	WebElement email;

	@FindBy(id = "passwd")
	WebElement pwd;

	@FindBy(id = "days")
	WebElement day;
	@FindBy(id = "months")
	WebElement month;

	@FindBy(id = "years")
	WebElement year;

	@FindBy(id = "submitAccount")
	WebElement submit;

	public SignUpPage() throws IOException{
		PageFactory.initElements(driver, this);
	}
	 
	 
	public void enterSignupEmail(String emailid) {
		enterMail.sendKeys(emailid);
	 }
	
	public void clickOnCreateAcc() {
		createAccount.click();
	}
		 public void clickOnSignIn() {
			 clickOnSignIn.click();
		 }
		 
		 public void enterEmail() {
			 String random = RandomString.make(5);
			 enterMail.sendKeys(random+"@gmail.com");
		 }
		 
		 public void createAccount() {
			 createAccount.click();
		 }
		 public void clickOnGender() 
		 
		 {
			if(prop.getProperty("gender").equals("mr"))
					{
				        titleMR.click();
					}
			else
			{
				titleMRs.click();
			}
		 }
		 
		 public String validateRadioButton()
		 {
			 if(titleMR.isSelected())
				 {
				    return "mr";
				 }
			 else
			 {
				 return "ms";
			 }
		 }
		 
		 public void enterFirstName(String fname) {
			 Fname.sendKeys(fname);
		 }
		 public void enterLastName(String lname) {
			 Lname.sendKeys(lname);
		 }
		 
		 public void enterSignupPassword(String pass) {
			 pwd.sendKeys(pass);
		 }
		 
		 public void DOB1(int days)
		 {
			 Select select = new Select(day);
			 select.selectByIndex(days);
			
		 }
		 
		 public void DOB2(int months)
		 {
			 
			 Select select1 = new Select(month);
			 select1.selectByIndex(months);
		 }
		 
		 public void DOB3(int years)
		 {
			 
			 
			 Select select2 = new Select(year);
			 select2.selectByIndex(years);
		 }

		public void clickOnsubmit() {
			submit.click();
		}
		
		// we will be contunuing further;
}
