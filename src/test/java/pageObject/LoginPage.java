package pageObject;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Setup;

public class LoginPage extends Setup {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(name = "user-name")
	public WebElement username;
	
	@FindBy(name = "password")
	public WebElement password;
	
	@FindBy(name = "login-button")
	public WebElement loginbuton;
	
	public void login_user(Map<String,String> userDetails) {
		username.sendKeys(userDetails.get("UserName"));
		password.sendKeys("secret_sauce");
		loginbuton.click();
	}

}
