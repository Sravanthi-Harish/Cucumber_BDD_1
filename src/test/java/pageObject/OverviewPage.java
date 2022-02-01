package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Setup;

public class OverviewPage extends Setup{
	public OverviewPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		//Setup.driver = driver;
	}
	
	@FindBy(xpath = "//button[@name = 'finish']")
	public WebElement finishbutton;
	
	public void clickOnfinishbutton() {
		finishbutton.click();
	}

}
