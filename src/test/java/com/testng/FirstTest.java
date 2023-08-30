package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {

	WebDriver driver;
	
	@BeforeTest
	public void initializeBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	
	@Test (timeOut=1000, expectedExceptions= {NoSuchElementException.class})
	public void test2() throws InterruptedException
	{
		//Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
}
