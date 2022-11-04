Feature: Ebay Home Page Scenarios

  @P1
  Scenario: Advance Search Link
    // Given When And Then

    Given I am on Ebay Home Page
    When I click on Advance Link
    Then I navigate to Advance Search Page

  @P2 @setCookies
  Scenario: Search items cout
    Given I am on Ebay Home Page
    When I search for 'Iphone 11'
    Then I validate at least 1000 search items present

  @P2 @setCookies
  Scenario: Search items cout2
    Given I am on Ebay Home Page
    When I search for 'Iphone 12'
    Then I validate at least 5000 search items present

	@setCookies
  Scenario: Search an item i category
    Given I am on Ebay Home Page
    When I search for 'soap' in 'Arte' category

  @P5
  Scenario Outline: Home Page Links
    Given I am on Ebay Home Page
    When I click on '<link>'
    Then I validate that page navigates to '<url>' and title contains '<title>'

    Examples: 
      | link       | url                                                               | title                                             |
      | Moda       | https://mx.ebay.com/b/Clothing-Shoes-Accessories/11450/bn_1852545 | Las mejores ofertas en Ropa, Calzado y Accesorios |
      | Deportes   | https://mx.ebay.com/b/Sporting-Goods/888/bn_1865031               | Las mejores ofertas en Artículos deportivos       |
      | Tecnología | https://mx.ebay.com/b/Electronics/bn_7000259124                   | Las mejores ofertas en Electronics                |
