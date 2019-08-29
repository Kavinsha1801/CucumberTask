@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag2
  Scenario: Add a customer
    Given Launch the chrome browser
    And click the Addd customer link
    When Add customer details
      | kavin | raj | kavin@gmail.com | pondy | 81222123321 |
    Then generate the customer id and display
