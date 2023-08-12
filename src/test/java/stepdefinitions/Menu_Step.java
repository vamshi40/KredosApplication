package stepdefinitions;

import com.driver.WebdriverIntializer;
import com.pages.Menu_Page;
import io.cucumber.java.en.And;

public class Menu_Step {


    private Menu_Page menuPage = new Menu_Page(WebdriverIntializer.getDriver());

    @And("Verify the Menu Modules")
    public void verify_the_menu_modules() {
        menuPage.verify_the_menu_modules();
    }

}
