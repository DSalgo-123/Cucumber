Feature: feature to test Sign in link

  @tag
  Scenario Outline: login fail-possible combinations
    Given user is in Dsalgo homepage
    When user click signin button it should be directed to login page
    Then user enter Username and password
    And user clicks loginbutton it should redirected to Dsalgohomepage
    Then User get alertmessage as "you are not logged in"

  @tag1
  Scenario Outline: login Success-possible combinations
    Given user is on  Dsalgo homepage
    When user click signin button it should be directed to Dsalgologin page
    Then user enter Username and password in login page
    And user clicks loginbutton it should redirected to homepage
    Then User get alertmessage as "you are logged in" in home page
