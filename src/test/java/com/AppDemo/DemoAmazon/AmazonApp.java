package com.AppDemo.DemoAmazon;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonApp {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Samsung Phone");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"p_90/6741117031\"]/span/a/div/label/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"p_90/6741117031\"]/span/a/div/label/i")).click();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		driver.get("https://www.snapdeal.com/");
//		driver.manage().window().maximize();
//		Robot robot=new Robot();
//		driver.findElement(By.xpath("//input[@placeholder='Search products & brands']")).sendKeys("Iphone 14");
//		
//		driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[2]/button/span/i")).click();
//		robot.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"649950189716\"]/div[3]/div[1]/a/p")).click();
//		Thread.sleep(3000);
//		
//		robot.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(1000);
//		Actions act =new Actions(driver);
//		WebElement a=driver.findElement(By.xpath("//div[@id='buy-button-id']"));
//	act.moveToElement(a).click().build().perform();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
