@MemberView
Feature: Perform the basic GAP operations 
  I want to use this template for my feature file
  
  
Background:  
#	Given user successfully logs into the GAP portal

  
  
  Scenario Outline: Check the Member Add feature
  	Given The user is in the landing page
    Then User clicks on the Enrollment link 
    Then User cliks on the add member link and navigates to member add page 
    And User selects the policy,divisio,class,plan and provided the members details
    	| Policy | Division |Class|Plan|FirstName|LastName|DOB|Address 1|Address 2|City|Province|Postal Code|Gender|Language|Permanent Date Employed|Application Date|
     
    And User provides the Employee Firstname: "<FirstName>" and Lastname: "<LastName>" 
    
    
    And User Performs the Search Option
    Then User validates the search results 