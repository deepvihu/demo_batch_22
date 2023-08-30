package com.AppDemo.DemoAmazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	
		// 1 st way
//		String title= driver.getTitle();
//		System.out.println("the Title is : "+title);
//		
//		String current=driver.getCurrentUrl();
//		System.out.println("current url :" +current);
		
		
		
		// 2 way
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		
		WebElement a= driver.findElement(By.id("user-name"));
		System.out.println(a.getAttribute("class"));
		System.out.println(a.getTagName());
		System.out.println(a.getCssValue("font-family"));
		System.out.println(a.getCssValue("width"));
		
		
		
		String text= driver.findElement(By.xpath("//div[@class='login_password']/h4")).getText();
		System.out.println(text);


		
//		driver.close();
//		driver.quit();
		
	
		
	}

}
