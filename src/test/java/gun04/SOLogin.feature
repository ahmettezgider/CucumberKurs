@LoginTest
Feature: Login assert with Scenari Outline


  Scenario Outline: login functionality

    Given user goes to "http://opencart.abstracta.us/"
    And   user clicks to My Account
    And   user clicks Login link
    When  user fill the login form as follows
      | username | <username> |
      | password | <password> |

    Then  login shoud be "<status>"
    And   closeBrowser

    Examples:
      | username              | password   | status |
      | testngkurs@gmail.com  | testngkurs | true   |
      | testngkurs1@gmail.com | testngkurs | false  |
      | testngkurs@gmail.com  | 123        | false  |
      | testngkurs@gmail.com  | testngkurs | true   |


    #    When user fill the login form as "<username>" and "<password>"

  @LoginTestScenario
  Scenario: login functionality scenario

    Given user goes to "http://opencart.abstracta.us/"
    And   user clicks to My Account
    And   user clicks Login link
    When  user fill the login form as follows
      | username | testngkurs@gmail.com |
      | password | testngkurs |

    Then  login shoud be "true"
    And   closeBrowser