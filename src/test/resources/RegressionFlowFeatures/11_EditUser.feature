Feature:Edit User
@tag6
  Scenario Outline:Scenario to Edit User.

    Given Login to Kredos Application with <Username> and <Password>
    When click on UsersModule and click on the EditUser <Email>
    And Enter the Updated User Details <NEmail> <Update_Btn> <Toaster_Message>
    Then Verify the Updated User Email present in the list <NEmail>

    Examples:

      | Username      | Password        | Email                      | NEmail                     | Update_Btn | Toaster_Message                         |
      | "kredosadmin" | "vassarlabs123" | "kredostestuser@gmail.com" | "test123@gmail.com"        | "Fail"     | "Error occured while updating the user" |
      | "kredosadmin" | "vassarlabs123" | "kredostestuser@gmail.com" | ""                         | ""         | ""                                      |
      | "kredosadmin" | "vassarlabs123" | "kredostestuser@gmail.com" | "kredosusertest@gmail.com" | "Success"  | "Successfully updated user details"     |
