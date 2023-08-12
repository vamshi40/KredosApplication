package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Menu_Page {
    private WebDriver driver;

    private By Menu_Icon = By.xpath("//button[@class='btn btn-link menu-toggle mr-3']");


    private By Customermodule = By.xpath("//span[normalize-space()='Customers']");

    private By Applicationmodule = By.xpath("//span[normalize-space()='Applications']");
    private By Rolesmodule = By.xpath("//span[normalize-space()='Roles']");
    private By Usersmodule = By.xpath("//span[normalize-space()='Users']");
    private By KredosAImodule = By.xpath("//span[normalize-space()='KredosAI']");

    private By Resourcesmodule = By.xpath("//span[normalize-space()='Resources']");



    public Menu_Page(WebDriver driver) {

        this.driver = driver;
    }

    public void verify_the_menu_modules() {


        driver.findElement(Menu_Icon).click();
        driver.findElement(Applicationmodule).isDisplayed();
        driver.findElement(Resourcesmodule).isDisplayed();
        driver.findElement(Usersmodule).isDisplayed();
        driver.findElement(Rolesmodule).isDisplayed();
        driver.findElement(KredosAImodule).isDisplayed();



    }
}
