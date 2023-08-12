package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class DeleteRole_Page {

    private WebDriver driver;

    boolean Rolefound = false;

    private By Yes_Btn = By.xpath("//button[normalize-space()='Yes']");
    private By toasterMessage = By.xpath("//div[@id='toast-container']/div/div");


    public DeleteRole_Page(WebDriver driver) {

        this.driver = driver;
    }


    public void click_on_rolesmodule_and_click_on_the_deleterole(String Role_Name, String Toaster_Message) throws InterruptedException {

        List<WebElement> role_Names = driver.findElements(By.xpath("//*[@id='rolelist']/tbody/tr/td[2]"));

        for (int i = 1; i <= role_Names.size(); i++) {
            String actual = driver.findElement(By.xpath("//*[@id='rolelist']/tbody/tr[" + i + "]/td[2]")).getText();
            Thread.sleep(1000);

            if (actual.contains(Role_Name)) {
                WebElement editRole = driver.findElement(By.xpath("//*[@id='rolelist']/tbody/tr[" + i + "]/td[1]/div/button[3]"));
                Thread.sleep(3000);
                editRole.click();
                Rolefound = true;
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


        if(Rolefound){

            driver.findElement(By.xpath("//h3[normalize-space()='Are you sure ?']")).isDisplayed();
            driver.findElement(By.xpath("//p[text()='Role will be deleted']")).isDisplayed();
            driver.findElement(Yes_Btn).click();

            driver.findElement(toasterMessage).isDisplayed();
            String actualMessage = driver.findElement(toasterMessage).getText();
            Thread.sleep(1000);
            Assert.assertEquals(actualMessage, Toaster_Message, "Expected : " + Toaster_Message + " But found : " + actualMessage);




        }

    }
}
