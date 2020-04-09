package com.gap.automation.steps;

import org.openqa.selenium.WebElement;

import com.gap.automation.pages.Launchpage;
import com.gap.automation.util.GenericKeywords;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Basic_login_Steps  {
	
	
	private GenericKeywords genericKeywords;
	
	
	public  Basic_login_Steps() {
		this.genericKeywords=GenericKeywords.getGenericKeywords();
		
	}
	

	@Given("I have opened the Chrome Browser")
	public void i_have_opened_the_Chrome_Browser() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Given ===>");
//	    genericKeywords.openBrowser();
	    
	    
	}

	@And("I have navigated to the URL")
	public void i_have_navigated_to_the_URL() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("And ===>");
		 genericKeywords.navigate("GAP_URL");
	}

//	@And("Provided the {string}")
	 @And("^Provided the \"([^\"]*)\"$")
	public void provided_the(String string) {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("And2 ===>"+string);
		 genericKeywords.type("username_xpath", string);
	}

//	@And("also Provided the {string}")
	@And("^also Provided the \"([^\"]*)\"$")
	public void also_Provided_the(String string) {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("And3 ===>"+string);
		 genericKeywords.type("password_xpath", string);
	}

	@Then("Click on the Login button")
	public void click_on_the_Login_button() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Then ===>");
		 genericKeywords.click("login_btn_xpath");
	}

	@Then("Whether the login is successful")
	public void whether_the_login_is_successful() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Then2 ===>");
		
		WebElement e=genericKeywords.getelement("enrolment_lnk_xpath");
		
		if(e==null){
			genericKeywords.reportFailure("login not successfull");
		}
		else{
			System.out.println("Successfull$$$$$$$$$$$$$$$$$$$");
		}
		
	}


}
