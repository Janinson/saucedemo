Feature: Make a purchase
  I want to make a purchase in the web site.

  Scenario: Buy a jacket
    Given the user enters the website
    When the user enters user and password
    And click on the jacket
    Then you can see the text of thank you for your order on the screen