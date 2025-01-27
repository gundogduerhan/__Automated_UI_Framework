package com.erhan.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		/** 
			    CHANGE TAG INDIVIDUALLY FOR YOUR TEST SCENARIO
			    SWITCH DRYRUN TO "TRUE" TO GET UNIMPLEMENTED TEST STEPS 
			    SWITCH BACK TO FALSE TO EXECUTION
	    **/
		
		features = "src/test/resources/features",
		glue = "com.erhan.steps",
		dryRun = true,
		monochrome = true,
		tags = "@tag", 
		plugin = {
				"html:target/cucumber-default-report.html",
				"json:target/cucumber.json",
				"rerun:target/failed.txt"
		}
		)

public class US_04_IndividualRunner {

}
