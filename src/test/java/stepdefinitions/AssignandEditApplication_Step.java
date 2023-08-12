package stepdefinitions;

import com.driver.WebdriverIntializer;
import com.pages.AssignandEditApplication_Page;
import com.utils.Roles_Operations;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AssignandEditApplication_Step {


    private Roles_Operations rolesOperations = new Roles_Operations(WebdriverIntializer.getDriver());

    private AssignandEditApplication_Page assignandEditApplicationPage = new AssignandEditApplication_Page(WebdriverIntializer.getDriver());


    @And("Assign the Application {string} and Verify the Assigned Application")
    public void assign_the_application_and_verify_the_assigned_application(String Application_Name) throws InterruptedException {
        assignandEditApplicationPage.assign_the_application_and_verify_the_assigned_application(Application_Name);
    }

    @Then("Delete the Assigned Application {string}")
    public void delete_the_assigned_application(String Application_Name) throws InterruptedException {
        assignandEditApplicationPage.delete_the_assigned_application(Application_Name);
    }
}
