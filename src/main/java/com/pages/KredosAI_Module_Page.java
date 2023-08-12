package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KredosAI_Module_Page {
    private WebDriver driver;


    private By kredosAI_button = By.xpath("//*[text()='KredosAI ']");

    private By ExperimentDraft = By.xpath("//*[text()=' Experiment Draft']");

    private By ExperimentLaunched = By.xpath("//*[text()=' Experiment Launched']");

    private By SearchExperimentDraft = By.xpath("//*[@placeholder='Search for Experiment Drafts']");

    private By SearchExperimentLaunched = By.xpath("//*[@placeholder='Search for Launched Experiments']");

    private By AnalysisButton = By.xpath("//*[text()='Analysis']");

    private By MessageBuilderButton = By.xpath("//*[text()=' Message Builder']");

    public KredosAI_Module_Page(WebDriver driver) {

        this.driver = driver;
    }

    public void click_on_kredos_a_imodule() throws InterruptedException {


        Thread.sleep(2000);
        driver.findElement(ExperimentDraft).isDisplayed();
        driver.findElement(ExperimentLaunched).isDisplayed();
        driver.findElement(SearchExperimentDraft).isDisplayed();
        driver.findElement(SearchExperimentLaunched).isDisplayed();
        driver.findElement(SearchExperimentLaunched).click();
        driver.findElement(AnalysisButton).isDisplayed();
        driver.findElement(MessageBuilderButton).isDisplayed();


    }
}
