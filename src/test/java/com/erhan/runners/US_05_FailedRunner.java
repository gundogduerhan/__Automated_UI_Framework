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
		
		features = "@target/failed.txt",
		glue = "com.erhan.steps",
		plugin = {
				
				"rerun:target/failed.txt"
		}
		)

public class US_05_FailedRunner {

}
