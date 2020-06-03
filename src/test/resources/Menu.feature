@test
Feature: check Menu page button

  Scenario Outline: Check launching app after sign in sign up for Menu Button Check
    When i open the app after sign in sign up
    Then i should get enter password page with title"<title>"
    Examples:
      | title |
      |Enter your 4-digit Pin|

  Scenario Outline: check Enter password page and get home page for Menu Button Check
    When i enter one two three and four as enter password
    Then i should get home page with title"<title>"
    Examples:
      | title |
      |SmartCoin|
