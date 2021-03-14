package PageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import PageElements.SignInElements;
import Utilities.SetupDriver;

public class SignInActions {
	
	SignInElements signEle;

	public  SignInActions() {
        this.signEle = new SignInElements();
		PageFactory.initElements(SetupDriver.chromeDriver, signEle);

	}

	public void homePage() {
		SetupDriver.chromeDriver.get("https://www.drugs.com/");
		SetupDriver.chromeDriver.manage().window().maximize();
		SetupDriver.chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void signIn() throws Exception {
		Thread.sleep(5000);

		signEle.SignIn.click();

	}

	public void username() throws Exception {
		Thread.sleep(5000);
		signEle.txtUser.sendKeys("Talentech");
	}

	public void password() throws Exception {
		Thread.sleep(5000);
		signEle.txtPass.sendKeys("Talent123");

	}

	public void SignInBtn() throws Exception {
		Thread.sleep(5000);
		signEle.SignInBtn.click();
		Thread.sleep(5000);
	}

}
