@smoke
  Feature: F05_HoverCategories | select random category from main categories and select random sub categories

    Scenario: Select random main categories and random sub categories
      Given mouse hover at random main categories
      Then Select random sub categories
      And verify that the page title is opened equal the sub category is selected

