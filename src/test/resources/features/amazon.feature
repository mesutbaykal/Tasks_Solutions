Feature: Amazon website
  @amazon
  Scenario: Successfully adding a purchase on cart
    When User goes to Amazon homepage
    And User searches for "hats for men"
    And User adds the first item to Cart with quantity 2
    And User opens Cart and assert total price and quantity correct
    And User reduces the quantity
    Then USer asserts the total price and quantity has been correctly changed

