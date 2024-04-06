# Feature: Home Page Verifications
_[Return to readme](https://github.com/JuanpaBorg/TestingStrategyUnitedAirlines2024/blob/main/README.md)_

This is the Web Application that is going to be tested, with its Search Functionality that covers mainly the Origin and Destination Inputs, also the respective Departure and Return Dates, a Search Button, a Table of Results. 
![[picture of the webapp](https://www.united.com/en-us/flights-from-chicago-to-san-francisco)](https://github.com/JuanpaBorg/TestingStrategyUnitedAirlines2024/assets/23565010/543b5ac5-0294-42c6-a64a-5cd10b7a43d2)


  ## Scenario: Verify search box is prominently displayed
  **Description:**
  This scenario verifies that the search box is prominently displayed on the flight search page.
  **Acceptance Criteria:**
  - The search box should be prominently displayed on the flight search page.

  **Testing Steps:**
  1. Open the flight search page.
  2. Verify if the search box is displayed.

  **Expected Results:**
  - The search box should be prominently displayed on the page.

  

  ## Scenario: Verify search box accepts input for destination
  **Description:**
  This scenario verifies that the search box accepts input for the destination on the flight search page.
  **Acceptance Criteria:**
  - The search box should accept input for the destination.

  **Testing Steps:**
  1. Open the flight search page.
  2. Enter "New York" into the destination input.

  **Expected Results:**
  - The destination input should contain "New York".

  

  ## Scenario: Verify search results are relevant and accurate
  **Description:**
  This scenario verifies that the search results are relevant and accurate for the provided search criteria on the flight search page.
  **Acceptance Criteria:**
  - The search results should be relevant and accurate for the provided search criteria.

  **Testing Steps:**
  1. Open the flight search page.
  2. Search for flights from "Chicago" to "New York" on "2024-04-01".

  **Expected Results:**
  - Relevant and accurate search results should be displayed.

  

  ## Scenario: Verify search functionality handles different inputs gracefully
  **Description:**
  This scenario verifies that the search functionality handles misspelled inputs gracefully on the flight search page.
  **Acceptance Criteria:**
  - The search functionality should handle misspelled inputs gracefully and provide suggestions for correction.

  **Testing Steps:**
  1. Open the flight search page.
  2. Enter misspelled destination "New Yark".

  **Expected Results:**
  - Suggestions for correcting the input should be displayed.

  

  ## Scenario: Verify search results display necessary information
  **Description:**
  This scenario verifies that the search results display necessary information for the provided search criteria on the flight search page.
  **Acceptance Criteria:**
  - The search results should display necessary information such as flight details, prices, and availability.

  **Testing Steps:**
  1. Open the flight search page.
  2. Search for flights from "Chicago" to "New York" on "2024-04-01".

  **Expected Results:**
  - Flight details, prices, and availability should be displayed in the search results for flights from "Chicago" to "New York" on "2024-04-01".


_[Return to readme](https://github.com/JuanpaBorg/TestingStrategyUnitedAirlines2024/blob/main/README.md)_
