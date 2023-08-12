package com.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

public class WebdriverIntializer {
    public WebDriver driver;

    public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

    public WebDriver init_driver(String browser) {

        System.out.println("browser value is: " + browser);

        if (browser.equals("chrome")) {
 //           System.setProperty("webdriver.chrome.driver","/home/vassar/Downloads/chromedriver_linux64/chromedriver");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            options.addArguments("window-size=1400,800");
            options.addArguments("headless");

            WebDriverManager.chromedriver().setup();
            tlDriver.set(new ChromeDriver(options));

        } else if (browser.equals("firefox")) {

            FirefoxOptions options = new FirefoxOptions();
            options.addArguments("--remote-allow-origins=*");
            options.addArguments("window-size=1400,800");

            WebDriverManager.firefoxdriver().setup();
            tlDriver.set(new FirefoxDriver(options));
        } else if (browser.equals("safari")) {
            tlDriver.set(new SafariDriver());
        } else {
            System.out.println("Please pass the correct browser value: " + browser);
        }

        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();
        return getDriver();

    }

    public static synchronized WebDriver getDriver() {
        return tlDriver.get();
    }
}
