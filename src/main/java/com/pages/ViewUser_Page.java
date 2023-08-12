package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class ViewUser_Page {

    private WebDriver driver;


    private By firstname = By.xpath("//strong[text()='First Name:']//following::p[1]");
    private By lastname = By.xpath("//strong[text()='Last Name:']//following::p[1]");
    private By email = By.xpath("//strong[text()='Email:']//following::p[1]");
    private By username = By.xpath("//strong[text()='User Name:']//following::p[1]");
    private By mobilenumber = By.xpath("//strong[text()='Mobile Number:']//following::p[1]");



    public ViewUser_Page(WebDriver driver) {

        this.driver = driver;
    }
    public void click_on_users_module_and_click_on_the_view_user(String Email) throws InterruptedException {

        List<WebElement> role_Names = driver.findElements(By.xpath("//*[@id='userlist']/tbody/tr/td[2]"));

        for (int i = 1; i <= role_Names.size(); i++) {
            String actual = driver.findElement(By.xpath("//*[@id='userlist']/tbody/tr[" + i + "]/td[2]")).getText();
            Thread.sleep(1000);

            if (actual.contains(Email)) {
                WebElement editRole = driver.findElement(By.xpath("//*[@id='userlist']/tbody/tr[" + i + "]/td[1]/div/button[1]"));
                Thread.sleep(3000);
                editRole.click();
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
    }


    public void verify_the_userdetails(String Email, String First_Name, String Last_Name, String Mobile_Number, String User_Name) throws InterruptedException {



        if(Email.length()>0){


            String actualemail = driver.findElement(email).getText();
            Thread.sleep(1000);
            Assert.assertEquals(actualemail, Email, "Expected : " + Email + " But found : " + actualemail);




        }
        if(First_Name.length()>0){

            String actualfirstname = driver.findElement(firstname).getText();
            Thread.sleep(1000);
            Assert.assertEquals(actualfirstname, First_Name, "Expected : " + First_Name + " But found : " + actualfirstname);



        }
        if(Last_Name.length()>0){

            String actuallastname = driver.findElement(lastname).getText();
            Thread.sleep(1000);
            Assert.assertEquals(actuallastname, Last_Name, "Expected : " + Last_Name + " But found : " + actuallastname);


        }
        if(Mobile_Number.length()>0){


            String actualmobilenum = driver.findElement(mobilenumber).getText();
            Thread.sleep(1000);
            Assert.assertEquals(actualmobilenum, Mobile_Number, "Expected : " + Mobile_Number + " But found : " + actualmobilenum);



        }
        if(User_Name.length()>0){


            String actualusername = driver.findElement(username).getText();
            Thread.sleep(1000);
            Assert.assertEquals(actualusername, User_Name, "Expected : " + User_Name + " But found : " + actualusername);



        }

    }

}
