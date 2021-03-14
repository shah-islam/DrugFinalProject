package PageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import PageElements.SideEffectsElements;
import Utilities.SetupDriver;

public class SideEffectsActions {
	
SideEffectsElements sideEffects ;
	
	public  SideEffectsActions() {
		this.sideEffects = new SideEffectsElements();
		PageFactory.initElements(SetupDriver.chromeDriver, sideEffects);
	}
	public void homePage() {
		SetupDriver.chromeDriver.get("https://www.drugs.com/");
		SetupDriver.chromeDriver.manage().window().maximize();				
		SetupDriver.chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	public void SideEffects() {
		
		sideEffects.SideEffects.click();
		
	}
	
	public void clickSearchBox() {
		sideEffects.searchBox.click();
	}
	
	public void searchText() {
		sideEffects.searchBox.sendKeys("tylenol");
	}
	public void searchIcon() {
		sideEffects.searchIcon.click();
	}
	
	

}
