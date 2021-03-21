@regression
Feature:  Search Filter validation 

Scenario: As a user I want to see the image of a specific drug

    Given User navigate the url
    When user input drug name "<tylenol>"
    And user clicks on serch icon
    And user scrolls down to Tylenol results from the Pill Identifier
    Then user should be able to see the image of tylenol