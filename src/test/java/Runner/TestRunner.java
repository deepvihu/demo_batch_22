package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\Feature\\Login.feature"		
	, glue={"StepDefinition"},
	plugin= {"pretty","html:target/Cucumber-report.html",
			"junit:target/JUNITReports/log.xml",
			"json:target/JSONReports/log.json",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
	)

public class TestRunner extends AbstractTestNGCucumberTests{

}
