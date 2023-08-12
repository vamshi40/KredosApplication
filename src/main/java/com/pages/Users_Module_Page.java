package com.pages;

import com.driver.WebdriverIntializer;
import com.utils.Roles_Operations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Users_Module_Page {
    private WebDriver driver;


    public Users_Module_Page(WebDriver driver) {
        this.driver = driver;
    }

    private Roles_Operations Roperation = new Roles_Operations(WebdriverIntializer.getDriver());


    public void validate_the_users_module_columns_dropdowns(String Email, String User_Name, String Customername, String Role, String Applications, String Last_Login, String Status) throws InterruptedException {


        driver.findElement(By.xpath("//h1[normalize-space()='List Of Users']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        if (Email.length() > 0) {

            Thread.sleep(2000);
            String[] emailParts = Email.split("-");

            System.out.println("-----"+emailParts);

            String columndropdown = emailParts[0];
            String entertext = emailParts[1];
            String columnindex = emailParts[2];

            System.out.println("Which column dropdown your are selecting: " + columndropdown);
            System.out.println("What text you are entering in search field: " + entertext);
            System.out.println("What column  you are validate the entered text: " + columnindex);

            Roperation.verifying_the_um_eachdropdown_column(columndropdown, entertext, columnindex);

        }

        if (User_Name.length() > 0) {

            String[] UsernameParts = User_Name.split("-");

            String columndropdown = UsernameParts[0];
            String entertext = UsernameParts[1];
            String columnindex = UsernameParts[2];

            System.out.println("Which column dropdown your are selecting: " + columndropdown);
            System.out.println("What text you are entering in search field: " + entertext);
            System.out.println("What column  you are validate the entered text: " + columnindex);

            Roperation.verifying_the_um_eachdropdown_column(columndropdown, entertext, columnindex);

        }

        if (Customername.length() > 0) {
            String[] CustomernameParts = Customername.split("-");

            String columndropdown = CustomernameParts[0];
            String entertext = CustomernameParts[1];
            String columnindex = CustomernameParts[2];

            System.out.println("Which column dropdown your are selecting: " + columndropdown);
            System.out.println("What text you are entering in search field: " + entertext);
            System.out.println("What column  you are validate the entered text: " + columnindex);

            Roperation.verifying_the_um_eachdropdown_column(columndropdown, entertext, columnindex);
        }

        if (Role.length() > 0) {

            String[] RoleParts = Role.split("-");

            String columndropdown = RoleParts[0];
            String entertext = RoleParts[1];
            String columnindex = RoleParts[2];

            System.out.println("Which column dropdown your are selecting: " + columndropdown);
            System.out.println("What text you are entering in search field: " + entertext);
            System.out.println("What column  you are validate the entered text: " + columnindex);

            Roperation.verifying_the_um_eachdropdown_column(columndropdown, entertext, columnindex);

        }
        if (Applications.length() > 0) {

            String[] ApplicationsParts = Applications.split("-");

            String columndropdown = ApplicationsParts[0];
            String entertext = ApplicationsParts[1];
            String columnindex = ApplicationsParts[2];

            System.out.println("Which column dropdown your are selecting: " + columndropdown);
            System.out.println("What text you are entering in search field: " + entertext);
            System.out.println("What column  you are validate the entered text: " + columnindex);

            Roperation.verifying_the_um_eachdropdown_column(columndropdown, entertext, columnindex);
        }
        if (Last_Login.length() > 0) {

            String[] Last_LoginParts = Last_Login.split("-");

            String columndropdown = Last_LoginParts[0];
            String entertext = Last_LoginParts[1];
            String columnindex = Last_LoginParts[2];

            System.out.println("Which column dropdown your are selecting: " + columndropdown);
            System.out.println("What text you are entering in search field: " + entertext);
            System.out.println("What column  you are validate the entered text: " + columnindex);

            Roperation.verifying_the_um_eachdropdown_column(columndropdown, entertext, columnindex);
        }
        if (Status.length() > 0) {

            String[] StatusParts = Status.split("-");

            String columndropdown = StatusParts[0];
            String entertext = StatusParts[1];
            String columnindex = StatusParts[2];

            System.out.println("Which column dropdown your are selecting: " + columndropdown);
            System.out.println("What text you are entering in search field: " + entertext);
            System.out.println("What column  you are validate the entered text: " + columnindex);

            Roperation.verifying_the_um_eachdropdown_column(columndropdown, entertext, columnindex);

        }


    }
}
