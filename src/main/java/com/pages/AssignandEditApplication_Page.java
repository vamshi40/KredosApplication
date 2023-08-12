package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.time.Duration;

public class AssignandEditApplication_Page {

    private WebDriver driver;

    private By assignAppilication_Button = By.xpath("//button[normalize-space()='Assign Applications']");
    private By assignApplication_Text = By.xpath("//*[text()='Assign Applications']");
    private By kredosMessagingmodule_Application = By.xpath("//*[text()=' kredos Messaging  module ']");
    private By cancel_Button = By.xpath("//*[@class='btn btn-secondary'][text()='Cancel']");
    private By assign_Button = By.xpath("//*[@class='btn btn-primary'][text()='Assign']");
    private By close_Button = By.xpath("//*[@class='btn-close']");
    private By editAppilications_Button = By.xpath("//td[text()='kredos Messaging  module']/parent::tr//span//button[1]");
    private By deleteAppilications_Button = By.xpath("//td[text()='kredos Messaging  module']/parent::tr//span//button[2]");
    private By appilication_API = By.xpath("//h3[text()=\"API's\"]");
    private By appilication_URL = By.xpath("//h3[text()=\"URL’s\"]");
    private By appilication_DashBoard = By.xpath("//h3[text()=\"Dashboard\"]");
    private By appilication_Widget = By.xpath("//h3[text()=\"Widget\"]");
    private By cancelApplication_Button = By.xpath("//button[text()=\"Cancel\"]");
    private By editWebApplications_Button = By.xpath("//td[text()='kerdos Messaging  module']/parent::tr//span//button[1]");
    private By deleteWebApplications_Button = By.xpath("//td[text()='kerdos Messaging  module']/parent::tr//span//button[2]");
    private By successfullMessage = By.xpath("//div[@id='toast-container']/div/div");
    private By warning_Symbol = By.xpath("//*[@class='close']//following-sibling::div//i");
    private By warning_Text1 = By.xpath("//*[@class='close']//following-sibling::div//h3");
    private By warning_Text2 = By.xpath("//*[@class='close']//following-sibling::div//p");
    private By deleteCancel_Button = By.xpath("//button[text()='Cancel']");
    private By deleteYes_Button = By.xpath("//button[text()='Yes']");
    private By deleteClose_Button = By.xpath("//*[@class='close']");


    public AssignandEditApplication_Page(WebDriver driver) {
        this.driver = driver;
    }


    public void assign_the_application_and_verify_the_assigned_application(String Application_Name) throws InterruptedException {


        driver.findElement(assignAppilication_Button).isDisplayed();
        driver.findElement(assignAppilication_Button).isEnabled();
        Thread.sleep(500);
        driver.findElement(assignAppilication_Button).click();
        driver.findElement(assignApplication_Text).isDisplayed();
        driver.findElement(kredosMessagingmodule_Application).isDisplayed();

        driver.findElement(cancel_Button).isEnabled();
        driver.findElement(close_Button).isEnabled();
        if (driver.findElement(By.xpath("//*[text()='" + Application_Name + "']")).isDisplayed()) {
            driver.findElement(By.xpath("//*[text()='" + Application_Name + "']")).click();
            driver.findElement(assign_Button).isEnabled();
            driver.findElement(assign_Button).click();
            Thread.sleep(2000);
            String message = driver.findElement(successfullMessage).getText();
            System.out.println(message);
            String value1 = null;



            if (message.contains("Applications assigned/updated successfully")) {

                value1 = "Created";

            }
            Assert.assertEquals("Created", value1, "Applications assigned/updated successfully");

        }


    }

    public void delete_the_assigned_application(String Application_Name) throws InterruptedException {


        Thread.sleep(3000);

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
