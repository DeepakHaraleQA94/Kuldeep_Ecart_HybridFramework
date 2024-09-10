package com.qa.view_cart.util;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import com.qa.view_cart.TestBase.TestBase;

public class testListner extends TestBase implements ITestListener{

	
	UtilClass util;
	public testListner() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public void onStart(ITestContext Result)					
	{		
		
		System.out.println("On Start method invoked....");  		
	}	

	//onFinish method is called after all Tests are executed
	public void onFinish(ITestContext Result) 					
	{		
		System.out.println("On Finished method invoked....");  	
		
	}		



	// When Test case get failed, this method is called.		

	public void onTestFailure(ITestResult Result) 					
	{		
		
		System.out.println("Name of test method failed:" + Result.getMethod().getMethodName() );  		
		
		try {
			util = new UtilClass();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String timestamp = new SimpleDateFormat("dd.MM.yy.hh.mm.ss").format(new Date());
		try {
			util.captureScreenShot(Result.getName()+timestamp);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}		

	// When Test case get Skipped, this method is called.		

	public void onTestSkipped(ITestResult Result)					
	{		
		System.out.println("Name of test method skipped:" + Result.getName() );  		

		}			

	// When Test case get Started, this method is called.		

	public void onTestStart(ITestResult Result)					
	{		
		System.out.println("Name of test method started:" + Result.getName() );  		

	}		

	// When Test case get passed, this method is called.		

	public void onTestSuccess(ITestResult Result)					
	{		
		System.out.println("Name of test method sucessfully executed:" + Result.getName() ); 
		
		
		
		try {
			util = new UtilClass();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String timestamp = new SimpleDateFormat("dd.MM.yy.hh.mm.ss").format(new Date());
		try {
			util.captureScreenShot(Result.getName()+timestamp);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		}		


}
