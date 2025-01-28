package com.erhan.steps;

import com.erhan.utils.US_03_CommonMethods;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class US_00_Hooks extends US_03_CommonMethods {
	
	@Before
	public void start() {
		setUp();
	}

	@After
	public void end(Scenario scenario) {

		byte[] picture;

		if (scenario.isFailed()) {
			picture = takeScreenshot("failed/" + scenario.getName());
		}

		else {
			picture = takeScreenshot("passed/" + scenario.getName());
		}

		scenario.attach(picture, "image/png", scenario.getName());
		
		tearDown();

	}

}
