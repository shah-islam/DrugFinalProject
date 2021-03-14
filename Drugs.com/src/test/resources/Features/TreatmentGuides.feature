Feature:  Treatment Guides search feature 

Scenario: As a user I want to search Treatment Guides 

    Given User navigate the url
    
    When Click on  Treatment Guides from carousel
    And Input headache in search textbox
    Then User can see Treatment Guides for headache
