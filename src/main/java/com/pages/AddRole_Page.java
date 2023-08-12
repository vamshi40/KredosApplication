package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class AddRole_Page {

    private WebDriver driver;

    // For roles_Link

    boolean Value = false;

    private By toasterMessage = By.xpath("//div[@id='toast-container']/div/div");
    private By tableRows = By.xpath("//*[@id='customerlist']/tbody/tr");

    // For btn_AddRole
    private By btn_AddRole = By.xpath("//button[text()=' Add Role ']");

    // For txt_RoleName
    private By txt_RoleName = By.id("name");

    // For list_Applications
    private By list_Applications = By.xpath("//select[@id='application']");

    // For role_Description
    private By role_Description = By.name("description");

    // For btn_Submit
    private By btn_Submit = By.xpath("//button[text()='Submit']");

    // For role_Names
    private By role_Names = By.xpath("//*[@id='rolelist']/tbody/tr/td[2]");





    public AddRole_Page(WebDriver driver) {
        this.driver = driver;
    }



    public void click_on_roles_and_add_new_role() throws InterruptedException {


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(btn_AddRole).isDisplayed();

        Thread.sleep(5000);
        driver.findElement(btn_AddRole).click();

    }

    public void enter_the_role_details(String Role_Name, String Application_Name, String Role_Description, String Submit, String Toaster_Message) throws InterruptedException {

        if(Role_Name.length()>0){

            driver.findElement(txt_RoleName).click();
            driver.findElement(txt_RoleName).sendKeys(Role_Name);

        }
        if(Application_Name.length()>0){

            driver.findElement(list_Applications).click();
            WebElement dropdownElement = driver.findElement(list_Applications);
            Select select = new Select(dropdownElement);
            select.selectByVisibleText(Application_Name);
        }
        if(Role_Description.length()>0){

            driver.findElement(role_Description).click();
            driver.findElement(role_Description).sendKeys(Role_Description);
        }


        driver.findElement(btn_Submit).click();

        if (Submit.equalsIgnoreCase("Success")) {


            Thread.sleep(500);
            driver.findElement(toasterMessage).isDisplayed();
            String actualMessage = driver.findElement(toasterMessage).getText();
            Thread.sleep(1000);
            Assert.assertEquals(actualMessage, Toaster_Message, "Expected : " + Toaster_Message + " But found : " + actualMessage);
            Value = true;


        } else if (Submit.equalsIgnoreCase("Fail")) {


            Thread.sleep(500);
            driver.findElement(toasterMessage).isDisplayed();
            String actualMessage = driver.findElement(toasterMessage).getText();
            Assert.assertEquals(actualMessage, Toaster_Message, "Expected : " + Toaster_Message + " But found : " + actualMessage);

        } else {

            System.out.println("Enter All Mandatory Fields");
        }


    }

    public void verify_role_added_to_role_list(String Role_Name) throws InterruptedException {


        if (Value) {

            Thread.sleep(4000);

            List<WebElement> tableRows = driver.findElements(By.xpath("//*[@id='rolelist']/tbody/tr"));

            int tableRowsSize = tableRows.size(); // Get the size of tableRows
            for (int i = 1; i < tableRowsSize; i++) {
                String actual = driver.findElement(By.xpath("//*[@id='rolelist']/tbody/tr[" + i + "]/td[2]")).getText();

                if (Role_Name.equalsIgnoreCase(actual)) {
                    Assert.assertEquals(actual, Role_Name, "Expected : " + Role_Name + " But found : " + actual);
                    System.out.println(""+actual);
                    break;
                }
            }

        }

    }


}
