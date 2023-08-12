package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class EditCustomer_Page {


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


    public EditCustomer_Page(WebDriver driver) {
        this.driver = driver;
    }

    public void enter_the(String NCustomer_Name, String NCommunication_Email_Address, String NPrimary_Contact_Number, String NSecondary_Contact_Number, String NCommunication_Address, String NBilling_Address, String Submit, String Toaster_Message) throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//h1[text()='Customers']")).isDisplayed();
        Thread.sleep(3000);


        if (NCustomer_Name.length() >= 0) {

            driver.findElement(custname).click();
            driver.findElement(custname).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            driver.findElement(custname).sendKeys(NCustomer_Name);


        }
        if (NCommunication_Email_Address.length() >= 0) {
            driver.findElement(communicationemailadd).click();
            driver.findElement(communicationemailadd).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            driver.findElement(communicationemailadd).sendKeys(NCommunication_Email_Address);
        }
        if (NPrimary_Contact_Number.length() >= 0) {

            driver.findElement(primarycontactno).click();
            driver.findElement(primarycontactno).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            driver.findElement(primarycontactno).sendKeys(NPrimary_Contact_Number);

        }
        if (NSecondary_Contact_Number.length() >= 0) {

            driver.findElement(secondarycontactno).click();
            driver.findElement(secondarycontactno).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            driver.findElement(secondarycontactno).sendKeys(NSecondary_Contact_Number);

        }
        if (NCommunication_Address.length() >= 0) {

            driver.findElement(communicationadd).click();
            driver.findElement(communicationadd).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            driver.findElement(communicationadd).sendKeys(NCommunication_Address);

        }
        if (NBilling_Address.length() >= 0) {
            driver.findElement(billingadd).click();
            driver.findElement(billingadd).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            driver.findElement(billingadd).sendKeys(NBilling_Address);

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

    public void verify_the_customer_added_to_customer_list(String NCustomer_Name) throws InterruptedException {

        if (Value) {

            Thread.sleep(4000);
            List<WebElement> tableRows = driver.findElements(By.xpath("//*[@id='customerlist']/tbody/tr"));

            int tableRowsSize = tableRows.size(); // Get the size of tableRows
            for (int i = 1; i < tableRowsSize; i++) {
                String actual = driver.findElement(By.xpath("//*[@id='customerlist']/   tbody/tr[" + i + "]/td[2]")).getText();

                if (NCustomer_Name.equalsIgnoreCase(actual)) {
                    Assert.assertEquals(actual, NCustomer_Name, "Expected : " + NCustomer_Name + " But found : " + actual);
                    System.out.println(""+actual);
                    break;
                }
            }

        }


    }

}
