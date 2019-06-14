package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "C:\\Users\\tarun.kanskar\\git\\CucumberTraining\\OpenSourceCMS\\Feature\\TestCase3.feature",
		glue={"stepDefinition"}
	
		)



@Test
public class TestRunner extends AbstractTestNGCucumberTests

{

}