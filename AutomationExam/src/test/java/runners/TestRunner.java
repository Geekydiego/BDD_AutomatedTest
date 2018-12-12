package runners;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions (
		features = "Feature" ,
		glue =  "StepDefinitions" ,
		monochrome = true ,
		plugin = {"pretty" , 
				  "html:Reports4CI/HTML" ,
				  "json:Reports4CI/JSON/cucumber.json" ,
				  "junit:Reports4CI/XML/cucumber.xml"})

public class TestRunner {

}
