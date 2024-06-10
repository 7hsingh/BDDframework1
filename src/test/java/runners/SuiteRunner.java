package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"/Users/pardeeptank/Desktop/QA/selenium_workplace/BDDCucumberProject/src/test/java/features/Login.feature"},
		glue = { "stepdefinations"}
				
				
		)
public class SuiteRunner {
	
	
	
	

}
