Feature: Test the compose function in Gmail

Scenario: Compose and send an email with the given body and subject

  #Given:Preconditions
    Given user is on gmail homepage
    Given user should click on compose button
    When user enters To and Body and Subject
    When user should click on send button
    Then user need to verify the mail is sent or not