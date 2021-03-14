package StepDef;

import PageActions.AdultDosesActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdultDosesStepDef {
	AdultDosesActions AdltDsg = new AdultDosesActions();
	
	@Given("^User navigate the url$")
	public void user_navigate_the_url() throws Throwable {
		
		AdltDsg.homePage();

	}

	@When("^user click on  Dosage Guidelines$")
	public void user_click_on_Dosage_Guidelines() throws Throwable {
		
		AdltDsg.DosageGuidelines();

	}

	@When("^user clicks on Benadryl$")
	public void user_clicks_on_Benadryl() throws Throwable {
		
		AdltDsg.BenadrylText();

	}

	@When("^user clicks on Motion Sickness$")
	public void user_clicks_on_Motion_Sickness() throws Throwable {
		
		AdltDsg.MotionSickness();

	}

	@Then("^User can see Usual Adult Dose for Motion Sickness$")
	public void user_can_see_Usual_Adult_Dose_for_Motion_Sickness() throws Throwable {
		
		AdltDsg.VisualText();

	}

}
