@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Add a customer
    Given Launch the chrome browser
    And click the Addd customer link
    When Add customer details
      | fname  | lname | email              | address | phoneno  |
      | Kavin  | raj   | kavin@gmail.com    | pondy   | 11111111 |
      | Balaji | ravi  | balai@gmail.com    | aiyaaa  | 22222222 |
      | Guna   | balan | gunachan@gmail.com | pkm     |  3333333 |
    Then generate the customer id and display
