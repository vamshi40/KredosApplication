package stepdefinitions;

import com.driver.WebdriverIntializer;
import com.pages.AddCustomerAdmin_Page;
import com.utils.Roles_Operations;
import io.cucumber.java.en.And;

public class AddCustomerAdmin_Step {


    private Roles_Operations rolesOperations = new Roles_Operations(WebdriverIntializer.getDriver());

    private AddCustomerAdmin_Page addCustomerAdminPage = new AddCustomerAdmin_Page(WebdriverIntializer.getDriver());

    @And("click on Customermodule and Click on the EditCustomer {string}")
    public void click_on_customermodule_and_click_on_the_edit_customer(String Customer_Name) throws InterruptedException {
        rolesOperations.common_pathway_to_customermodule();
        addCustomerAdminPage.click_on_customermodule_and_click_on_the_edit_customer(Customer_Name);
    }

    @And("Click on the AddCustomerAdmin and Enter {string} {string} {string} {string} {string} {string} {string}")
    public void click_on_the_add_customer_admin_and_enter(String Email, String First_Name, String Last_Name, String Mobile_Number, String User_Name, String Submit, String Toaster_Message) throws InterruptedException {

        addCustomerAdminPage.click_on_the_add_customer_admin_and_enter(Email, First_Name, Last_Name, Mobile_Number, User_Name, Submit, Toaster_Message);
    }

}
