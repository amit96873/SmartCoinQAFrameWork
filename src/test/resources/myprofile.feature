@test
Feature: Verification of my profile Page

  Scenario Outline: Verify launching app after sign in sign up for my profile Button Check
    When i open the app after sign in sign up
    Then i should get enter password page with title"<title>"
    Examples:
      | title |
      |Enter your 4-digit Pin|

  Scenario Outline: Verify Enter password page and get home page for my profile Button Check
    When i enter one two three and four as enter password
    Then i should get home page with title"<title>"
    Examples:
      | title |
      |SmartCoin|

  Scenario Outline: Verify menu page my profile button
    Given i clicked on menu button
    When  i should get menu page with title"<MTitle>"
    And   i clicked on myprofile button
    Then  i should get menu main my profile page with title "<HTitle>"
    Examples:
      | MTitle | HTitle |
      |Welcome!|My Profile|


    Scenario Outline: verify menu button of my profile page
      When i clicked on menu button of my profile page
      Then i should get Expended menu button title as "<title>"
      Examples:
      |title|
        |EDIT PERSONAL DETAILS|


  Scenario Outline: verify Edit personal details button of my profile page
    When i clicked on edit personal details button
    Then i should get edit personal page title as "<title>"
    Examples:
      |title|
      | EDIT PERSONAL DETAILS |

  Scenario Outline: verify Edit personal details page without enter any value
    When i clear the name
    And i clicked on save button
    Then i should get error message as "<error>"
    Examples:
      |error|
      | EDIT PERSONAL DETAILS |