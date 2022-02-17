package stepDef;

import base.Setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Cartpage;
import pageObject.CheckoutPage;

public class CartStepDefination extends Setup {
	
	Cartpage CartPg = new Cartpage(driver);
	
	@When("user checkout from the cart")
	public void user_checkout_from_the_cart() {
		CartPg.clickOncheckout();
	}
	
	@Then("user Remove Product")
	public void user_remove_product() {
		CartPg.clickOnremove();
	}

	
	@And("Continue Shopping")
	public void continue_shopping() {
		CartPg.clickOncontinueShopping();
	}


}
