package stepdefinitions;

import com.driver.WebdriverIntializer;
import com.pages.ViewRole_Page;
import com.utils.Roles_Operations;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ViewRole_Step {


    private ViewRole_Page viewRolePage = new ViewRole_Page(WebdriverIntializer.getDriver());
    private Roles_Operations rolesOperations = new Roles_Operations(WebdriverIntializer.getDriver());

    @And("click on Rolesmodule and click on the Viewrole {string}")
    public void click_on_rolesmodule_and_click_on_the_viewrole(String Role_Name) throws InterruptedException {
        rolesOperations.common_pathway_to_roles();
        viewRolePage.click_on_rolesmodule_and_click_on_the_viewrole(Role_Name);
    }

    @Then("Verify the Role Details {string} {string} {string}")
    public void verify_the_role_details(String Role_Name, String Application_Name, String Role_Description) throws InterruptedException {
        viewRolePage.verify_the_role_details(Role_Name, Application_Name, Role_Description);
    }
}
