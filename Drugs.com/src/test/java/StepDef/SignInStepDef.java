package StepDef;

import PageActions.SignInActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignInStepDef {
	
	SignInActions SignAct = new SignInActions();

	@When("^user clicks on SignIn$")
	public void user_clicks_on_SignIn() throws Throwable {
		
		SignAct.signIn();

	}

	@When("^user input invalid <username>$")
	public void user_input_invalid_username() throws Throwable {
		
		SignAct.username();

	}

	@When("^user input invalid <password>$")
	public void user_input_invalid_password() throws Throwable {
		
		SignAct.password();

	}

	@Then("^user should see <Loginfailed> message$")
	public void user_should_see_Loginfailed_message() throws Throwable {
		SignAct.SignInBtn();

	}

}
