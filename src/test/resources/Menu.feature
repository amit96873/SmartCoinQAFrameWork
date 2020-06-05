@test
Feature: check Menu page button

  Scenario Outline: Verify launching app after sign in sign up for Menu Button Check
    When i open the app after sign in sign up
    Then i should get enter password page with title"<title>"
    Examples:
      | title |
      |Enter your 4-digit Pin|

  Scenario Outline: Verify Enter password page and get home page for Menu Button Check
    When i enter one two three and four as enter password
    Then i should get home page with title"<title>"
    Examples:
      | title |
      |SmartCoin|

   Scenario Outline: Verify menu page home button
     Given i clicked on menu button
     When  i should get menu page with title"<MTitle>"
     And   i clicked on home button of menu page
     Then  i should get home page with title"<HTitle>"
     Examples:
       | MTitle | HTitle |
       |Welcome!|SmartCoin|

   Scenario Outline: Verify My loans Button
     Given i clicked on menu button
     And   i should get menu page with title"<MTitle>"
     When  i clicked on my loan button
     Then  i should get my loans page with title "<HTitle>"
     Examples:
       | MTitle | HTitle |
       |Welcome!|My Loans|

   Scenario Outline: Verify my profile button
     Given i clicked reverse button of my loans page to get back on home page
     And   i should get home page with title"<HTitle>"
     And   i clicked on menu button
     And   i should get menu page with title"<MTitle>"
     When  i clicked on my profile button of menu page
     Then  i should get my profile page with title"<MPTitle>"
     Examples:
       | HTitle | MTitle | MPTitle |
       | SmartCoin | Welcome! | My Profile |

  Scenario Outline: Verify All Transactions Button
    Given i clicked reverse button of my profile page to get back on home page
    And   i should get home page with title"<HTitle>"
    And   i clicked on menu button
    And   i should get menu page with title"<MTitle>"
    When  i clicked on all transaction button
    Then  i should get All transaction page with title "<title>"
    Examples:
      | HTitle | MTitle | title |
      | SmartCoin | Welcome! | All Transactions |

  Scenario Outline: Verify Help And Support Button
    Given i clicked reverse button of All Transaction page to get back on home page
    And   i should get home page with title"<HTitle>"
    And   i clicked on menu button
    And   i should get menu page with title"<MTitle>"
    When  i clicked on help and support button
    Then  i should get help and Support Page with title"<HPTitle>"
    Examples:
      | HTitle | MTitle | HPTitle |
      | SmartCoin | Welcome! | EMAIL US |

  Scenario Outline: Verify FAQ Button
    Given i clicked reverse button of Help And Support page to get back on home page
    And   i should get home page with title"<HTitle>"
    And   i clicked on menu button
    And   i should get menu page with title"<MTitle>"
    When  i clicked on FAQ button
    Then  i should get FAQ page with title "<FAQTitle>"
    Examples:
      | HTitle | MTitle | FAQTitle |
      | SmartCoin | Welcome! | FAQ |


  Scenario Outline: Verify Language settings Button
    Given i clicked reverse button of FAQ page to get back on home page
    And   i should get home page with title"<HTitle>"
    And   i clicked on menu button
    And   i should get menu page with title"<MTitle>"
    When  i clicked on language setting button
    Then  i should get language setting page with title "<LTitle>"
    Examples:
      | HTitle | MTitle | LTitle |
      | SmartCoin | Welcome! | Language |

  Scenario Outline: Verify Troubleshoot Button
    Given i clicked reverse button of language settings page to get back on home page
    And   i should get home page with title"<HTitle>"
    And   i clicked on menu button
    And   i should get menu page with title"<MTitle>"
    When  i clicked on Troubleshoot button
    Then  i should get Troubleshoot page with title "<TTitle>"
    Examples:
      | HTitle | MTitle | TTitle |
      | SmartCoin | Welcome! | Troubleshoot |

  Scenario Outline: Verify my referrals Button
    Given i clicked reverse button of troubleshoot page to get back on home page
    And   i should get home page with title"<HTitle>"
    And   i clicked on menu button
    And   i should get menu page with title"<MTitle>"
    When  i clicked on my referrals button
    Then  i should get my referrals page with title "<RTitle>"
    Examples:
      | HTitle | MTitle | RTitle |
    |SmartCoin|Welcome!|Share Smartcoin|

   Scenario Outline: verify My Bank Details Page
     Given i clicked reverse button of my referrals page to get back on home page
     And  i should get home page with title"<HTitle>"
     And i clicked on menu button
     And i should get menu page with title"<MTitle>"
     When i clicked on my bank details page
     Then i should get bank account pending page with title "<BTitle>"
     Examples:
       | HTitle | MTitle | BTitle |
       | SmartCoin | Welcome! | Bank Account Pending |






