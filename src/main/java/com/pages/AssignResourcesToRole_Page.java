package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.Duration;

public class AssignResourcesToRole_Page {

    private WebDriver driver;
    private By list_Applications = By.xpath("//select[@name='application']");
    private By Update_btn = By.xpath("//button[normalize-space()='Update']");
    private By toasterMessage = By.xpath("//div[@id='toast-container']/div/div");

    public AssignResourcesToRole_Page(WebDriver driver) {
        this.driver = driver;
    }


    public void assign_the_to(String Resources, String Application, String Toaster_Message) throws InterruptedException {

        if (Application.length() > 0) {

            System.out.println("" + Application);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
            Thread.sleep(3000);
            driver.findElement(list_Applications).isDisplayed();
            driver.findElement(list_Applications).click();
            Thread.sleep(3000);
            WebElement dropdownElement = driver.findElement(list_Applications);
            Select select = new Select(dropdownElement);
            select.selectByVisibleText(Application);


            if (Resources.length() > 0) {

                Thread.sleep(5000);
                String[] Resource = Resources.split(",");
                for (int i = 0; i < Resource.length; i++) {

                    System.out.println("" + Resource[i]);

                    Thread.sleep(500);

                    if (Resource[i].contains("READ")) {
                        String[] res = Resource[i].split("/");
                        driver.findElement(By.xpath("//thead//th[text()=' "+res[1]+"']//following::td[text()='"+res[0]+"']//following::td[2]//input")).click();
                        //  System.out.println("teja" + res[0] + "     " + res[1]);
                    } else if (Resource[i].contains("EDIT")) {
                        String[] res = Resource[i].split("/");
                        driver.findElement(By.xpath("//thead//th[text()=' "+res[1]+"']//following::td[text()='"+res[0]+"']//following::td[3]//input")).click();
                    }


                }

                driver.findElement(Update_btn).click();

                Thread.sleep(500);
                driver.findElement(toasterMessage).isDisplayed();
                String actualMessage = driver.findElement(toasterMessage).getText();
                Thread.sleep(1000);
                Assert.assertEquals(actualMessage, Toaster_Message, "Expected : " + Toaster_Message + " But found : " + actualMessage);


            }

        }

    }

}
