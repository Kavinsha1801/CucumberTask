	 @tag
Feature: we need to add the tarif details
  I want to use this template for my feature file

  @tag1
  Scenario: Add tariff detail
    Given Launch chrome browser
    And click the Add tariff plan link
    When Add tariff detail
      | rental | freelocmins | freeintmins | freesms | localcharge | intcharge | smscharge |
      |    200 |         600 |         100 |     100 |          30 |       100 |        20 |
      |    500 |         300 |          50 |     150 |          40 |       150 |        30 |
      |    200 |         400 |          60 |      90 |          50 |       400 |        10 |
    Then Generate the tariff details and display
