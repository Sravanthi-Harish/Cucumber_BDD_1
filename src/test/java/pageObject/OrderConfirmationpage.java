package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Setup;

public class OrderConfirmationpage extends Setup{
	
	public OrderConfirmationpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		//Setup.driver = driver;
	}
	
	@FindBy(xpath = "//span[@class = 'title']")
	public WebElement confirmationmsg;
	
	public String readConfirmationmsg() {
		String msg = confirmationmsg.getText();
		return msg;		
	}

}
