Feature: Resources Module

  Scenario Outline: Resources Module drill down functionality

    Given Login to Kredos Application with <Username> and <Password>
    And Validate the Resources Module columns dropdowns <Resource_Name> <Description> <Resource_Type> <Application> <Status>


    Examples:
      | Username      | Password        | Resource_Name          | Description                | Resource_Type          | Application                     | Status            |
      | "kredosadmin" | "vassarlabs123" | "Resource Name-USER-1" | "Description-macros API-2" | "Resource Type-APIs-3" | "Application-User Management-4" | "Status-Active-5" |


