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
@Regression
Feature: Login Page Feature

  Background:
    Given I am the user of facebook application
  

  @Smoke @TestCaseNo:1
  Scenario: Login Page Valid Scenario
    When I enter username as "abc@gmail.com"
    And I enter password as "12345"
    Then I should be able to login successfully
    

  @TestCaseNo:2
  Scenario: Login Page Invalid Scenario
    When I enter username as "invalid_abc@gmail.com"
    And I enter password as "12345"
    Then I should not be able to login successfully
    
    
    @Smoke @TestCaseNo:3
    Scenario Outline: Scenario Outline feature check
    When I enter the user credUsername "<username>"
    And I enter the user credPassword "<password>"
    
    Examples:
    | username    | password        |
    | validUser1  | validPassword1  |
    | validUser2  | validPassword2  |

   