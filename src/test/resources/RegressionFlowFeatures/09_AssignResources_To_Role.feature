Feature:Assign Resources to Role

  Scenario Outline:Scenario to Assign Resources to Role

    Given Login to Kredos Application with <Username> and <Password>
    When click on Rolesmodule and click on the Editrole <Role_Name>
    And Assign the <Resources> to <Application> <Toaster_Message>


    Examples:

      | Username      | Password        | Role_Name     | Application                | Resources                                                                                                                                                                                                                                                                                                                        | Toaster_Message             |
      | "kredosadmin" | "vassarlabs123" | "Kredos Role1" | "User Management"          | "APPLICATION/READ,CUSTOMER/EDIT"                                                                                                                                                                                                                                                                                                 | "Role updated successfully" |
      | "kredosadmin" | "vassarlabs123" | "Kredos Role1" | "kredos Messaging module " | "macros/READ,mc/READ,add-macros/READ,experiment-canvas/READ,Kredos resource -1/READ,experiments/READ,launch/READ,add-experiments/READ,macro-canvas/READ,uploadFile/READ,search/READ,message-mechanics/READ,Kredos resource -3/READ,all-images/READ,Kredos resource -2/READ,get-allTemplates/READ,Download/READ,get-reports/READ" | "Role updated successfully" |

