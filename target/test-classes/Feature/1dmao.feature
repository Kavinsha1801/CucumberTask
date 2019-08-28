@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag2
  Scenario: Add a customer
    Given Launch the chrome browser
    And click the Addd customer link
    When Add customer details
      | fname   | kavin           |
      | lname   | raj             |
      | email   | kavin@gmail.com |
      | address | pondy           |
      | phoneno |       812123321 |
    Then generate the customer id and display
