Feature:Delete Customer
@tag9
  Scenario Outline:Scenario to Delete Customer

    Given Login to Kredos Application with <Username> and <Password>
    And click on Customermodule and Click on the DeleteCustomer <Customer_Name> <Toaster_Message>

    Examples:

      | Username      | Password        | Customer_Name | Toaster_Message                 |
      | "kredosadmin" | "vassarlabs123" | "kredostest"  | "Customer deleted successfully" |
      | "kredosadmin" | "vassarlabs123" | "test123"     | "Customer deleted successfully" |
