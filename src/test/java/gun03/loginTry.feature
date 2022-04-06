Feature: Login try

  Scenario: login

    Given user goes to "http://opencart.abstracta.us/"
    And   user clicks to My Account
    And   user clicks Login link

    When user login as follows
      | kullanici1           | sifre1     | 0 |
      | kullanici2           | sifre2     | 0 |
      | testngkurs@gmail.com | testngkurs | 1 |

    Then  closeBrowser