Feature: feature to test Register link

  @tag
  Scenario Outline: login fail-possible combinations
    Given user navigates to Register page
    When User will  Enter "priya" in the Username field
    And user will Enter "1234" in the Password field
    And User will Enter "1234" in the Password Confirmation Field
    And user clicks Register button
    Then User get Loginfailed message

  @tag1
  Scenario Outline: login Success-possible combinations
    Given user navigates to Register page
    When User will  Enter "Dsalgo@146" in the Username field
    And user will Enter "Gpss@146" in the Password field
    And User will Enter "Gpss@146" in the Password Confirmation Field
    And user clicks Register button
    Then User get success message
