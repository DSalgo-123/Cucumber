Feature: Feature to test Dsalgo portal

  Scenario: Accessing into dsalgo homepage
    Given browser is open
    When User is on dsalgo portal page
    And Clicks on GetStarted button
    Then User has navigated to the dsalgo home page