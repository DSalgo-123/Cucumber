Feature: feature to test DSalgo Homepage

  Scenario: Register user can access the portal
    Given user is on dsalgo homepage
    When user clicks on Datastructure dropdown
    Then user can see six different datastructure entries
    And user Selects each entries from dropdown
    Then alertmessage is showing as' You are not logged in'

  Scenario: Accessing Getstarted button in Datastructure topics
    Given User is on Dsalgo homepage
    When User clicks Getstarted button in Datastructure topics
    Then alertmessage is showing as' You are not logged in'

  Scenario: User clicks Register link
    Given user is on dsalgo portal homepage
    When user clicks Register link
    Then User will redirect to register page

  Scenario: User clicks signin link
    Given user is on dsalgo portal homepage
    When user clicks sign in link
    Then User will redirect to login page
