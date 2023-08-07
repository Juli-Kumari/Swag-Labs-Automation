@Checkout
Feature: Check the Checkout functionality

  Background: 
    Given User is logged in
    When User on the products page
    And User click on add to cart button for one product
    Then Click on shopping cart
    And Click on checkout

  @chcekout_form
  Scenario Outline: Checkout Informations should present and user able to enter the information
    Then user can see and enter the "<first_name>" "<last_name>" "<postal_code>"

    Examples: 
      | first_name | last_name | postal_code |
      | Juli       | Kumari    |      854301 |

  @checkout_unsuccessful
  Scenario Outline: User Not Able to Complete the checkout process without entering the postal code
    When user enter the "<first_name>" "<last_name>"
    And user click on continue 
    Then user see the error message as "Error: Postal Code is required"
    Examples: 
      | first_name | last_name |
      | Juli       | Kumari    |

  @checkout_successful
  Scenario Outline: Complete the checkout process successfully with enter valid credential
    Then user enter the "<first_name>" "<last_name>" "<postal_code>"
    And user click on continue 
    Then user can see the checkout overview
    When user click on finish
    Then Verify the order confirmation message should displayed

    Examples: 
      | first_name | last_name | postal_code |
      | Juli       | Kumari    |      854301 |
