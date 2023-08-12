package stepdefinitions;

import com.driver.WebdriverIntializer;
import com.pages.Logout_Page;
import com.utils.Roles_Operations;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;


public class Logout_Step {


    private Logout_Page logoutPage = new Logout_Page(WebdriverIntializer.getDriver());


    @Given("Login to Kredos Application")
    public void login_to_kredos_application() {


    }

    @And("Verify logoutBySelectingUserDropdownOption")
    public void verify_logout_by_selecting_user_dropdown_option() {

        logoutPage.verify_logout_by_selecting_user_dropdown_option();

    }

    @And("logoutSuccessfullAndBrowseBack")
    public void logout_successfull_and_browse_back() {
        logoutPage.logout_successfull_and_browse_back();


    }

    @And("logoutSuccessfullAndRefresh")
    public void logout_successfull_and_refresh() {
        logoutPage.logout_successfull_and_refresh();


    }
}
