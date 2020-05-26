@test
Feature: Checked Register With Name And Number By enter Different input
  Scenario Outline: Sign up with invalid name and valid mobile number
    Given Open SmartCoin App and clicked on sign up button then got language page select english language and clicked on continue button then get Registration page
    When  i enter invalid name as"<name>"
    And  i enter mobile number as"<number>"
    And  i clicked on continue button
    Then registration should failed with Name Error message"<error>"
    Examples:
      | name | number | error |
      | Am@#2it | 9848370141 | invalid Name |


  Scenario Outline: Sign up with Valid name and Invalid mobile number
    When  i enter name as"<name>"
    And  i enter invalid mobile number as"<number>"
    And  i clicked on continue button
    Then registration should failed with Mobile Number Error message"<error>"
    Examples:
      | name | number | error |
      | Amit Kumar | 98@#233465 | Invalid Mobile No.|

  Scenario Outline: Sign up with Invalid name and Invalid mobile number
    When  i enter invalid name as"<name>"
    And  i enter invalid mobile number as"<number>"
    And  i clicked on continue button
    Then registration should failed with Mobile Number Error message"<error1>" and Name Error message"<error2>"
    Examples:
      | name | number | error1 | error2 |
      | *&dfg45Am(8it5*|98gh46tr%$gdh$%| Invalid Mobile No.| invalid Name |

  Scenario Outline: Sign up with empty name and empty mobile number
    When  i enter invalid name as"<name>"
    And  i enter invalid mobile number as"<number>"
    And  i clicked on continue button
    Then registration should failed with Mobile Number Error message"<error1>" and Name Error message"<error2>"
    Examples:
      | name | number | error1 | error2 |
      |         |        | Invalid Mobile No.| invalid Name |

  Scenario Outline: Sign up with empty name and invalid mobile number
    When  i enter invalid name as"<name>"
    And  i enter invalid mobile number as"<number>"
    And  i clicked on continue button
    Then registration should failed with Mobile Number Error message"<error1>" and Name Error message"<error2>"
    Examples:
      | name | number | error1 | error2 |
      |         |9hsuw54672| Invalid Mobile No.| invalid Name |

  Scenario Outline: Sign up with invalid name and emplty mobile number
    When  i enter invalid name as"<name>"
    And  i enter invalid mobile number as"<number>"
    And  i clicked on continue button
    Then registration should failed with Mobile Number Error message"<error1>" and Name Error message"<error2>"
    Examples:
      | name | number | error1 | error2 |
      |am86575%$&hgjgf|        | Invalid Mobile No.| invalid Name |

  Scenario Outline: Sign up with invalid name and 13 digits mobile number
    When  i enter invalid name as"<name>"
    And  i enter invalid mobile number as"<number>"
    And  i clicked on continue button
    Then registration should failed with Name Error message"<error>"
    Examples:
      | name | number | error |
      |am865ws4575%$&hgjgf|9848370141232| invalid Name |

  Scenario Outline: Sign up with long name and 9 digits mobile number
    When  i enter invalid name as"<name>"
    And  i enter invalid mobile number as"<number>"
    And  i clicked on continue button
    Then registration should failed with Mobile Number Error message"<error>"
    Examples:
      | name | number | error|
      |raja ram mohan ray kalyan pur situation moha saddam hussai hisbul kassab main poiny jahit sai ram sajan sing |984837014| Invalid Mobile No.|

  Scenario Outline: Sign up with 30 characters name and 8 digits mobile number
    When  i enter invalid name as"<name>"
    And  i enter invalid mobile number as"<number>"
    And  i clicked on continue button
    Then registration should failed with Mobile Number Error message"<error>"
    Examples:
      | name | number | error|
      |raja ram mohan ramnah mjhgt mhjg|98483701| Invalid Mobile No.|

  Scenario Outline: Sign up with 1 char name and 4 digits mobile number
    When  i enter invalid name as"<name>"
    And  i enter invalid mobile number as"<number>"
    And  i clicked on continue button
    Then registration should failed with Mobile Number Error message"<error1>" and Name Error message"<error2>"
    Examples:
      | name | number | error1 | error2 |
      |A|9848| Invalid Mobile No.| invalid Name |

  Scenario Outline: Sign up with 2 char name and 6 digits mobile number
    When  i enter invalid name as"<name>"
    And  i enter invalid mobile number as"<number>"
    And  i clicked on continue button
    Then registration should failed with Mobile Number Error message"<error>"
    Examples:
      | name | number | error|
      |Am|984837| Invalid Mobile No.|

  Scenario Outline: Sign up with 3 char name and 8 digits mobile number
    When  i enter invalid name as"<name>"
    And  i enter invalid mobile number as"<number>"
    And  i clicked on continue button
    Then registration should failed with Mobile Number Error message"<error>"
    Examples:
      | name | number | error |
      |Ami|98483701| Invalid Mobile No.|

  Scenario Outline: Sign up with 4 char name and 2 digits mobile number
    When  i enter invalid name as"<name>"
    And  i enter invalid mobile number as"<number>"
    And  i clicked on continue button
    Then registration should failed with Mobile Number Error message"<error>"
    Examples:
      | name | number | error |
      |Amit|98| Invalid Mobile No.|

  Scenario Outline: Sign up with 3 char name and 3 digits mobile number
    When  i enter invalid name as"<name>"
    And  i enter invalid mobile number as"<number>"
    And  i clicked on continue button
    Then registration should failed with Mobile Number Error message"<error>"
    Examples:
      | name | number | error |
      |Ami|984| Invalid Mobile No.|

  Scenario Outline: Sign up with 4 char name and 5 digits mobile number
    When  i enter invalid name as"<name>"
    And  i enter invalid mobile number as"<number>"
    And  i clicked on continue button
    Then registration should failed with Mobile Number Error message"<error>"
    Examples:
      | name | number | error |
      |Amit|98483| Invalid Mobile No.|

  Scenario Outline: Sign up: name with special charchter(@) and mobile number with special Charachter(@)
    When  i enter invalid name as"<name>"
    And  i enter invalid mobile number as"<number>"
    And  i clicked on continue button
    Then registration should failed with Mobile Number Error message"<error1>" and Name Error message"<error2>"
    Examples:
      | name | number | error1 | error2|
      |Am@it|984837@141| Invalid Mobile No.|invalid name|

  Scenario Outline: Sign up: name with special charchter(A..) and mobile number with special Charachter(.)
    When  i enter invalid name as"<name>"
    And  i enter invalid mobile number as"<number>"
    And  i clicked on continue button
    Then registration should failed with Mobile Number Error message"<error>"
    Examples:
      | name | number | error |
      |A..|984837.141| Invalid Mobile No.|

  Scenario Outline: Sign up: name with special charchter(..A) and mobile number with special Charachter(.)
    When  i enter invalid name as"<name>"
    And  i enter invalid mobile number as"<number>"
    And  i clicked on continue button
    Then registration should failed with Mobile Number Error message"<error>"
    Examples:
      | name | number | error |
      |..A|984837.141| Invalid Mobile No.|

  Scenario Outline: Sign up: name with special charchter(.A) and mobile number with special Charachter(.)
    When  i enter invalid name as"<name>"
    And  i enter invalid mobile number as"<number>"
    And  i clicked on continue button
    Then registration should failed with Mobile Number Error message"<error>"
    Examples:
      | name | number | error |
      |.A|984837.141| Invalid Mobile No.|

  Scenario Outline: Sign up: name with special charchter(..) and mobile number with special Charachter(.)
    When  i enter invalid name as"<name>"
    And  i enter invalid mobile number as"<number>"
    And  i clicked on continue button
    Then registration should failed with Mobile Number Error message"<error>"
    Examples:
      | name | number | error|
      |..|984837.141| Invalid Mobile No.|

  Scenario Outline: Sign up: name with special charchter(.) and mobile number with special Charachter(.)
    When  i enter invalid name as"<name>"
    And  i enter invalid mobile number as"<number>"
    And  i clicked on continue button
    Then registration should failed with Mobile Number Error message"<error1>" and Name Error message"<error2>"
    Examples:
      | name | number | error1 | error2|
      |.|984837.141| Invalid Mobile No.|invalid name|


  Scenario Outline: Sign up: name with special charchter($) and mobile number with special Charachter($)
    When  i enter invalid name as"<name>"
    And  i enter invalid mobile number as"<number>"
    And  i clicked on continue button
    Then registration should failed with Mobile Number Error message"<error1>" and Name Error message"<error2>"
    Examples:
      | name | number | error1 | error2|
      |Am$it|984837$141| Invalid Mobile No.|invalid name|

  Scenario Outline: Sign up: name with special charchter(&) and mobile number with special Charachter(&)
    When  i enter invalid name as"<name>"
    And  i enter invalid mobile number as"<number>"
    And  i clicked on continue button
    Then registration should failed with Mobile Number Error message"<error1>" and Name Error message"<error2>"
    Examples:
      | name | number | error1 | error2|
      |Am&it|984837&141| Invalid Mobile No.|invalid name|

  Scenario Outline: Sign up: name with special charchter(*) and mobile number with special Charachter(*)
    When  i enter invalid name as"<name>"
    And  i enter invalid mobile number as"<number>"
    And  i clicked on continue button
    Then registration should failed with Mobile Number Error message"<error1>" and Name Error message"<error2>"
    Examples:
      | name | number | error1 | error2|
      |Am*it|984837*141| Invalid Mobile No.|invalid name|

  Scenario Outline: Sign up: name with special charchter(#) and mobile number with special Charachter(#)
    When  i enter invalid name as"<name>"
    And  i enter invalid mobile number as"<number>"
    And  i clicked on continue button
    Then registration should failed with Mobile Number Error message"<error1>" and Name Error message"<error2>"
    Examples:
      | name | number | error1 | error2|
      |Am#it|984837#141| Invalid Mobile No.|invalid name|

  Scenario Outline: Sign up: name with special charchter(%) and mobile number with special Charachter(%)
    When  i enter invalid name as"<name>"
    And  i enter invalid mobile number as"<number>"
    And  i clicked on continue button
    Then registration should failed with Mobile Number Error message"<error1>" and Name Error message"<error2>"
    Examples:
      | name | number | error1 | error2|
      |Am%it|984837%141| Invalid Mobile No.|invalid name|


  Scenario Outline: Sign up: name with special charchter(!) and mobile number with special Charachter(!)
    When  i enter invalid name as"<name>"
    And  i enter invalid mobile number as"<number>"
    And  i clicked on continue button
    Then registration should failed with Mobile Number Error message"<error1>" and Name Error message"<error2>"
    Examples:
      | name | number | error1 | error2|
      |Am!it|984837!141| Invalid Mobile No.|invalid name|


  Scenario Outline: Sign up: name with special charchter(~) and mobile number with special Charachter(~)
    When  i enter invalid name as"<name>"
    And  i enter invalid mobile number as"<number>"
    And  i clicked on continue button
    Then registration should failed with Mobile Number Error message"<error1>" and Name Error message"<error2>"
    Examples:
      | name | number | error1 | error2|
      |Am~it|984837~141| Invalid Mobile No.|invalid name|


  Scenario Outline: Sign up: name with special charchter(^) and mobile number with special Charachter(^)
    When  i enter invalid name as"<name>"
    And  i enter invalid mobile number as"<number>"
    And  i clicked on continue button
    Then registration should failed with Mobile Number Error message"<error1>" and Name Error message"<error2>"
    Examples:
      | name | number | error1 | error2|
      |Am^it|984837^141| Invalid Mobile No.|invalid name|

  Scenario Outline: Sign up: name with special charchter({}) and mobile number with special Charachter({})
    When  i enter invalid name as"<name>"
    And  i enter invalid mobile number as"<number>"
    And  i clicked on continue button
    Then registration should failed with Mobile Number Error message"<error1>" and Name Error message"<error2>"
    Examples:
      | name | number | error1 | error2|
      |Am{}it|984837{}141| Invalid Mobile No.|invalid name|


  Scenario Outline: Sign up: name with special charchter(()) and mobile number with special Charachter(())
    When  i enter invalid name as"<name>"
    And  i enter invalid mobile number as"<number>"
    And  i clicked on continue button
    Then registration should failed with Mobile Number Error message"<error1>" and Name Error message"<error2>"
    Examples:
      | name | number | error1 | error2|
      |Am()it|984837()141| Invalid Mobile No.|invalid name|

  Scenario Outline: Sign up: name with special charchter((%)) and mobile number with special Charachter((%))
    When  i enter invalid name as"<name>"
    And  i enter invalid mobile number as"<number>"
    And  i clicked on continue button
    Then registration should failed with Mobile Number Error message"<error1>" and Name Error message"<error2>"
    Examples:
      | name | number | error1 | error2|
      |Am(%)it|984837(%)141| Invalid Mobile No.|invalid name|

  Scenario Outline: Sign up: name with special charchter(`) and mobile number with special Charachter(`)
    When  i enter invalid name as"<name>"
    And  i enter invalid mobile number as"<number>"
    And  i clicked on continue button
    Then registration should failed with Mobile Number Error message"<error1>" and Name Error message"<error2>"
    Examples:
      | name | number | error1 | error2|
      |Am`it|984837`141| Invalid Mobile No.|invalid name|

  Scenario Outline: Sign up: name with digits and mobile number with special Charachter(`)
    When  i enter invalid name as"<name>"
    And  i enter invalid mobile number as"<number>"
    And  i clicked on continue button
    Then registration should failed with Mobile Number Error message"<error1>" and Name Error message"<error2>"
    Examples:
      | name | number | error1 | error2|
      |Am12it|984837`141| Invalid Mobile No.|invalid name|

  Scenario Outline: Register with valid name and mobile number
    When  i enter invalid name as"<name>"
    And  i enter invalid mobile number as"<number>"
    And  i clicked on continue button
    Then registration should passed and jump to the permission Page with title"<title>"
    Examples:
      | name | number |title|
      |Amit Kumar|8073420765|Permissions|

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
    Then  i should get Sign up With Gmail Page Title as"<title>"
    Examples:
      | sms | CMsg | CMMsg | LMsg | title |
      |Allow SmartCoin to send and view SMS messages?|Allow SmartCoin to access your contacts?|Allow SmartCoin to make and manage phone calls?|Allow SmartCoin to access this device's location?|Sign up|

  Scenario Outline: Check Sign UP With Gmail
    When i clicked on sign up with gmail
    Then i should get gmail page with title"<title>"
    And i clicked on gmail id
#    Then i should get Create Password Page with title"<CTitle>"
    And i enter one two three four as password
    Then i should get confirm password pas with title"<CFTitle>"
    And i enter one two three four as confirm password
    Then  i should get Home Page Of SmartCoin with Title"<HTitle>"
    Examples:
      | title | CTitle | CFTitle | HTitle |
      | Choose an account | Create a 4-digit Pin | Confirm your 4-digit Pin | SmartCoin |

  Scenario Outline: closed App
    Given i closed the App
    Examples:
      |  |


