package stepdefinitions;

import com.driver.WebdriverIntializer;
import com.pages.Customer_Module_Page;
import com.utils.Roles_Operations;
import io.cucumber.java.en.And;

public class Customer_Module_Step {

    private Roles_Operations Roperation = new Roles_Operations(WebdriverIntializer.getDriver());
    private Customer_Module_Page customerModulePage = new Customer_Module_Page(WebdriverIntializer.getDriver());

    @And("Validate the Customer Module columns dropdowns {string} {string} {string} {string} {string} {string} {string} {string}")
    public void validate_the_customer_module_columns_dropdowns(String Customer_Name, String Customer_Admin, String Email, String Date_Added, String URL, String Dashboard, String Widget, String API) throws InterruptedException {
        Roperation.common_pathway_to_customermodule();
        customerModulePage.validate_the_customer_module_columns_dropdowns(Customer_Name, Customer_Admin, Email, Date_Added, URL, Dashboard, Widget, API);
    }
}
