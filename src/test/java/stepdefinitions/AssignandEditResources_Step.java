package stepdefinitions;

import com.driver.WebdriverIntializer;
import com.pages.AssignandEditResources_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AssignandEditResources_Step {


    private AssignandEditResources_Page assignandEditResourcesPage = new AssignandEditResources_Page(WebdriverIntializer.getDriver());

    @And("Click on the Edit Resources button and assign the resources {string} {string} {string} {string} {string}")
    public void click_on_the_edit_resources_button_and_assign_the_resources(String Apis, String Dashboard, String Widget, String submit, String toaster_message) throws InterruptedException {
        assignandEditResourcesPage.click_on_the_edit_resources_button_and_assign_the_resources(Apis, Dashboard, Widget, submit, toaster_message);
    }

    @Then("Verify the assigned Resources {string} {string} {string} {string}")
    public void verify_the_assigned_resources(String Apis, String Dashboard, String Widget, String Customer_Name) throws InterruptedException {

        assignandEditResourcesPage.verify_the_assigned_resources(Apis, Dashboard, Widget, Customer_Name);

    }



}
