import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		 features = {"src/main/resources/feature"}
		 ,glue = {"stepdefinations"}
		 plugin = {"pretty","html:CucumberReport/cucumberhtml/destination.html","json:CucumberReport/cucumberjson/cucumber.json"
				 ,"junit:CucumberReport/cucumberxml/cucumber.xml","pretty:CucumberReport/cucumbertxt/cucumber-pretty.txt"},
		 ,monochrome=true
		 ,dryRun=true 
				 
		)
public class myntra_testrunner {

}
