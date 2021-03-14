package PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TreatmentGuidesElements {
	
	@FindBy (xpath="//body/div[@id='wrap']/div[@id='inner-wrap']/div[2]/div[1]/button[2]/*[1]")
	public WebElement carouselIcon;
	
	@FindBy (xpath= "//*[@id=\"inner-wrap\"]/div[2]/div/ul/li[6]/a/img")
	public WebElement TreatmentGuides;
	
	@FindBy (xpath= "//*[@id=\"livesearch-condition\"]")
	public WebElement searchBox;
	
	@FindBy (xpath = "//*[@id=\"ls-wrap\"]/div/a[1]/var/b")
	public WebElement searchTxt;

}
