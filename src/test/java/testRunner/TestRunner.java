package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"features"},
		glue = {"steps"},
		plugin = {"pretty", "html:Reporter1"}
		//dryRun = true,
		//strict = true
		//monochrome = true,
		//tags = "@P5"
		//name = {"Logo"}
		)
public class TestRunner {

}
