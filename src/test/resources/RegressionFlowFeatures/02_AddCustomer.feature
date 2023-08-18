Feature:Add Customer.
@tag1
  Scenario Outline:Scenario to Add Customer.

    Given Login to Kredos Application with <Username> and <Password>
    When click on Customermodule and add new customer
    And Enter <Customer_Name> <Communication_Email_Address> <Primary_Contact_Number> <Secondary_Contact_Number> <Communication_Address> <Billing_Address> <Submit> <Toaster_Message>
    Then verify Customer Added To CustomerList <Customer_Name>

    Examples:

      | Username      | Password        | Customer_Name | Communication_Email_Address | Primary_Contact_Number | Secondary_Contact_Number | Communication_Address | Billing_Address                     | Submit    | Toaster_Message                        |

      | "kredosadmin" | "vassarlabs123" | "test123"     | "test123@gmail.com"         | "9999999999"           | "8888888888"             | "Netherlands"         | "Mindspace,Buildingno-9,Vassarlabs" | "Success" | "Added customer successfully"          |
      | "kredosadmin" | "vassarlabs123" | "kredos"      | "info@kredos.com"           | "9182692837"           | "9182692812"             | "Netherlands"         | "Mindspace,Buildingno-9,Vassarlabs" | "Success" | "Added customer successfully"          |
      | "kredosadmin" | "vassarlabs123" | "kredos"      | "info@kredos.com"           | "9182692837"           | "9182692812"             | "Netherlands"         | "Mindspace,Buildingno-9,Vassarlabs" | "Fail"    | "Email Id Already Exists"              |
      | "kredosadmin" | "vassarlabs123" | "kredos"      | "infokredos@kredos.com"     | "9182692837"           | "9182692812"             | "Netherlands"         | "Mindspace,Buildingno-9,Vassarlabs" | "Fail"    | "Primary Mobile Number Already Exists" |
      | "kredosadmin" | "vassarlabs123" | "kredos"      | "infokredos@kredos.com"     | "9182692777"           | "9182692812"             | "Netherlands"         | "Mindspace,Buildingno-9,Vassarlabs" | "Fail"    | "Customer Already Exists"              |

      | "kredosadmin" | "vassarlabs123" | ""            | "infokredos@kredos.com"     | "9182692837"           | "9182692812"             | "Netherlands"         | "Mindspace,Buildingno-9,Vassarlabs" | ""        | ""                                     |
      | "kredosadmin" | "vassarlabs123" | "kredos"      | ""                          | "9182692837"           | "9182692812"             | "Netherlands"         | "Mindspace,Buildingno-9,Vassarlabs" | ""        | ""                                     |
      | "kredosadmin" | "vassarlabs123" | "kredos"      | "infokredos@kredos.com"     | ""                     | "9182692812"             | "Netherlands"         | "Mindspace,Buildingno-9,Vassarlabs" | ""        | ""                                     |




