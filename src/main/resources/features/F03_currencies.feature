@smoke
  Feature: F03_currencies | Select Euro currency from the dropdown list on the top left of home page

    Scenario: Select Euro currency from the dropdown list and verify Euro Symbol (€) is shown
      Then User select Euro currency from dropdown list
      And verify euro symbol is shown in 4 product in display