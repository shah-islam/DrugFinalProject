package PageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import PageElements.DrugInfoSpanishElements;
import Utilities.SetupDriver;

public class DrugInfoSpanishActions {

	DrugInfoSpanishElements EspEle;

	public DrugInfoSpanishActions() {

		this.EspEle = new DrugInfoSpanishElements();
		PageFactory.initElements(SetupDriver.chromeDriver, EspEle);
	}

	public void homePage() {
		SetupDriver.chromeDriver.get("https://www.drugs.com/");
		SetupDriver.chromeDriver.manage().window().maximize();
		SetupDriver.chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void MoreOption() {
		EspEle.MoreInfo.click();
	}

	public void EspanolInfo() {
		EspEle.EspInfo.click();
	}

	public void DisplayMessage() throws Exception {
		Thread.sleep(2000);
		EspEle.displayMsg.isDisplayed();
		Thread.sleep(2000);
	}
}
