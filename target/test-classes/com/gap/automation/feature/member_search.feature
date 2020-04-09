@MemberView
Feature: Perform the basic GAP operations 
  I want to use this template for my feature file


	Background:  
#	Given user successfully logs into the GAP portal

  
  
  Scenario Outline: Title of your scenario outline
  	Given The user is in the landing page
    Then User clicks on the Enrollment link 
    Then User cliks on the update/View member link and navigates to member search page 
    And User select the policy: "<Policy>" , division: "<Division>", class: "<Class>"
    
    
    And User provides the Employee Firstname: "<FirstName>" and Lastname: "<LastName>" 
    
    
    And User Performs the Search Option
    Then User validates the search results
    

    Examples: 
      | Policy  | Division | Class  |FirstName  |LastName|
      | 13622   |  001     | 01     |GESTYUI|GESTYUI    |
