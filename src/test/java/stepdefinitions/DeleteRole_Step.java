package stepdefinitions;

import com.driver.WebdriverIntializer;
import com.pages.DeleteCustomer_Page;
import com.pages.DeleteRole_Page;
import com.utils.Roles_Operations;
import io.cucumber.java.en.And;

public class DeleteRole_Step {

    private Roles_Operations rolesOperations = new Roles_Operations(WebdriverIntializer.getDriver());
    private DeleteRole_Page deleteRolePage = new DeleteRole_Page(WebdriverIntializer.getDriver());

    @And("click on Rolesmodule and click on the deleterole {string} {string}")
    public void click_on_rolesmodule_and_click_on_the_deleterole(String Role_Name, String Toaster_Message) throws InterruptedException {
        rolesOperations.common_pathway_to_roles();

        deleteRolePage.click_on_rolesmodule_and_click_on_the_deleterole(Role_Name, Toaster_Message);

    }
}
