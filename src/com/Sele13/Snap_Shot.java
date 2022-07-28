package com.Sele13;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snap_Shot {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdrivder.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Selenium13\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://commons.apache.org/proper/commons-io/download_io.cgi");
		
		//byte d =(byte) c;
		
		TakesScreenshot s = (TakesScreenshot) driver; 
		
		File src = s.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\LENOVO\\eclipse-workspace\\Selenium13\\Snap\\snap2.png");
		
		FileUtils.copyFile(src, dest);
		
		
		
		
	
		
	}

}
