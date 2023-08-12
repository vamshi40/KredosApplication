package stepdefinitions;

import com.driver.WebdriverIntializer;
import com.pages.AddCustomer_Page;
import com.utils.Roles_Operations;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddCustomer_Step {


    private AddCustomer_Page addCustomerPage = new AddCustomer_Page(WebdriverIntializer.getDriver());

    private Roles_Operations rolesOperations = new Roles_Operations(WebdriverIntializer.getDriver());


    @Given("Login to Kredos Application with {string} and {string}")
    public void login_to_kredos_application_with_and(String Username, String Password) {
        rolesOperations.enterValidCredentials(Username, Password);
    }

    @When("click on Customermodule and add new customer")
    public void click_on_customermodule_and_add_new_customer() throws InterruptedException {

        rolesOperations.common_pathway_to_customermodule();
    }

    @And("Enter {string} {string} {string} {string} {string} {string} {string} {string}")
    public void enter(String Customer_Name, String Communication_Email_Address, String Primary_Contact_Number, String Secondary_Contact_Number, String Communication_Address, String Billing_Address, String Submit, String Toaster_Message) throws InterruptedException {

        addCustomerPage.enter(Customer_Name, Communication_Email_Address, Primary_Contact_Number, Secondary_Contact_Number, Communication_Address, Billing_Address, Submit, Toaster_Message);

    }

    @Then("verify Customer Added To CustomerList {string}")
    public void verify_customer_added_to_customer_list(String Customer_Name) throws InterruptedException {

        addCustomerPage.verify_customer_added_to_customer_list(Customer_Name);

    }


}
