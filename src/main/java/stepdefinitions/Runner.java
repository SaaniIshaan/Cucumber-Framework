package stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(features ={"src/main/java/featurefiles"}, glue ={"stepdefinitions"},
	plugin = {"pretty","html:target/report.html"})
	
	public class Runner {

	
	
	
	}
