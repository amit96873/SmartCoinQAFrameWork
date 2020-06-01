@test
Feature: check home page button

  Scenario Outline: Check launching app after sign in sign up
    When i open the app after sign in sign up
    Then i should get enter password page with title"<title>"
    Examples:
      | title |
    |Enter your 4-digit Pin|

  Scenario Outline: check Enter password page and get home page
    When i enter one two three and four as enter password
    Then i should get home page with title"<title>"
    Examples:
      | title |
    |SmartCoin|

  Scenario Outline: check Menu Button
    When i clicked on menu button
    Then i should get menu page with title"<title>"
    Examples:
      | title |
      |Welcome!|

  Scenario Outline: check chat short cut button of home page
   Given : i clicked on home button of menu page to get back on home page
    When i clicked on chat short cut button
    Then i should get chat page with title"<title>"
    Examples:
      | title |
      |SmartCoin Customer Support|

   Scenario Outline: check Earn button of home page
     Given i clicked reverse button of chat page to get back on home page
     When i clicked on Earn button
     Then  i should get smartCoin rewards Page with title"<title>"
     Examples:
       | title |
       |Smartcoin Rewards|

   Scenario Outline: check My khata button of home page
     Given i clicked reverse button of SmartCoin Rewards page to get back on home page
     When  i clicked on my khata button
     Then i should get my khata page with title"<title>"
     Examples:
       | title |
       |Khata|

   Scenario Outline: check my profile button of home page
     Given i clicked reverse button of My Khata page to get back on home page
     When i clicked on my profile button
     Then i should get my profile page with title"<title>"
     Examples:
       | title |
       |My Profile|

   Scenario Outline: check contact us button of home page
     Given i clicked reverse button of my profile page to get back on home page
     When i clicked on contact us button of home page
     Then i should get help and Support Page with title"<title>"
     Examples:
       | title |
       |EMAIL US|






