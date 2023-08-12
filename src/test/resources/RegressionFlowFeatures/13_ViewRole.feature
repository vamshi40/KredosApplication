Feature:View Role

  Scenario Outline:Scenario to View Role

    Given Login to Kredos Application with <Username> and <Password>
    And click on Rolesmodule and click on the Viewrole <Role_Name>
    Then Verify the Role Details <Role_Name> <Application_Name> <Role_Description>

    Examples:

      | Username      | Password        | Role_Name     | Application_Name           | Role_Description              |
      | "kredosadmin" | "vassarlabs123" | "Kredos Role1" | "kredos Messaging module" | "kredos testing role updated" |