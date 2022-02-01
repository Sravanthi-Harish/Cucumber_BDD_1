package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Setup;

public class CheckoutPage extends Setup {
	
	public CheckoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		//Setup.driver = driver;
	}
	

	
	@FindBy(id = "first-name")
	public WebElement firstName;
	
	@FindBy(id = "last-name")
	public WebElement lastName;
	
	@FindBy(id = "postal-code")
	public WebElement postalCode;
	
	@FindBy(id = "continue")
	public WebElement continuebutton;
	
	

	public void clickOncontinuebutton() {
		continuebutton.click();
	}

}
