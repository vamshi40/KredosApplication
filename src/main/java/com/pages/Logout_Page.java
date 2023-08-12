package com.pages;

import com.driver.WebdriverIntializer;
import com.utils.Roles_Operations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Logout_Page {
    private WebDriver driver;

    private Roles_Operations rolesOperations = new Roles_Operations(WebdriverIntializer.getDriver());

    public Logout_Page(WebDriver driver) {

        this.driver = driver;
    }

    public void verify_logout_by_selecting_user_dropdown_option() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        rolesOperations.verifyLoginButton();
        rolesOperations.enterValidCredentials("kredosadmin", "vassarlabs123");
        rolesOperations.validateLogout();
        rolesOperations.verifyLoginButton();

    }

    public void logout_successfull_and_browse_back() {
        rolesOperations.verifyLoginButton();
        rolesOperations.enterValidCredentials("kredosadmin", "vassarlabs123");
        rolesOperations.validateLogout();

        rolesOperations.verifyLoginButton();
        rolesOperations.browserBack();
        rolesOperations.verifyLoginButton();
    }

    public void logout_successfull_and_refresh() {
        rolesOperations.verifyLoginButton();
        rolesOperations.enterValidCredentials("kredosadmin", "vassarlabs123");
        rolesOperations.validateLogout();
        rolesOperations.verifyLoginButton();
        rolesOperations.refreshBrowser();
        rolesOperations.verifyLoginButton();
    }
}
