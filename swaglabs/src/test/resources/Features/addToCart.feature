@addToCart
Feature: Check the Add To Cart functionality

  Background: 
    Given User is logged in
    When User on the products page

  @single_item_added_to_cart
  Scenario: User is able to Add single item to cart
    When User click on add to cart button for one product
    Then Confirm the cart updated item count to one
    When Click on shopping cart
    Then User see that one Product is added to the cart

  @multiple_item_added_to_cart
  Scenario: User is able to Add multiple item to cart
    When User click on add to cart button for more than one product
    Then Confirm the cart updated item count should increase
    When Click on shopping cart
    Then User see that multiple product is added to the cart
