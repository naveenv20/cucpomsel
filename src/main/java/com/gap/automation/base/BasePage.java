package com.gap.automation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.gap.automation.common.TopMenuPage;
import com.gap.automation.util.GenericKeywords;



public class BasePage  {
	
	 public WebDriver driver;
	 public TopMenuPage topmenu;
//	 public ExtentTest test;
	 public GenericKeywords genericKeywords;
	

	
	
	
	public BasePage(){
		
		
		this.genericKeywords=GenericKeywords.getGenericKeywords();
		
	}
public BasePage(WebDriver driver){
		
		this.driver=driver;
		this.genericKeywords=GenericKeywords.getGenericKeywords();
		topmenu=new TopMenuPage(driver);
		PageFactory.initElements(driver, topmenu);
		
	}
	
	
	
	public boolean isElementpresent(String locator){
		 return true;
	}
	
	public TopMenuPage gettopMenu(){
		return topmenu;
	}
	
	
	
}
