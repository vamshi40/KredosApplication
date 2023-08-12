package stepdefinitions;

import com.driver.WebdriverIntializer;
import com.pages.EditCustomer_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class EditCustomer_Step {



    private EditCustomer_Page editCustomerPage = new EditCustomer_Page(WebdriverIntializer.getDriver());

    @And("Enter the {string} {string} {string} {string} {string} {string} {string} {string}")
    public void enter_the(String NCustomer_Name, String NCommunication_Email_Address, String NPrimary_Contact_Number, String NSecondary_Contact_Number, String NCommunication_Address, String NBilling_Address, String Submit, String Toaster_Message) throws InterruptedException {

        editCustomerPage.enter_the(NCustomer_Name, NCommunication_Email_Address, NPrimary_Contact_Number, NSecondary_Contact_Number, NCommunication_Address, NBilling_Address, Submit, Toaster_Message);
    }

    @Then("verify the Customer Added To CustomerList {string}")
    public void verify_the_customer_added_to_customer_list(String NCustomer_Name) throws InterruptedException {
        editCustomerPage.verify_the_customer_added_to_customer_list(NCustomer_Name);

    }


}
