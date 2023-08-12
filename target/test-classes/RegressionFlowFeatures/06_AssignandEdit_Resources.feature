Feature:Assign and Edit Resources

  Scenario Outline: Scenario to Assign and Edit Resources

    Given Login to Kredos Application with <Username> and <Password>
    And click on Customermodule and Click on the EditCustomer <Customer_Name>
    And Assign the Application <Application_Name> and Verify the Assigned Application
    And Click on the Edit Resources button and assign the resources <Apis> <Dashboard> <Widget> <submit> <toaster_message>
    Then Verify the assigned Resources <Apis> <Dashboard> <Widget> <Customer_Name>


    Examples:

      | Username      | Password        | Customer_Name | Application_Name             | Apis                                                                                                                                                                                                                                                                                   | Dashboard                   | Widget                                                | submit    | toaster_message                            |
      | "kredosadmin" | "vassarlabs123" | "test123"     | " kredos Messaging  module " | ""                                                                                                                                                                                                                                                                                     | ""                          | ""                                                    | "Fail"    | "No resources selected to assign / update" |
      | "kredosadmin" | "vassarlabs123" | "kredostest"  | " kredos Messaging  module " | "search (READ),all-images (READ),mc (READ),macros (READ),experiments (READ),experiment-canvas (READ),macro-canvas (READ),launch (READ),uploadFile (READ),message-mechanics (READ),get-allTemplates (READ),Download (READ),get-reports (READ),add-experiments (READ),add-macros (READ)" | "Kredos resource -3 (READ)" | "Kredos resource -1 (READ),Kredos resource -2 (READ)" | "Success" | "Resources updated successfully"           |
