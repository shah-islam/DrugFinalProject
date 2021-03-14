package PageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import PageElements.ConditionAndDiseasesElements;
import Utilities.SetupDriver;

public class ConditionAndDiseasesActions {
	
	ConditionAndDiseasesElements drugsEle;

	public void DrugsAndConditionActions() {
		this.drugsEle = new ConditionAndDiseasesElements();
		PageFactory.initElements(SetupDriver.chromeDriver, drugsEle);
	}

	public void homePage() {
		SetupDriver.chromeDriver.get("https://www.drugs.com/");
		SetupDriver.chromeDriver.manage().window().maximize();
		SetupDriver.chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	public void deseaseAndCondition() {
		drugsEle.carouselIcon.click();
		drugsEle.deseaseAndCondition.click();

	}

	public void searchText() {

		drugsEle.searchText.sendKeys("Fever");
	}

	public void searchClick() {
		drugsEle.searchText.click();

	}

	public void feverMsg() {
		drugsEle.feverMsg.isDisplayed();

	}


}
