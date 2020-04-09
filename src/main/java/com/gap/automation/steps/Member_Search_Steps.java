package com.gap.automation.steps;

import java.util.Hashtable;

import org.openqa.selenium.support.PageFactory;

import com.gap.automation.pages.Launchpage;
import com.gap.automation.pages.Loginpage;
import com.gap.automation.session.Enrolment_page;
import com.gap.automation.session.Landingpage;
import com.gap.automation.session.UpdateViewMemberPage;
import com.gap.automation.util.SeleniumDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Member_Search_Steps  {
	


Loginpage loginPage;
Landingpage landingPage;
Enrolment_page enrolmentPage;
UpdateViewMemberPage  updateViewMemberPage;
Hashtable<String,String> datavalue=new Hashtable<String,String>();

	
	
	public  Member_Search_Steps() {
		
		
		
	}
	
	@Given("The user is in the landing page")
	public void The_user_is_in_the_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
		 Launchpage lauchPage=new Launchpage(SeleniumDriver.getDriver());
		   PageFactory.initElements(SeleniumDriver.getDriver(), lauchPage);
		   
		   loginPage=lauchPage.gotologicpage();
			
		landingPage=(Landingpage) loginPage.dologin();
		
	}
	
	@Then("User clicks on the Enrollment link")
	public void user_clicks_on_the_Enrollment_link() {
	    // Write code here that turns the phrase above into concrete actions
		
		enrolmentPage=(Enrolment_page) landingPage.gettopMenu().gotoEnrolment();
		 
	}

	@Then("User cliks on the update\\/View member link and navigates to member search page")
	public void user_cliks_on_the_update_View_member_link_and_navigates_to_member_search_page() {
	    // Write code here that turns the phrase above into concrete actions
		updateViewMemberPage=(UpdateViewMemberPage) landingPage.gettopMenu().gotoUpdateViewMember();
	}

	@And("User select the policy: {string} , division: {string}, class: {string}")
	public void user_select_the(String Policy, String Division, String Class) {
	    // Write code here that turns the phrase above into concrete actions
		datavalue.put("Policy", Policy);
		datavalue.put("Division", Division);
		datavalue.put("Class", Class);
		
		
		
	}

	@And("User provides the Employee Firstname: {string} and Lastname: {string}")
	public void user_provides_the_Employee_fn_and_ln(String FirstName, String LastName) {
	    // Write code here that turns the phrase above into concrete actions
		datavalue.put("FirstName", FirstName);
		datavalue.put("LastName", LastName);
		
	}

	@And("User Performs the Search Option")
	public void user_Performs_the_Search_Option() {
	    // Write code here that turns the phrase above into concrete actions
		updateViewMemberPage.SearchMember(datavalue);
	}

	@Then("User validates the search results")
	public void user_validates_the_search_results() {
		updateViewMemberPage.validatesearchresults(datavalue);
	   
	}

}
