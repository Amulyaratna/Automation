Feature: composing a mail
  I want to use this template for my feature file

  Scenario Outline: To check  a user is able to compose a mail to a given address
    Given Application is up and running
    And User is logged in successfully
    When User clicks on compose option
    And User enters <emai_id> and <subject>
    And User clicks on send button
    Then Compose window is closed
    And Message window pops up

    Examples: 
      | emai_id                 | subject        |
      | techbodhi@gmail.com     | Resume for job |
      | pradnyaamaske@gmail.com | assignment     |
