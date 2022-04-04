#
Feature: Ikinci feature

  Scenario: 1. Scenario
    Given user on home page
    When  user clicks to login button
    Then  My Account page should be visible

  Scenario: 2. Scenario
    Given the initial value is 2
    When  user add 5 the value
    Then  the result should be 7
    
  Scenario: 3. Scenario
    Given the initial value is 10
    When  user add 10 the value
    Then  the result should be 20

  Scenario: 4. Scenario
    Given the string is "Java"
    And   the number is 1.8
    When  the version is combined
    Then  the version is "Java 1.8"
    And   the number is a 1, 8

