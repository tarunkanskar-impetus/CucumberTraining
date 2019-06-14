package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "Feature",
		glue={"stepDefinition"}
	
		)



@Test
public class TestRunner extends AbstractTestNGCucumberTests{

}