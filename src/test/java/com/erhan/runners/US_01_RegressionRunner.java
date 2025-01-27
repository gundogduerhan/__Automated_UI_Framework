package com.erhan.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		/** 
			    CHANGES IN THIS CLASS PROHIBITED BY VERSION CONTROL SYSTEM 
			    WITH PRE-COMMIT HOOKS.
			    IN CASE OF ANY CHNAGES IN THIS CLASS, YOUR COMMIT
			    WILL GET YOU AN ERROR
	    **/
		
		features = "src/test/resources/features",
		glue = "com.erhan.steps",
		dryRun = false,
		monochrome = true,
		tags = "@Regression", 
		plugin = {
				"html:target/cucumber-default-report.html",
				"json:target/cucumber.json",
				"rerun:target/failed.txt"
		}
		)

public class US_01_RegressionRunner {

}
