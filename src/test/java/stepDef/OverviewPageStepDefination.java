package stepDef;

import base.Setup;
import io.cucumber.java.en.And;
import pageObject.OverviewPage;

public class OverviewPageStepDefination extends Setup {
	
	OverviewPage OverviewPg = new OverviewPage(driver);
	
	@And("I finish payment")
	public void i_finish_payment() {
		OverviewPg.clickOnfinishbutton();
	}

}
