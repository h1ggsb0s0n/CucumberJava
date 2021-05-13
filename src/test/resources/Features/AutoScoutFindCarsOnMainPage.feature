Feature: Search Cars

  Scenario Outline: Check Search is navigated to search Page
    Given browser window is open
    And user is on main page
    When user selects brand <Brand>
    When user selects modell <Modell>
    When user selects year <Year>
    When user selects price <Price>
    And clicks on autosSuchen button
    Then user is navigated to result Page

    Examples: 
      | Brand | Modell | Year    | Price         |
      | AUDI  | A4     | Ab 1980 | Bis CHF 2'000 |
