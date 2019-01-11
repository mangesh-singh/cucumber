Feature: Test running websites

Background: 
		When User navigates to site https://www.google.com
    And User clicks on Images link
  Scenario: Verify browser driver integrity
    Then User inputs apple in the search field
    And User clicks on search icon
    Then image search is complete

  #Scenario: Verify browser driver integrity
    #Then User inputs ford in the search field
    #And User clicks on search icon
    #Then image search is complete
    #
    #Scenario: Verify browser driver integrity
    #Then User inputs meganfox in the search field
    #And User clicks on search icon
    #Then image search is complete
