@smoke
  Feature: F08_Wishlist | user could add products to wishlist
    Scenario: select wishlist for htc mobile and verify success message
      When user click the wishlist button for HTC
      Then verify that success message is appear

    Scenario: select wishlist for HTC and click on wishlist page
      When user click the wishlist button for HTC
      And click on wishlist button after successes message is disappear
      Then check that the quantity is bigger than 0