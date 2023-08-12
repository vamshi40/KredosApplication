package stepdefinitions;

import com.driver.WebdriverIntializer;
import com.pages.RolesModule_Page;
import com.utils.Roles_Operations;

import io.cucumber.java.en.And;


public class RolesModule_Steps {


    private Roles_Operations Roperation = new Roles_Operations(WebdriverIntializer.getDriver());


    private RolesModule_Page Rolesmodulepage = new RolesModule_Page(WebdriverIntializer.getDriver());






    @And("Validate the Roles Module columns dropdowns {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void validate_the_roles_module_columns_dropdowns(String Role_Name, String Application_Name, String Customer_Name, String Description, String Status, String Date_Added, String URL, String Dashboard, String Widget, String API, String Others) throws InterruptedException {
        Roperation.common_pathway_to_roles();
        Rolesmodulepage.validate_the_roles_module_columns_dropdowns(Role_Name, Application_Name, Customer_Name, Description, Status, Date_Added, URL, Dashboard, Widget, API, Others);

    }
}
