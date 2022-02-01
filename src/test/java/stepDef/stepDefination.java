package stepDef;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

import base.Setup;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class stepDefination extends Setup {
	
	public static String driverType;
	public static String url;

	@Before
	public void startTest() { // happen before each test scenario
		driverType = "ch";
		driver = setupBrowser(driverType);
		url = "https://www.saucedemo.com";
		driver.get(url);
	}

	@After
	public void endTest(Scenario scenario) {

		if (scenario.isFailed()) {
			Shutterbug.shootPage(driver, Capture.FULL_SCROLL).save();
		}
		driver.quit();
	}

}
