Feature:Assign and Edit Application

  Scenario Outline: Scenario to Assign and Edit Application

    Given Login to Kredos Application with <Username> and <Password>
    And click on Customermodule and Click on the EditCustomer <Customer_Name>
    And Assign the Application <Application_Name> and Verify the Assigned Application
    Then Delete the Assigned Application <Application_Name>


    Examples:

      | Username      | Password        | Customer_Name | Application_Name             |
      | "kredosadmin" | "vassarlabs123" | "kredostest"  | " kredos Messaging  module " |