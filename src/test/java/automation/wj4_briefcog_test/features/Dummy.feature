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

Feature: i want o check and or wrt tags

Background: Lets invke browser and login
	Given i will invoke he browser
	Then i will login

  @smoke @E2e
  Scenario: lerts check drive brezza
    Given I will be inside the car
    When I start the car
    Then i will see the fuel gage
    
  @fast @E2e
  Scenario: lerts check drive Xuv300
    Given I will be inside the car Xuv300
    When I start the car
    Then i will see the fuel gage
  
   
  Scenario Outline: Drive the brezza car
    Given i willbe on the road
    When I check for the <gear> of the
    Then I will change to <number> gear
    
  @E2e
  Examples: 
     | gear | number  |
     |   3  | three   |
     |   4  | four    |
  @reg
  Examples: 
     | gear | number  |
     |   1  | first   |
     |   2  | second  |
