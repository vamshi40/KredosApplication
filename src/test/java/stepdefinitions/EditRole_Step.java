package stepdefinitions;

import com.driver.WebdriverIntializer;
import com.pages.EditRole_Page;
import com.utils.Roles_Operations;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditRole_Step {

    private Roles_Operations rolesOperations = new Roles_Operations(WebdriverIntializer.getDriver());
    private EditRole_Page editRolePage = new EditRole_Page(WebdriverIntializer.getDriver());

    @When("click on Rolesmodule and click on the Editrole {string}")
    public void click_on_rolesmodule_and_click_on_the_editrole(String Role_Name) throws InterruptedException {
        rolesOperations.common_pathway_to_roles();
        editRolePage.click_on_rolesmodule_and_click_on_the_editrole(Role_Name);
    }

    @And("Enter the updated details {string} {string} {string} {string} {string}")
    public void enter_the_updated_details(String NRole_Name, String Napplication_Name, String Ndescription, String Submit, String Toaster_Message) throws InterruptedException {

        editRolePage.enter_the_updated_details(NRole_Name, Napplication_Name, Ndescription, Submit, Toaster_Message);
    }

    @Then("Verify the Updated role present in the list {string}")
    public void verify_the_updated_role_present_in_the_list(String NRole_Name) throws InterruptedException {

        editRolePage.verify_the_updated_role_present_in_the_list(NRole_Name);
    }
}
