package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class DeleteCustomer_Page {
    private WebDriver driver;

    boolean Customerfound = false;

    private By Yes_Btn = By.xpath("//button[normalize-space()='Yes']");
    private By toasterMessage = By.xpath("//div[@id='toast-container']/div/div");

    public DeleteCustomer_Page(WebDriver driver) {

        this.driver = driver;
    }

    public void click_on_customermodule_and_click_on_the_delete_customer(String Customer_Name, String Toaster_Message) throws InterruptedException {

        Thread.sleep(3000);

        List<WebElement> tableRows = driver.findElements(By.xpath("//*[@id='customerlist']/tbody/tr"));

        int tableRowsSize = tableRows.size(); // Get the size of tableRows
        for (int i = 1; i < tableRowsSize; i++) {
            String actual = driver.findElement(By.xpath("//*[@id='customerlist']/tbody/tr[" + i + "]/td[2]")).getText();

            if (Customer_Name.equalsIgnoreCase(actual)) {
                Assert.assertEquals(actual, Customer_Name, "Expected : " + Customer_Name + " But found : " + actual);
                WebElement click_EditCustomer = driver.findElement(By.xpath("//*[@id='customerlist']/tbody/tr[" + i + "]/td[1]/div/button[3]"));
                click_EditCustomer.click();
                Customerfound = true;
                break;
            }
        }

        if (Customerfound) {

            driver.findElement(By.xpath("//h3[normalize-space()='Are you sure ?']")).isDisplayed();
            driver.findElement(By.xpath("//p[text()='Customer will be deleted']")).isDisplayed();
            driver.findElement(Yes_Btn).click();

            driver.findElement(toasterMessage).isDisplayed();
            String actualMessage = driver.findElement(toasterMessage).getText();
            Thread.sleep(1000);
            Assert.assertEquals(actualMessage, Toaster_Message, "Expected : " + Toaster_Message + " But found : " + actualMessage);


        }


    }
}
