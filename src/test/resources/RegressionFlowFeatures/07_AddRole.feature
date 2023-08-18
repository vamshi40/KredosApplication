Feature:Add Role
@tag3
  Scenario Outline:Scenario to Add Role

    Given Login to Kredos Application with <Username> and <Password>
    When click on Roles and add new Role
    And Enter the Role details <Role_Name> <Application_Name> <Role_Description> <Submit> <Toaster_Message>
    Then verify Role Added To RoleList <Role_Name>

    Examples:

      | Username      | Password        | Role_Name    | Application_Name           | Role_Description      | Submit    | Toaster_Message             |
      | "kredosadmin" | "vassarlabs123" | "testrole"   | "kredos Messaging module " | "kredos test role"    | "Success" | "Role created successfully" |
      | "kredosadmin" | "vassarlabs123" | "testrole"   | "kredos Messaging module " | "testing role"        | "Fail"    | "Role name exists"          |
      | "kredosadmin" | "vassarlabs123" | ""           | "kredos Messaging module " | "testing role"        | ""        | ""                          |
      | "kredosadmin" | "vassarlabs123" | "testrole"   | ""                         | "testing role"        | ""        | ""                          |
      | "kredosadmin" | "vassarlabs123" | "kredosrole1" | "kredos Messaging module " | "kredos testing role" | "Success" | "Role created successfully" |

