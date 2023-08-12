package stepdefinitions;

import com.driver.WebdriverIntializer;
import com.pages.ExperimentFrame_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class ExperimentFram_Step {
	
	private ExperimentFrame_Page ExperimentFrame = new ExperimentFrame_Page(WebdriverIntializer.getDriver());
	
	@Given("Open Kredos Website & Enter username credentials")
	public void open_kredos_website_enter_username_credentials() {
		
		
	
	    
	}

	@And("Click on the MessageBuilder button")
	public void click_on_the_message_builder_button() throws InterruptedException {
		
		ExperimentFrame.ClickMessageBuilder();
	    
	}
	
	@And("Enter a {string} in ExperimentFrame")
	public void enter_a_in_experiment_frame(String message) {
		
		ExperimentFrame.EnterMessage(message);
	   
	}
	
	@And("Click on ImageLibrary and select Image")
	public void click_on_image_library_and_select_image() throws InterruptedException {
		
		ExperimentFrame.Click_on_ImageLibrary_and_select_Image();
	   
	}
	
	
	@And("Click on MessageMechanics and select Tags {string} {string} {string}")
	public void click_on_message_mechanics_and_select_tags(String tags1, String tags2, String tags3) {
	    ExperimentFrame.click_on_message_mechanics_and_select_tags(tags1, tags2, tags3);
	}
	
	
	@And("Click on Target Dropdown and select Targets {string}")
	public void click_on_target_dropdown_and_select_targets(String targets1) {
		
		ExperimentFrame.click_on_target_dropdown_and_select_targets(targets1);
			    
	}
	
	
	
	
	@And("Create Duplicate Message and Verify with original {string}")
	public void create_duplicate_message_and_verify_with_original(String message) {
		
		ExperimentFrame.create_duplicate_message_and_verify_with_original(message);
	    
	}
	
	@And("Click on Timings button and enter the {string}")
	public void click_on_timings_button_and_enter_the(String risklevel) throws InterruptedException {
	    ExperimentFrame.click_on_timings_button_and_enter_the(risklevel);
	}
	
	
	@And("Clicking on the Notes button and Entering the {string}")
	public void clicking_on_the_notes_button_and_entering_the(String text) {
	    
		ExperimentFrame.clicking_on_the_notes_button_and_entering_the(text);
		
	}
	
	@And("Clicking on the Add button and Creating Duplicate Macro")
	public void clicking_on_the_add_button_and_creating_duplicate_macro() {
	    
		ExperimentFrame.clicking_on_the_add_button_and_creating_duplicate_macro();
	}
	
	@And("Delete the Created Macro")
	public void delete_the_created_macro() throws InterruptedException {
	    ExperimentFrame.delete_the_created_macro();
		
	}


		
	@And("Click on save button")
	public void click_on_save_button() throws InterruptedException {
		Thread.sleep(2000);
		ExperimentFrame.click_on_save_button();
		
		
	    
	}

	@And("Click on canvas button")
	public void click_on_canvas_button() throws InterruptedException {
		
		Thread.sleep(2000);
		ExperimentFrame.click_on_canvas_button();
		
		
	   
	}
	
	@And("Click on submit button")
	public void click_on_submit_button() throws InterruptedException {
		Thread.sleep(2000);
		ExperimentFrame.click_on_submit_button();
	   
		
	}



}
