package PageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import PageElements.TreatmentGuidesElements;
import Utilities.SetupDriver;

public class TreatmentGuidesActions {
	
TreatmentGuidesElements treatEle;
	
	public  TreatmentGuidesActions() {
		this.treatEle = new TreatmentGuidesElements();
		PageFactory.initElements(SetupDriver.chromeDriver, treatEle);
	}
	public void homePage() {
		SetupDriver.chromeDriver.get("https://www.drugs.com/");
		SetupDriver.chromeDriver.manage().window().maximize();				
		SetupDriver.chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	public void TreatmentGuides() { 
		treatEle.carouselIcon.click();
		treatEle.carouselIcon.click();
		treatEle.TreatmentGuides.click();
	}
	
	public void searchBox() {
		treatEle.searchBox.click();
	}
	public void searchTxt() {
		treatEle.searchBox.sendKeys("HeadAche");
	
	
	}
	

}
