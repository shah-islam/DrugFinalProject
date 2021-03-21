@regression
Feature:  Dosage Guidelines feature validation 

Scenario: As a user I want to see all the adult doses for motion sickness

    Given User navigate the url
    When  user click on  Dosage Guidelines
    And user clicks on Benadryl
    And user clicks on Motion Sickness
    Then User can see Usual Adult Dose for Motion Sickness