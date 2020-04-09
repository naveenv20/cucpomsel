package com.gap.automation.session;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.gap.automation.base.BasePage;
import com.gap.automation.util.GAP_Constants;

public class UpdateViewMemberPage extends BasePage {
	
	WebDriver driver;

	@FindBy(xpath=GAP_Constants.member_search_LastName)
	//getting it from constants file
	public WebElement Search_LastName;
	
	
	@FindBy(xpath=GAP_Constants.member_search_FirstName)
	//getting it from constants file
	public WebElement Search_FirstName;
	
	@FindBy(xpath=GAP_Constants.member_search_CertNumber)
	//getting it from constants file
	public WebElement Search_CertNumber;
	
	@FindBy(xpath=GAP_Constants.member_search_Policy)
	//getting it from constants file
	public WebElement Search_Policy;
	
	@FindBy(xpath=GAP_Constants.member_search_Policy1)
	//getting it from constants file
	public WebElement Search_Policy1;
	
	@FindBy(xpath=GAP_Constants.member_search_Policy2)
	//getting it from constants file
	public WebElement Search_Policy2;
	
	@FindBy(xpath=GAP_Constants.member_search_Division)
	//getting it from constants file
	public WebElement Search_Division;
	
	
	@FindBy(xpath=GAP_Constants.member_search_Division1)
	//getting it from constants file
	public WebElement Search_Division1;
	
	@FindBy(xpath=GAP_Constants.member_search_Class)
	//getting it from constants file
	public WebElement Search_Class;
	
	
	@FindBy(xpath=GAP_Constants.member_search_Class1)
	//getting it from constants file
	public WebElement Search_Class1;
	
	@FindBy(xpath=GAP_Constants.member_search_Member_btn)
	//getting it from constants file
	public WebElement Search_Member_btn;
	
	@FindBy(xpath=GAP_Constants.member_search_Member_results_table)
	//getting it from constants file
	public WebElement Search_Member_results_table;
	
	
	
	@FindBy(xpath=GAP_Constants.search_Member_table_hearder_FN)
	//getting it from constants file
	public WebElement search_Member_table_hearder_FN;
	
	
	@FindBy(xpath=GAP_Constants.search_Member_table_hearder_LN)
	//getting it from constants file
	public WebElement search_Member_table_hearder_LN;
	
	
	@FindBy(xpath=GAP_Constants.search_Member_table_hearder_ID)
	//getting it from constants file
	public WebElement search_Member_table_hearder_ID;
	
	
	@FindBy(xpath=GAP_Constants.search_Member_table_body_ID)
	//getting it from constants file
	public WebElement search_Member_table_body_ID;
	
	
	@FindBy(xpath=GAP_Constants.search_Member_table_body_FN)
	//getting it from constants file
	public WebElement search_Member_table_body_FN;
	
	
	@FindBy(xpath=GAP_Constants.search_Member_table_body_LN)
	//getting it from constants file
	public WebElement search_Member_table_body_LN;
	
	
	
	
	
	
	public UpdateViewMemberPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	
	public UpdateViewMemberPage() {
		
	}
	
	
	public void SearchMember(String Policy,String Division,String Class,String FirstName,String LastName){
		genericKeywords.selectdropdown(Search_Policy,Policy);
		genericKeywords.selectdropdown(Search_Division,Division);
		genericKeywords.selectdropdown(Search_Class,Class);
		Search_FirstName.sendKeys(FirstName);
		Search_LastName.sendKeys(LastName);
		Search_Member_btn.click();
		
		
	}


	public void SearchMember(Hashtable<String, String> datavalue) {
		
		Enumeration enu=datavalue.keys();
		
		 while (enu.hasMoreElements()) { 
			 String temp=(enu.nextElement().toString().trim());
	            if(temp.equalsIgnoreCase("Policy")){
	            	
	            	
	            	
	            	
	            	
	            	
	            	
	            	Search_Policy1.click();
	            	try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
//	            	String abc_xpath=GAP_Constants.member_search_Policy2+"00036"+GAP_Constants.member_search_Policy3;
	            	
	            	String abc_xpath="//*[contains(@class,'ui-corner-all')]/span[contains(text(),'13622')]";
	            	genericKeywords.getelement(abc_xpath).click();
//	            	Search_Policy2.sendKeys("01022");
//	            	genericKeywords.selectdropdown(Search_Policy,datavalue.get("Policy"));
	            }
	            
		 }
		 enu=datavalue.keys();
		 while (enu.hasMoreElements()) { 
			 String temp=(enu.nextElement().toString().trim());	 
	            if(temp.equalsIgnoreCase("Division")){
//	            	genericKeywords.selectdropdown(Search_Division,datavalue.get("Division"));
	            	Search_Division1.click();
	            	String abc_xpath="//label[contains(@class,'ui-corner-all') and contains(@for,'divisionDropDown')]/span[contains(text(),'001')]";
	            	genericKeywords.getelement(abc_xpath).click();
//	            	
	            }
		 }
		 enu=datavalue.keys();
		 while (enu.hasMoreElements()) { 
			 String temp=(enu.nextElement().toString().trim());	 
	            if(temp.equalsIgnoreCase("Class")){
	            	
	            	Search_Class1.click();
	            	
//	            	genericKeywords.selectdropdown(Search_Class,datavalue.get("Class"));
	            	
	            	String abc_xpath="//label[contains(@class,'ui-corner-all') and contains(@for,'policyClassDropDown')]/span[contains(text(),'01')]";
	            	genericKeywords.getelement(abc_xpath).click();
	            	
	            }
	            
		 }
		 enu=datavalue.keys();
		 while (enu.hasMoreElements()) { 
			 String temp=(enu.nextElement().toString().trim());	 
	             if(temp.equalsIgnoreCase("FirstName")){
	            	Search_FirstName.sendKeys(datavalue.get("FirstName"));
	            } 
	            
	            if(temp.equalsIgnoreCase("LastName")){
	            	Search_LastName.sendKeys(datavalue.get("LastName"));
	            }
	        } 
		
		 Search_Member_btn.click();
		 genericKeywords.waitforelement(GAP_Constants.member_search_Member_results_table);
		 
		 
		 
		 
	}


	public void validatesearchresults(Hashtable<String, String> datavalue) {
		Enumeration enu=datavalue.keys();
		
		List<WebElement> e=genericKeywords.getelements(GAP_Constants.search_Member_table_body_ID);
		String Expected_firstname=datavalue.get("FirstName");
		String Expected_lastname=datavalue.get("LastName");
		for (int i=1;i<=e.size();i++){
			String FN_Xpath=GAP_Constants.search_Member_table_body_FN1+i+GAP_Constants.search_Member_table_body_FN2;
			String LN_Xpath=GAP_Constants.search_Member_table_body_LN1+i+GAP_Constants.search_Member_table_body_LN2;
			if(genericKeywords.gettext(genericKeywords.getelement(FN_Xpath)).equalsIgnoreCase(Expected_firstname)){
				if(genericKeywords.gettext(genericKeywords.getelement(LN_Xpath)).equalsIgnoreCase(Expected_lastname)){
					
					String actual_FName=genericKeywords.gettext(genericKeywords.getelement(FN_Xpath));
					String actual_Lname=genericKeywords.gettext(genericKeywords.getelement(LN_Xpath));
					
					
					Assert.assertEquals(actual_Lname, Expected_lastname);
					Assert.assertEquals(actual_FName, Expected_firstname);
					break;
				}
			}
		}
		
		
		
		
		
		
			 
		 }
		
	
	

}
