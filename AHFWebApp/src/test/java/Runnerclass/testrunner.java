package Runnerclass;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features="src/test/resources/Projectcreation/Projectcreation.feature",
		glue={"Stepdefinition"},
		plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:ExtentReports/report.html"}
		)
public class testrunner extends AbstractTestNGCucumberTests {

}

