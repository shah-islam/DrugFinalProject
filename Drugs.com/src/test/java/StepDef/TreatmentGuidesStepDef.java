package StepDef;

import PageActions.TreatmentGuidesActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TreatmentGuidesStepDef {
	
	TreatmentGuidesActions TreatmentAction = new TreatmentGuidesActions();

	@When("^Click on  Treatment Guides from carousel$")
	public void click_on_Treatment_Guides_from_carousel() throws Throwable {
		
		TreatmentAction.TreatmentGuides();

	}

	@When("^Input headache in search textbox$")
	public void input_headache_in_search_textbox() throws Throwable {
		
		TreatmentAction.searchBox();

	}

	@Then("^User can see Treatment Guides for headache$")
	public void user_can_see_Treatment_Guides_for_headache() throws Throwable {
		
		TreatmentAction.searchTxt();

	}

}
