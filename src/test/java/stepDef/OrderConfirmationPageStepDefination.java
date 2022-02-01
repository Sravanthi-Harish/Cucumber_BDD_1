package stepDef;

import base.Setup;
import io.cucumber.java.en.Then;
import pageObject.OrderConfirmationpage;
import static org.junit.Assert.assertTrue;

public class OrderConfirmationPageStepDefination extends Setup {
	
	OrderConfirmationpage OrderConfirmationPg = new OrderConfirmationpage(driver);
	
	@Then("the order shuld be successfully completed")
	public void the_order_shuld_be_successfully_completed() {
		String Actualmsg = OrderConfirmationPg.readConfirmationmsg();
		String Expectedmsg = "CHECKOUT: COMPLETE!";
//		if (Actualmsg == Expectedmsg) {
//			System.out.println("Order Placed Sucessfully");
//		}
		assertTrue(OrderConfirmationPg.readConfirmationmsg().equals(Expectedmsg));

	}

}
