package com.pages;

import com.driver.WebdriverIntializer;
import com.utils.Roles_Operations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AssignandEditResources_Page {


    private WebDriver driver;
    boolean Value = false;

    private Roles_Operations rolesOperations = new Roles_Operations(WebdriverIntializer.getDriver());

    private By Submit_btn = By.xpath("//button[normalize-space()='Submit']");
    private By toasterMessage = By.xpath("//div[@id='toast-container']/div/div");

    private By Assignresources_btn = By.xpath("//*[text()='kredos Messaging  module']//following::i[@class=\"bx bx-pencil\"]");

    private By deleteAppilications_Button = By.xpath("//td[text()='kredos Messaging  module']/parent::tr//span//button[2]");


    private By successfullMessage = By.xpath("//div[@id='toast-container']/div/div");
    private By warning_Symbol = By.xpath("//*[@class='close']//following-sibling::div//i");
    private By warning_Text1 = By.xpath("//*[@class='close']//following-sibling::div//h3");
    private By warning_Text2 = By.xpath("//*[@class='close']//following-sibling::div//p");
    private By deleteCancel_Button = By.xpath("//button[text()='Cancel']");
    private By deleteYes_Button = By.xpath("//button[text()='Yes']");
    private By deleteClose_Button = By.xpath("//*[@class='close']");


    public AssignandEditResources_Page(WebDriver driver) {
        this.driver = driver;
    }

    public void click_on_the_edit_resources_button_and_assign_the_resources(String Apis, String Dashboard, String Widget, String submit, String toaster_message) throws InterruptedException {


        Thread.sleep(5000);

        driver.findElement(Assignresources_btn).click();

        if (Apis.length() > 0) {

            Thread.sleep(5000);
            String[] a = Apis.split(",");
            for (int i = 0; i < a.length; i++) {


                System.out.println("" + a[i]);
                driver.findElement(By.xpath("//span[normalize-space()='" + a[i] + "']")).isDisplayed();
                driver.findElement(By.xpath("//span[normalize-space()='" + a[i] + "']")).click();

                Thread.sleep(500);
            }


        }
        if (Dashboard.length() > 0) {

            driver.findElement(By.xpath("//span[normalize-space()='" + Dashboard + "']")).isDisplayed();
            driver.findElement(By.xpath("//span[normalize-space()='" + Dashboard + "']")).click();

        }
        if (Widget.length() > 0) {

            Thread.sleep(5000);
            String[] w = Widget.split(",");
            for (int i = 0; i < w.length; i++) {



                driver.findElement(By.xpath("//span[normalize-space()='" + w[i] + "']")).isDisplayed();
                driver.findElement(By.xpath("//span[normalize-space()='" + w[i] + "']")).click();

                Thread.sleep(500);
            }
        }
        if (submit.equalsIgnoreCase("Success")) {

            driver.findElement(Submit_btn).click();
            Thread.sleep(500);
            driver.findElement(toasterMessage).isDisplayed();
            String actualMessage = driver.findElement(toasterMessage).getText();
            Thread.sleep(1000);
            Assert.assertEquals(actualMessage, toaster_message, "Expected : " + toaster_message + " But found : " + actualMessage);
            Value = true;


        } else if (submit.equalsIgnoreCase("Fail")) {


            driver.findElement(Submit_btn).click();
            Thread.sleep(500);
            driver.findElement(toasterMessage).isDisplayed();
            String actualMessage = driver.findElement(toasterMessage).getText();
            Assert.assertEquals(actualMessage, toaster_message, "Expected : " + toaster_message + " But found : " + actualMessage);

            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();

            Thread.sleep(1000);
            driver.findElement(deleteAppilications_Button).isDisplayed();
            driver.findElement(deleteAppilications_Button).isEnabled();

            driver.findElement(deleteAppilications_Button).click();
            driver.findElement(warning_Symbol).isDisplayed();
            driver.findElement(warning_Text1).isDisplayed();
            driver.findElement(warning_Text2).isDisplayed();
            driver.findElement(deleteCancel_Button).isEnabled();
            driver.findElement(deleteYes_Button).isEnabled();
            driver.findElement(deleteClose_Button).isEnabled();
            driver.findElement(deleteYes_Button).click();
            Thread.sleep(2000);
            String message = driver.findElement(successfullMessage).getText();
            System.out.println(message);
            String value2 = null;
            if (message.contains("Deleted application successfully")) {
                value2 = "Deleted";
            }
            Assert.assertEquals("Deleted", value2, "Deleted application successfully");


        }

    }


    public void verify_the_assigned_resources(String Apis, String Dashboard, String Widget, String Customer_Name) throws InterruptedException {

        if (Value) {

            Thread.sleep(3000);
            if (Apis.length() > 0) {

                Thread.sleep(5000);
                String[] a = Apis.split(",");
                for (int i = 0; i < a.length; i++) {


                    driver.findElement(By.xpath("//span[normalize-space()='" + a[i] + "']")).isDisplayed();


                    Thread.sleep(500);
                }


            }
            if (Dashboard.length() > 0) {

                driver.findElement(By.xpath("//span[normalize-space()='" + Dashboard + "']")).isDisplayed();

            }
            if (Widget.length() > 0) {

                Thread.sleep(5000);
                String[] w = Widget.split(",");
                for (int i = 0; i < w.length; i++) {


                    driver.findElement(By.xpath("//span[normalize-space()='" + w[i] + "']")).isDisplayed();


                    Thread.sleep(500);
                }
            }
        }

        rolesOperations.common_pathway_to_applications();
        Thread.sleep(2000);


        if (Apis.length() > 0) {
            Thread.sleep(5000);
            String[] a = Apis.split(",");
            for (int i = 0; i < a.length; i++) {
                driver.findElement(By.xpath("//tbody/tr/td[2]/div/div/button//span[.='" + a[i] + "']")).click();
                Thread.sleep(500);
                boolean value = driver.findElement(By.xpath("//label[.=' " + Customer_Name + " ']//parent::div//input")).isSelected();
                if (value) {
                    Assert.assertTrue(true);
                    System.out.println("The Resource "+a[i]+" is Assigned to "+Customer_Name);
                } else {
                    Assert.assertFalse(false);
                }
                driver.findElement(By.xpath("//button[.='Back ']")).click();
                Thread.sleep(500);
            }
        }

        if (Dashboard.length() > 0) {

            driver.findElement(By.xpath("//tbody/tr/td[4]/div/div/button//span[.='" + Dashboard + "']")).click();
            Thread.sleep(500);
            boolean value = driver.findElement(By.xpath("//label[.=' " + Customer_Name + " ']//parent::div//input")).isSelected();
            if (value) {
                Assert.assertTrue(true);
                System.out.println("The Resource "+Dashboard+" is Assigned to "+Customer_Name);
            } else {
                Assert.assertFalse(false);
            }
            driver.findElement(By.xpath("//button[.='Back ']")).click();
            Thread.sleep(500);

        }
        if (Widget.length() > 0) {
            Thread.sleep(5000);
            String[] w = Widget.split(",");
            for (int i = 0; i < w.length; i++) {
                driver.findElement(By.xpath("//tbody/tr/td[5]/div/div/button//span[.='" + w[i] + "']")).click();
                Thread.sleep(500);
                boolean value = driver.findElement(By.xpath("//label[.=' " + Customer_Name + " ']//parent::div//input")).isSelected();
                if (value) {
                    Assert.assertTrue(true);
                    System.out.println("The Resource "+w[i]+" is Assigned to "+Customer_Name);
                } else {
                    Assert.assertFalse(false);
                }
                driver.findElement(By.xpath("//button[.='Back ']")).click();
                Thread.sleep(500);
            }
        }


    }

}
