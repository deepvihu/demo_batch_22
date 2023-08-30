package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ThirdTest {
	WebDriver driver;
	
	@Test (priority=-1)
	public void initializeBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	
	@Test (priority=0)
	@Parameters({"username" , "password"})
	public void test2(@Optional("problem_user")String username,@Optional("secret_sauce") String password)
	{
		  driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
			driver.findElement(By.xpath("//input[@id='login-button']")).click();}

	@Test (priority=1)
	public void teardown()
	{
		driver.close();
	}
}
