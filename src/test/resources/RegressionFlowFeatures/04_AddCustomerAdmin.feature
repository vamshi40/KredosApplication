Feature:Add Customer Admin

  Scenario Outline:Scenario to Add Customer Admin

    Given Login to Kredos Application with <Username> and <Password>
    And click on Customermodule and Click on the EditCustomer <Customer_Name>
    And Click on the AddCustomerAdmin and Enter <Email> <First_Name> <Last_Name> <Mobile_Number> <User_Name> <Submit> <Toaster_Message>


    Examples:

      | Username      | Password        | Customer_Name | Email               | First_Name | Last_Name | Mobile_Number | User_Name             | Submit    | Toaster_Message                     |
      | "kredosadmin" | "vassarlabs123" | "test123"     | "test123@gmail.com" | "test"     | "test"    | "9999999999"  | "test"                | "Success" | "Successfully added customer admin" |

      | "kredosadmin" | "vassarlabs123" | "kredostest"  | ""                  | "test"     | "test"    | "9999999999"  | "test"                | ""        | ""                                  |
      | "kredosadmin" | "vassarlabs123" | "kredostest"  | "testing@gmail.com" | ""         | "test"    | "9999999999"  | "test"                | ""        | ""                                  |
      | "kredosadmin" | "vassarlabs123" | "kredostest"  | "testing@gmail.com" | "test"     | "test"    | ""            | "testing"             | ""        | ""                                  |
      | "kredosadmin" | "vassarlabs123" | "kredostest"  | "test123@gmail.com" | "test"     | "test"    | "9999999999"  | ""                    | ""        | ""                                  |

      | "kredosadmin" | "vassarlabs123" | "kredostest"  | "test123@gmail.com" | "test"     | "test"    | "9999999999"  | "test"                | "Fail"    | "Username or email already exists"  |
      | "kredosadmin" | "vassarlabs123" | "kredostest"  | "testing@gmail.com" | "test"     | "test"    | "9999999999"  | "test"                | "Fail"    | "Username or email already exists"  |
      | "kredosadmin" | "vassarlabs123" | "kredostest"  | "testing@gmail.com" | "test"     | "test"    | "9999999999"  | "testingg"            | "Fail"    | "The Mobile Number already exists"  |

      | "kredosadmin" | "vassarlabs123" | "kredostest"  | "info@kredos.com"   | "kredos"   | "Admin"   | "9999988888"  | "kredosadministrator" | "Success" | "Successfully added customer admin" |
