Feature: Search Cars

  Scenario: Check Neuwagen Limousine selected
    Given browser window is open
    And user is on Neuwagen page
    And limousine is visible
    When user clicks on limousine
    Then user is navigated to Neuwagen Result Page
