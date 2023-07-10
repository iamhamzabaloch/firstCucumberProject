#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@login @regression
Feature: facebook app user management
	Users with permission should be able interact
	with the application on successfull login

  @validLogin @loginTests @smokeTest
  Scenario: Successful login
  Given AS a user, i am on the login page
  When I enter valid username and valid password
  And i click on the login button 
  Then i should be on user profile page

  @invalidLogin @loginTests
  Scenario: invalid username and login
    Given As a user, I am on the login page
    When I enter a invalid username and valid password
    And i click on login button
    Then I should see an error message 
    And I should not be logged in

    
