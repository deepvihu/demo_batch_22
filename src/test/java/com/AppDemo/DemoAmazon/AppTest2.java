package com.AppDemo.DemoAmazon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		List<WebElement> e= driver.findElements(By.tagName("input"));
		System.out.println(e.size());
	
		
	
		
		
		WebElement a=driver.findElement(By.cssSelector("#login-button"));
		
		System.out.println(a.isEnabled());
		
		//driver.findElement(By.linkText("Gmail")).click();
		//driver.findElement(By.partialLinkText("Ima")).click();
		
	}

}
