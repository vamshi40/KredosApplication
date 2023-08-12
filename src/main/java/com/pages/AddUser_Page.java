package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class AddUser_Page {


    private WebDriver driver;

    boolean Value = false;



    // For btn_AddUser
    private By btn_AddUser = By.xpath("//button[text()=' Add User ']");

    // For txt_Email
    private By txt_Email = By.xpath("//*[@formcontrolname='email']");

    // For txt_FirstName
    private By txt_FirstName = By.xpath("//*[@formcontrolname='firstName']");

    // For txt_LastName
    private By txt_LastName = By.xpath("//*[@formcontrolname='lastName']");

    // For txt_MobileNumber
    private By txt_MobileNumber = By.xpath("//*[@name='primaryMobileNo']//input");

    // For txt_UserName
    private By txt_UserName = By.xpath("//*[@formcontrolname='username']");

    // For customer_Dropdown
    private By customer_Dropdown = By.xpath("//select[@id='customers']");

    // For btn_Add
    private By btn_Add = By.xpath("//button[text()='Add']");

    // For successfullMessage
    private By toasterMessage = By.xpath("//div[@id='toast-container']/div/div");

    private By btn_Cancel = By.xpath("//button[text()='Cancel ']");



    public AddUser_Page(WebDriver driver) {
        this.driver = driver;
    }

    public void click_on_users_module_and_add_new_user() {


        driver.findElement(btn_AddUser).click();

    }

    public void enter_the_user_details(String Email, String First_Name, String Last_Name, String Mobile_Number, String User_Name, String Select_Customers, String Add_Button, String Toaster_Message) throws InterruptedException {




        if(Email.length()>0){

            driver.findElement(txt_Email).click();
            driver.findElement(txt_Email).sendKeys(Email);

        }
        if(First_Name.length()>0){

            driver.findElement(txt_FirstName).click();
            driver.findElement(txt_FirstName).sendKeys(First_Name);

        }
        if(Last_Name.length()>0){
            driver.findElement(txt_LastName).click();
            driver.findElement(txt_LastName).sendKeys(Last_Name);

        }
        if(Mobile_Number.length()>0){

            driver.findElement(txt_MobileNumber).click();
            driver.findElement(txt_MobileNumber).sendKeys(Mobile_Number);
        }
        if(User_Name.length()>0){
            driver.findElement(txt_UserName).click();
            driver.findElement(txt_UserName).sendKeys(User_Name);


        }
        if(Select_Customers.length()>0){


            System.out.println("" + Select_Customers);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
            Thread.sleep(3000);
            driver.findElement(customer_Dropdown).isDisplayed();
            driver.findElement(customer_Dropdown).click();
            Thread.sleep(3000);
            WebElement dropdownElement = driver.findElement(customer_Dropdown);
            Select select = new Select(dropdownElement);
            select.selectByVisibleText(Select_Customers);






        }


        driver.findElement(btn_Add).click();
        if (Add_Button.equalsIgnoreCase("Success")) {


            Thread.sleep(500);
            driver.findElement(toasterMessage).isDisplayed();
            String actualMessage = driver.findElement(toasterMessage).getText();
            Thread.sleep(1000);
            Assert.assertEquals(actualMessage, Toaster_Message, "Expected : " + Toaster_Message + " But found : " + actualMessage);
            Value = true;



        } else if (Add_Button.equalsIgnoreCase("Fail")) {


            Thread.sleep(500);
            driver.findElement(toasterMessage).isDisplayed();
            String actualMessage = driver.findElement(toasterMessage).getText();
            Assert.assertEquals(actualMessage, Toaster_Message, "Expected : " + Toaster_Message + " But found : " + actualMessage);

        } else {

            System.out.println("Enter All Mandatory Fields");
        }

    }
    public void verify_user_added_to_userlist(String User_Name) throws InterruptedException {

        if (Value) {

            Thread.sleep(4000);
            List<WebElement> tableRows = driver.findElements(By.xpath("//*[@id='userlist']/tbody/tr"));

            int tableRowsSize = tableRows.size(); // Get the size of tableRows
            for (int i = 1; i < tableRowsSize; i++) {
                String actual = driver.findElement(By.xpath("//*[@id='userlist']/   tbody/tr[" + i + "]/td[3]")).getText();

                if (User_Name.equalsIgnoreCase(actual)) {
                    Assert.assertEquals(actual, User_Name, "Expected : " + User_Name + " But found : " + actual);
                    System.out.println("---"+actual);
                    break;
                }
            }

        }



    }
}
