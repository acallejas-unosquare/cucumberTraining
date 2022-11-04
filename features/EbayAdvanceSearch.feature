Feature: Ebay Advance Search Page

  @P2
  Scenario: Ebay Logo on Advance Search Page
    Given I am Ebay Advance Search Page
    When I click on Ebay Logo
    Then I am navigate to Ebay Home Page

	@P3
  Scenario: Advance search an item
    Given I am Ebay Advance Search Page
    When I advance search an item
      | keyword   | exclude     | min  | max   |
      | iPhone 11 | refurbished | 3000 | 10000 |
