package stepdefinitions;

import com.driver.WebdriverIntializer;
import com.pages.DeleteUser_Page;
import com.utils.Roles_Operations;
import io.cucumber.java.en.And;

public class DeleteUser_Step {

    private Roles_Operations rolesOperations = new Roles_Operations(WebdriverIntializer.getDriver());

    private DeleteUser_Page deleteUserPage = new DeleteUser_Page(WebdriverIntializer.getDriver());

    @And("click on UsersModule and click on the DeleteUser {string} {string}")
    public void click_on_users_module_and_click_on_the_delete_user(String Email, String Toaster_Message) throws InterruptedException {
        rolesOperations.common_pathway_to_users();
        deleteUserPage.click_on_users_module_and_click_on_the_delete_user(Email, Toaster_Message);
    }

}
