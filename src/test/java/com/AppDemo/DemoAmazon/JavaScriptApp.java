package com.AppDemo.DemoAmazon;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(1000);
		
		WebElement uname=driver.findElement(By.id("user-name"));
		js.executeScript("arguments[0].setAttribute('value','standard_user');" , uname);
		
		
		Object obj =js.executeScript("return arguments[0].getAttribute('value')" ,uname);
		String s=(String)obj;
		System.out.println(s);
		
		
		
		
		
		
		
		
		
//		// reresh
//		js.executeScript("location.reload()");
//		Thread.sleep(1000);
//		
//		
//		
//		WebElement a=driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[3]/a"));
//		js.executeScript("arguments[0].click();", a);
//		
//		// scroll the page  1st - horizontal , 2nd- Vertical
//		js.executeScript("window.scrollBy(200,600)");
	}

}
