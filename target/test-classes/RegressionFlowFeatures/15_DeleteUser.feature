Feature:Delete User
@tag7
  Scenario Outline:Scenario to Delete User.

    Given Login to Kredos Application with <Username> and <Password>
    And click on UsersModule and click on the DeleteUser <Email> <Toaster_Message>

    Examples:

      | Username      | Password        | Email                      | Toaster_Message             |
      | "kredosadmin" | "vassarlabs123" | "kredosusertest@gmail.com" | "User deleted Successfully" |
      | "kredosadmin" | "vassarlabs123" | "test123@gmail.com"        | "User deleted Successfully" |