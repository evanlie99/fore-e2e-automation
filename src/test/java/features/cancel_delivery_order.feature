Feature: Cancel transaction for delivery order with no payment

  As a logged in user
  I want to create an order for delivery order type
  and i want to cancelled it immediately after creation

  Background:
    Given user is logged in successfully
    And user is on Fore home page

  Scenario: Create delivery order and cancel immediately
    When user taps the Delivery order button
    Then user should be redirected to the delivery address and menu screen
    And the nearest delivery store is selected
    And user inputs their delivery location
    And user selects the coffee menu
    And user customized coffee
    And user adds the item to the cart
    And user view the cart
    And the user selects delivery method
    And the user selects payment method
    And user confirms the order
    And user should be redirected to detail order page
    Then user cancel the order immediately after creation

