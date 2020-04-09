package com.gap.automation.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gap.automation.base.BasePage;
import com.gap.automation.session.Enrolment_page;
import com.gap.automation.session.UpdateViewMemberPage;
import com.gap.automation.util.GAP_Constants;

public class TopMenuPage extends BasePage {
	
	//every page HAS A Top menu 
	//so encapsulation 
	
WebDriver driver;


@FindBy(xpath=GAP_Constants.home_link_xpath)
//getting it from constants file
public WebElement Home_link;

@FindBy(xpath=GAP_Constants.Enrolment_link_xpath)
//getting it from constants file
public WebElement Emrolment_link;


@FindBy(xpath=GAP_Constants.ContactUs_link_xpath)
//getting it from constants file
public WebElement ContactUs_link;


@FindBy(xpath=GAP_Constants.Updateview_link_xpath)
//getting it from constants file
public WebElement UpdateView_link;


@FindBy(xpath=GAP_Constants.member_search_LastName)
//getting it from constants file
public WebElement Search_LastName;





public TopMenuPage(WebDriver driver){
	this.driver=driver;
	
}
	
	/******
Common functions Below 
***/

public void logout(){
	
	System.out.println("Logout==============>");
	
}

public Object gotoEnrolment(){
	
	Object enrolmentPage;
	
	Emrolment_link.click();
	//waiting till the page navigation is done 
	genericKeywords.waitforelement(GAP_Constants.Updateview_link_xpath);
	enrolmentPage= new Enrolment_page(driver);
	PageFactory.initElements(driver, enrolmentPage);
	
	return enrolmentPage;
	
}

public Object gotoHome(){
	
	return null;
	
}


public Object ContactUs(){
	
	return null;
	
}


public Object gotoUpdateViewMember(){
	
	Object updateViewMemberPage;
	
	UpdateView_link.click();
	genericKeywords.waitforelement(GAP_Constants.member_search_LastName);
	
	
	
	
	updateViewMemberPage=new UpdateViewMemberPage();
	PageFactory.initElements(driver, updateViewMemberPage);
	
	return updateViewMemberPage;
	
}



}
