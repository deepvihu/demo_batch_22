package com.AppDemo.DemoAmazon;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utils {

	public static String CaptureScreen(WebDriver driver, String filename) throws IOException {
		// TODO Auto-generated method stub
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		String s="C:\\Users\\deedhole\\eclipse-workspace\\DemoAmazon\\Screenshots\\"+filename+".png";
		File dest=new File(s);
		FileUtils.copyFile(src,dest);
		return s;
	}

}
