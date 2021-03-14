package StepDef;

import PageActions.SideEffectsActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SideEffectsStepDef {

	SideEffectsActions SideActions = new SideEffectsActions();

	@When("^Click on  Side Effects$")
	public void click_on_Side_Effects() throws Throwable {

		SideActions.SideEffects();

	}

	@When("^Input tylenol in search textbox$")
	public void input_tylenol_in_search_textbox() throws Throwable {

		SideActions.clickSearchBox();
		SideActions.searchText();

	}

	@Then("^User can see side Effects of tylenol$")
	public void user_can_see_side_Effects_of_tylenol() throws Throwable {

		SideActions.searchIcon();

	}

}
