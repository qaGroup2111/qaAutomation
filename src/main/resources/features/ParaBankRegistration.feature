Feature: Para Bank registration

  @run
  Scenario: check para bank registration
    Given user opens Parabank page
    And clicks on register button
    When user fills the registration form
    And user clicks to register a user
    Then user is registered successfully