package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.time.Duration;

public class Login_Page {

    private WebDriver driver;
    private By Menu_Icon = By.xpath("//button[@class='sidebar-toogle']");

    private By Login_Link = By.xpath("//a[normalize-space()='Login']");
    private By userName_Txt = By.id("username");
    private By password_Txt = By.id("password");
    private By signin_Btn = By.id("kc-login");
    private By home_button = By.xpath("//button[text()=' Home']");
    private By warningMessage = By.xpath("//*[@id='input-error']");

    public Login_Page(WebDriver driver) {
        this.driver = driver;
    }


    public void enterValidCredentials() {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(userName_Txt).isDisplayed();
        driver.findElement(userName_Txt).sendKeys("superadmin");
        driver.findElement(password_Txt).isDisplayed();
        driver.findElement(password_Txt).sendKeys("IQ360@cloud$");
        driver.findElement(signin_Btn).click();
    }

    public void enterUsername(String Username) {
        //enter the username
      //  driver.findElement(Login_Link).click();
        driver.findElement(userName_Txt).sendKeys(Username);
    }

    public void enterPassword(String Password) {
        //enter password
        driver.findElement(password_Txt).sendKeys(Password);
    }

    public void clickOnSignin() {
        //click login button
        driver.findElement(signin_Btn).click();
        //  driver.findElement(Menu_Icon).click();
    }

    public void ClickOnMenuIon() throws InterruptedException {
        //after successful logging-in click on Hamburger menu icon
        Thread.sleep(5000);
        driver.findElement(Menu_Icon).click();
    }

    public void verifyTheLogin(String message) {

        //verify wether successfully logged-in

        if (message.equalsIgnoreCase("Success")) {

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
            driver.findElement(By.xpath("//h1[normalize-space()='List Of Users']")).isDisplayed();
            System.out.println("wwwwwwwwww");

        } else if (message.equalsIgnoreCase("Not Success")) {
            String actualMessage = driver.findElement(warningMessage).getText();
            Assert.assertEquals(actualMessage, "Invalid username or password.");
        }

    }
}