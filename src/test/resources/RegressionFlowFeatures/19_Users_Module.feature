Feature: Users Module

  Scenario Outline: Users Module drill down functionality

    Given Login to Kredos Application with <Username> and <Password>
    And Validate the users Module columns dropdowns <Email> <User_Name> <Customername> <Role> <Applications> <Last_Login> <Status>


    Examples:
      | Username      | Password        | Email                            | User_Name                | Customername             | Role                            | Applications                             | Last_Login                 | Status            |
      | "kredosadmin" | "vassarlabs123" | "Email-vikramsukh94@gmail.com-2" | "Username-vikramsukh-3" | "Customer Name-Airtel-4" | "Role-Customer Administrator-5" | "Applications-User Management-6" | "Last Login-15 Nov 2022-7" | "Status-Active-8" |



