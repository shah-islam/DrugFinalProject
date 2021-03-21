@regression
Feature:  Side Effects search feature

Scenario: As a user I want to search Side Effects 

    Given User navigate the url
    
    When Click on  Side Effects
    And Input tylenol in search textbox
    Then User can see side Effects of tylenol