Feature:Delete Role
@tag8
  Scenario Outline:Scenario to Delete Role

    Given Login to Kredos Application with <Username> and <Password>
    And click on Rolesmodule and click on the deleterole <Role_Name> <Toaster_Message>

    Examples:

      | Username      | Password        | Role_Name     | Toaster_Message             |
      | "kredosadmin" | "vassarlabs123" | "Kredos Role1" | "Role deleted successfully" |
      | "kredosadmin" | "vassarlabs123" | "testrole"    | "Role deleted successfully" |