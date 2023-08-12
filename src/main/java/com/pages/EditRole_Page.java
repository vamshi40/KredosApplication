package com.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class EditRole_Page {

    private WebDriver driver;


    boolean Value = false;

    private By toasterMessage = By.xpath("//div[@id='toast-container']/div/div");
    private By tableRows = By.xpath("//*[@id='customerlist']/tbody/tr");


    private By btn_AddRole = By.xpath("//button[text()=' Add Role ']");

    private By txt_RoleName = By.id("name");

    private By list_Applications = By.xpath("//select[@name='application']");


    private By role_Description = By.xpath("//textarea[@placeholder='Write Role description...']");


    private By btn_Update = By.xpath("//button[normalize-space()='Update']");


    private By role_Names = By.xpath("//*[@id='rolelist']/tbody/tr/td[2]");


    public EditRole_Page(WebDriver driver) {

        this.driver = driver;
    }


    public void click_on_rolesmodule_and_click_on_the_editrole(String Role_Name) throws InterruptedException {


        List<WebElement> role_Names = driver.findElements(By.xpath("//*[@id='rolelist']/tbody/tr/td[2]"));

        for (int i = 1; i <= role_Names.size(); i++) {
            String actual = driver.findElement(By.xpath("//*[@id='rolelist']/tbody/tr[" + i + "]/td[2]")).getText();
            Thread.sleep(1000);

            if (actual.contains(Role_Name)) {
                WebElement editRole = driver.findElement(By.xpath("//*[@id='rolelist']/tbody/tr[" + i + "]/td[1]/div/button[2]"));
                Thread.sleep(3000);
                editRole.click();
                break;
            }

            // If the element is not found in the current view, scroll down the page
            if (i == role_Names.size()) {
                WebElement lastElement = driver.findElement(By.xpath("//*[@id='rolelist']/tbody/tr[" + i + "]/td[2]"));
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].scrollIntoView();", lastElement);
                Thread.sleep(1000);
                i = 0; // Reset the loop counter to start from the top after scrolling
            }
        }

    }

    public void enter_the_updated_details(String NRole_Name, String Napplication_Name, String Ndescription, String Submit, String Toaster_Message) throws InterruptedException {

        driver.findElement(By.xpath("(//h4[normalize-space()='Edit Role'])[1]")).isDisplayed();

        if (NRole_Name.length() > 0) {
            Thread.sleep(2000);

            driver.findElement(txt_RoleName).click();
            driver.findElement(txt_RoleName).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            driver.findElement(txt_RoleName).sendKeys(NRole_Name);

        }
        if (Ndescription.length() > 0) {
            driver.findElement(role_Description).click();
            driver.findElement(role_Description).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            driver.findElement(role_Description).sendKeys(Ndescription);
        }

        if (Napplication_Name.length() > 0) {

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
            driver.findElement(list_Applications).isDisplayed();
            driver.findElement(list_Applications).click();
            WebElement dropdownElement = driver.findElement(list_Applications);
            Select select = new Select(dropdownElement);
            select.selectByVisibleText(Napplication_Name);
        }


        WebElement lastElement = driver.findElement(btn_Update);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", lastElement);

        driver.findElement(btn_Update).click();

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

    public void verify_the_updated_role_present_in_the_list(String NRole_Name) throws InterruptedException {

        if (Value) {

            Thread.sleep(4000);
            List<WebElement> tableRows = driver.findElements(By.xpath("//*[@id='rolelist']/tbody/tr"));

            int tableRowsSize = tableRows.size(); // Get the size of tableRows
            for (int i = 1; i < tableRowsSize; i++) {
                String actual = driver.findElement(By.xpath("//*[@id='rolelist']/tbody/tr[" + i + "]/td[2]")).getText();

                if (NRole_Name.equalsIgnoreCase(actual)) {
                    Assert.assertEquals(actual, NRole_Name, "Expected : " + NRole_Name + " But found : " + actual);
                    System.out.println("" + actual);
                    break;
                }
            }

        }
    }
}
