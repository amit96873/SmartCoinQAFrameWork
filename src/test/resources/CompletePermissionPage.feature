#@test
Feature: Complete Permission Page Check

  Scenario Outline: Check Text on sign in page
    When i open SmartCoin App
    Then i should get title as"<title1>" and carousel text as "<carousel>" and the SignIn text as"<text>"
    Examples:
      | title1 | carousel |text|
      |SmartCoin|Easy loans for anything you need|Already a member?|

  Scenario Outline: Check Text on Language Page
    When i clicked on sign in button
    Then i should get Language Page title as"<LTitle>"
    And  i should get first instruction as"<ins1>"
    And  i should get second instruction as"<ins2>"
    Examples:
      |LTitle|ins1|ins2|
      |Language|Please Select your Language|You can always change this in Language Settings|

  Scenario Outline: Check English Language and continue button and Permission page Text by scrolling
    When i select english language
    And i clicked on sign in continue button
    Then i should get Permission page title as"<title>"
    And  i should get privacy policy key as"<giveUsTheOk>"
    And i should get the privacy policy value as"<value>"
    And  i should get Financial SMS key as"<SMSKey>"
    And  i should get Financial SMS Value as"<SMSValue>"
    And  i should get Contacts Key as"<ContactsKey>"
    And  i should get Contacts Value as"<ContactsValue>"
    And  i should get Phone Key as"<PhoneKey>"
    And  i should get Phone Value as"<PhoneValue>"
    And  i should get Location Key as"<LocationKey>"
    And  i should get Location Value as"<LocationValue>"
    And  i should get Installed Apps Key as"<InstalledAppsKey>"
    And  i should get Experian Report Key as"<ExperianReportKey>"
    And  i should get Installed Apps Value as"<InstalledAppsValue>"
    And  i should get Experian Report Value as"<ExperianReportValue>"
    Examples:
      |title|giveUsTheOk|value|SMSKey|SMSValue|ContactsKey|ContactsValue|PhoneKey|PhoneValue|LocationKey|LocationValue|InstalledAppsKey|InstalledAppsValue|ExperianReportKey|ExperianReportValue|
      | Permissions|Give us the okay|Smartcoin uses financial data on your phone to unlock suitable loan offers. By continuing, you also agree to our Privacy policy and Terms & Conditions.|Financial Sms| We collect and monitor financial SMS to create a financial summary for your profile, which includes only financial and transactional SMS about bank related transactions, name of transacting parties, description of the transaction, amount of transaction for performing credit risk assessment - all to provide the best loan offers; and to keep the loan process convenient and seamless. We store this financial information on our secure servers. No personal SMS data is ever collected, read or stored by our app.|Contacts|Our app needs permission to detect your contacts' information, that includes name, phone number, account type, modifications to contact, favorites and other optional data to enrich your financial profile and provide a better understanding of your creditworthiness. We use this information to unlock better loan offers and provide a better user experience for certain features in the app.|Phone|Our app collects and monitors specific information about your device including your hardware model, RAM, storage, unique device identifiers like IMEI, serial number, SSAID, SIM information that includes network operator, roaming state, MNC and MCC codes, WIFI information that includes MAC address and mobile network information to uniquely identify devices and to prevent fraud. This also helps in enriching your credit profile and providing you with the best loan offers according to your profile.|Location|We collect and monitor the information about the location of your device to service your loan application, to reduce risk associated with your loan application and to provide better loan offers. This also helps us to verify the address and make a better credit risk decision.|Installed Apps|We collect each installed applications' metadata information that includes application and package name; installed and updated time; version name and version code for all applications installed on your device. We use this to assess your creditworthiness and provide you with the best loan offers we can.|Experian Report|We require authorisation for Smartcoin to fetch your Credit Report from Experian (Credit Information Company) and agree to the Terms and Conditions. This helps in making a better credit risk assessment of your profile and providing the best loan offers to you.|

  Scenario Outline: Check deny Button And Texts
    When i clicked on Agree And Continue Button
    Then  i should Get Sms Permission Message as"<sms>"
    And i clicked on deny button
    Then  i should get Access of Contacts Message As"<CMsg>"
    And i clicked on deny button
    Then i should get Manage Phone Calls Message As"<CMMsg>"
    And i clicked on deny button
    Then  i should get Access of Location Message as"<LMsg>"
    And i clicked on deny button
    Then i should get warning message as"<warning>"
    Examples:
      | sms | CMsg | CMMsg | LMsg | warning |
      |Allow SmartCoin to send and view SMS messages?|Allow SmartCoin to access your contacts?|Allow SmartCoin to make and manage phone calls?|Allow SmartCoin to access this device's location?|This is for verification purposes only. Please enable your required permissions and help us serve you better.|


  Scenario Outline: Check Allow Button And deny Texts
    When i clicked on Agree And Continue Button
    Then  i should Get Sms Permission Message as"<sms>"
    And  i clicked on Allow Button
    Then  i should get Access of Contacts Message As"<CMsg>"
    And i clicked on deny button
    Then i should get Manage Phone Calls Message As"<CMMsg>"
    And i clicked on deny button
    Then  i should get Access of Location Message as"<LMsg>"
    And  i clicked on deny button
    Then i should get warning message as"<warning>"
    And i clicked on Agree And Continue Button
    Then  i should get Access of Contacts Message As"<CMsg>"
    And i clicked on Allow Button
    Then i should get Manage Phone Calls Message As"<CMMsg>"
    And i clicked on deny button
    Then  i should get Access of Location Message as"<LMsg>"
    And  i clicked on deny button
    Then i should get warning message as"<warning>"
    And i clicked on Agree And Continue Button
    Then i should get Manage Phone Calls Message As"<CMMsg>"
    And i clicked on Allow Button
    Then  i should get Access of Location Message as"<LMsg>"
    And i clicked on deny button
    Then i should get warning message as"<warning>"
    And i clicked on Agree And Continue Button
    Then  i should get Access of Location Message as"<LMsg>"
    And i clicked on Allow Button
    Then  i should get Login With Gmail and FaceBook Page Title as"<title>"
    Examples:
      | sms |CMsg|CMMsg|LMsg|title|warning|
      |Allow SmartCoin to send and view SMS messages?|Allow SmartCoin to access your contacts?|Allow SmartCoin to make and manage phone calls?|Allow SmartCoin to access this device's location?|Sign in|This is for verification purposes only. Please enable your required permissions and help us serve you better.|

  Scenario Outline: closed App
  Given i closed the App
    Examples:
      |  |