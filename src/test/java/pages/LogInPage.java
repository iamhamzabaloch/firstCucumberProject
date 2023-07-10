package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class LogInPage {
	
	public LogInPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (name = "email")
	public WebElement emailField;
	
	@FindBy (name = "pass")
	public WebElement passField;
	
	@FindBy (name = "login")
	public WebElement loginBtn;
	@FindBy (xpath = "//span[contains(text(),'Hamza Baloch')]")
	public WebElement NameVerification;
}
