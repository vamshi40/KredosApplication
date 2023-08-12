Feature: Customer Module

  Scenario Outline: Customer drill down functionality

    Given Login to Kredos Application with <Username> and <Password>
    And Validate the Customer Module columns dropdowns <Customer_Name> <Customer_Admin> <Email> <Date_Added> <URL> <Dashboard> <Widget> <API>


    Examples:
      | Username      | Password        | Customer_Name             | Customer_Admin                   | Email                      | Date_Added                 | URL | Dashboard              | Widget            | API             |
      | "kredosadmin" | "vassarlabs123" | "Customer Name-Tmobile-2" | "Customer Admin-vikram tiwari-3" | "Email-vikram@gmail.com-4" | "Date Added-11 Oct 2022-5" | ""  | "# of Dashboard-1-7  " | "# of Widget-2-8" | "# of API-13-9" |


