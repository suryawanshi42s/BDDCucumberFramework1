Feature: Login Functionality

 # Background:

  Scenario: TC1-Login with valid Credentials
    Given user is on Swag lab login
  When user enter username on swaglab login page "standard_user"
    And wait for 2 seconds
    And user enter password on swaglab login page "secret_sauce"
    And wait for 3 seconds
    And user click on login btn on swaglab login page
    And wait for 3 seconds
    Then home page visible with logo text "Swag Labs"
    And wait for 2 seconds

  Scenario: TC2-login with invalid credentials
    Given user is on Swag lab login
    When user enter username on swaglab login page "abc"
    And wait for 2 seconds
    And user enter password on swaglab login page "xyz"
    And wait for 3 seconds
   And user click on login btn on swaglab login page
    And wait for 3 seconds
   Then user can see error messgae "Epic sadface: Username and password do not match any user in this service"

