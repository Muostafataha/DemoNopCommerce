@smoke
  Feature: F07_FollowUS | you will find "Follow us" links at the end of the page
    Scenario: user opens facebook link
      When User select facebook icon
      Then verify that facebook tap is open

     Scenario: user opens twitter link
       When User select twitter icon
       Then verify that twitter tap is open

    Scenario: user opens rss link
      When User select rss icon
      Then verify that rss tap is open

    Scenario: user opens youtube link
      When User select youtube icon
      Then verify that youtube tap is open