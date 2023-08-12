package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class ExperimentFrame_Page {
    private WebDriver driver;


    private By ClickMB = By.xpath("//*[text()=' Message Builder']");
    private By Experiment_Frame_Header = By.xpath("//*[text()='Experiment Frame']");
    private By TextField_Message = By.xpath("//*[@placeholder=\"Write Message...\"]");
    private By ImageLibrary = By.xpath("//*[@title=\"Image Library\"]");
    private By SelectImage = By.xpath("/html/body/ngb-modal-window/div/div/app-image-library/div[2]/div[2]/img");
    private By VerifyImage = By.xpath("//*[@id=\"toast-container\"]/div/div");
    private By ExperimentTitle = By.xpath("//*[text()='Experiment Frame']");
    private By Click_MessageMechanics_Tag = By.xpath("//*[@title=\"Message Mechanics\"]");
    private By MessageMechanicsLabel = By.xpath("//*[text()='Tag Message Mechanics']");
    private By FrameLabel = By.xpath("//*[text()='Frame']");
    private By ChooseLabel = By.xpath("//*[text()='Choose']");
    private By DirectLabel = By.xpath("//*[text()='Direct']");
    private By MessageContentDd = By.xpath("//*[text()=' Message Content ']");
    private By CalltoActionDd = By.xpath("//*[text()=' Call To Action ']");
    private By BehaviouralPathwaysDd = By.xpath("//*[text()=' Behavioral Pathways ']");
    private By MessageFormDd = By.xpath("//*[text()=' Message Form ']");
    private By ChoiceArchitectureDd = By.xpath("//*[text()=' Choice Architecture ']");
    private By DigitalToolsDd = By.xpath("//*[text()=' Digital Tools ']");
    private By MessageTimingsDd = By.xpath("//*[text()=' Message Timing ']");
    private By CustomerPreferencesDd = By.xpath("//*[text()=' Customer Preferences ']");
    private By CommunicationDd = By.xpath("//*[text()=' COMMUNICATION ']");
    private By MessageChannelDd = By.xpath("//*[text()=' Message Channel ']");
    private By LanguageDd = By.xpath("//*[text()=' Language ']");
    private By Save_Message_Mecahnics = By.xpath("//button[text()=\" Save \"]");

    private By ClikingTargetDd = By.xpath("//*[text()=' Target']");
    private By MessageTargetlabel = By.xpath("(//*[text()='Message Target'])[1]");
    private By Segmentheader = By.xpath("(//*[text()='SEGMENT'])[1]");
    private By Risklevelheader = By.xpath("(//*[text()='RISK LEVEL '])[1]");
    private By Behaviourheader = By.xpath("(//*[text()='BEHAVIOR SCORE '])[1]");
    private By Creditclassheader = By.xpath("(//*[text()='CREDIT CLASS '])[1]");
    private By Locationheader = By.xpath("(//*[text()='LOCATION'])[1]");
    private By Stateheader = By.xpath("(//*[text()='STATE '])[1]");
    private By Accountheader = By.xpath("(//*[text()='ACCOUNT'])[1]");
    private By AccountTypeheader = By.xpath("(//*[text()='ACCOUNT TYPE '])[1]");
    private By Amountsheader = By.xpath("(//*[text()='AMOUNTS'])[1]");
    private By WirelessBalanceheader = By.xpath("(//*[text()='WIRELESS BALANCE '])[1]");
    private By Pastdueamountheader = By.xpath("(//*[text()='PAST DUE AMOUNT '])[1]");
    private By paymentamountheader = By.xpath("(//*[text()='PAYMENT AMOUNT '])[1]");
    private By Statusheader = By.xpath("(//*[text()='STATUS'])[1]");
    private By Daysdeliquentheader = By.xpath("(//*[text()='DAYS DELIQUENT '])[1]");
    private By DaystonextSREPheader = By.xpath("(//*[text()='DAYS TO NEXT SREP '])[1]");
    private By DaysPastdueheader = By.xpath("(//*[text()='DAYS PAST DUE '])[1]");
    private By Yesterdaysstatusheader = By.xpath("(//*[text()='YESTERDAY’S STATUS '])[1]");
    private By Indicatorsheader = By.xpath("(//*[text()='INDICATORS'])[1]");
    private By Lastpaymentmethodheader = By.xpath("(//*[text()='LAST PAYMENT METHOD '])[1]");
    private By Easypayindicatorheader = By.xpath("(//*[text()='EASY PAY INDICATOR '])[1]");
    private By PAstatusheader = By.xpath("(//*[text()='PA STATUS '])[1]");
    private By WriteOffheader = By.xpath("(//*[text()='WRITE-OFF '])[1]");
    private By CancelButton = By.xpath("(//*[text()='Cancel'])[1]");
    private By SaveTarget = By.xpath("//*[text()=' Save Target']");

    private By Addicon = By.xpath("//*[@id='dropdownAddMoreBottom']");
    private By DuplicateMsg = By.xpath("//*[text()='Duplicate Message']");

    private By timingsbutton = By.xpath("//*[@id=\"dropdownTiming\"]");
    private By Notesbutton = By.xpath("//*[text()='Notes']");
    private By EnteringNotes = By.xpath("//*[text()='Notes']//following::span[text()=' shivateja']//following::textarea");
    private By Addnotebutton = By.xpath("//button[text()=' Add Note ']");
    private By savenotebutton = By.xpath("//h1[text()='Experiment Frame']//following::span[text()='Notes']//following::button//span[text()='Save']");

    private By Addmacrobutton = By.xpath("//h1[text()='Experiment Frame']//following::span[text()='Add']");
    private By ClickDuplicateMacro = By.xpath("//*[text()='Duplicate Macro']");

    private By Deletemacro = By.xpath("(//button[text()=' Delete Macro'])[2]");
    private By defaulttext = By.xpath("//*[text()='Are you sure you want to delete the macro?']");
    private By Confirmationpopup = By.xpath("//*[text()='Confirmation']");
    private By cancelbutton = By.xpath("(//*[text()='Cancel'])[5]");
    private By okbutton = By.xpath("(//*[text()='OK'])[5]");

    private By savebutton = By.xpath("//*[text()='Save']");
    private By canvasbutton = By.xpath("//*[text()='Canvas ']");
    private By ExperimentHeading = By.xpath("//*[text()='Experiment: ']");
    private By Summaryheading = By.xpath("//*[text()=' Summary']");
    private By Factoryheading = By.xpath("//*[text()=' Factors']");
    private By Messagemechanicsheading = By.xpath("//*[text()=' Message Mechanics']");
    private By Targetheading = By.xpath("//*[text()=' Target']");

    private By submit = By.xpath("//*[text()='Submit ']");


    public ExperimentFrame_Page(WebDriver driver) {
        this.driver = driver;
    }

    public void ClickMessageBuilder() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(ClickMB).isDisplayed();
        driver.findElement(ClickMB).click();
        Thread.sleep(1000);
        driver.findElement(Experiment_Frame_Header).isDisplayed();

        driver.findElement(By.xpath("//div[@id='cdk-drop-list-2']//i[@class='fi-delete-regular']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();

    }

    public void EnterMessage(String message) {

        driver.findElements(TextField_Message).get(0).sendKeys(message);

    }

    public void Click_on_ImageLibrary_and_select_Image() throws InterruptedException {


        Thread.sleep(2000);
        driver.findElements(ImageLibrary).get(0).click();
        driver.findElement(ExperimentTitle).isDisplayed();
        driver.findElement(SelectImage).click();
        driver.findElement(VerifyImage).isDisplayed();
        String s = driver.findElement(By.xpath("//*[@id=\"toast-container\"]/div/div")).getText();
        System.out.println("" + s);

    }

    public void click_on_message_mechanics_and_select_tags(String tags1, String tags2, String tags3) {

        driver.findElements(Click_MessageMechanics_Tag).get(0).click();
        driver.findElement(MessageMechanicsLabel).isDisplayed();
        driver.findElement(FrameLabel).isDisplayed();
        driver.findElement(ChooseLabel).isDisplayed();
        driver.findElement(DirectLabel).isDisplayed();
        driver.findElement(MessageContentDd).isDisplayed();
        driver.findElement(CalltoActionDd).isDisplayed();
        driver.findElement(BehaviouralPathwaysDd).isDisplayed();
        driver.findElement(MessageFormDd).isDisplayed();
        driver.findElement(ChoiceArchitectureDd).isDisplayed();
        driver.findElement(DigitalToolsDd).isDisplayed();
        driver.findElement(MessageTimingsDd).isDisplayed();
        driver.findElement(CustomerPreferencesDd).isDisplayed();
        driver.findElement(CommunicationDd).isDisplayed();
        driver.findElement(MessageChannelDd).isDisplayed();
        driver.findElement(LanguageDd).isDisplayed();


        String[] MMT1 = tags1.split(",");
        for (int i = 0; i < MMT1.length; i++) {


            System.out.println(MMT1[i]);
            driver.findElement(By.xpath("//*[ text() = '" + MMT1[i] + "']")).click();

        }

//		driver.findElement(By.xpath("//*[text()='"+MMT2[i]+"']//following-sibling::div//label//span[text()='Yes']"));	

        String[] MMT2 = tags2.split(",");
        for (int i = 0; i < MMT2.length; i++) {
            System.out.println(MMT2[i]);
            if (MMT2[i].contains("Yes")) {
                String s = MMT2[i].substring(0, MMT2[i].length() - 3);
                driver.findElement(By.xpath("//*[text()='" + s + "']//following-sibling::div//label//span[text()='Yes']")).click();
            } else {
                String s = MMT2[i].substring(0, MMT2[i].length() - 2);
                driver.findElement(By.xpath("//*[text()='" + s + "']//following-sibling::div//label//span[text()='No']")).click();

            }

        }
		
	/*	String[] MMT3 =tags3.split(",");
		for(int i=0;i<MMT3.length;i++) {
			System.out.println(MMT3[i]);
			if(MMT3[i].contains("Yes"))
			{
				String s=MMT3[i].substring(0, MMT3[i].length()-3);
				driver.findElement(By.xpath("//*[text()='"+s+"']//following-sibling::div//label//span[text()='Yes']")).click();
			}
			else
			{
				String s=MMT3[i].substring(0, MMT3[i].length()-2);
				driver.findElement(By.xpath("//*[text()='"+s+"']//following-sibling::div//label//span[text()='No']")).click();
				
			}
			
		}
		
		String[] MMT4 =tags4.split(",");
		for(int i=0;i<MMT4.length;i++) {
			System.out.println(MMT4[i]);
			if(MMT4[i].contains("Yes"))
			{
				String s=MMT4[i].substring(0, MMT4[i].length()-3);
				driver.findElement(By.xpath("//*[text()='"+s+"']//following-sibling::div//label//span[text()='Yes']")).click();
			}
			else
			{
				String s=MMT3[i].substring(0, MMT3[i].length()-2);
				driver.findElement(By.xpath("//*[text()='"+s+"']//following-sibling::div//label//span[text()='No']")).click();
				
			}
			
		}
	*/
        String[] MMT3 = tags3.split(",");
        for (int i = 0; i < MMT3.length; i++) {
            System.out.println(MMT3[i]);
            if (MMT3[i].contains("Low")) {
                String s = MMT3[i].substring(0, MMT3[i].length() - 3);
                driver.findElement(By.xpath("//*[text()='" + s + "']//following-sibling::div//label//span[text()='Low']")).click();
            } else if (MMT3[i].contains("Mid")) {
                String s = MMT3[i].substring(0, MMT3[i].length() - 3);
                driver.findElement(By.xpath("//*[text()='" + s + "']//following-sibling::div//label//span[text()='Mid']")).click();

            } else if (MMT3[i].contains("High")) {
                String s = MMT3[i].substring(0, MMT3[i].length() - 4);
                driver.findElement(By.xpath("//*[text()='" + s + "']//following-sibling::div//label//span[text()='High']")).click();

            }

        }


        driver.findElement(Save_Message_Mecahnics).click();


    }


    public void click_on_target_dropdown_and_select_targets(String targets1) {


        driver.findElement(ClikingTargetDd).click();

//		driver.findElement(MessageTargetlabel).isDisplayed();
//		driver.findElement(Segmentheader).isDisplayed();
//		driver.findElement(Risklevelheader).isDisplayed();
//		driver.findElement(Behaviourheader).isDisplayed();
//		driver.findElement(Creditclassheader).isDisplayed();
//		driver.findElement(Locationheader).isDisplayed();
//		driver.findElement(Stateheader).isDisplayed();
//		driver.findElement(Accountheader).isDisplayed();
//		driver.findElement(AccountTypeheader).isDisplayed();
//		driver.findElement(Amountsheader).isDisplayed();
//		driver.findElement(WirelessBalanceheader).isDisplayed();
//		driver.findElement(Pastdueamountheader).isDisplayed();
//		driver.findElement(paymentamountheader).isDisplayed();
//		driver.findElement(Statusheader).isDisplayed();
//		driver.findElement(Daysdeliquentheader).isDisplayed();
//		driver.findElement(DaystonextSREPheader).isDisplayed();
//		driver.findElement(DaysPastdueheader).isDisplayed();
//		driver.findElement(Yesterdaysstatusheader).isDisplayed();
//		driver.findElement(Indicatorsheader).isDisplayed();
//		driver.findElement(Lastpaymentmethodheader).isDisplayed();
//		driver.findElement(Easypayindicatorheader).isDisplayed();
//		driver.findElement(PAstatusheader).isDisplayed();
//		driver.findElement(WriteOffheader).isDisplayed();
//		driver.findElement(CancelButton).isDisplayed();


        String[] MT1 = targets1.split(",");
        for (int i = 0; i < MT1.length; i++) {


            System.out.println(MT1[i]);
            driver.findElement(By.xpath("//*[text()='" + MT1[i] + "']//following-sibling::button[text()=' Select all']")).click();
            //driver.findElement(By.xpath("//*[ text() = '"+MT1[i]+"']")).click();

        }

        driver.findElement(SaveTarget).click();

    }


    public void create_duplicate_message_and_verify_with_original(String message) {


        driver.findElements(Addicon).get(0).click();
        driver.findElement(DuplicateMsg).click();

        String message1 = driver.findElement(By.xpath("//div[@id='cdk-drop-list-1']//div[2]//app-message-box-tool[1]//div[1]//div[2]//textarea[1]")).getAttribute("value");
        System.out.println("" + message1);
        message1.equals(message);

    }

    public void click_on_timings_button_and_enter_the(String risklevel) throws InterruptedException {

        driver.findElement(timingsbutton).click();


        String[] TIM1 = risklevel.split(",");
        String[] res;


        for (int i = 0; i < TIM1.length; i++) {
            res = TIM1[i].split("-");

            System.out.println("---------------" + res[0] + "--------------" + res[1]);
            Thread.sleep(2000);
            driver.findElement(By.xpath("//div[@class='set-range set-range-fixed']//div[" + res[0] + "]")).click();
            WebElement dropdownElement = driver.findElement(By.xpath("//div[@class='set-range set-range-fixed']//div[" + res[0] + "]//select"));
            Select select = new Select(dropdownElement);
            Thread.sleep(2000);
            select.selectByVisibleText(res[1]);

            Thread.sleep(2000);

        }


        //driver.findElement(By.xpath("//label[text()='110']//parent::div//span[text()='1']//parent::div//option[text()=' Day 10']")).click();


    }

    public void clicking_on_the_notes_button_and_entering_the(String text) {

        driver.findElements(Notesbutton).get(0).click();
        driver.findElements(EnteringNotes).get(0).sendKeys(text);
        driver.findElements(Addnotebutton).get(0).click();
        driver.findElements(savenotebutton).get(0).click();

    }

    public void clicking_on_the_add_button_and_creating_duplicate_macro() {


        driver.findElements(Addmacrobutton).get(0).click();
        driver.findElements(ClickDuplicateMacro).get(0).click();
        //  driver.findElement(By.xpath("//*[@id=\"toast-container\"]/div/div")).isDisplayed();
        //  String s = driver.findElement(By.xpath("//*[@id=\"toast-container\"]/div/div")).getText();
        //  System.out.println(""+s+" Successfully");
        if (driver.findElement(By.xpath("//*[@id=\"toast-container\"]/div/div")).isDisplayed()) {
            System.out.println("DuplicateMacro has been created successfully");
        } else {
            System.out.println("DuplicateMacro not created");
        }

    }


    public void delete_the_created_macro() throws InterruptedException {

        Thread.sleep(3000);
//    	driver.findElement(Deletemacro).click();
//  		driver.findElement(Confirmationpopup).isDisplayed();
//  		driver.findElement(cancelbutton).isDisplayed();
//  		driver.findElement(defaulttext).isDisplayed();
//  		driver.findElement(okbutton).isDisplayed();
//  		driver.findElement(okbutton).click();
//


    }


    public void click_on_save_button() {

        driver.findElements(savebutton).get(0).click();
        driver.findElement(By.xpath("//*[@id=\"toast-container\"]/div")).isDisplayed();
        String s = driver.findElement(By.xpath("//*[@id=\"toast-container\"]/div")).getText();
        System.out.println("" + s);


    }

    public void click_on_canvas_button() {
        driver.findElements(canvasbutton).get(0).click();
        driver.findElement(ExperimentHeading).isDisplayed();
        driver.findElement(Summaryheading).isDisplayed();
        driver.findElement(Factoryheading).isDisplayed();
        driver.findElement(Messagemechanicsheading).isDisplayed();
        driver.findElement(Factoryheading).isDisplayed();
        driver.findElement(Targetheading).isDisplayed();
        driver.findElement(submit).isDisplayed();


    }

    public void click_on_submit_button() {

        driver.findElement(submit).click();
        //driver.findElement(By.xpath("//*[@id=\"toast-container\"]/div")).isDisplayed();
        //	String s = driver.findElement(By.xpath("//*[@id=\"toast-container\"]/div")).getText();
        //	System.out.println("Experiment "+s);
        if (driver.findElement(By.xpath("//*[@id=\"toast-container\"]/div")).isDisplayed()) {
            System.out.println("Experiment Launched Successfully");
        }

    }

}
