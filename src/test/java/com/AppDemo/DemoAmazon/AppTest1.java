package com.AppDemo.DemoAmazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/");
		driver.manage().window().maximize();
	
		
		WebElement l=driver.findElement(By.xpath("//img[@src='https://b.zmtcdn.com/web_assets/81f3ff974d82520780078ba1cfbd453a1583259680.png']"));
		System.out.println(l.isDisplayed());
		System.out.println(l.isSelected());
		System.out.println(l.isEnabled());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		WebElement a=driver.findElement(By.xpath("//input[@type='text']"));
//		a.sendKeys("standard_user");
//		Thread.sleep(1000);
//		a.clear();
		
//		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
//		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//	driver.findElement(By.name("user-name")).sendKeys("standard_user");
//	
//	driver.findElement(By.id("password")).sendKeys("secret_sauce");
//	
//	driver.findElement(By.id("login-button")).click();
//	
//	driver.findElement(By.tagName("input")).sendKeys("standard_user");
//	
//	driver.findElement(By.className("input_error form_input"));
		//driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver = new EdgeDriver();
//		driver.get("https://www.google.com/");
		
		
		
		

//		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.saucedemo.com/");
//		driver.manage().window().maximize();
//		
//		
//		System.setProperty("webdriver.edge.driver", "C:\\drivers\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
//		driver.get("https://www.saucedemo.com/");
//		driver.manage().window().maximize();
//		//driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
