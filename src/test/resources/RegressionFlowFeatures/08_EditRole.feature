Feature:Edit Role
@tag4
  Scenario Outline:Scenario to Edit Role

    Given Login to Kredos Application with <Username> and <Password>
    When click on Rolesmodule and click on the Editrole <Role_Name>
    And Enter the updated details <NRole_Name> <Napplication_Name> <Ndescription> <Submit> <Toaster_Message>
    Then Verify the Updated role present in the list <NRole_Name>

    Examples:

      | Username      | Password        | Role_Name     | NRole_Name     | Napplication_Name          | Ndescription                  | Submit    | Toaster_Message             |
#      | "kredosadmin" | "vassarlabs123" | "kredosrole"  | "testrole"     | "kredos Messaging module " | "testrole description"        | "Fail"    | "Role name Already Exists"  |
#      | "kredosadmin" | "vassarlabs123" | "kredosrole"  | ""             | "kredos Messaging module " | ""                            | ""        | ""                          |
      | "kredosadmin" | "vassarlabs123" | "kredosrole1" | "Kredos Role1" | "kredos Messaging module " | "kredos testing role updated" | "Success" | "Role updated successfully" |