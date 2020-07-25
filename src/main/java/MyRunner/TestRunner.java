package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "G:\\programs_eclipse\\CucumberBDDFramework\\src\\main\\java\\Features\\createContact.feature", //the path of the feature files
        glue={"stepDefinitions"},
        format= {"pretty","html: test-output"},
		monochrome=true,
		dryRun=false)
		
public class TestRunner {

}
  