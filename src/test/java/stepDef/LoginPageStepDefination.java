package stepDef;

import java.util.Map;

import base.Setup;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import pageObject.LoginPage;

public class LoginPageStepDefination extends Setup {
	
	LoginPage LoginPg = new LoginPage(driver);
	
	@Given("user is on saucedemo homepage")
	public void user_is_on_saucedemo_homepage(DataTable dataTable) {
		Map<String, String> userDetails = dataTable.asMap(String.class, String.class);
		LoginPg.login_user(userDetails);
		
	}

}
