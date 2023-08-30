package com.AppDemo.DemoAmazon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class AppSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
		WebElement e=driver.findElement(By.cssSelector("#cars"));
		Select s=new Select(e);
		
		boolean b= s.isMultiple();
		System.out.println(b);
		
		List<WebElement> opt=s.getOptions();
		System.out.println(opt.size());
		
		for(WebElement e2: opt)
		{
			String t=e2.getText();
			System.out.println(t);
		}
		
		System.out.println("first selected");
		
		s.selectByIndex(1);
		s.selectByValue("audi");
		
		WebElement d= s.getFirstSelectedOption();
		String first= d.getAttribute("value");
		System.out.println(first);
		
		List<WebElement> all = s.getAllSelectedOptions();
		System.out.println(all.size());
		
		s.deselectAll();
		
		List<WebElement> all1 = s.getAllSelectedOptions();
		System.out.println(all1.size());
		
		
		
		
//		s.selectByIndex(2);
//		s.selectByValue("saab");
//		s.selectByVisibleText("Volvo");
//		
//		//s.deselectAll();
//		
//		s.deselectByIndex(2);
//		s.deselectByValue("saab");
//		s.deselectByVisibleText("Volvo");
		
	}

}
