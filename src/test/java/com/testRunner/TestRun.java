package com.testRunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.report.ReportGeneration;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature/Hooks.feature",glue = "com.stepDefn" ,monochrome = true,dryRun = false
														,plugin ={"pretty","json:src/test/resources/Report/Output4.json"})
public class TestRun {
	
	
	  @AfterClass
	  public static void afterClass() {
		  
		  	ReportGeneration.report("C:\\Users\\ciadmin\\eclipse-workspace\\AppiumDailyplanner\\src\\test\\resources\\Report\\Output4.json");
	
	  }

}
