package stepDef;

import base.Setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Cartpage;
import pageObject.CheckoutPage;

public class CartStepDefination extends Setup {
	
	Cartpage CartPg = new Cartpage(driver);
	
	@When("I checkout from the cart")
	public void i_checkout_from_the_cart() {
		CartPg.clickOncheckout();
	}
	
	@Then("I Remove Product")
	public void i_remove_product() {
		CartPg.clickOnremove();
	}

	
	@And("Continue Shopping")
	public void continue_shopping() {
		CartPg.clickOncontinueShopping();
	}


}
