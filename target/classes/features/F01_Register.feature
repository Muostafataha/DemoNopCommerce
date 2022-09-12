@smoke
  Feature: F01_register | Users could register with new accounts

    #Test Case 1
    Scenario: Guest user could registration with valid data successfully
      Given User go to register page
      And User select gender type
      And User enter first name and last name
      And User enter date of birth
      And User enter email
      And User fill password fields
      Then User click register
      And Validate that registration is successes