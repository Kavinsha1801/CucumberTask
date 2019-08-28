@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Add a customer
    Given Launch the chrome browser
    And click the Addd customer link
    When Add customer details
      | Kavin  | raj   | kavin@gmail.com    | pondy       |   812212333 |
      | Balaji | ravi  | balai@gmail.com    | pondicherry |  8838258963 |
      | Guna   | balan | gunachan@gmail.com | nettapkm    | 96775470262 |
    Then generate the customer id and display
