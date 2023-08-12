Feature:View Customer

  Scenario Outline:Scenario to View Customer

    Given Login to Kredos Application with <Username> and <Password>
    And click on Customermodule and Click on the ViewCustomer <Customer_Name>
    Then Verify the Details <Customer_Name> <Communication_Email_Address> <Primary_Contact_Number> <Secondary_Contact_Number> <Communication_Address> <Billing_Address>




    Examples:
      | Username      | Password        | Customer_Name | Communication_Email_Address | Primary_Contact_Number | Secondary_Contact_Number | Communication_Address | Billing_Address |
      | "kredosadmin" | "vassarlabs123" | "kredostest"  | "info@kredosgmail.com"      | "+919548454578"        | "+916447845444"          | "Mindspace"           | ""              |