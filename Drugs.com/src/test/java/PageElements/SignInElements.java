package PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInElements {
	
	@FindBy (xpath= "//*[@id=\"header\"]/div/div/div/nav[2]/a[2]")
	public WebElement SignIn;
	
	@FindBy (xpath = "//*[@id=\"content\"]/div[2]/form/div[1]/label/input")
	public WebElement txtUser;
	
	@FindBy (xpath = "//*[@id=\"content\"]/div[2]/form/div[2]/label/input")
	public WebElement txtPass;
	
	@FindBy (xpath = "//*[@id=\"content\"]/div[2]/form/div[3]/input")
	public WebElement SignInBtn;

}
