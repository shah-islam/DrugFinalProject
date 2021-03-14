Feature: SignIn feature validation

 Scenario Outline: User is unable to SignIn

    Given User navigate the url
    When user clicks on SignIn
    And user input invalid <username>
    And user input invalid <password> 
    Then user should see <Loginfailed> message 

    Examples: 
      | name     |   value        | status  |
      |username  |   Talentech    | Fail    |
      |password  |  Talent123     | Fail    |