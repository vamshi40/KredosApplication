package com.pages;

import org.openqa.selenium.*;
import org.testng.Assert;

import java.util.List;

public class EditUser_Page {

    private WebDriver driver;

    boolean Value = false;
    private By toasterMessage = By.xpath("//div[@id='toast-container']/div/div");
    private By btn_Update = By.xpath("//button[normalize-space()='Update']");

    private By Email_txt = By.xpath("//input[@placeholder='Email']");


    public EditUser_Page(WebDriver driver) {

        this.driver = driver;
    }
    public void click_on_users_module_and_click_on_the_edit_user(String Email) throws InterruptedException {

        List<WebElement> role_Names = driver.findElements(By.xpath("//*[@id='userlist']/tbody/tr/td[2]"));

        for (int i = 1; i <= role_Names.size(); i++) {
            String actual = driver.findElement(By.xpath("//*[@id='userlist']/tbody/tr[" + i + "]/td[2]")).getText();
            Thread.sleep(1000);

            if (actual.contains(Email)) {
                WebElement editRole = driver.findElement(By.xpath("//*[@id='userlist']/tbody/tr[" + i + "]/td[1]/div/button[2]"));
                Thread.sleep(3000);
                editRole.click();
                break;
            }

            // If the element is not found in the current view, scroll down the page
            if (i == role_Names.size()) {
                WebElement lastElement = driver.findElement(By.xpath("//*[@id='userlist']/tbody/tr[" + i + "]/td[2]"));
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].scrollIntoView();", lastElement);
                Thread.sleep(1000);
                i = 0; // Reset the loop counter to start from the top after scrolling
            }
        }
Thread.sleep(10000);

    }
    public void enter_the_updated_user_details(String NEmail, String Update_Btn, String Toaster_Message) throws InterruptedException {


        if(NEmail.length()>=0){

            driver.findElement(Email_txt).click();
            driver.findElement(Email_txt).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            driver.findElement(Email_txt).sendKeys(NEmail);
        }


        driver.findElement(btn_Update).click();

        if (Update_Btn.equalsIgnoreCase("Success")) {


            Thread.sleep(500);
            driver.findElement(toasterMessage).isDisplayed();
            String actualMessage = driver.findElement(toasterMessage).getText();
            Thread.sleep(1000);
            Assert.assertEquals(actualMessage, Toaster_Message, "Expected : " + Toaster_Message + " But found : " + actualMessage);
            Value = true;


        } else if (Update_Btn.equalsIgnoreCase("Fail")) {


            Thread.sleep(500);
            driver.findElement(toasterMessage).isDisplayed();
            String actualMessage = driver.findElement(toasterMessage).getText();
            Assert.assertEquals(actualMessage, Toaster_Message, "Expected : " + Toaster_Message + " But found : " + actualMessage);

        } else {

            System.out.println("Enter All Mandatory Fields");
        }

    }
    public void verify_the_updated_user_email_present_in_the_list(String NEmail) throws InterruptedException {

        if (Value) {

            Thread.sleep(4000);
            List<WebElement> tableRows = driver.findElements(By.xpath("//*[@id='userlist']/tbody/tr"));

            int tableRowsSize = tableRows.size(); // Get the size of tableRows
            for (int i = 1; i < tableRowsSize; i++) {
                String actual = driver.findElement(By.xpath("//*[@id='userlist']/tbody/tr[" + i + "]/td[2]")).getText();

                if (NEmail.equalsIgnoreCase(actual)) {
                    Assert.assertEquals(actual, NEmail, "Expected : " + NEmail + " But found : " + actual);
                    System.out.println("" + actual);
                    break;
                }
            }

        }
    }
}
