package PageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import PageElements.MobileAppsElements;
import Utilities.SetupDriver;

public class MobileAppsActions {
	MobileAppsElements MobileApps;

	public MobileAppsActions() {

		this.MobileApps = new MobileAppsElements();
		PageFactory.initElements(SetupDriver.chromeDriver, MobileApps);

	}

	public void homePage() {
		SetupDriver.chromeDriver.get("https://www.drugs.com/");
		SetupDriver.chromeDriver.manage().window().maximize();				
		SetupDriver.chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void MobileApps() {

		MobileApps.MobileApps.click();

	}

}
