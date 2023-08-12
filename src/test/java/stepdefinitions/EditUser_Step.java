package stepdefinitions;

import com.driver.WebdriverIntializer;
import com.pages.EditUser_Page;
import com.utils.Roles_Operations;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditUser_Step {

private EditUser_Page editUserPage = new EditUser_Page(WebdriverIntializer.getDriver());
private Roles_Operations rolesOperations = new Roles_Operations(WebdriverIntializer.getDriver());



    @When("click on UsersModule and click on the EditUser {string}")
    public void click_on_users_module_and_click_on_the_edit_user(String Email) throws InterruptedException {

        rolesOperations.common_pathway_to_users();
        editUserPage.click_on_users_module_and_click_on_the_edit_user(Email);
    }

    @And("Enter the Updated User Details {string} {string} {string}")
    public void enter_the_updated_user_details(String NEmail, String Update_Btn, String Toaster_Message) throws InterruptedException {

        editUserPage.enter_the_updated_user_details(NEmail,Update_Btn,Toaster_Message);
    }

    @Then("Verify the Updated User Email present in the list {string}")
    public void verify_the_updated_user_email_present_in_the_list(String NEmail) throws InterruptedException {

        editUserPage.verify_the_updated_user_email_present_in_the_list(NEmail);
    }
}
