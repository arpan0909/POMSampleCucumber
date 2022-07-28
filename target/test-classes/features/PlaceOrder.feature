Feature:Place Order Feature
  Scenario: Search Item
    Given user is on the Home Page
    When user search an "T-Shirts"
    Then should display search results


  Scenario:Add Item to the cart
    Given Item should display the search results
    When user add item to the cart
    Then Item must be available in the cart