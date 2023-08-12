package stepdefinitions;

import com.driver.WebdriverIntializer;
import com.pages.KredosAI_Module_Page;
import com.utils.Roles_Operations;
import io.cucumber.java.en.And;

public class KredosAI_Module_Step {

    private Roles_Operations rolesOperations = new Roles_Operations(WebdriverIntializer.getDriver());

    private KredosAI_Module_Page kredosAIModulePage = new KredosAI_Module_Page(WebdriverIntializer.getDriver());

    @And("click on KredosAImodule")
    public void click_on_kredos_a_imodule() throws InterruptedException {

        rolesOperations.common_pathway_to_kredosaimodule();
        kredosAIModulePage.click_on_kredos_a_imodule();
    }
}
