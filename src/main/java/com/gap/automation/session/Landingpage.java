package com.gap.automation.session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.gap.automation.base.BasePage;


public class Landingpage extends BasePage{
	
	WebDriver driver;
	
//	public landingpage(WebDriver driver,ExtentTest test){
//		super(driver,test);
//		test.log(Status.INFO, "LANDING");
//	}
	
	
	public Landingpage(WebDriver driver){
		super(driver);
		this.driver=driver;
//		test.log(Status.INFO, "LANDING");
	}

	public Landingpage() {
		// TODO Auto-generated constructor stub
	}
	
//	public Profilepage gotoprofilepage(){
//		
//		//coming from BasePage common functonalities inside this
//				verifyTitle("landing page title");
//		
//		//driver code 
//		
//				Profilepage profilepage=new Profilepage(driver, test);
//						PageFactory.initElements(driver, profilepage);
////		Profilepage profilepage=PageFactory.initElements(driver, Profilepage.class);
//		
//		return profilepage;
//	}

}
