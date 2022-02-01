@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @swaglab
  Scenario: Title of your scenario
    Given I login Swaglabs with below user
      | UserName | standard_user |
    When I select product Sauce Labs Bike Light
    And Add Product To Cart
    Then product should be added to cart
    Then I Remove Product
    And Continue Shopping
    When I add following products to cart
      | Sauce Labs Bike Light   |
      | Sauce Labs Bolt T-Shirt |
    Then product should be added to cart
    When I checkout from the cart
    And I provide details on checkout page
    And I finish payment
    Then the order shuld be successfully completed

  @swaglab
  Scenario: Title of your scenario
    Given I login Swaglabs with below user
      | UserName | standard_user |
    When I add following products to cart
      | Sauce Labs Bike Light   |
      | Sauce Labs Bolt T-Shirt |
    Then product should be added to cart
    When I checkout from the cart
    And I provide details on checkout page
    And I finish payment
    Then the order shuld be successfully completed

  @swaglab
  Scenario: Title of your scenario
    Given I login Swaglabs with below user
      | UserName | standard_user |
    When I Sort Products on Home Page From Price Low to high
    And I validate Lowest Price Product Is On Top
    And I Add Lowest Price Product To Cart
    Then product should be added to cart
    When I checkout from the cart
    And I provide details on checkout page
    And I finish payment
    Then the order shuld be successfully completed
