Feature: Roles Module

  Scenario Outline: Roles Module drill down functionality

    Given Login to Kredos Application with <Username> and <Password>
    And Validate the Roles Module columns dropdowns <Role_Name> <Application_Name> <Customer_Name> <Description> <Status> <Date_Added> <URL> <Dashboard> <Widget> <API> <Others>


    Examples:
      | Username      | Password        | Role_Name               | Application_Name                     | Customer_Name                | Description                                                                                    | Status            | Date_Added                 | URL | Dashboard            | Widget             | API              | Others              |
      | "kredosadmin" | "vassarlabs123" | "Role Name-DEMOROLES-2" | "Application Name-User Management-3" | "Customer Name-SuperAdmin-4" | "Description-Super admin can access all the widgets/resources in user mangement application-5" | "Status-Active-6" | "Date Added-17 Nov 2022-7" | ""  | "# of Dashboard-1-9" | "# of Widget-2-10" | "# of API-14-11" | "# of Others-13-12" |


