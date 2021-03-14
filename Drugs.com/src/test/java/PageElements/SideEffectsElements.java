package PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SideEffectsElements {
	@FindBy(xpath = "//*[@id=\"inner-wrap\"]/div[2]/div/ul/li[4]/a/img")
	public WebElement SideEffects;
	
	@FindBy(xpath = "//*[@id=\"livesearch-sfx\"]")
	public WebElement searchBox;
	
	/*
	 * @FindBy(xpath = "//*[@id=\"ls-wrap\"]/div/a[1]/var") public WebElement
	 * searchText;
	 */
	
	@FindBy (xpath= "//*[@id=\"search\"]/form/div/button")
	public WebElement searchIcon;
	
	////*[@id="ls-wrap"]/div/a[1]/var      tylenol
	////*[@id=\"livesearch-sfx\"]   tylenol
	
	
	////*[@id="inner-wrap"]/div[2]/div/ul/li[4]/a/img

  
}


