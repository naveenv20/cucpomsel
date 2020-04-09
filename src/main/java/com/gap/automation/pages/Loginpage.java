package com.gap.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.gap.automation.base.BasePage;
import com.gap.automation.session.Landingpage;
import com.gap.automation.util.GAP_Constants;


public class Loginpage extends BasePage{
	
	
	WebDriver driver;
	
//	@FindBy(xpath="//*[@id='email']")
	@FindBy(xpath=GAP_Constants.username_xpath)
	//getting it from constants file
	public WebElement userid;
	
	@FindBy(xpath=GAP_Constants.password_xpath)
	//getting it from constants file
	public WebElement password;
	
	
	@FindBy(xpath=GAP_Constants.login_btn_xpath)
	//getting it from constants file
	public WebElement Log_in_btn;
	
	@FindBy(xpath=GAP_Constants.English_link_xpath)
	//getting it from constants file
	public WebElement English_link;
	
	
	@FindBy(xpath=GAP_Constants.Enrolment_link_xpath)
	//getting it from constants file
	public WebElement Enrolment_link;
	
	
	
//	public Loginpage(WebDriver driver,ExtentTest test){
//		
//		super(driver,test);
////		test.log(Status.INFO, "LOGIN");
//	}
	
	public Loginpage(WebDriver driver){
		super(driver);
		this.driver=driver;
//		test.log(Status.INFO, "LOGIN");
	}
	
public Loginpage() {
		// TODO Auto-generated constructor stub
	}

	//	public landingpage dologin(String uname, String password){
	/*** same function returing either one class or other type**/	
		public Object dologin(){
			
			
			Object landingPage;
		//driver code for login
		userid.sendKeys("GAP2USER05");
		password.sendKeys("Welcome1");
		Log_in_btn.click();
		English_link.click();
		genericKeywords.waitforelement(GAP_Constants.Enrolment_link_xpath);
		if(genericKeywords.isElementPresent(GAP_Constants.Enrolment_link_xpath)){
		
		
			//login success then take the user to the landing page
//			landingPage= new landingpage(driver, test)	;
			landingPage= new Landingpage(driver);
			PageFactory.initElements(driver, landingPage);
//		landingPage=PageFactory.initElements(driver, landingpage.class);
		}
		else
			//login not sucess then returbr thge same login page for corrections
		{
			landingPage= new Loginpage(driver)	;
			PageFactory.initElements(driver, landingPage);
			
		
		}
		return landingPage;
		
		
	}

}
