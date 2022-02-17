@tag
Feature: Title of your feature
  I want to use this template for my feature file

 
  @swaglab
  Scenario: To verify sort low to high
    Given user is on saucedemo homepage
      | UserName | standard_user |
    And user sorts item low to high
    And user validate Lowest Price Product Is On Top
    And user Add Lowest Price Product To Cart
    Then product should be added to cart
    When user checkout from the cart
    And user provide details on checkout page
    And user finish payment
    Then the order shuld be successfully completed

  @swaglab
  Scenario: To verify adding multiple options in cart and checkout 
    Given user is on saucedemo homepage
      | UserName | standard_user |
    When user select product Sauce Labs Bike Light
    And Add Product To Cart
    Then product should be added to cart
    Then user Remove Product
    And Continue Shopping
    When user add following products to cart
      | Sauce Labs Bike Light   |
      | Sauce Labs Bolt T-Shirt |
    Then product should be added to cart
    When user checkout from the cart
    And user provide details on checkout page
    And user finish payment
    Then the order shuld be successfully completed

  @swaglab
  Scenario: To verify adding removing then adding and checkout
    Given user is on saucedemo homepage
      | UserName | standard_user |
    When user add following products to cart
      | Sauce Labs Bike Light   |
      | Sauce Labs Bolt T-Shirt |
    Then product should be added to cart
    When user checkout from the cart
    And user provide details on checkout page
    And user finish payment
    Then the order shuld be successfully completed