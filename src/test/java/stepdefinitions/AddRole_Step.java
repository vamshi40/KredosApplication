package stepdefinitions;

import com.driver.WebdriverIntializer;

import com.pages.AddRole_Page;
import com.utils.Roles_Operations;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddRole_Step {


    private AddRole_Page addRolePage = new AddRole_Page(WebdriverIntializer.getDriver());

    private Roles_Operations rolesOperations = new Roles_Operations(WebdriverIntializer.getDriver());


    @When("click on Roles and add new Role")
    public void click_on_roles_and_add_new_role() throws InterruptedException {

        rolesOperations.common_pathway_to_roles();
        addRolePage.click_on_roles_and_add_new_role();
    }

    @And("Enter the Role details {string} {string} {string} {string} {string}")
    public void enter_the_role_details(String Role_Name, String Application_Name, String Role_Description, String Submit, String Toaster_Message) throws InterruptedException {
        addRolePage.enter_the_role_details(Role_Name, Application_Name, Role_Description, Submit, Toaster_Message);
    }

    @Then("verify Role Added To RoleList {string}")
    public void verify_role_added_to_role_list(String Role_Name) throws InterruptedException {

        addRolePage.verify_role_added_to_role_list(Role_Name);
    }

}
