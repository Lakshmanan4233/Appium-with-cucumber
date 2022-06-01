package com.stepDefn;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefnintion {
	
	public static AndroidDriver driver;
	
	/*
	 * @Given("lanuch the Application") public void lanuch_the_application() throws
	 * MalformedURLException, InterruptedException {
	 * 
	 * DesiredCapabilities capabilities = new DesiredCapabilities();
	 * 
	 * capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	 * capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,
	 * "Android Emulator"); capabilities.setCapability(MobileCapabilityType.
	 * APP,"C:\\Users\\ciadmin\\Desktop\\Daily Planner\\QA\\Build\\Daily Planner 5(30-05-2022).apk"
	 * );
	 * 
	 * URL url = new URL("http://0.0.0.0:4723/wd/hub");
	 * 
	 * driver = new AndroidDriver(url,capabilities); Thread.sleep(5000);
	 * 
	 * }
	 * 
	 * @When("User should tap the enter button") public void
	 * user_should_tap_the_enter_button() throws Exception {
	 * 
	 * driver.findElement(By.id("com.example.dailyplanner:id/btnEnter")).click();
	 * Thread.sleep(4000);
	 * 
	 * }
	 * 
	 * @When("User should tap the register button in login screen") public void
	 * user_should_tap_the_register_button_in_login_screen() {
	 * 
	 * driver.findElement(By.id("com.example.dailyplanner:id/btnRegister")).click();
	 * 
	 * }
	 * 
	 * @When("user should enter the {string},{string},{string},{string} and {string}"
	 * ) public void user_should_enter_the_and(String string, String string2, String
	 * string3, String string4, String string5) {
	 * 
	 * driver.navigate().back();
	 * driver.findElement(By.id("com.example.dailyplanner:id/edtFirstName")).
	 * sendKeys(string);
	 * driver.findElement(By.id("com.example.dailyplanner:id/edtLastName")).sendKeys
	 * (string2);
	 * driver.findElement(By.id("com.example.dailyplanner:id/edtRegUserName")).
	 * sendKeys(string3);
	 * driver.findElement(By.id("com.example.dailyplanner:id/edtRegPassword")).
	 * sendKeys(string4);
	 * driver.findElement(By.id("com.example.dailyplanner:id/imgRegCalendar")).click
	 * (); driver.findElement(By.
	 * xpath("//android.view.View[@content-desc=\"02 May 2022\"]")).click();
	 * driver.findElement(By.id("android:id/button1")).click();
	 * driver.findElement(By.id("com.example.dailyplanner:id/edtEmailName")).
	 * sendKeys(string5);
	 * driver.findElement(By.id("com.example.dailyplanner:id/btnRegisterPage")).
	 * click();
	 * 
	 * }
	 * 
	 * @Then("user should navigate the register screen sucessfull") public void
	 * user_should_navigate_the_register_screen_sucessfull() throws
	 * InterruptedException {
	 * 
	 * Thread.sleep(5000);
	 * 
	 * boolean displayed =
	 * driver.findElement(By.id("com.example.dailyplanner:id/txtTitleDailyPlanner"))
	 * .isDisplayed();
	 * 
	 * Assert.assertTrue("Verify the daily planner navigated sucessfully",
	 * displayed);
	 * 
	 * }
	 */


//	@Given("user lanuch the quiz app")
//	public void user_lanuch_the_quiz_app() throws MalformedURLException, InterruptedException {
//		
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//		  
//		  capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//		  capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator"); 
//		  capabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\ciadmin\\Downloads\\app-debug.apk");
//		  
//		  URL url = new URL("http://0.0.0.0:4723/wd/hub");
//		  
//		  driver = new AndroidDriver(url,capabilities); Thread.sleep(5000);
//		  
//}
//	@When("User tap the register button")
//	public void user_tap_the_register_button() throws InterruptedException {
//		
//		
//		driver.navigate().back();
//		driver.findElement(By.id("com.example.quizapp:id/txtRegisterLink")).click();
//		Thread.sleep(3000);  
//}
//	@When("User enter the data in register page {string},{string},{string},{string},{string} and click register button")
//	public void user_enter_the_data_in_register_page_and_click_register_button(String string, String string2, String string3, String string4, String string5) {
//		
//		driver.navigate().back();
//		driver.findElement(By.id("com.example.quizapp:id/etFirstName")).sendKeys(string);
//		driver.findElement(By.id("com.example.quizapp:id/etLastName")).sendKeys(string2);
//		driver.findElement(By.id("com.example.quizapp:id/etUserName")).sendKeys(string3);
//		driver.findElement(By.id("com.example.quizapp:id/et_password")).sendKeys(string4);
//		driver.findElement(By.id("com.example.quizapp:id/etEmailAddress")).sendKeys(string5);
//		driver.findElement(By.id("com.example.quizapp:id/btnRegister")).click();
//}
//	@Then("the sucess alert displayed in the registration screen")
//	public void the_sucess_alert_displayed_in_the_registration_screen() throws InterruptedException {
//		
//		Thread.sleep(3000);
//		
//		boolean displayed = driver.findElement(By.id("com.example.quizapp:id/txtLogin")).isDisplayed();
//
//		Assert.assertTrue("Verify the registration sucessfull",displayed);
//		
//}
	
	
//	@Given("user lanuch the app")
//	public void user_lanuch_the_app() throws MalformedURLException, InterruptedException {
//	    
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//		
//		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
//		capabilities.setCapability(MobileCapabilityType.APP, "C:\\\\Users\\\\ciadmin\\\\Desktop\\\\Daily Planner\\\\QA\\\\Build\\\\Daily Planner 5(30-05-2022).apk");
//		
//		URL url = new URL("http://0.0.0.0:4723/wd/hub");
//		
//		driver = new AndroidDriver(url, capabilities);
//		
//		Thread.sleep(5000);
//	
//	}
//	@When("user tap the enter the button")
//	public void user_tap_the_enter_the_button() {
//		
//		driver.findElement(By.id("com.example.dailyplanner:id/btnEnter")).click();
//	   
//	}
//	@Then("user take the screenshot")
//	public void user_take_the_screenshot() throws IOException {
//		
//		TakesScreenshot screenshot =(TakesScreenshot)driver;
//		  
//		  File as = screenshot.getScreenshotAs(OutputType.FILE);
//		  
//		  FileUtils fileUtils = new FileUtils();
//		  
//		  File file = new File("D:\\Pivture.png");
//		  
//		  fileUtils.copyFile(as,file);
//
//	}
	
	@Given("user lanuch the setup")
	public void user_lanuch_the_setup() throws Exception {
		
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		capabilities.setCapability(MobileCapabilityType.APP, "C:\\\\Users\\\\ciadmin\\\\Desktop\\\\Daily Planner\\\\QA\\\\Build\\\\Daily Planner 5(30-05-2022).apk");
		
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		
		driver = new AndroidDriver(url, capabilities);
		
		Thread.sleep(5000);
	    
		
	}
	@When("user tap the enter the button")
	public void user_tap_the_enter_the_button() {
		
		driver.findElement(By.id("com.example.dailyplanner:id/btnEnter")).click();
		
	    
	}
	@Then("the login screen navigated")
	public void the_login_screen_navigated() throws InterruptedException {
		
		Thread.sleep(4000);
		
		boolean displayed = driver.findElement(By.id("com.example.dailyplanner:id/btnLogin")).isDisplayed();
		
		Assert.assertFalse(displayed);
	    
	}


}
