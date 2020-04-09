#Author: your.email@your.domain.com
#Keywords Summary :

#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@smoke
Feature: Check the login of GAP
  This is used for checking the basic logging of the GAP application

  @tag1
  Scenario Outline: Check the login behaviour of GAP
    Given I have opened the Chrome Browser
    And I have navigated to the URL 
    And Provided the "<USER_ID>"
    And also Provided the "<PASSWORD>"
    Then Click on the Login button
    Then Whether the login is successful

  

    Examples: 
      | USER_ID  | PASSWORD |
      | GAP2USER02 |Welcome1|
     
