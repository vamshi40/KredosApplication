package stepdefinitions;

import com.driver.WebdriverIntializer;
import com.pages.AddUser_Page;
import com.utils.Roles_Operations;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddUser_Step {


    private AddUser_Page addUserPage = new AddUser_Page(WebdriverIntializer.getDriver());
    private Roles_Operations rolesOperations= new Roles_Operations(WebdriverIntializer.getDriver());



    @When("click on UsersModule and add new user")
    public void click_on_users_module_and_add_new_user() throws InterruptedException {

        rolesOperations.common_pathway_to_users();
        addUserPage.click_on_users_module_and_add_new_user();

    }

    @And("Enter the User Details {string} {string} {string} {string} {string} {string} {string} {string}")
    public void enter_the_user_details(String Email, String First_Name, String Last_Name, String Mobile_Number, String User_Name, String Select_Customers, String Add_Button, String Toaster_Message) throws InterruptedException {
        addUserPage.enter_the_user_details(Email, First_Name, Last_Name, Mobile_Number, User_Name, Select_Customers, Add_Button, Toaster_Message);
    }

    @Then("verify User Added To Userlist {string}")
    public void verify_user_added_to_userlist(String User_Name) throws InterruptedException {

        addUserPage.verify_user_added_to_userlist(User_Name);
    }
}
