package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class ViewCustomer_Page {


    private WebDriver driver;
    boolean Customerfound = false;

    private By custname = By.xpath("//strong[text()='Name']//following::span[2]");
    private By communicationemailadd = By.xpath("//strong[text()='Communication Email Address']//following::span[2]");
    private By primarycontactno = By.xpath("//strong[text()='Primary Contact Number']//following::span[2]");
    private By secondarycontactno = By.xpath("//strong[text()='Secondary Contact Number']//following::span[2]");
    private By communicationadd = By.xpath("//strong[text()='Communication Address']//following::span[2]");
    private By billingadd = By.xpath("//strong[text()='Billing Address']//following::span[2]");

    public ViewCustomer_Page(WebDriver driver) {

        this.driver = driver;
    }
    public void click_on_customermodule_and_click_on_the_view_customer(String Customer_Name) throws InterruptedException {

        Thread.sleep(3000);

        List<WebElement> tableRows = driver.findElements(By.xpath("//*[@id='customerlist']/tbody/tr"));

        int tableRowsSize = tableRows.size(); // Get the size of tableRows
        for (int i = 1; i < tableRowsSize; i++) {
            String actual = driver.findElement(By.xpath("//*[@id='customerlist']/tbody/tr[" + i + "]/td[2]")).getText();

            if (Customer_Name.equalsIgnoreCase(actual)) {
                Assert.assertEquals(actual, Customer_Name, "Expected : " + Customer_Name + " But found : " + actual);
                WebElement click_EditCustomer = driver.findElement(By.xpath("//*[@id='customerlist']/tbody/tr[" + i + "]/td[1]/div/button[1]"));
                click_EditCustomer.click();
                Customerfound = true;
                break;
            }
        }


    }
    public void verify_the_details(String Customer_Name, String Communication_Email_Address, String Primary_Contact_Number, String Secondary_Contact_Number, String Communication_Address, String Billing_Address) throws InterruptedException {

        if (Customerfound) {
            Thread.sleep(5000);
            if (Customer_Name.length() > 0) {


                String actualname = driver.findElement(custname).getText();
                Thread.sleep(1000);
                Assert.assertEquals(actualname, Customer_Name, "Expected : " + Customer_Name + " But found : " + actualname);


            }
            if (Communication_Email_Address.length() > 0) {

                String actualemail = driver.findElement(communicationemailadd).getText();
                Thread.sleep(1000);
                Assert.assertEquals(actualemail, Communication_Email_Address, "Expected : " + Communication_Email_Address + " But found : " + actualemail);


            }
            if (Primary_Contact_Number.length() > 0) {


                String actualprimarycontact = driver.findElement(primarycontactno).getText();
                Thread.sleep(1000);
                Assert.assertEquals(actualprimarycontact, Primary_Contact_Number, "Expected : " + Primary_Contact_Number + " But found : " + actualprimarycontact);




            }
            if (Secondary_Contact_Number.length() > 0) {


                String actualsecondarycontact = driver.findElement(secondarycontactno).getText();
                Thread.sleep(1000);
                Assert.assertEquals(actualsecondarycontact, Secondary_Contact_Number, "Expected : " + Secondary_Contact_Number + " But found : " + actualsecondarycontact);


            }
            if (Communication_Address.length() > 0) {


                String actualcommaddress = driver.findElement(communicationadd).getText();
                Thread.sleep(1000);
                Assert.assertEquals(actualcommaddress, Communication_Address, "Expected : " + Communication_Address + " But found : " + actualcommaddress);



            }
            if (Billing_Address.length() > 0) {

                String actualbillingadd = driver.findElement(billingadd).getText();
                Thread.sleep(1000);
                Assert.assertEquals(actualbillingadd, Billing_Address, "Expected : " + Billing_Address + " But found : " + actualbillingadd);

            }
        }
    }
}
