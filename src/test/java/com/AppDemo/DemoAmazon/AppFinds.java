package com.AppDemo.DemoAmazon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppFinds {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
	
		//driver.findElement(By.cssSelector("ve")).sendKeys("Admin");
		Thread.sleep(7000);
	//	driver.findElement(By.xpath("//a[contains(text(),'Add Employee')]")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("deepa");
		
		
		
		
		
//		driver.findElement(By.tagName("iframe"));
//		driver.switchTo().frame(0);
//		
//		WebElement source= driver.findElement(By.id("draggable"));
//		WebElement dst= driver.findElement(By.id("droppable"));
//		
//		Actions act =new Actions(driver);
//		
//		act.dragAndDrop(source, dst).perform();
//		
//		if(dst.getText().matches("Dropped!"))
//		{
//			System.out.println("Successfully dropped");
//		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		act.sendKeys(Keys.TAB).build().perform();
//		
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		
//		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//    uname.click();
//    act.moveToElement(uname).sendKeys("standard_user").build().perform();
//    
//    WebElement pwd= driver.findElement(By.id("password"));
//    pwd.click();
//    act.moveToElement(pwd).sendKeys("secret_sauce").build().perform();
//    
//    WebElement log= driver.findElement(By.id("login-button"));
//    act.moveToElement(log).click().build().perform();
    
    
	}

}
