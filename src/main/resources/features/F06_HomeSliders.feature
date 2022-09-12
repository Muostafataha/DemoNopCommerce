@smoke
  Feature: F06_HomeSliders | select two slider from home page

    Scenario: first slider is clickable on home page
      When Click on first Slider
      Then assert that relative product for first slider is opened and url is changed

    Scenario: second slider is clickable on home page
      When Click on second Slider
      Then assert that relative product for second slider is opened and url is changed