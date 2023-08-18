Feature:Add User
@tag5
  Scenario Outline:Scenario to Add User.

    Given Login to Kredos Application with <Username> and <Password>
    When click on UsersModule and add new user
    And Enter the User Details <Email> <First_Name> <Last_Name> <Mobile_Number> <User_Name> <Select_Customers> <Add_Button> <Toaster_Message>
    Then verify User Added To Userlist <User_Name>


    Examples:

      | Username      | Password        | Email                      | First_Name       | Last_Name | Mobile_Number | User_Name        | Select_Customers | Add_Button | Toaster_Message                                                 |
      | "kredosadmin" | "vassarlabs123" | "test123@gmail.com"        | "test"           | "user"    | "9999999999"  | "testuser"       | "kredostest"     | "Success"  | "Successfully added new user"                                   |

      | "kredosadmin" | "vassarlabs123" | "test123@gmail.com"        | "test"           | "user"    | "9999999999"  | "testuser"       | "kredostest"     | "Fail"     | "Username or email already exists"                              |
      | "kredosadmin" | "vassarlabs123" | "testkredos@gmail.com"     | "test"           | "user"    | "9999999999"  | "testuser"       | "kredostest"     | "Fail"     | "Username or email already exists"                              |
      | "kredosadmin" | "vassarlabs123" | "testkredos@gmail.com"     | "test"           | "user"    | "9999999999"  | "testkredosuser" | "kredostest"     | "Fail"     | "Mobile Number Already Exists" |

      | "kredosadmin" | "vassarlabs123" | ""                         | "test"           | "user"    | "9999999999"  | "testuser"       | "kredostest"     | ""         | ""                                                              |
      | "kredosadmin" | "vassarlabs123" | "test123@gmail.com"        | ""               | "user"    | "9999999999"  | "testuser"       | "kredostest"     | ""         | ""                                                              |
      | "kredosadmin" | "vassarlabs123" | "test123@gmail.com"        | "test"           | "user"    | ""            | "testuser"       | "kredostest"     | ""         | ""                                                              |
      | "kredosadmin" | "vassarlabs123" | "test123@gmail.com"        | "test"           | "user"    | "9999999999"  | ""               | "kredostest"     | ""         | ""                                                              |
      | "kredosadmin" | "vassarlabs123" | "test123@gmail.com"        | "test"           | "user"    | "9999999999"  | "testuser"       | ""               | ""         | ""                                                              |

      | "kredosadmin" | "vassarlabs123" | "kredostestuser@gmail.com" | "kredostestuser" | ""        | "7894561238"  | "kredostestuser" | "kredostest"     | "Success"  | "Successfully added new user"                                   |




