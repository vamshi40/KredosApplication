package stepdefinitions;

import com.driver.WebdriverIntializer;
import com.pages.ChangePassword_Page;
import com.utils.Roles_Operations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ChangePassword_Steps {



    private Roles_Operations Roperation = new Roles_Operations(WebdriverIntializer.getDriver());
    private ChangePassword_Page changepwd = new ChangePassword_Page(WebdriverIntializer.getDriver());


    @Given("login as user {string} {string} and click on change password")
    public void login_as_user_and_click_on_change_password(String username, String password) throws InterruptedException {

        Roperation.enterValidCredentials(username, password);
        Roperation.Common_pathway_to_changepassword_for_all_Roles();

    }

    @And("Enter {string} {string}")
    public void enter(String newpassword, String confirmnewpassword) {

        changepwd.enter(newpassword, confirmnewpassword);

    }

    @And("Click on the {string} button {string} {string}")
    public void click_on_the_button(String submit, String errormsg, String toastermsg) throws InterruptedException {

        changepwd.click_on_the_button(submit, errormsg, toastermsg);

    }

    @Then("Login with updated password {string} {string}")
    public void login_with_updated_password(String username, String newpassword) throws InterruptedException {

        changepwd.login_with_updated_password(username, newpassword);

    }


}
