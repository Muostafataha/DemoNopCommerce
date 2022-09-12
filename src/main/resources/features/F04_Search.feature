@smoke
  Feature: F04_Search | user use search par to find different product
    Scenario Outline: Search by using product name
      Given user enter "<product_name>" in search par
      Then verify the url
      And Find number of product in search page
      And verify that the search result contain "<product_name>"
      Examples:
        | product_name |
        |     book     |
        |    laptop    |
        |     nike     |

    Scenario Outline: Search by using product sku
      Given user enter "<sku>" for product in search par
      Then select product from search result
      And verify that the "<sku>" is appear in product page
      Examples:
        |   sku   |
        |SCI_FAITH|
        |APPLE_CAM|
        |SF_PRO_11|