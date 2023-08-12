package com.pages;

import com.aventstack.extentreports.App;
import com.driver.WebdriverIntializer;
import com.utils.Roles_Operations;
import org.openqa.selenium.WebDriver;

public class ResourcesModule_Page {

    private WebDriver driver;


    public ResourcesModule_Page(WebDriver driver) {
        this.driver = driver;
    }

    private Roles_Operations Roperation = new Roles_Operations(WebdriverIntializer.getDriver());

    public void validate_the_resources_module_columns_dropdowns(String Resource_Name, String Description, String Resource_Type, String Application, String Status) throws InterruptedException {


        if (Resource_Name.length() > 0) {

            String[] Resource_NameParts = Resource_Name.split("-");

            String columndropdown = Resource_NameParts[0];
            String entertext = Resource_NameParts[1];
            String columnindex = Resource_NameParts[2];

            System.out.println("Which column dropdown your are selecting: " + columndropdown);
            System.out.println("What text you are entering in search field: " + entertext);
            System.out.println("What column  you are validate the entered text: " + columnindex);

            Roperation.verifying_the_um_eachdropdown_column(columndropdown, entertext, columnindex);
        }
        if (Description.length() > 0) {

            String[] DescriptionParts = Description.split("-");

            String columndropdown = DescriptionParts[0];
            String entertext = DescriptionParts[1];
            String columnindex = DescriptionParts[2];

            System.out.println("Which column dropdown your are selecting: " + columndropdown);
            System.out.println("What text you are entering in search field: " + entertext);
            System.out.println("What column  you are validate the entered text: " + columnindex);

            Roperation.verifying_the_um_eachdropdown_column(columndropdown, entertext, columnindex);

        }
        if (Resource_Type.length() > 0) {

            String[] Resource_TypeParts = Resource_Type.split("-");

            String columndropdown = Resource_TypeParts[0];
            String entertext = Resource_TypeParts[1];
            String columnindex = Resource_TypeParts[2];

            System.out.println("Which column dropdown your are selecting: " + columndropdown);
            System.out.println("What text you are entering in search field: " + entertext);
            System.out.println("What column  you are validate the entered text: " + columnindex);

            Roperation.verifying_the_um_eachdropdown_column(columndropdown, entertext, columnindex);
        }
        if (Application.length() > 0) {
            String[] ApplicationParts = Application.split("-");

            String columndropdown = ApplicationParts[0];
            String entertext = ApplicationParts[1];
            String columnindex = ApplicationParts[2];

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
