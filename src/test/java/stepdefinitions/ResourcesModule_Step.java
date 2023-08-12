package stepdefinitions;

import com.driver.WebdriverIntializer;
import com.pages.ResourcesModule_Page;
import com.utils.Roles_Operations;
import io.cucumber.java.en.And;

public class ResourcesModule_Step {

    private Roles_Operations Roperation = new Roles_Operations(WebdriverIntializer.getDriver());

    private ResourcesModule_Page resourcesModulePage = new ResourcesModule_Page(WebdriverIntializer.getDriver());

    @And("Validate the Resources Module columns dropdowns {string} {string} {string} {string} {string}")
    public void validate_the_resources_module_columns_dropdowns(String Resource_Name, String Description, String Resource_Type, String Application, String Status) throws InterruptedException {
        Roperation.common_pathway_to_resources();
        resourcesModulePage.validate_the_resources_module_columns_dropdowns(Resource_Name, Description, Resource_Type, Application, Status);
    }
}
