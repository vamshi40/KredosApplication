package com.pages;

import com.driver.WebdriverIntializer;
import com.utils.Roles_Operations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class RolesModule_Page {

    private WebDriver driver;

    private By drilldown_search_field = By.xpath("//input[@placeholder='Search']");
    private By outsideClick = By.xpath("//div[@class='col-lg']");
    private By selectAll_btn = By.xpath("//button[text()=' Select All ']");
    private By clearAll_btn = By.xpath("//button[text()=' Clear All ']");
    private By Role_Name_dropdown = By.xpath("//strong[text()='Role Name']//ancestor::th//i[@triggers='manual']");
    private By Application_Name_dropdown = By.xpath("//strong[text()='Application Name']//ancestor::th//i[@triggers='manual']");
    private By Description_dropdown = By.xpath("//strong[text()='Description']//ancestor::th//i[@triggers='manual']");
    private By Status_dropdown = By.xpath("//strong[text()='Status']//ancestor::th//i[@triggers='manual']");
    private By Date_Added_dropdown = By.xpath("//strong[text()='Date Added']//ancestor::th//i[@triggers='manual']");
    private By URL_dropdown = By.xpath("//strong[text()='# of URL']//ancestor::th//i[@triggers='manual']");
    private By Dashboard_dropdown = By.xpath("//strong[text()='# of Dashboard']//ancestor::th//i[@triggers='manual']");
    private By Widget_dropdown = By.xpath("//strong[text()='# of Widget']//ancestor::th//i[@triggers='manual']");
    private By API_dropdown = By.xpath("//strong[text()='# of API']//ancestor::th//i[@triggers='manual']");
    private By Others_dropdown = By.xpath("//strong[text()='# of Others']//ancestor::th//i[@triggers='manual']");
    private By nodata_text = By.xpath("//li[text()=' No Data to Display ']");
    private By table = By.xpath("//table");
    private By Role_Name_column = By.xpath("//tr//td[2]");
    private By Application_Name_column = By.xpath("//tr//td[3]");
    private By Description_column = By.xpath("//tr//td[4]");
    private By Status_column = By.xpath("//tr//td[5]");
    private By Date_Added_column = By.xpath("//tr//td[6]");
    private By URL_column = By.xpath("//tr//td[7]");
    private By Dashboard_column = By.xpath("//tr//td[8]");
    private By Widget_column = By.xpath("//tr//td[9]");
    private By API_column = By.xpath("//tr//td[10]");
    private By Others_column = By.xpath("//tr//td[11]");
    private By classNext = By.xpath("//*[text()=' Next ']//parent::li");
    private By classPrevious = By.xpath("//*[text()=' Previous ']//parent::li");
    private By nextBtn = By.xpath("//*[text()=' Next ']");
    private By previousBtn = By.xpath("//*[text()=' Previous ']");

    public RolesModule_Page(WebDriver driver) {
        this.driver = driver;
    }

    private Roles_Operations Roperation = new Roles_Operations(WebdriverIntializer.getDriver());


    public void validate_the_roles_module_columns_dropdowns(String Role_Name, String Application_Name, String Customer_Name, String Description, String Status, String Date_Added, String URL, String Dashboard, String Widget, String API, String Others) throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));


        if (Role_Name.length() > 0) {

            String[] Role_NameParts = Role_Name.split("-");

            String columndropdown = Role_NameParts[0];
            String entertext = Role_NameParts[1];
            String columnindex = Role_NameParts[2];

            System.out.println("Which column dropdown your are selecting: " + columndropdown);
            System.out.println("What text you are entering in search field: " + entertext);
            System.out.println("What column  you are validate the entered text: " + columnindex);

            Roperation.verifying_the_um_eachdropdown_column(columndropdown, entertext, columnindex);


        }
        if (Application_Name.length() > 0) {

            String[] Application_NameParts = Application_Name.split("-");

            String columndropdown = Application_NameParts[0];
            String entertext = Application_NameParts[1];
            String columnindex = Application_NameParts[2];

            System.out.println("Which column dropdown your are selecting: " + columndropdown);
            System.out.println("What text you are entering in search field: " + entertext);
            System.out.println("What column  you are validate the entered text: " + columnindex);

            Roperation.verifying_the_um_eachdropdown_column(columndropdown, entertext, columnindex);


        }

        if(Customer_Name.length()>0){

            String[] Customer_NameParts = Customer_Name.split("-");

            String columndropdown = Customer_NameParts[0];
            String entertext = Customer_NameParts[1];
            String columnindex = Customer_NameParts[2];

            System.out.println("Which column dropdown your are selecting: " + columndropdown);
            System.out.println("What text you are entering in search field: " + entertext);
            System.out.println("What column  you are validate the entered text: " + columnindex);

            Roperation.verifying_the_um_eachdropdown_column(columndropdown, entertext, columnindex);


        }
        if (Description.length() > 0) {

            String[] DescriptionParts = Description.split("-");

            String columndropdown = DescriptionParts[0];
            String entertext = DescriptionParts[1];
            String columnindex = DescriptionParts[2];

            System.out.println("Which column dropdown your are selecting: " + columndropdown);
            System.out.println("What text you are entering in search field: " + entertext);
            System.out.println("What column  you are validate the entered text: " + columnindex);

            Roperation.verifying_the_um_eachdropdown_column(columndropdown, entertext, columnindex);


        }
        if (Status.length() > 0) {

            String[] StatusParts = Status.split("-");

            String columndropdown = StatusParts[0];
            String entertext = StatusParts[1];
            String columnindex = StatusParts[2];

            System.out.println("Which column dropdown your are selecting: " + columndropdown);
            System.out.println("What text you are entering in search field: " + entertext);
            System.out.println("What column  you are validate the entered text: " + columnindex);

            Roperation.verifying_the_um_eachdropdown_column(columndropdown, entertext, columnindex);


        }
        if (Date_Added.length() > 0) {


            String[] Date_AddedParts = Date_Added.split("-");

            String columndropdown = Date_AddedParts[0];
            String entertext = Date_AddedParts[1];
            String columnindex = Date_AddedParts[2];

            System.out.println("Which column dropdown your are selecting: " + columndropdown);
            System.out.println("What text you are entering in search field: " + entertext);
            System.out.println("What column  you are validate the entered text: " + columnindex);

            Roperation.verifying_the_um_eachdropdown_column(columndropdown, entertext, columnindex);


        }
        if (URL.length() > 0) {

            String[] URLParts = URL.split("-");

            String columndropdown = URLParts[0];
            String entertext = URLParts[1];
            String columnindex = URLParts[2];

            System.out.println("Which column dropdown your are selecting: " + columndropdown);
            System.out.println("What text you are entering in search field: " + entertext);
            System.out.println("What column  you are validate the entered text: " + columnindex);

            Roperation.verifying_the_um_eachdropdown_column(columndropdown, entertext, columnindex);

        }
        if (Dashboard.length() > 0) {

            String[] DashboardParts = Dashboard.split("-");

            String columndropdown = DashboardParts[0];
            String entertext = DashboardParts[1];
            String columnindex = DashboardParts[2];

            System.out.println("Which column dropdown your are selecting: " + columndropdown);
            System.out.println("What text you are entering in search field: " + entertext);
            System.out.println("What column  you are validate the entered text: " + columnindex);

            Roperation.verifying_the_um_eachdropdown_column(columndropdown, entertext, columnindex);


        }
        if (Widget.length() > 0) {

            String[] WidgetParts = Widget.split("-");

            String columndropdown = WidgetParts[0];
            String entertext = WidgetParts[1];
            String columnindex = WidgetParts[2];

            System.out.println("Which column dropdown your are selecting: " + columndropdown);
            System.out.println("What text you are entering in search field: " + entertext);
            System.out.println("What column  you are validate the entered text: " + columnindex);

            Roperation.verifying_the_um_eachdropdown_column(columndropdown, entertext, columnindex);


        }
        if (API.length() > 0) {


            String[] APIParts = API.split("-");

            String columndropdown = APIParts[0];
            String entertext = APIParts[1];
            String columnindex = APIParts[2];

            System.out.println("Which column dropdown your are selecting: " + columndropdown);
            System.out.println("What text you are entering in search field: " + entertext);
            System.out.println("What column  you are validate the entered text: " + columnindex);

            Roperation.verifying_the_um_eachdropdown_column(columndropdown, entertext, columnindex);


        }
        if (Others.length() > 0) {

            String[] OthersParts = Others.split("-");

            String columndropdown = OthersParts[0];
            String entertext = OthersParts[1];
            String columnindex = OthersParts[2];

            System.out.println("Which column dropdown your are selecting: " + columndropdown);
            System.out.println("What text you are entering in search field: " + entertext);
            System.out.println("What column  you are validate the entered text: " + columnindex);

            Roperation.verifying_the_um_eachdropdown_column(columndropdown, entertext, columnindex);


        }

    }
}
