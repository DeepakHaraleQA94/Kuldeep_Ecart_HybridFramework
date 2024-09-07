package com.qa.view_cart.TestBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.configuration.Config;

public class TestBase {
	public static Properties prop;
	public static WebDriver driver;

	
	public TestBase() throws IOException{
		 prop = new Properties();
		 String  BasePath = System.getProperty("user.dir");
		String endpoint = "\\src\\main\\java\\com\\qa\\view_cart\\properties\\Config.proprties";
		FileInputStream path = new FileInputStream(BasePath+endpoint);
	prop.load(path);
	}
	
	public static void Initialization() {
		

		String checkBrowser = prop.getProperty("BrowserName");
		if(checkBrowser.equals("chrome")) {
			driver = new ChromeDriver();
		}else if(checkBrowser.equals("FireFox")) {
			driver = new FirefoxDriver();
		}else if(checkBrowser.equals("edge")) {
			driver = new EdgeDriver();
		}else {
			System.out.println("Somthiong went wrong... please check browser name");
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		driver.get(prop.getProperty("Url"));
		
	}
	
	
	

}
