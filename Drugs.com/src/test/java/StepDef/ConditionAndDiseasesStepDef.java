package StepDef;

import PageActions.ConditionAndDiseasesActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ConditionAndDiseasesStepDef {
	
	ConditionAndDiseasesActions DiseasesAction = new ConditionAndDiseasesActions();

	@When("^Click on  disease and condition from carousel$")
	public void click_on_disease_and_condition_from_carousel() {
		
		DiseasesAction.deseaseAndCondition();

	}

	@When("^Input fever in search textbox$")
	public void input_fever_in_search_textbox() {
		
		DiseasesAction.searchText();

	}

	@Then("^User can see description of fever$")
	public void user_can_see_description_of_fever() {
		
		DiseasesAction.feverMsg();

	}

}
