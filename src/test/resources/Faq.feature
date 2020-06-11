@test
Feature: Verification of FAQ Page

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

  Scenario Outline: Verify menu page FAQ button
    Given i clicked on menu button
    When  i should get menu page with title"<MTitle>"
    And   i clicked on FAQ button
    Then  i should get FAQ page with title "<HTitle>"
    Examples:
      | MTitle | HTitle |
      |Welcome!|FAQ|

   Scenario Outline: verify About SmartCoin Section By Selecting English Language
     Given i clicked on English language
     When  i clicked on about smartCoin section
     Then  i should get About smartCoin Questions answers page in english that we can see in screenshot and title is "<title>"
     Examples:
       | title |
       | FAQ |

  Scenario Outline: verify My Registrations Section By Selecting English Language
    Given i clicked on close button
    When  i clicked on my registration section
    Then  i should get my registration Questions answers page in english that we can see in screenshot and title is "<title>"
    Examples:
      | title |
      | FAQ |

  Scenario Outline: verify My Profile Section By Selecting English Language
    Given i clicked on close button
    When  i clicked on my Profile section
    Then  i should get my Profile Questions answers page in english that we can see in screenshot and title is "<title>"
    Examples:
      | title |
      | FAQ |

  Scenario Outline: verify My Documents Section By Selecting English Language
    Given i clicked on close button
    When  i clicked on my Documents section
    Then  i should get my Documents Questions answers page in english that we can see in screenshot and title is "<title>"
    Examples:
      | title |
      | FAQ |

  Scenario Outline: verify My Loan Offers Section By Selecting English Language
    Given i clicked on close button
    When  i clicked on my Loan Offers section
    Then  i should get my Loan Offers Questions answers page in english that we can see in screenshot and title is "<title>"
    Examples:
      | title |
      | FAQ |

  Scenario Outline: verify My Payments Section By Selecting English Language
    Given i clicked on close button
    When  i clicked on my Payments section
    Then  i should get my Payments Questions answers page in english that we can see in screenshot and title is "<title>"
    Examples:
      | title |
      | FAQ |

  Scenario Outline: verify My Coins Section By Selecting English Language
    Given i clicked on close button
    When  i clicked on my Coins section
    Then  i should get my Coins Questions answers page in english that we can see in screenshot and title is "<title>"
    Examples:
      | title |
      | FAQ |

  Scenario Outline: verify My Khata Section By Selecting English Language
    Given i clicked on close button
    When  i clicked on my Khata section
    Then  i should get my Khata Questions answers page in english that we can see in screenshot and title is "<title>"
    Examples:
      | title |
      | FAQ |