package com.AppDemo.DemoAmazon;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;

public class ExtentRepoTest {
		
		  WebDriver driver=null;
		  ExtentTest testt;
		  ExtentReports report;
		
  @Test
  public void verifyTitle() {
	  
	report= new ExtentReports("C:\\Report\\LogReport.html");
	testt=report.startTest("VerifyBlogTitle");
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	testt.log(LogStatus.INFO, "Browser started");	
	driver.get("https://www.google.com/");
	testt.log(LogStatus.INFO, "Application is up & running");
	driver.manage().window().maximize();
	
	String title=driver.getTitle();
	Assert.assertTrue(title.contains("Swag Labs"));
	
	testt.log(LogStatus.PASS, "Title verified");  
  }
  
  @AfterMethod
  public void teardown(ITestResult result) throws IOException
  {
	  if(result.getStatus()==ITestResult.FAILURE)
	  {
		  String screen=Utils.CaptureScreen(driver, result.getName());
		  String image = testt.addScreenCapture(screen);
		  testt.log(LogStatus.FAIL,"Title verification failed", image);
	  }
	report.endTest(testt);
	report.flush();
	
	driver.get("C:\\Report\\LogReport.html");
  }}
