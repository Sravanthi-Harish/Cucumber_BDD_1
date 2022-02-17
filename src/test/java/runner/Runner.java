package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue = "stepDef", plugin = { "pretty",
		"html:target/cucumber-reports.html", "json:target/cucumber.json",
		}, tags = "@swaglab")
public class Runner {
	public static void sendEmail() {

		System.out.println("Send Email of execution");
		
	}

}
