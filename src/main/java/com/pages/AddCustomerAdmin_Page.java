package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class AddCustomerAdmin_Page {
    private WebDriver driver;

    boolean Customerfound = false;

    boolean Value = false;





    private By customerAdmin_Button = By.xpath("//button[text()=' Add Customer Admin ']");
    private By customerAdmin_Text = By.xpath("//h4[text()='Add Customer Admin']");
    private By customerAdmin_Email = By.xpath("//*[@placeholder='Enter Email']");
    private By customerAdmin_FirstName = By.xpath("//*[@placeholder='Enter First Name']");
    private By customerAdmin_LastName = By.xpath("//*[@placeholder='Enter Last Name']");
    private By customerAdmin_MobileNumber = By.xpath("//label[text()='Mobile Number']//following-sibling::div//input");
    private By customerAdmin_UserName = By.xpath("//*[@placeholder='Enter User Name']");
    private By cancel_Button = By.xpath("//button[text()='Cancel ']");
    private By submit_Button = By.xpath("//button[text()='Submit ']");
    private By close_Button = By.xpath("//*[@class='close']");
    private By toasterMessage = By.xpath("//div[@id='toast-container']/div/div");
    private By successfullMessage = By.xpath("//*[@id='toast-container']");



    public AddCustomerAdmin_Page(WebDriver driver) {
        this.driver = driver;
    }

    public void click_on_customermodule_and_click_on_the_edit_customer(String Customer_Name) throws InterruptedException {


        Thread.sleep(3000);

        List<WebElement> tableRows = driver.findElements(By.xpath("//*[@id='customerlist']/tbody/tr"));

        int tableRowsSize = tableRows.size(); // Get the size of tableRows
        for (int i = 1; i < tableRowsSize; i++) {
            String actual = driver.findElement(By.xpath("//*[@id='customerlist']/tbody/tr[" + i + "]/td[2]")).getText();

            if (Customer_Name.equalsIgnoreCase(actual)) {
                Assert.assertEquals(actual, Customer_Name, "Expected : " + Customer_Name + " But found : " + actual);
                WebElement click_EditCustomer = driver.findElement(By.xpath("//*[@id='customerlist']/tbody/tr[" + i + "]/td[1]/div/button[2]"));
                click_EditCustomer.click();
                Customerfound = true;
                break;
            }
        }


    }

    public void click_on_the_add_customer_admin_and_enter(String Email, String First_Name, String Last_Name, String Mobile_Number, String User_Name, String Submit, String Toaster_Message) throws InterruptedException {

        if(Customerfound){


            driver.findElement(customerAdmin_Button).isDisplayed();
            Thread.sleep(1000);
            driver.findElement(customerAdmin_Button).click();

            if(Email.length()>0) {
                driver.findElement(customerAdmin_Email).sendKeys(Email);
            }
            if(First_Name.length()>0) {
                driver.findElement(customerAdmin_FirstName).sendKeys(First_Name);
            }
            if(Last_Name.length()>0) {
                driver.findElement(customerAdmin_LastName).sendKeys(Last_Name);
            }
            if(Mobile_Number.length()>0) {
                driver.findElement(customerAdmin_MobileNumber).sendKeys(Mobile_Number);
            }
            if(User_Name.length()>0) {
                driver.findElement(customerAdmin_UserName).sendKeys(User_Name);
            }

            driver.findElement(submit_Button).click();

            if(Submit.equalsIgnoreCase("Success")){

                Thread.sleep(500);
                driver.findElement(toasterMessage).isDisplayed();
                String actualMessage = driver.findElement(toasterMessage).getText();
                Assert.assertEquals(Toaster_Message, actualMessage);
                Thread.sleep(1000);
                Assert.assertEquals(actualMessage, Toaster_Message, "Expected : " + Toaster_Message + " But found : " + actualMessage);
                Value = true;
                driver.findElement(cancel_Button).click();






            }else if(Submit.equalsIgnoreCase("Fail")){


                Thread.sleep(500);
                driver.findElement(toasterMessage).isDisplayed();
                String actualMessage = driver.findElement(toasterMessage).getText();
                Assert.assertEquals(actualMessage, Toaster_Message, "Expected : " + Toaster_Message + " But found : " + actualMessage);


            }else{
                System.out.println("Enter All Mandatory Fields");
            }




        }else{
            System.out.println("Customer Not Found");
        }


    }


}
