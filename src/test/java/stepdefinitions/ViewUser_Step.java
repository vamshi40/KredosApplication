package stepdefinitions;

import com.driver.WebdriverIntializer;
import com.pages.ViewUser_Page;
import com.utils.Roles_Operations;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ViewUser_Step {


    private ViewUser_Page viewUserPage = new ViewUser_Page(WebdriverIntializer.getDriver());

    private Roles_Operations rolesOperations = new Roles_Operations(WebdriverIntializer.getDriver());


    @And("click on UsersModule and click on the ViewUser {string}")
    public void click_on_users_module_and_click_on_the_view_user(String Email) throws InterruptedException {

        rolesOperations.common_pathway_to_users();
        viewUserPage.click_on_users_module_and_click_on_the_view_user(Email);
    }

    @Then("Verify the userdetails {string} {string} {string} {string} {string}")
    public void verify_the_userdetails(String Email, String First_Name, String Last_Name, String Mobile_Number, String User_Name) throws InterruptedException {
        viewUserPage.verify_the_userdetails(Email, First_Name, Last_Name, Mobile_Number, User_Name);
    }


}
