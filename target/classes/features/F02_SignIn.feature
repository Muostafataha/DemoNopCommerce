@smoke
  Feature: F02_SignIn | Users could use login functionality to use their accounts

    #testCase 1
  Scenario: user could login with valid email and password
    Given user go to login page
    And user login with valid email and password
    Then user press on login button
    And verify signIn successes

    #testCase 2
  Scenario: user could login with Invalid email and password
    Given user go to login page
    And user login with Invalid email and password
    Then user press on login button
    And verify signIn is not successes