package com.qa.view_cart.page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.view_cart.TestBase.TestBase;

public class HomePage extends TestBase {

	public HomePage() throws IOException {
		PageFactory.initElements(driver, this);

}
	
	@FindBy(className = "home")
	WebElement HomePageButton;

	@FindBy(xpath="//*[@id=\"contact-link\"]/a")
	WebElement contactUs;
	
	@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")
	WebElement signOut;
	
	@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")
	WebElement profileName;
	
	@FindBy(xpath="//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/b")
	WebElement cart;
	
	@FindBy(xpath="//*[@id=\"search_query_top\"]")
	WebElement searchBox;
	
	@FindBy(xpath="//*[@id=\"searchbox\"]/button")
	WebElement searchButton;
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	WebElement womenPage;
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	WebElement dressPage;
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	WebElement tshirtPage;
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[4]/a")
	WebElement blogpage;
	
	@FindBy(xpath="//*[@id=\"homeslider\"]/li[3]/div/p[2]/button")
	WebElement shopnowButton;
	
	@FindBy(xpath="//*[@id=\"home-page-tabs\"]/li[1]/a")
	WebElement popularButton;
	
	@FindBy(xpath="//*[@id=\"home-page-tabs\"]/li[2]/a")
	WebElement bestSellerButton;
	
	@FindBy(xpath="//*[@id=\"newsletter_block_left\"]/h4")
	WebElement newsLetter;
	
	@FindBy(xpath="//*[@id=\"newsletter-input\"]")
	WebElement enterEmail;
	
	@FindBy(xpath="//*[@id=\"footer\"]/div/section[2]/h4")
	WebElement category;
	
	@FindBy(xpath="//*[@id=\"block_various_links_footer\"]/h4")
	WebElement information;
	
	@FindBy(xpath="//*[@id=\"footer\"]/div/section[5]/h4/a")
	WebElement myAccount;
	
	@FindBy(xpath="//*[@id=\"social_block\"]/h4")
	WebElement followUs;
	
	@FindBy(xpath="//*[@id=\"block_contact_infos\"]/div/h4")
	WebElement storeInformation;
	
	public void clickOnHomePageButton()
	{
		HomePageButton.click();
	}
	
	public void contactUsVisible()
	{
		System.out.println(contactUs.isDisplayed());
	}
	
	public void signOutVisible()
	{
		System.out.println(signOut.isDisplayed());
	}
	public void profileNameVisible()
	{
		System.out.println(profileName.isDisplayed());
	}
	public void cartVisible()
	{
		System.out.println(cart.isDisplayed());
	}
	public void searchBoxVisible()
	{
		System.out.println(searchBox.isDisplayed());
	}
	public void searchButtonVisible()
	{
		System.out.println(searchButton.isDisplayed());
	}
	public void womenPageVisible()
	{
		System.out.println(womenPage.isDisplayed());
	}
	public void dressPageVisible()
	{
		System.out.println(dressPage.isDisplayed());
	}
	public void tshirtPageVisible()
	{
		System.out.println(tshirtPage.isDisplayed());
	}
	public void blogpageVisible()
	{
		System.out.println(blogpage.isDisplayed());
	}
	public void shopnowButtonVisible()
	{
		System.out.println(shopnowButton.isDisplayed());
	}
	public void popularButtonVisible()
	{
		System.out.println(popularButton.isDisplayed());
	}
	public void bestSellerButtonVisible()
	{
		System.out.println(bestSellerButton.isDisplayed());
	}
	public void newsLetterVisible()
	{
		System.out.println(newsLetter.isDisplayed());
	}
	public void enterEmailVisible()
	{
		System.out.println(enterEmail.isDisplayed());
	}
	public void categoryVisible()
	{
		System.out.println(category.isDisplayed());
	}
	public void informationVisible()
	{
		System.out.println(information.isDisplayed());
	}
	public void myAccountVisible()
	{
		System.out.println(myAccount.isDisplayed());
	}
	public void followUsVisible()
	{
		System.out.println(followUs.isDisplayed());
	}
	public void storeInformationVisible()
	{
		System.out.println(storeInformation.isDisplayed());
	}
	
	
	
}
