package stepDef;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.Setup;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObject.SwagLabHomePage;
import static org.junit.Assert.assertEquals;

public class SwagLabHomePageStepDefination extends Setup {

	SwagLabHomePage Swaglab = new SwagLabHomePage(driver);

	@When("I add following products to cart")
	public void i_add_following_products_to_cart(DataTable dataTable) {
		List<String> productName = dataTable.asList(String.class);

		for (String a : productName) {

			switch (a) {
			case "Sauce Labs Bike Light":
				Swaglab.clickOn_add_to_cart_sauce_labs_bike_light();
				break;
			case "Sauce Labs Backpack":
				Swaglab.clickOn_add_to_cart_sauce_labs_backpack();
				break;
			case "Sauce Labs Bolt T-Shirt":
				Swaglab.clickOn_add_to_cart_sauce_labs_bolt_t_shirt();
				break;
			case "Sauce Labs Fleece Jacket":
				Swaglab.clickOn_add_to_cart_sauce_labs_fleece_jacket();
				break;
			}
		}
	}

	@Then("product should be added to cart")
	public void product_should_be_added_to_cart() {
		Swaglab.clickOncarts();
	}

	@And("Add Product To Cart")
	public void Add_Product_To_Cart() {
		Swaglab.clickOnaddToCart();
	}

	@When("I select product Sauce Labs Bike Light")
	public void i_select_product_sauce_labs_bike_light() {
		Swaglab.clickOn_item_sauce_labs_bike_light();
	}

	@When("I select product Sauce Labs Backpack")
	public void i_select_product_item_sauce_labs_backpack() {
		Swaglab.clickOn_item_sauce_labs_backpack();
	}

	@When("I select product Sauce Labs Bolt T-Shirt")
	public void i_select_product_sauce_labs_bolt_t_shirt() {
		Swaglab.clickOn_item_sauce_labs_bolt_t_shirt();
	}

	@When("I select product Sauce Labs Fleece Jacket")
	public void i_select_product_item_sauce_labs_fleece_jacket() {
		Swaglab.clickOn_item_sauce_labs_fleece_jacket();
	}

	@When("I Sort Products on Home Page From Price Low to high")
	public void I_Sort_Products_on_Home_Page_From_Price_Low_to_high() {
		Swaglab.sort.click();
		Select sortItems = new Select(Swaglab.sort);
		sortItems.selectByValue("lohi");

		List<WebElement> element = new ArrayList<>(driver.findElements(By.xpath("//div[@class = 'inventory_item']")));

		element.get(0).click();
	}

	@And("I Add Lowest Price Product To Cart")
	public void I_Add_Lowest_Price_Product_To_Cart() {
		List<WebElement> element = new ArrayList<>(driver.findElements(By.xpath("//button[text()='Add to cart']")));
		element.get(0).click();
	}

	@When("I Sort Products on Home Page From Price High to low")
	public void I_Sort_Products_on_Home_Page_From_Price_High_to_low() {
		Swaglab.sort.click();
		Select sortItems = new Select(Swaglab.sort);
		sortItems.selectByValue("hilo");
	}

	@And("I Select Highest Price Product")
	public void I_Select_Highest_Price_Product() {
		List<WebElement> element = new ArrayList<>(driver.findElements(By.xpath("//button[text()='Add to cart']]")));
		element.get(0).click();
	}

	@And("I validate Lowest Price Product Is On Top")
	public void I_Validate_Lowest_Price_Product_Is_On_Top() {
		List<WebElement> priceElement = new ArrayList<>(
				driver.findElements(By.xpath("//div[@class = 'inventory_item_price']")));
		List<Double> productPrice = new ArrayList<>();

		double LowestPrice = Double.parseDouble(priceElement.get(0).getText().replace("$", ""));
		System.out.println(LowestPrice);

		for (WebElement a : priceElement) {
			double price = Double.parseDouble(a.getText().replace("$", ""));
			productPrice.add(price);
		}
		
		Collections.sort(productPrice);

	}

}
