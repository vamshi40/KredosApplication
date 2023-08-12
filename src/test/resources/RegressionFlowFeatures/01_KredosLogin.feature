Feature:Login

  Scenario Outline:Scenario to Login

    Given Enter the username and password <Username> <Password>
    When click on login
    Then verify the home page <message>
    Examples:

      | Username        | Password        | message       |
      | "Kredosadmin"   | "vassarlabs123" | "Success"     |
#      | "Kredosadmin"   | ""              | "Not Success" |
#      | ""              | "kredos@123"    | "Not Success" |
#      | "Kredosadminnn" | "kredos@123"    | "Not Success" |
#      | "Kredosadmin"   | "kredos@12345"  | "Not Success" |
#      | "Kredosadmin"   | "kredos@12345"  | "Not Success" |
#      | ""              | "adad"          | "Not Success" |
#      | "sdad"          | ""              | "Not Success" |
#      | "su"            | "kredos@123"    | "Not Success" |
#      | "Kredosadmin"   | ""              | "Not Success" |
#      | "#@$#!#!#$3"    | "stanl"         | "Not Success" |
#      | ""              | "kredos@123"    | "Not Success" |
#      | "Kredosadmin"   | "st"            | "Not Success" |
#      | "sup"           | "!@#$%$#@"      | "Not Success" |
#      | "ada"           | "adad"          | "Not Success" |
#      | "@#!#$@!$@"     | "ad"            | "Not Success" |
#      | "Kredosadmin"   | ""              | "Not Success" |
#      | ""              | "kredos@123"    | "Not Success" |
#      | "Kredosadmin"   | "!@#$@!@123"    | "Not Success" |
#      | "Kredosadmin"   | "kredos@12345"  | "Not Success" |
#      | "Kredosadminnn" | ""              | "Not Success" |
#      | ""              | ""              | "Not Success" |
#      | ""              | "123123"        | "Not Success" |
