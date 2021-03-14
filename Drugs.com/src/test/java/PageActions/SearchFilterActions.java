package PageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import PageElements.SearchFilterElements;
import Utilities.SetupDriver;

public class SearchFilterActions {

	SearchFilterElements searchEle;
	Actions action = new Actions(SetupDriver.chromeDriver);
	JavascriptExecutor js = (JavascriptExecutor) SetupDriver.chromeDriver;

	public SearchFilterActions() {
		this.searchEle = new SearchFilterElements();
		PageFactory.initElements(SetupDriver.chromeDriver, searchEle);
	}

	public void homePage() {
		SetupDriver.chromeDriver.get("https://www.drugs.com/");
		SetupDriver.chromeDriver.manage().window().maximize();
		SetupDriver.chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void SearchBox() {
		searchEle.srchBx.click();
	}

	public void tylenolTxt() {
		searchEle.tylenolTxt.sendKeys("tylenol");

	}

	public void PressEnterBtn() throws InterruptedException {
		searchEle.srchBx.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
	}

	public void ScrollDown() {

		js.executeScript("scroll(0, 250);");

	}

	public void tylenolIdentifier() throws InterruptedException {
		/*
		 * ((JavascriptExecutor) SetupDriver.chromeDriver)
		 * .executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 * //action.moveToElement(searchEle.tylenolIdentifier).build().perform();
		 * Thread.sleep(2000);
		 */
		searchEle.tylenolIdentifier.click();
	}

	public void ImageMessage() {
		searchEle.imgMsg.isDisplayed();
	}

}
