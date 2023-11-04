package stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features ={"src/main/java/featurefiles"}, glue ={"stepdefinitions"},
plugin = {"pretty","html:target/report.html"}, tags = "@test")
public class RunnerTestNg extends AbstractTestNGCucumberTests{

	
}
