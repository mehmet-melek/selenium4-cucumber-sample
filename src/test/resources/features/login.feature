Feature: Login Features

  Scenario: Login successfully with valid user and valid password
    Given User is at the login page
    When User enters username as "standard_user" and password as "secret_sauce"

