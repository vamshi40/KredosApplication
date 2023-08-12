package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class DeleteUser_Page {

    private WebDriver driver;

    boolean Userfound = false;

    private By Yes_Btn = By.xpath("//button[normalize-space()='Yes']");
    private By toasterMessage = By.xpath("//div[@id='toast-container']/div/div");

    public DeleteUser_Page(WebDriver driver) {

        this.driver = driver;
    }

    public void click_on_users_module_and_click_on_the_delete_user(String Email, String Toaster_Message) throws InterruptedException {


        List<WebElement> role_Names = driver.findElements(By.xpath("//*[@id='userlist']/tbody/tr/td[2]"));

        for (int i = 1; i <= role_Names.size(); i++) {
            String actual = driver.findElement(By.xpath("//*[@id='userlist']/tbody/tr[" + i + "]/td[2]")).getText();
            System.out.println("-----------"+actual);
            Thread.sleep(1000);

            if (actual.contains(Email)) {
                WebElement editRole = driver.findElement(By.xpath("//*[@id='userlist']/tbody/tr[" + i + "]/td[1]/div/button[3]"));
                Thread.sleep(3000);
                editRole.click();
                Userfound = true;
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


        if(Userfound){
            driver.findElement(By.xpath("//h3[normalize-space()='Are you sure ?']")).isDisplayed();
            driver.findElement(By.xpath("//p[text()='User will be deleted']")).isDisplayed();
            driver.findElement(Yes_Btn).click();

            driver.findElement(toasterMessage).isDisplayed();
            String actualMessage = driver.findElement(toasterMessage).getText();
            Thread.sleep(1000);
            Assert.assertEquals(actualMessage, Toaster_Message, "Expected : " + Toaster_Message + " But found : " + actualMessage);


        }
    }

}
