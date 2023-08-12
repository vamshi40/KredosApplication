package stepdefinitions;

import com.driver.WebdriverIntializer;
import com.pages.AssignResourcesToRole_Page;
import io.cucumber.java.en.And;

public class AssignResourcesToRole_Step {


    private AssignResourcesToRole_Page assignResourcesToRolePage = new AssignResourcesToRole_Page(WebdriverIntializer.getDriver());


    @And("Assign the {string} to {string} {string}")
    public void assign_the_to(String Resources, String Application, String Toaster_Message) throws InterruptedException {

        assignResourcesToRolePage.assign_the_to(Resources, Application, Toaster_Message);
    }

}
