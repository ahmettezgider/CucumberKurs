#aciklamalar # ile yapili

# Her feature dosyasi Feature ile baslar
# Bu feature ile ilgil detayli aciklama yapilir
Feature: Ilk feature denemesi
  Cucumber baslangic calismasi


  # testler Scenariolar seklinde yazilir
  Scenario: ilk senariomuz
    Given kullanici ana sayfada
    When  user clicks to login button
    Then  login form should be visible

    # Given, When, Then, And, But annotationlarinin kisitlayici
    # bir tarafi yok


  Scenario: senario 2
    Given user on home page
    And   user goes to login form
    When  user input username
    And   user input password
    And   user clicks to login button
    Then  page title should be My Account
    And   My Account page should be visible