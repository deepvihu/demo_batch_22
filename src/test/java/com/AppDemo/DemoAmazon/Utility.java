package com.AppDemo.DemoAmazon;

import java.io.File;
import java.io.IOException;
//import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
//import org.apache.poi.hpsf.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	public static void Capture(WebDriver driver){
		// TODO Auto-generated method stub
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);;
		try {
			FileUtils.copyFile(src, new File("./Screenshots/"+timestamp()+"  " + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String timestamp()
	{
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}
	
}
