package com.experitest.auto;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "src/Features/NewFeatures.feature"
		,glue={"androidSteps"},
		plugin = { "pretty","html:report", "json:target/cucumber-reports/Cucumber.json" },
		monochrome = true
		)

public class TestRunnerAndroid extends AbstractTestNGCucumberTests {


}