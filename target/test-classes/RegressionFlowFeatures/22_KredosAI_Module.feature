Feature: KredosAI Module

  Scenario Outline: Scenario to KredosAI Module

    Given Login to Kredos Application with <Username> and <Password>
    And click on KredosAImodule

    Examples:
      | Username      | Password        |
      | "kredosadmin" | "vassarlabs123" |