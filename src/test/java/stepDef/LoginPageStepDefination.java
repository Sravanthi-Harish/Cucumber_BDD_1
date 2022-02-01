package stepDef;

import java.util.Map;

import base.Setup;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import pageObject.LoginPage;

public class LoginPageStepDefination extends Setup {
	
	LoginPage LoginPg = new LoginPage(driver);
	
	@Given("I login Swaglabs with below user")
	public void i_login_swaglabs_with_below_user(DataTable dataTable) {
		Map<String, String> userDetails = dataTable.asMap(String.class, String.class);
		LoginPg.login_user(userDetails);
		
	}

}
