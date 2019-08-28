@tag
Feature: Add customer details
  I want to use this template for my feature file

  @tag2
  Scenario Outline: Add a customer id
    Given Launch the chrome browser
    And click the Addd customer link
    When user provide valid details "<fname>","<lname>","<email>","<address>","<phoneno>"
    Then generate the customer id and display

    Examples: 
      | fname  | lname | email              | address     | phoneno     |
      | Kavin  | raj   | kavin@gmail.com    | pondy       |   812212333 |
      | Balaji | ravi  | balai@gmail.com    | pondicherry |  8838258963 |
      | Guna   | balan | gunachan@gmail.com | nettapkm    | 96775470262|
