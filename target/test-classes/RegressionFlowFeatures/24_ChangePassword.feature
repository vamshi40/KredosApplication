Feature: Change Password.

  Scenario Outline: Change Password functionality

    Given login as user <username> <password> and click on change password
    And Enter <newpassword> <confirmnewpassword>
    And Click on the <submit> button <errormsg> <toastermsg>
    Then Login with updated password <username> <newpassword>

    Examples:

      | username            | password     | newpassword    | confirmnewpassword | submit    | errormsg                                            | toastermsg                      |
      | "shivatejacustomer" | "kredos@123" | ""             | "Vassarlabs1."     | "Disable" | "Password is required,Password Must be match"       | ""                              |
      | "shivatejacustomer" | "kredos@123" | ""             | ""                 | "Disable" | "Password is required,Confirm Password is required" | ""                              |
      | "shivatejacustomer" | "kredos@123" | "Vassarlabs1." | ""                 | "Disable" | "Confirm Password is required"                      | ""                              |
      | "shivatejacustomer" | "kredos@123" | "Vassarlabs1." | "Vassarlabs1.."    | "Disable" | "Password Must be match"                            | ""                              |
      | "shivatejacustomer" | "kredos@123" | "kredos@123"   | "kredos@123"       | "Enable"  | ""                                                  | "Password changed successfully" |



