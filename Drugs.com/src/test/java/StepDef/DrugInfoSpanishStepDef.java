package StepDef;

import PageActions.DrugInfoSpanishActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DrugInfoSpanishStepDef {
	DrugInfoSpanishActions drugInfo = new DrugInfoSpanishActions();

	@When("^Click on  more$")
	public void click_on_more() throws Throwable {

		drugInfo.MoreOption();

	}

	@When("^user clicks on Info en Espanol$")
	public void user_clicks_on_Info_en_Espanol() throws Throwable {

		drugInfo.EspanolInfo();
	}

	@Then("^User can see drugs info in spanish$")
	public void user_can_see_drugs_info_in_spanish() throws Throwable {

		drugInfo.DisplayMessage();

	}

}
