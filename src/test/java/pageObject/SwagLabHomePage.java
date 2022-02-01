package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Setup;

public class SwagLabHomePage extends Setup {
	
	public SwagLabHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		//Setup.driver = driver;
	}
	
	//add to cart locaters
	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	public WebElement add_to_cart_sauce_labs_backpack;
	
	@FindBy(id = "add-to-cart-sauce-labs-bike-light")
	public WebElement add_to_cart_sauce_labs_bike_light;
	
	@FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
	public WebElement add_to_cart_sauce_labs_bolt_t_shirt;
	
	@FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
	public WebElement add_to_cart_sauce_labs_fleece_jacket;
	
	//Items Locaters
	
	@FindBy(xpath = "//div[text() ='Sauce Labs Backpack']")
	public WebElement item_sauce_labs_backpack;
	
	@FindBy(xpath = "//div[text() ='Sauce Labs Bike Light']")
	public WebElement item_sauce_labs_bike_light;
	
	@FindBy(xpath = "//div[text() ='Sauce Labs Bolt T-Shirt']")
	public WebElement item_sauce_labs_bolt_t_shirt;
	
	@FindBy(xpath = "//div[text() ='Sauce Labs Fleece Jacket']")
	public WebElement item_sauce_labs_fleece_jacket;
	
	//AddToCart Button
	@FindBy(xpath ="//button[text() = 'Add to cart']")
	public WebElement addToCart;
	
	//cart
	@FindBy(id="shopping_cart_container")
	public WebElement carts;
	
	//Sort dropDown
	@FindBy(xpath = "//select[@class = 'product_sort_container']")
	public WebElement sort;

	
	
	
	
	public void clickOn_add_to_cart_sauce_labs_backpack() {
		add_to_cart_sauce_labs_backpack.click();
	}
	public void clickOn_add_to_cart_sauce_labs_bike_light() {
		add_to_cart_sauce_labs_bike_light.click();
	}
	public void clickOn_add_to_cart_sauce_labs_bolt_t_shirt() {
		add_to_cart_sauce_labs_bolt_t_shirt.click();
	}
	public void clickOn_add_to_cart_sauce_labs_fleece_jacket() {
		add_to_cart_sauce_labs_fleece_jacket.click();
	}
	
	public void clickOn_item_sauce_labs_backpack() {
		item_sauce_labs_backpack.click();
	}
	
	public void clickOn_item_sauce_labs_bike_light() {
		item_sauce_labs_bike_light.click();
	}
	
	public void clickOn_item_sauce_labs_bolt_t_shirt() {
		item_sauce_labs_bolt_t_shirt.click();
	}
	
	public void clickOn_item_sauce_labs_fleece_jacket() {
		item_sauce_labs_fleece_jacket.click();
	}
	
	public void clickOnaddToCart() {
		addToCart.click();
	}

	
	public void clickOncarts() {
		carts.click();
	}

}
