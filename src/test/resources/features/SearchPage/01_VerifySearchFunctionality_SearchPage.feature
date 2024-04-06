Feature: Home Page Verifications

  @search_page
  Scenario: Verify search box is prominently displayed
    Given I am on the flight search page
    Then I should see the search box displayed prominently

  Scenario: Verify search box accepts input for destination
    Given I am on the flight search page
    When I enter "New York" into the destination input
    Then the destination input should contain "New York"

  Scenario: Verify search results are relevant and accurate
    Given I am on the flight search page
    When I search for flights from "Chicago" to "New York" on "2024-04-01"
    Then I should see relevant and accurate search results

  Scenario: Verify search functionality handles different inputs gracefully
    Given I am on the flight search page
    When I enter misspelled destination "New Yark"
    Then I should see suggestions for correcting the input

  Scenario: Verify search results display necessary information
    Given I am on the flight search page
    When I search for flights from "Chicago" to "New York" on "2024-04-01"
    Then I should see flight details, prices, and availability in the search results of flights from "Chicago" to "New York" on "2024-04-01"
