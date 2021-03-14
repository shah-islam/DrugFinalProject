package StepDef;

import PageActions.SearchFilterActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchFilterStepDef {

	SearchFilterActions srcAct = new SearchFilterActions();

	@When("^user input drug name \"([^\"]*)\"$")
	public void user_input_drug_name(String arg1) throws Throwable {

		srcAct.tylenolTxt();

	}

	@When("^user clicks on serch icon$")
	public void user_clicks_on_serch_icon() throws Throwable {

		srcAct.PressEnterBtn();

	}

	@When("^user scrolls down to Tylenol results from the Pill Identifier$")
	public void user_scrolls_down_to_Tylenol_results_from_the_Pill_Identifier() throws Throwable {
		srcAct.tylenolIdentifier();
	}

	@Then("^user should be able to see the image of tylenol$")
	public void user_should_be_able_to_see_the_image_of_tylenol() throws Throwable {

		srcAct.ImageMessage();

	}

}
