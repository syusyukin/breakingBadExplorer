Feature: Registration password

  Scenario: Valid password registration
    Given I start the app and navigate to registration
    And I enter username "IvanS"
    When I enter a valid password
    #this will be an auto generated password to avoid pesticide paradox
    And I press register
    Then I am registered

  Scenario Outline: Invalid password registration
    Given I start the app and navigate to registration
    And I enter username "IvanS"
    And I enter password <password>
    And I press register
    Then I get an error

    Examples:
    |password|
    |p4ssword|
    |pa$$word|
    |p4$wo   |
