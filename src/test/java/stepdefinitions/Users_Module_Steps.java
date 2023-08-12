package stepdefinitions;

import com.driver.WebdriverIntializer;
import com.pages.Users_Module_Page;
import com.utils.Roles_Operations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class Users_Module_Steps {


    private Roles_Operations Roperation = new Roles_Operations(WebdriverIntializer.getDriver());

    private Users_Module_Page Usersmodulepage = new Users_Module_Page(WebdriverIntializer.getDriver());


    @Given("Login into the application and goto Users Module {string} {string}")
    public void login_into_the_application_and_goto_users_module(String username, String password) throws InterruptedException {

      //  Roperation.common_pathway_to_users();
    }

    @And("Validate the users Module columns dropdowns {string} {string} {string} {string} {string} {string} {string}")
    public void validate_the_users_module_columns_dropdowns(String Email, String User_Name, String Customername, String Role, String Applications, String Last_Login, String Status) throws InterruptedException {

        Usersmodulepage.validate_the_users_module_columns_dropdowns(Email, User_Name, Customername, Role, Applications, Last_Login, Status);

    }
}
