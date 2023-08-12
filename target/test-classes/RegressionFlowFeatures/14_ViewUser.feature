Feature:View User

  Scenario Outline:Scenario to View User.

    Given Login to Kredos Application with <Username> and <Password>
    And click on UsersModule and click on the ViewUser <Email>
    Then Verify the userdetails <Email> <First_Name> <Last_Name> <Mobile_Number> <User_Name>

    Examples:

      | Username      | Password        | Email                      | First_Name       | Last_Name | Mobile_Number | User_Name        |
      | "kredosadmin" | "vassarlabs123" | "kredosusertest@gmail.com" | "kredostestuser" | ""        | "+917894561238"  | "kredostestuser" |