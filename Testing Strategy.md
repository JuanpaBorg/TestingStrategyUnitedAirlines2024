# Testing Strategy for "Flights from Chicago" Page:
_[Return to readme](https://github.com/JuanpaBorg/TestingStrategyUnitedAirlines2024/blob/main/README.md)_

## 1. Test Planning:
   - Understand the requirements thoroughly.
   - Define testing objectives and scope.
   - Identify testing techniques and tools.
   - Allocate resources and define timelines.

## 2. Functional Testing:

### Search Functionality: (developed on the [01_VerifySearchFunctionality_SearchPage.feature]() file, as requested in the excercize) 
   - Test case 1: Verify that the search box is prominently displayed on the page.
   - Test case 2: Verify that the search box accepts input for destination.
   - Test case 3: Verify that the search results are relevant and accurate.
   - Test case 4: Verify that the search functionality handles different inputs (e.g., misspellings, special characters) gracefully.
   - Test case 5: Verify that the search results display necessary information (e.g., flight details, prices, availability).

### Daily Fares for Flights to San Francisco:
   - Test case 1: Verify that the daily fares are displayed accurately for flights to San Francisco from Chicago.
   - Test case 2: Verify that the displayed fares are updated in real-time.
   - Test case 3: Verify that users can select dates and view fares accordingly.
   - Test case 4: Verify that fare information is consistent across different devices and browsers.

### Information Panel:
   - Test case 1: Verify that the information panel displays relevant airport information.
   - Test case 2: Verify that ad-placements within the panel are correctly displayed and do not interfere with user experience.
   - Test case 3: Verify that weather information is accurate and updated regularly.
   - Test case 4: Verify that the information panel is responsive and adjusts well to different screen sizes.

### Table of Other Popular Deals:
   - Test case 1: Verify that the table displays popular deals on flights from Chicago to San Francisco.
   - Test case 2: Verify that the deals are sorted based on relevance and popularity.
   - Test case 3: Verify that users can navigate through different deal options smoothly.
   - Test case 4: Verify that the table layout remains consistent across various screen resolutions.

## 3. Performance Testing:
   - Test the page load time under different network conditions.
   - Check server response time for search queries and fare requests.
   - Assess the system's performance under peak loads.

## 4. Security Testing:
   - Conduct vulnerability assessment and penetration testing.
   - Verify secure communication (HTTPS) for sensitive data transmission.
   - Check for proper authentication and authorization mechanisms.

## 5. Compatibility Testing:
   - Test the web page on different browsers (Chrome, Firefox, Safari, Edge).
   - Verify compatibility with various devices (desktops, laptops, tablets, mobile phones).

## 6. Usability Testing:
   - Evaluate the overall user experience of the page.
   - Gather feedback on navigation, layout, and intuitiveness.
   - Ensure accessibility compliance for users with disabilities.

## 7. Regression Testing:
   - Execute regression tests after every code change or system update.
   - Ensure that new features do not break existing functionality.
   - Automate regression tests for efficiency.

## 8. Localization and Internationalization Testing:
   - Verify language support and text translations.
   - Test currency conversions and date formats for international users.

## 9. Accessibility Testing:
   - Ensure compliance with WCAG guidelines for accessibility.
   - Test screen reader compatibility and keyboard navigation.

## 10. Disaster Recovery Testing:
   - Simulate system failures and assess the recovery process.
   - Verify data backup mechanisms and disaster recovery plans.

_[Return to readme](https://github.com/JuanpaBorg/TestingStrategyUnitedAirlines2024/blob/main/README.md)_
