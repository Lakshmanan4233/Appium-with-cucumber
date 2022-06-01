package com.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class ReportGeneration {
	
	public static void report(String jsonFile) {
		
		File file = new File("C:\\Users\\ciadmin\\eclipse-workspace\\AppiumDailyplanner\\src\\test\\resources\\screenshot report");
		
		
		Configuration configuration = new Configuration(file, "Quiz");
		
		configuration.addClassifications("Android version", "8.0");
		configuration.addClassifications("Automation Tool", "Appium");
		configuration.addClassifications("Test Module","screenshotatachement");

		List jsonFiles = new ArrayList<String>();
		
		jsonFiles.add(jsonFile);
		
		ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);
		
		builder.generateReports();
	}

}
