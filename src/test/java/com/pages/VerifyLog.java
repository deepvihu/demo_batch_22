package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyLog {
	WebDriver driver=null;
	LogPage lp;
	
	@Test
	public void testLog()
	{

		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://www.saucedemo.com/");
		 driver.manage().window().maximize();
		lp=new LogPage (driver);
		
		lp.typelog("problem_user", "secret_sauce");

//		lp.typeuser();
//		lp.typepass();
//		lp.clickbtn();
				
		 
		
		
		
	}
	
	
}
