package PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdultDosesElements {
	
	@FindBy(xpath = "//*[@id=\"inner-wrap\"]/div[3]/div/div/div[2]/ul[2]/li[3]/a")
	public WebElement dsgGuides;

	@FindBy(xpath = "//a[contains(text(),'amoxicillin')]")
	public WebElement benadrylTxt;

	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/ul[1]/li[3]/a")
	public WebElement mtnSickness;

	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/h2[3]")
	public WebElement visualTxt;


}

//a[contains(text(),'Benadryl')]
//amoxicillin