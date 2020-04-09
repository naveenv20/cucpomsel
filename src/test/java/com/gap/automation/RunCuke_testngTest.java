package com.gap.automation;









import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;






@CucumberOptions(features={"src/test/resources/com/gap/automation/feature"},
plugin={"json:target/cucumber.json","html:target/site/cucumber-pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},

	glue={"com.gap.automation.steps"},
//			glue={"com/learn/w2acucumber/stepDefinitions/"},
	monochrome=true,tags={"@MemberView"})
public class RunCuke_testngTest  extends AbstractTestNGCucumberTests{
	
	
	


	
	
	
	
	
}
