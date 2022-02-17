package stepDef;

import base.Setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pageObject.CheckoutPage;

public class CheckoutPageStepDefination extends Setup {
	
	CheckoutPage CheckoutPg = new CheckoutPage(driver);
	
	@And("user provide details on checkout page")
	public void user_provide_details_on_checkout_page() {
		CheckoutPg.firstName.sendKeys("Tom");
		CheckoutPg.lastName.sendKeys("Clark");
		CheckoutPg.postalCode.sendKeys("302020");
		CheckoutPg.clickOncontinuebutton();

	}


}
