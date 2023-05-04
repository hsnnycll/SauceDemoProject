@smoke @login
Feature: Login

  As a user, we would like to be able to connect successfully with the right credentials.

  RULES:
  - The user must have a valid username
  - The user must have a valid password
  - User will get a generic error message following login attempt with invalid credentials.

  Scenario: The user successfully logs in with valid credentials.
  This scenario tests that a user is able to successfully login when enter valid credentials.
    Given the user is on the login page
    When the user enters username "standard_user"
    And the user enters password "secret_sauce"
    And the user clicks on the login
    Then the user should be logged in


  Scenario: The user attempts to log in with locked out credentials.
  This scenario tests that a user is not able to log in when users enter locked out credentials.
    Given the user is on the login page
    When the user enters username "locked_out_user"
    And the user enters password "secret_sauce"
    And the user clicks on the login
    Then the user should not be able to login and see error message "Epic sadface: Sorry, this user has been locked out."


  Scenario Outline: The user attempts to log in with multiple invalid credentials.
    Given the user is on the login page
    When the user enters username "<username>"
    And the user enters password "<password>"
    And the user clicks on the login
    Then the user should not be able to login and see error message "Epic sadface: Username and password do not match any user in this service"
    Examples:
      | username        | password        |
      | wrongusername   | wrongpassword   |
      | invalidusername | invalidpassword |
