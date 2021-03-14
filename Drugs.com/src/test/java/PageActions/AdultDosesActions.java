package PageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import PageElements.AdultDosesElements;
import Utilities.SetupDriver;

public class AdultDosesActions {
	AdultDosesElements AdultEle;

	public AdultDosesActions() {
		this.AdultEle = new AdultDosesElements();
		PageFactory.initElements(SetupDriver.chromeDriver, AdultEle);
	}

	public void homePage() {
		SetupDriver.chromeDriver.get("https://www.drugs.com/");
		SetupDriver.chromeDriver.manage().window().maximize();
		SetupDriver.chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	public void DosageGuidelines() {
		AdultEle.dsgGuides.click();
	}

	public void BenadrylText() throws Exception {

		AdultEle.benadrylTxt.click();

	}

	public void MotionSickness() {
		AdultEle.mtnSickness.click();
	}

	public void VisualText() {
		AdultEle.visualTxt.isDisplayed();
	}

}
