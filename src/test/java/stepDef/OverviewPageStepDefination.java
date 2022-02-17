package stepDef;

import base.Setup;
import io.cucumber.java.en.And;
import pageObject.OverviewPage;

public class OverviewPageStepDefination extends Setup {
	
	OverviewPage OverviewPg = new OverviewPage(driver);
	
	@And("user finish payment")
	public void user_finish_payment() {
		OverviewPg.clickOnfinishbutton();
	}

}
