package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(features ={"C:\\Users\\saanidhya\\eclipse-workspace\\cucumber_framework\\src\\main\\java\\featurefiles"}, glue ={"stepdefinitions"},
	plugin = {"pretty","html:target/report.html"},dryRun = false)
	public class Runner {

	
	
	}
