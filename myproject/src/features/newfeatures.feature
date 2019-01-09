Feature: Test running websites

  Scenario: Verify browser driver integrity
    When User navigates to google homepage
    And User clicks on Images link
    Then User types apple in the search field
    And User clicks on search icon
    Then Apple image search is complete
