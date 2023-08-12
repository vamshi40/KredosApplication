package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class ViewRole_Page {


    private WebDriver driver;


    private By Rolename = By.xpath("//strong[text()='Role Name']//following::span[3]");

    private By Applicationname = By.xpath("//strong[text()='Application Name']//following::span[3]");


    private By Roledesc = By.xpath("//strong[text()='Role Description']//following::span[2]");




    public ViewRole_Page(WebDriver driver) {

        this.driver = driver;
    }

    public void click_on_rolesmodule_and_click_on_the_viewrole(String Role_Name) throws InterruptedException {


        List<WebElement> role_Names = driver.findElements(By.xpath("//*[@id='rolelist']/tbody/tr/td[2]"));

        for (int i = 1; i <= role_Names.size(); i++) {
            String actual = driver.findElement(By.xpath("//*[@id='rolelist']/tbody/tr[" + i + "]/td[2]")).getText();
            Thread.sleep(1000);

            if (actual.contains(Role_Name)) {
                WebElement editRole = driver.findElement(By.xpath("//*[@id='rolelist']/tbody/tr[" + i + "]/td[1]/div/button[1]"));
                Thread.sleep(3000);
                editRole.click();
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


    }

    public void verify_the_role_details(String Role_Name, String Application_Name, String Role_Description) throws InterruptedException {




        if(Role_Name.length()>0){


            String actualrolename = driver.findElement(Rolename).getText();
            Thread.sleep(1000);
            Assert.assertEquals(actualrolename, Role_Name, "Expected : " + Role_Name + " But found : " + actualrolename);

        }
        if(Application_Name.length()>0){
            String actualapplicationname = driver.findElement(Applicationname).getText();
            Thread.sleep(1000);
            Assert.assertEquals(actualapplicationname, Application_Name, "Expected : " + Application_Name + " But found : " + actualapplicationname);
        }
        if(Role_Description.length()>0){
            String actualroledesc = driver.findElement(Roledesc).getText();
            Thread.sleep(1000);
            Assert.assertEquals(actualroledesc, Role_Description, "Expected : " + Role_Description + " But found : " + actualroledesc);
        }

    }
}
