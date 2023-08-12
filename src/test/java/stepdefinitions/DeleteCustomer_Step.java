package stepdefinitions;

import com.driver.WebdriverIntializer;
import com.pages.DeleteCustomer_Page;
import com.utils.Roles_Operations;
import io.cucumber.java.en.And;

public class DeleteCustomer_Step {


    private Roles_Operations rolesOperations = new Roles_Operations(WebdriverIntializer.getDriver());

    private DeleteCustomer_Page deleteCustomerPage = new DeleteCustomer_Page(WebdriverIntializer.getDriver());

    @And("click on Customermodule and Click on the DeleteCustomer {string} {string}")
    public void click_on_customermodule_and_click_on_the_delete_customer(String Customer_Name, String Toaster_Message) throws InterruptedException {


        rolesOperations.common_pathway_to_customermodule();
        deleteCustomerPage.click_on_customermodule_and_click_on_the_delete_customer(Customer_Name,Toaster_Message);
    }

}
