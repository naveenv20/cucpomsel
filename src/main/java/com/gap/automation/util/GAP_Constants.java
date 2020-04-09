package com.gap.automation.util;

public class GAP_Constants {
	
	//paths
	
	
	public static final String CHROME_DRIVER_EXE="C:\\Seli\\browsers\\chromedriver.exe";
	public static final String FF_DRIVER_EXE="C:\\Seli\\browsers\\geckodriver.exe";
	
	
	// 
	public static final String REPORTS_PATH = null;
	public static final String TESTDATA_SHEET = null;
	public static final String TESTCASES_SHEET = null;
	
	
	
	
	public static final String BASE_PAGE_URL = "https://securest.medavie.bluecross.ca/mps/myportal/service/";
	
	
	// Login page
	public static final String username_xpath="//*[@id='username']";
	public static final String password_xpath="//*[@id='password']";
	public static final String login_btn_xpath="//*[@id='login']";
	public static final String English_link_xpath="//*[@id='commonActionsDiv']/ul/li[3]/a";
//	public static final String Enrolment_link_xpath="//span[contains(text(),'Enrolment')]";
	
	
	//Top Menu
	public static final String Enrolment_link_xpath="//span[contains(text(),'Enrolment')]";
	public static final String home_link_xpath="//nav[contains(@class,'wpthemeNavContainer1')]/ul/li[1]/a ";
	public static final String ContactUs_link_xpath="//span[contains(text(),'Contact Us')]";
	public static final String Updateview_link_xpath = "//nav[contains(@class,'wpthemeNavContainer2')]/ul/li[2]/a";
	
	
	//Update/View Member page
	public static final String member_search_LastName ="//input[contains(@id,'employeeLastName') and contains(@type,'text')]";
	public static final String member_search_FirstName = "//input[contains(@id,'employeeFirstName') and contains(@type,'text')]";
	public static final String member_search_CertNumber ="//div[contains(@id,'CertificateNumber') and contains(@class,'TextBox')]";
	public static final String member_search_Policy = "//select[contains(@id,'policyDropDown')]";
	public static final String member_search_Policy1 = "//button[contains(@id,'policyDropDown')]";

	public static final String member_search_Policy2="//label[contains(@class,'ui-corner-all')]/input[@value='";
	public static final String member_search_Policy3="']";
	
	public static final String member_search_Division ="//select[contains(@id,'divisionDropDown')]";
	public static final String member_search_Division1 = "//button[contains(@id,'divisionDropDown')]";
	
	public static final String member_search_Class = "//select[contains(@id,'policyClassDropDown')]";
	public static final String member_search_Class1 = "//button[contains(@id,'policyClassDropDown')]";
		
		
	public static final String member_search_Member_btn = "//span[contains(@id,'submit_button') and (@role='button')]";
	public static final String member_search_Member_results_table = "//table[contains(@id,'searchMemberResultsTable')]";
	
	public static final String search_Member_table_hearder_FN = "//table[contains(@id,'searchMemberResultsTable')]/thead/tr/th[3]";
	public static final String search_Member_table_hearder_LN = "//table[contains(@id,'searchMemberResultsTable')]/thead/tr/th[2]";
	public static final String  search_Member_table_hearder_ID = "//table[contains(@id,'searchMemberResultsTable')]/thead/tr/th[1]";
	public static final String  search_Member_table_body_ID = "//table[contains(@id,'searchMemberResultsTable')]/tbody/tr/td";
	public static final String  search_Member_table_body_FN = "//table[contains(@id,'searchMemberResultsTable')]/tbody/tr[1]/td[3]";
	public static final String  search_Member_table_body_LN = "//table[contains(@id,'searchMemberResultsTable')]/tbody/tr[1]/td[2]";
	public static final String  search_Member_table_body_FN1 = "//table[contains(@id,'searchMemberResultsTable')]/tbody/tr[";
			
	public static final String  search_Member_table_body_LN1 = "//table[contains(@id,'searchMemberResultsTable')]/tbody/tr[";
	public static final String  search_Member_table_body_FN2 = "]/td[3]";
	public static final String  search_Member_table_body_LN2 = "]/td[2]";
	
	
	
	
	
	
	
	
	
	
	
	
	
}
