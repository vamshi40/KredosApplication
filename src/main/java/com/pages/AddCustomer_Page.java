package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class AddCustomer_Page {

    private WebDriver driver;

    boolean Value = false;

    private By AddCustomer_btn = By.xpath("//button[normalize-space()='Add Customer']");

    private By custname = By.xpath("//input[@placeholder='Customer Name']");
    private By communicationemailadd = By.xpath("//input[@placeholder='Customer Email']");
    private By primarycontactno = By.xpath("//ngx-intl-tel-input[@name='primaryMobileNo']//input[@id='phone']");
    private By secondarycontactno = By.xpath("//ngx-intl-tel-input[@name='secondaryMobileNo']//input[@id='phone']");
    private By communicationadd = By.xpath("//input[@name='com_address']");
    private By billingadd = By.xpath("//input[@name='billing_address']");

    private By Submit_btn = By.xpath("//button[normalize-space()='Submit']");
    private By btn_Cancel = By.xpath("//button[text()='Cancel ']");


    private By toasterMessage = By.xpath("//div[@id='toast-container']/div/div");
    private By tableRows = By.xpath("//*[@id='customerlist']/tbody/tr");


    public AddCustomer_Page(WebDriver driver) {
        this.driver = driver;
    }


    public void enter(String Customer_Name, String Communication_Email_Address, String Primary_Contact_Number, String Secondary_Contact_Number, String Communication_Address, String Billing_Address, String Submit, String Toaster_Message) throws InterruptedException {


        driver.findElement(AddCustomer_btn).click();

        if (Customer_Name.length() > 0) {

            driver.findElement(custname).click();
            driver.findElement(custname).sendKeys(Customer_Name);


        }
        if (Communication_Email_Address.length() > 0) {
            driver.findElement(communicationemailadd).click();
            driver.findElement(communicationemailadd).sendKeys(Communication_Email_Address);
        }
        if (Primary_Contact_Number.length() > 0) {

            driver.findElement(primarycontactno).click();
            driver.findElement(primarycontactno).sendKeys(Primary_Contact_Number);

        }
        if (Secondary_Contact_Number.length() > 0) {

            driver.findElement(secondarycontactno).click();
            driver.findElement(secondarycontactno).sendKeys(Secondary_Contact_Number);

        }
        if (Communication_Address.length() > 0) {

            driver.findElement(communicationadd).click();
            driver.findElement(communicationadd).sendKeys(Communication_Address);

        }
        if (Billing_Address.length() > 0) {
            driver.findElement(billingadd).click();
            driver.findElement(billingadd).sendKeys(Billing_Address);

        }


        driver.findElement(Submit_btn).click();


        if (Submit.equalsIgnoreCase("Success")) {


            Thread.sleep(500);
            driver.findElement(toasterMessage).isDisplayed();
            String actualMessage = driver.findElement(toasterMessage).getText();
            Thread.sleep(1000);
            Assert.assertEquals(actualMessage, Toaster_Message, "Expected : " + Toaster_Message + " But found : " + actualMessage);
            Value = true;
            driver.findElement(btn_Cancel).click();


        } else if (Submit.equalsIgnoreCase("Fail")) {


            Thread.sleep(500);
            driver.findElement(toasterMessage).isDisplayed();
            String actualMessage = driver.findElement(toasterMessage).getText();
            Assert.assertEquals(actualMessage, Toaster_Message, "Expected : " + Toaster_Message + " But found : " + actualMessage);

        } else {

            System.out.println("Enter All Mandatory Fields");
        }

    }


    public void verify_customer_added_to_customer_list(String Customer_Name) throws InterruptedException {
        if (Value) {

            Thread.sleep(4000);
            List<WebElement> tableRows = driver.findElements(By.xpath("//*[@id='customerlist']/tbody/tr"));

            int tableRowsSize = tableRows.size(); // Get the size of tableRows
            for (int i = 1; i < tableRowsSize; i++) {
                String actual = driver.findElement(By.xpath("//*[@id='customerlist']/   tbody/tr[" + i + "]/td[2]")).getText();

                if (Customer_Name.equalsIgnoreCase(actual)) {
                    Assert.assertEquals(actual, Customer_Name, "Expected : " + Customer_Name + " But found : " + actual);
                    System.out.println("---"+actual);
                    break;
                }
            }

        }

    }
}
