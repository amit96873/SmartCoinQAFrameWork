#@test
Feature: Sign in Text Quality check With Facebook

  Scenario Outline: Check Text on sign in page
    When i open SmartCoin App
    Then i should get title as"<title1>" and carousel text as "<carousel>" and the SignIn text as"<text>"
    Examples:
      | title1 | carousel |text|
    |SmartCoin|Easy loans for anything you need|Already a member?|

  Scenario Outline: Check Text on Language Page
    When i clicked on sign in button
    Then i should get Language Page title as"<title>"
    And  i should get first instruction as"<ins1>"
    And  i should get second instruction as"<ins2>"
    Examples:
     |title|ins1|ins2|
    |Language|Please Select your Language|You can always change this in Language Settings|

  Scenario Outline: Check English Language and continue button and Permission page Text
    When i select english language
    And i clicked on sign in continue button
    Then i should get Permission page title as"<title>"

    Examples:
      |title|
    | Permissions|

  Scenario Outline: Check Allow Button And Texts
    When i clicked on Agree And Continue Button
    Then  i should Get Sms Permission Message as"<sms>"
    And i clicked on Allow Button
    Then  i should get Access of Contacts Message As"<CMsg>"
    And i clicked on Allow Button
    Then i should get Manage Phone Calls Message As"<CMMsg>"
    And i clicked on Allow Button
    Then  i should get Access of Location Message as"<LMsg>"
    And i clicked on Allow Button
    Then  i should get Login With Gmail and FaceBook Page Title as"<title>"
    Examples:
      | sms | CMsg | CMMsg | LMsg | title |
      |Allow SmartCoin to send and view SMS messages?|Allow SmartCoin to access your contacts?|Allow SmartCoin to make and manage phone calls?|Allow SmartCoin to access this device's location?|Sign in|



  Scenario Outline: Check Log In With FaceBook
    When i clicked on Log In With FaceBook
    Then  i Should Get FaceBook Page With Title"<fb>"
    And i enter username as "<username>"
    And i enter password as"<password>"
    And i clicked on Log in button
    Then i Should Get Continue With FaceBook Page with Title "<title>"
    And i clicked on continue with fb button
#    Then i should get Create Password Page with title"<CTitle>"
    And i enter one two three four as password
    Then i should get confirm password pas with title"<COTitle>"
    And i enter one two three four as confirm password
    Then i should get Home Page Of SmartCoin with Title"<HTitle>"
    Examples:
      | fb | username | password | title | CTitle |COTitle| HTitle |
      | Facebook | amit96873@gmail.com | 8226993297 | Log in with Facebook | Create a 4-digit pin |Confirm your 4-digit Pin| SmartCoin |


  Scenario Outline: closed App
    Given i closed the App
    Examples:
      |  |