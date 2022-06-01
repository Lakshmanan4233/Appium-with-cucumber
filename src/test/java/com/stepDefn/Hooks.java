package com.stepDefn;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	
	@Before
	public void beforeScenario() {
		
		System.out.println("Start...................");

	}
	
	@After
	public  void afterScenario(Scenario s) {
		
		if(s.isFailed()) {
			
			TakesScreenshot screenshot = (TakesScreenshot)StepDefnintion.driver;
			
			byte[] as = screenshot.getScreenshotAs(OutputType.BYTES);
			
			s.attach(as, "Picture", "S.png");
			
			
		}

	}

}
