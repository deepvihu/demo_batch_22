
Feature: Rent Magicbricks Website
			
  Scenario: Sort rental properties by price
    Given I am on the Magicbricks website
    When I navigate to rent section
    And I select the price:Low to High sorting option
    Then I should see the list of rental properties sorted from low to high prices
   