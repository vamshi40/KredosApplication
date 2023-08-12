package com.pages;


import com.driver.WebdriverIntializer;
import com.utils.Roles_Operations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.HashMap;
import java.util.Map;

public class ChangePassword_Page {

    private WebDriver driver;


    private By newpwd = By.xpath("//input[@placeholder='Enter New Password']");

    private By Changepassword_header = By.xpath("//h2[normalize-space()='Change Password']");
    private By confpwd = By.xpath("//input[@placeholder='Confirm Password']");

    private By submit_btn = By.xpath("//button[text()='Submit']");

    private By Reset_btn = By.xpath("//button[normalize-space()='Reset']");

    private By Cancel_btn = By.xpath("//button[normalize-space()='Cancel']");

    private By pwdreq = By.xpath("//div[text()='Password is required']");
    private By compwdreq = By.xpath("//div[text()='Confirm Password is required']");

    private By pwdmatch = By.xpath("//div[text()='Password Must be match']");

    private By pwdatleast = By.xpath("//div[text()='Password must be at least 6 characters']");


    private By toasterMessage = By.xpath("//div[@id='toast-container']/div/div");

    boolean chgpwd_toastermsg = false;
    private Roles_Operations rolesOperations = new Roles_Operations(WebdriverIntializer.getDriver());


    public ChangePassword_Page(WebDriver driver) {
        this.driver = driver;
    }


    public void enter(String newpassword, String confirmnewpassword) {


        driver.findElement(Changepassword_header).isDisplayed();


        if (newpassword.length() > 0) {


            driver.findElement(newpwd).sendKeys(newpassword);


        } else {
            System.out.println("Not given New Password");
        }

        if (confirmnewpassword.length() > 0) {


            driver.findElement(confpwd).sendKeys(confirmnewpassword);


        } else {
            System.out.println("Not given Confirm New Password");
        }


    }

    public void click_on_the_button(String submit, String errormsg, String toastermsg) throws InterruptedException {

        if (submit.equalsIgnoreCase("Enable")) {
            driver.findElement(submit_btn).click();

               // Thread.sleep(1000);
                driver.findElement(toasterMessage).isDisplayed();
                String actualPasswordErrorMsg = driver.findElement(toasterMessage).getText();
                Assert.assertEquals(actualPasswordErrorMsg, toastermsg, "Expected: " + toastermsg + " but found: " + actualPasswordErrorMsg);
                System.out.println("" + actualPasswordErrorMsg);
                chgpwd_toastermsg = true;


        } else if (submit.equalsIgnoreCase("Disable")) {
            driver.findElement(submit_btn).click();


            Map<String, Runnable> statusActions = new HashMap<>();

            statusActions.put("Error in resetting password", () -> {
                try {
                    Thread.sleep(1000);
                    String actualPasswordErrorMsg = driver.findElement(toasterMessage).getText();
                    Assert.assertEquals(actualPasswordErrorMsg, toastermsg, "Expected: " + toastermsg + " but found: " + actualPasswordErrorMsg);
                    System.out.println("" + actualPasswordErrorMsg);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            statusActions.put("Password Must be match", () -> {
                try {
                    Thread.sleep(1000);
                    String actualPasswordErrorMsg = driver.findElement(pwdmatch).getText();
                    Assert.assertEquals(actualPasswordErrorMsg, "Password Must be match", "Expected: " + "Password Must be match" + " but found: " + actualPasswordErrorMsg);
                    System.out.println("" + actualPasswordErrorMsg);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            statusActions.put("Confirm Password is required", () -> {
                try {
                    Thread.sleep(1000);
                    String actualPasswordErrorMsg = driver.findElement(compwdreq).getText();
                    Assert.assertEquals(actualPasswordErrorMsg, "Confirm Password is required", "Expected: " + "Confirm Password is required" + " but found: " + actualPasswordErrorMsg);
                    System.out.println("" + actualPasswordErrorMsg);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            statusActions.put("Password is required,Confirm Password is required", () -> {
                try {
                    Thread.sleep(1000);
                    String[] errormsgs = errormsg.split(",");
                    for (int i = 0; i < errormsgs.length; i++) {
                        System.out.println(errormsgs[i]);
                        if (errormsgs[i].contains("Password is required")) {

                            driver.findElement(pwdreq).isDisplayed();
                            String ActualErrorMgs = driver.findElement(pwdreq).getText();
                            Assert.assertEquals(ActualErrorMgs, "Password is required");

                        } else if (errormsgs[i].contains("Confirm Password is required")) {

                            driver.findElement(compwdreq).isDisplayed();
                            String ActualErrorMgs = driver.findElement(compwdreq).getText();
                            Assert.assertEquals(ActualErrorMgs, "Confirm Password is required");

                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

            statusActions.put("Password is required,Password Must be match", () -> {
                try {
                    Thread.sleep(1000);
                    String[] errormsgs = errormsg.split(",");
                    for (int i = 0; i < errormsgs.length; i++) {
                        System.out.println(errormsgs[i]);
                        if (errormsgs[i].contains("Password is required")) {
                            driver.findElement(pwdreq).isDisplayed();
                            String ActualErrorMgs = driver.findElement(pwdreq).getText();
                            Assert.assertEquals(ActualErrorMgs, "Password is required");
                        } else if (errormsgs[i].contains("Password Must be match")) {

                            driver.findElement(pwdmatch).isDisplayed();
                            String ActualErrorMgs = driver.findElement(pwdmatch).getText();
                            Assert.assertEquals(ActualErrorMgs, "Password Must be match");

                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });


            Runnable action = statusActions.get(errormsg);
            //  Runnable action = statusActions.get(toastermsg);

            if (action != null) {
                action.run();
            } else {
                System.out.println("Not Performed any Action");
            }


        }


    }


    public void login_with_updated_password(String username, String newpassword) throws InterruptedException {

        if (chgpwd_toastermsg) {

            rolesOperations.enterValidCredentials(username, newpassword);

        }


    }


}
