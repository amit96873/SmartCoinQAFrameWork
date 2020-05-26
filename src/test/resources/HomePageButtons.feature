@test
Feature: Check the button of Home Page

  Scenario Outline: opening app after Sign in
    When i open the app
    Then i should get enter Password Page with title"<title>"
    Examples:
      | title |
    |Enter your 4-digit Pin|

    Scenario Outline: check by Enter four digits password
      When i enter one two three four as enter password
      Then i should get Home Page Of SmartCoin with Title"<title>"
      Examples:
        | title |
        | SmartCoin |


