package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cartpage {
	
	public Cartpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	

	@FindBy(id = "checkout")
	public WebElement checkout;

	@FindBy(xpath = "//button[text() = 'Remove']")
	public WebElement remove;
	
	@FindBy(xpath = "//button[text() = 'Continue Shopping']")
	public WebElement continueShopping;
	
	public void clickOncheckout() {
		checkout.click();
	}
	
	public void clickOnremove() {
		remove.click();
	}
	
	public void clickOncontinueShopping() {
		continueShopping.click();
	}
}
