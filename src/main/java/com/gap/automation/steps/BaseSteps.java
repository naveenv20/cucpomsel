package com.gap.automation.steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.gap.automation.pages.Launchpage;
import com.gap.automation.pages.Loginpage;
import com.gap.automation.util.GenericKeywords;
import com.gap.automation.util.SeleniumDriver;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;

public class BaseSteps {

	private Scenario scenario;
	private WebDriver driver;
	
	@Before
    public void setUp(Scenario scenario) {
		this.scenario=scenario;
		//ExtentCucumberFormatter.initiateExtentCucumberFormatter();
    	System.out.println("Before");
       SeleniumDriver.setUpDriver();
       this.driver=SeleniumDriver.getDriver();
       GenericKeywords.setUpGenericKeywords();
       
//       
    }
	
	
	@After
    public void tearDown(Scenario scenario) {
    	
		
		
    	WebDriver driver=SeleniumDriver.getDriver();
    	System.out.println(scenario.isFailed());
    	byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshotBytes, "image/png");
    	 if (scenario.isFailed()) {
    		 
    		 
    		 
    		 
             byte[] screenshotBytes111 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
             scenario.embed(screenshotBytes111, "image/png");
          
         }
    	 
    	 
    	 
    SeleniumDriver.tearDown();
    }
	
	
	
	@Given("user successfully logs into the GAP portal")
	public Object user_successfully_logs_into_the_GAP_portal() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("1");
	   Launchpage lauchPage=new Launchpage(SeleniumDriver.getDriver());
	   PageFactory.initElements(SeleniumDriver.getDriver(), lauchPage);
	   
	   Loginpage loginpage=lauchPage.gotologicpage();
	   
	   Object page=loginpage.dologin();
	   
	   if(page instanceof Loginpage){
			Assert.fail("Login failed");
			
			}
	   	return page;
	   
	      
	}
	
	
}
