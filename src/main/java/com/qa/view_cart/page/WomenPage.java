package com.qa.view_cart.page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.view_cart.TestBase.TestBase;

public class WomenPage extends TestBase
{

	public WomenPage() throws IOException {
		PageFactory.initElements(driver, this);

}

	@FindBy(linkText  ="Women")
	WebElement womenButton;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[5]/div/div[1]/div/a[1]/img")
	WebElement prinntedDress;
	
	@FindBy(id ="group_1")
	WebElement size;
	
	@FindBy(xpath ="//*[@id=\"add_to_cart\"]/button/span")
	WebElement addToCart;
	
	@FindBy(xpath ="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
	WebElement proceedToCheckout1;
	
	@FindBy(xpath ="//*[@id=\"center_column\"]/p[2]/a[1]/span")
	WebElement proceedToCheckout2;
	
	@FindBy(id ="firstname")
	WebElement enterFirstName;
	
	@FindBy(id ="lastname")
	WebElement enterLastName;
	
	@FindBy(id  ="company")
	WebElement entercompany;
	
	@FindBy(id ="address1")
	WebElement enterAddress1;
	
	@FindBy(id ="address2")
	WebElement enterAddress2;
	
	@FindBy(id="city")
	WebElement enterCity;
	
	@FindBy(id="id_state")
	WebElement selectState;
	
	@FindBy(id="postcode")
	WebElement enterPostcode;
	
	@FindBy(xpath = "//*[@id=\"add_address\"]/div[10]")
	WebElement enterHomePhone;
	
	@FindBy(id ="phone_mobile")
	WebElement enterMobNumber;
	
	@FindBy(id="other")
	WebElement enterAdditionalInformation;
	
	@FindBy(id = "alias")
	WebElement assignAddress;
	
	@FindBy(xpath = "//*[@id=\"submitAddress\"]/span")
	WebElement saveButton;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button/span")
	WebElement Checkout1;
	
	@FindBy(id = "cgv")
	WebElement checkBox;
	
	@FindBy(xpath = "//*[@id=\"form\"]/p/button/span")
	WebElement Checkout2;
	
	@FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
	WebElement payByBankWire;
	
	@FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a")
	WebElement payByCheck;
	
	@FindBy(xpath = "//*[@id=\"cart_navigation\"]/button/span")
	WebElement iConfirmMyOrder;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a")
	WebElement viewOrderHistory;
	
	
	
	public void clickOnWomenButton() {
		womenButton.click();
	}
	
	public void clickOnPrinntedDress() {
		prinntedDress.click();
	}

	public void selectSizeOfDress() {
		Select select = new Select(size);
		select.selectByVisibleText("M");
	}
	
	
	public void clickOnAddTocart() {
		addToCart.click();
	}
	
	public void proceedToCheckoutBtn1() {
		proceedToCheckout1.click();
	}
	
	public void proceedToCheckoutBtn2() {
		proceedToCheckout2.click();
	}
	
	public void enterFirstName(String Fname) {
		enterFirstName.sendKeys(Fname);
	}
	
public void enterLastName(String Lname) {
	enterLastName.sendKeys(Lname);
	
}

public void enterCompanyName(String Cname) {
	entercompany.sendKeys(Cname);
}

public void enterAddress1(String address1) {
	enterAddress1.sendKeys(address1);
}

public void enterAddress2(String address2) {
	enterAddress2.sendKeys(address2);
}

public void enterCityname(String cityName) {
	enterCity.sendKeys(cityName);
}

public void selectState(String State) {
	Select select = new Select(selectState);
	select.selectByVisibleText(State);
	
}


public void enterPostcode() {
	enterPostcode.sendKeys("00000");
}

public void enterHomePhone(String phoneNo) {
	enterHomePhone.sendKeys(phoneNo);
}

public void enterMobNumber(String MoNo) {
	enterMobNumber.sendKeys(MoNo);
}

public void enterAdditionalInformation(String AdditionalInfo) {
	enterAdditionalInformation.sendKeys(AdditionalInfo);
}

public void assignAddress(String AssignAdd) {
	assignAddress.sendKeys(AssignAdd);	
}

public void clickOnSaveButton() {
	saveButton.click();
}

public void clicOnCheckout1() {
	Checkout1.click();
}

public void clickOnCheckBox() {
	checkBox.click();
}

public void clicOnCheckout2() {
	Checkout2.click();
}

public void clickOnPayByCheck() {
	payByCheck.click();
}

public void clickOnConfirmMyOrder() {
	iConfirmMyOrder.click();
}

public void viewOrderHistory() {
	viewOrderHistory.click();
}

}
