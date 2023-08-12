package com.pages;

import com.driver.WebdriverIntializer;
import com.utils.Roles_Operations;
import org.openqa.selenium.WebDriver;

public class Customer_Module_Page {

    private WebDriver driver;


    public Customer_Module_Page(WebDriver driver) {
        this.driver = driver;
    }

    private Roles_Operations Roperation = new Roles_Operations(WebdriverIntializer.getDriver());

    public void validate_the_customer_module_columns_dropdowns(String Customer_Name, String Customer_Admin, String Email, String Date_Added, String URL, String Dashboard, String Widget, String API) throws InterruptedException {


        if (Customer_Name.length() > 0) {

            String[] Customer_NameParts = Customer_Name.split("-");

            String columndropdown = Customer_NameParts[0];
            String entertext = Customer_NameParts[1];
            String columnindex = Customer_NameParts[2];

            System.out.println("Which column dropdown your are selecting: " + columndropdown);
            System.out.println("What text you are entering in search field: " + entertext);
            System.out.println("What column  you are validate the entered text: " + columnindex);

            Roperation.verifying_the_um_eachdropdown_column(columndropdown, entertext, columnindex);

        }
        if (Customer_Admin.length() > 0) {

            String[] Customer_AdminParts = Customer_Admin.split("-");

            String columndropdown = Customer_AdminParts[0];
            String entertext = Customer_AdminParts[1];
            String columnindex = Customer_AdminParts[2];

            System.out.println("Which column dropdown your are selecting: " + columndropdown);
            System.out.println("What text you are entering in search field: " + entertext);
            System.out.println("What column  you are validate the entered text: " + columnindex);

            Roperation.verifying_the_um_eachdropdown_column(columndropdown, entertext, columnindex);

        }
        if (Email.length() > 0) {

            String[] EmailParts = Email.split("-");

            String columndropdown = EmailParts[0];
            String entertext = EmailParts[1];
            String columnindex = EmailParts[2];

            System.out.println("Which column dropdown your are selecting: " + columndropdown);
            System.out.println("What text you are entering in search field: " + entertext);
            System.out.println("What column  you are validate the entered text: " + columnindex);

            Roperation.verifying_the_um_eachdropdown_column(columndropdown, entertext, columnindex);
        }
        if (Date_Added.length() > 0) {

            String[] Date_AddedParts = Date_Added.split("-");

            String columndropdown = Date_AddedParts[0];
            String entertext = Date_AddedParts[1];
            String columnindex = Date_AddedParts[2];

            System.out.println("Which column dropdown your are selecting: " + columndropdown);
            System.out.println("What text you are entering in search field: " + entertext);
            System.out.println("What column  you are validate the entered text: " + columnindex);

            Roperation.verifying_the_um_eachdropdown_column(columndropdown, entertext, columnindex);

        }
        if (URL.length() > 0) {
            String[] URLParts = URL.split("-");

            String columndropdown = URLParts[0];
            String entertext = URLParts[1];
            String columnindex = URLParts[2];

            System.out.println("Which column dropdown your are selecting: " + columndropdown);
            System.out.println("What text you are entering in search field: " + entertext);
            System.out.println("What column  you are validate the entered text: " + columnindex);

            Roperation.verifying_the_um_eachdropdown_column(columndropdown, entertext, columnindex);
        }
        if (Dashboard.length() > 0) {

            String[] DashboardParts = Dashboard.split("-");

            String columndropdown = DashboardParts[0];
            String entertext = DashboardParts[1];
            String columnindex = DashboardParts[2];

            System.out.println("Which column dropdown your are selecting: " + columndropdown);
            System.out.println("What text you are entering in search field: " + entertext);
            System.out.println("What column  you are validate the entered text: " + columnindex);

            Roperation.verifying_the_um_eachdropdown_column(columndropdown, entertext, columnindex);

        }
        if (Widget.length() > 0) {
            String[] WidgetParts = Widget.split("-");

            String columndropdown = WidgetParts[0];
            String entertext = WidgetParts[1];
            String columnindex = WidgetParts[2];

            System.out.println("Which column dropdown your are selecting: " + columndropdown);
            System.out.println("What text you are entering in search field: " + entertext);
            System.out.println("What column  you are validate the entered text: " + columnindex);

            Roperation.verifying_the_um_eachdropdown_column(columndropdown, entertext, columnindex);
        }
        if (API.length() > 0) {
            String[] APIParts = API.split("-");

            String columndropdown = APIParts[0];
            String entertext = APIParts[1];
            String columnindex = APIParts[2];

            System.out.println("Which column dropdown your are selecting: " + columndropdown);
            System.out.println("What text you are entering in search field: " + entertext);
            System.out.println("What column  you are validate the entered text: " + columnindex);

            Roperation.verifying_the_um_eachdropdown_column(columndropdown, entertext, columnindex);
        }

    }
}
