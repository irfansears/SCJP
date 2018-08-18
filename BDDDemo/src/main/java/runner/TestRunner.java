package runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(
			features ="E:\\MyWorkSpace\\BDDDemo\\src\\main\\java\\features\\Login.feature",
			glue={"stepDefinition"},
			format = {"pretty", "html:test-out"}
			) 

	public class TestRunner {
}
