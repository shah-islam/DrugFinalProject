package PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchFilterElements {
	
	@FindBy(xpath = "//*[@id=\"livesearch-main\"]")
	public WebElement srchBx;

	@FindBy(xpath = "//*[@id=\"livesearch-main\"]")
	 public WebElement tylenolTxt;

	@FindBy(xpath = "//body/div[@id='wrap']/div[@id='inner-wrap']/div[1]/section[1]/div[1]/form[1]/div[1]/button[1]/*[1]")
	public WebElement srchIcon;

	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div[3]/div/h3/a")
	public WebElement tylenolIdentifier;
	
	@FindBy (xpath = "//*[@id=\"content\"]/div[2]/h1")
	public WebElement imgMsg;

}
