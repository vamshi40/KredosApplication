Feature:Edit Customer
@tag2
  Scenario Outline:Scenario to Edit Customer

    Given Login to Kredos Application with <Username> and <Password>
    And click on Customermodule and Click on the EditCustomer <Customer_Name>
    And Enter the <NCustomer_Name> <NCommunication_Email_Address> <NPrimary_Contact_Number> <NSecondary_Contact_Number> <NCommunication_Address> <NBilling_Address> <Submit> <Toaster_Message>
    Then verify the Customer Added To CustomerList <NCustomer_Name>

    Examples:

      | Username      | Password        | Customer_Name | NCustomer_Name | NCommunication_Email_Address | NPrimary_Contact_Number | NSecondary_Contact_Number | NCommunication_Address | NBilling_Address | Submit    | Toaster_Message                                                       |
      | "kredosadmin" | "vassarlabs123" | "kredos"      | "test123"      | "test123@gmail.com"          | "9999999999"            | "8888888888"              | "Mindspace"            | "Mindspace"      | "Fail"    | "Email Id Already Exists"       |
      | "kredosadmin" | "vassarlabs123" | "kredos"      | "test123"      | "test12345@gmail.com"        | "9999999999"            | "8888888888"              | "Mindspace"            | "Mindspace"      | "Fail"    | "Primary Mobile Number Already Exists" |
      | "kredosadmin" | "vassarlabs123" | "kredos"      | "test123"      | "test12345@gmail.com"        | "9999988888"            | "8888888888"              | "Mindspace"            | "Mindspace"      | "Fail"    | "Customer Already Exists"         |

      | "kredosadmin" | "vassarlabs123" | "kredos"      | ""             | "test12345@gmail.com"        | "9999988888"            | "8888888888"              | "Mindspace"            | "Mindspace"      | ""        | ""                                                                    |
      | "kredosadmin" | "vassarlabs123" | "kredos"      | "test123"      | ""                           | "9999988888"            | "8888888888"              | "Mindspace"            | "Mindspace"      | ""        | ""                                                                    |
      | "kredosadmin" | "vassarlabs123" | "kredos"      | "test123"      | "test12345@gmail.com"        | ""                      | "8888888888"              | "Mindspace"            | "Mindspace"      | ""        | ""                                                                    |

      | "kredosadmin" | "vassarlabs123" | "kredos"      | "kredostest"   | "info@kredosgmail.com"       | "9548454578"            | "6447845444"              | "Mindspace"            | "Mindspace"      | "Success" | "Updated customer successfully"                                       |
