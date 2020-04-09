package com.gap.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.gap.automation.base.BasePage;
//import com.qtpselenium.fbook.pom.Util.FB_Constants;
//import com.qtpselenium.fbook.pom.base.BasePage;
import com.gap.automation.util.GAP_Constants;
import com.gap.automation.util.SeleniumDriver;

public class Launchpage extends BasePage{
	
	WebDriver driver;
	
//	public Launchpage(WebDriver driver,ExtentTest test){
//		
//		super(driver,test);
//		test.log(Status.INFO, "LAUNCH");
//	}
	
	
	
	

	public Launchpage(WebDriver driver){
		
		this.driver=driver;
		
	}
	
	public Loginpage  gotologicpage(){

		
		//driver code
//		driver.get("http://facebook.com");
		driver.get(GAP_Constants.BASE_PAGE_URL);
		
//		Loginpage loginpage=PageFactory.initElements(driver, Loginpage.class);
		
		Loginpage loginpage=new Loginpage(driver);
		PageFactory.initElements(driver, loginpage);
		
		return loginpage;
		
	}

}
