package com.AppDemo.DemoAmazon;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.magicbricks.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Actions act =new Actions(driver);
		
		String parenthandle= driver.getWindowHandle();
		System.out.println("Parent Window " +parenthandle);
		
		WebElement a=driver.findElement(By.xpath("//*[@id=\"buyheading\"]"));
	
		act.moveToElement(a).build().perform();
		driver.findElement(By.xpath("//*[@id=\"propTypesBuy1\"]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		
		//getWindow handles
		
		Set<String> handles= driver.getWindowHandles();
		
		
		for(String h: handles)
		{
			System.out.println(h);
		}
		
		
		//driver.switchTo().window(parenthandle);
	
		
		
		
		
		
//		driver.switchTo().newWindow(WindowType.TAB);
//		
//		driver.switchTo().newWindow(WindowType.WINDOW);
	
		
		
		
		
	}

}
