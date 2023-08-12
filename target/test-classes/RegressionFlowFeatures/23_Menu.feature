Feature: Menu Functionality

  Scenario Outline: Scenario to Menu Functionality

    Given Login to Kredos Application with <Username> and <Password>
    And Verify the Menu Modules

    Examples:
      | Username      | Password        |
      | "kredosadmin" | "vassarlabs123" |