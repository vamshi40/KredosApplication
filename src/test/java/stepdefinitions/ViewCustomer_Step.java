package stepdefinitions;

import com.driver.WebdriverIntializer;
import com.pages.ViewCustomer_Page;
import com.utils.Roles_Operations;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ViewCustomer_Step {

    private ViewCustomer_Page viewCustomerPage = new ViewCustomer_Page(WebdriverIntializer.getDriver());
    private Roles_Operations rolesOperations = new Roles_Operations(WebdriverIntializer.getDriver());

    @And("click on Customermodule and Click on the ViewCustomer {string}")
    public void click_on_customermodule_and_click_on_the_view_customer(String Customer_Name) throws InterruptedException {
        rolesOperations.common_pathway_to_customermodule();
        viewCustomerPage.click_on_customermodule_and_click_on_the_view_customer(Customer_Name);
    }

    @Then("Verify the Details {string} {string} {string} {string} {string} {string}")
    public void verify_the_details(String Customer_Name, String Communication_Email_Address, String Primary_Contact_Number, String Secondary_Contact_Number, String Communication_Address, String Billing_Address) throws InterruptedException {
        viewCustomerPage.verify_the_details(Customer_Name, Communication_Email_Address, Primary_Contact_Number, Secondary_Contact_Number, Communication_Address, Billing_Address);
    }
}
