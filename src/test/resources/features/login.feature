Feature: Login Features

  Scenario: Login successfully with valid user and valid password
    When search "sample" on searh box
    Then delete search
    And get text as "Files you download appear here"

