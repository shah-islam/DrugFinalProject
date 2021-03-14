package StepDef;

import PageActions.MobileAppsActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MobileAppStepDef {

	MobileAppsActions mobileAction = new MobileAppsActions();

	@When("^Click on Mobile Apps$")
	public void click_on_Mobile_Apps() throws Throwable {
		mobileAction.MobileApps();

	}

	@Then("^User can see download options for Mobile Apps$")
	public void user_can_see_download_options_for_Mobile_Apps() throws Throwable {

	}

}
