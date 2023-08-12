package com.utils;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


import java.time.Duration;
import java.util.List;


public class Roles_Operations {
    private static WebDriver driver;


    private By outsideClick = By.xpath("//div[@class='col-lg mb-3 mb-lg-0']");
    private By selectAll_btn = By.xpath("//button[text()=' Select All ']");
    private By clearAll_btn = By.xpath("//button[text()=' Clear All ']");
    private By nodata_text = By.xpath("//li[text()=' No Data to Display ']");
    private By table = By.xpath("//table");
    private By classNext = By.xpath("//*[text()=' Next ']//parent::li");
    private By classPrevious = By.xpath("//*[text()=' Previous ']//parent::li");
    private By nextBtn = By.xpath("//*[text()=' Next ']");
    private By previousBtn = By.xpath("//*[text()=' Previous ']");

    private By drilldown_search_field = By.xpath("//input[@placeholder='Search']");

    private By Login_Link = By.xpath("//a[normalize-space()='Login']");
    private By userName_Txt = By.id("username");
    private By password_Txt = By.id("password");
    private By signin_Btn = By.id("kc-login");
    private By home_button = By.xpath("//button[text()=' Home']");
    private By warningMessage = By.xpath("//*[@id='input-error']");
    private By Menu_Icon = By.xpath("//button[@class='btn btn-link menu-toggle mr-3']");


    private By Customermodule = By.xpath("//span[normalize-space()='Customers']");

    private By Applicationmodule = By.xpath("//span[normalize-space()='Applications']");
    private By Rolesmodule = By.xpath("//span[normalize-space()='Roles']");
    private By Usersmodule = By.xpath("//span[normalize-space()='Users']");
    private By KredosAImodule = By.xpath("//span[normalize-space()='KredosAI']");

    private By Resourcesmodule = By.xpath("//span[normalize-space()='Resources']");


    private By Heading_Customer = By.xpath("//h1[contains(text(),'List Of Customers')]");

    private By Toaster_msg = By.xpath("//*[@id='toast-container'");


    //um change password
    private By link_MyAccount = By.xpath("//a[@id='userDropdown']");


    //macro frame change password
   // private By link_MyAccount = By.xpath("//a[@id='loginUser']");


    // For link_Logout
    private By link_Logout = By.xpath("//*[@class='dropdown-item logout']");

    // For errorMessage_PleaseLogin
    private By errorMessage_PleaseLogin = By.xpath("//*[@class='toast-message ng-star-inserted']");

    // For text_WeAreSorry
    private By text_WeAreSorry = By.id("kc-page-title");
    // For link_Login
    private By link_Login = By.xpath("//input[@id='kc-login']");


    private By Changepassword_link = By.xpath("//a[normalize-space()='Change Password']");


    public Roles_Operations(WebDriver driver) {
        this.driver = driver;
    }

    public void refreshBrowser() {
        driver.navigate().refresh();
    }

    public void browserBack() {
        driver.navigate().back();
    }

    public void validateLogout() {
        driver.findElement(link_MyAccount).click();
        driver.findElement(link_Logout).click();
    }

    public void verifyLoginButton() {
        driver.findElement(link_Login).isDisplayed();
    }

    public void enterValidCredentials(String Username, String Password) {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        // driver.findElement(Login_Link).click();
        driver.findElement(userName_Txt).isDisplayed();
        driver.findElement(userName_Txt).click();
        driver.findElement(userName_Txt).sendKeys(Username);
        driver.findElement(password_Txt).isDisplayed();
        driver.findElement(password_Txt).click();
        driver.findElement(password_Txt).sendKeys(Password);
        driver.findElement(signin_Btn).click();
    }


    public void common_pathway_to_customermodule() throws InterruptedException {
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(Menu_Icon).isDisplayed();
        driver.findElement(Menu_Icon).click();
        Thread.sleep(500);
        driver.findElement(Customermodule).click();
        driver.findElement(Heading_Customer).isDisplayed();

    }

    public void common_pathway_to_applications() throws InterruptedException {
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(Menu_Icon).isDisplayed();
        driver.findElement(Menu_Icon).click();
        Thread.sleep(500);
        driver.findElement(Applicationmodule).click();

    }

    public void common_pathway_to_roles() throws InterruptedException {
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(Menu_Icon).isDisplayed();
        driver.findElement(Menu_Icon).click();
        Thread.sleep(500);
        driver.findElement(Rolesmodule).click();


    }

    public void common_pathway_to_users() throws InterruptedException {
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(Menu_Icon).isDisplayed();
        driver.findElement(Menu_Icon).click();
        Thread.sleep(500);
        driver.findElement(Usersmodule).click();


    }

    public void common_pathway_to_resources() throws InterruptedException {
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(Menu_Icon).isDisplayed();
        driver.findElement(Menu_Icon).click();
        Thread.sleep(500);
        driver.findElement(Resourcesmodule).click();


    }

    public void common_pathway_to_kredosaimodule() throws InterruptedException {
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(Menu_Icon).isDisplayed();
        driver.findElement(Menu_Icon).click();
        Thread.sleep(500);
        driver.findElement(KredosAImodule).click();


    }
    public void Common_pathway_to_changepassword_for_all_Roles() throws InterruptedException {
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       // driver.findElement(Menu_Icon).isDisplayed();
        driver.findElement(link_MyAccount).click();
        Thread.sleep(500);
        driver.findElement(Changepassword_link).click();


    }
    public void verifying_the_um_eachdropdown_column(String ColumnDropdown, String Entertext, String Columnindex) throws InterruptedException {

        Thread.sleep(3000);
        driver.findElement(By.xpath("//strong[text()='" + ColumnDropdown + "']//ancestor::th//i[@triggers='manual']")).isDisplayed();
        driver.findElement(By.xpath("//strong[text()='" + ColumnDropdown + "']//ancestor::th//i[@triggers='manual']")).click();
        Thread.sleep(1000);
        driver.findElement(drilldown_search_field).isDisplayed();
        driver.findElement(drilldown_search_field).sendKeys(Entertext);

        if (driver.findElements(By.xpath("//input[@name='" + Entertext + "']")).size() > 0) {
            driver.findElement(By.xpath("//input[@name='" + Entertext + "']")).click();
            String ActualEntertext = driver.findElement(By.xpath("//input[@name='" + Entertext + "']")).getAttribute("value");

            Assert.assertEquals(ActualEntertext, Entertext, "Expected: " + Entertext + " But found: " + ActualEntertext);
            driver.findElement(outsideClick).click();
            driver.findElement(table).isDisplayed();

            List<WebElement> cells = driver.findElements(By.xpath("//tr//td[" + Columnindex + "]"));
            System.out.println("list---------------------------xxxx" + cells);
            for (WebElement cell : cells) {
                System.out.println("foreach cell------------------xxxx" + cell.getText());
                Assert.assertEquals(cell.getText().trim(), Entertext);
            }

        } else {
            driver.findElement(nodata_text).isDisplayed();
        }
        driver.findElement(outsideClick).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//strong[text()='" + ColumnDropdown + "']//ancestor::th//i[@triggers='manual']")).isDisplayed();
        driver.findElement(By.xpath("//strong[text()='" + ColumnDropdown + "']//ancestor::th//i[@triggers='manual']")).click();
        Thread.sleep(2000);
        driver.findElement(clearAll_btn).isDisplayed();
        driver.findElement(selectAll_btn).click();
        driver.findElement(clearAll_btn).click();
        Thread.sleep(1000);
        driver.findElement(outsideClick).click();
    }


}

