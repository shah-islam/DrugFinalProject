package PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DrugInfoSpanishElements {
	
	@FindBy (xpath="//*[@id=\"inner-wrap\"]/div[3]/div/div/div[2]/ul[2]/li[10]/a")
	public WebElement MoreInfo;
	
	@FindBy (xpath= "//*[@id=\"content\"]/div[2]/div/div[1]/div[1]/ul/li[1]/ul/li[2]/a")
	public WebElement EspInfo;
	
	@FindBy (xpath = "//*[@id=\"content\"]/div[2]/h1")
	public WebElement displayMsg;

}
