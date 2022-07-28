package com.Sele13;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Snap {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Selenium13\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		WebElement f1 = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(f1);
		
		WebElement ip = driver.findElement(By.xpath("//input[@type='text']"));
		ip.sendKeys("Hello");
		
		driver.switchTo().defaultContent();
		
		WebElement multi = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		multi.click();
		
		WebElement fr1 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(fr1);
		
		WebElement fr2 = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(fr2);
		
		WebElement ip2 = driver.findElement(By.xpath("//input[@type='text']"));
		ip2.sendKeys("Hiiiiii");
		
		TakesScreenshot s = (TakesScreenshot) driver;
		File src = s.getScreenshotAs(OutputType.FILE);
		File dest = new File ("C:\\Users\\LENOVO\\eclipse-workspace\\Selenium13\\Snap\\snap1.png");
		FileUtils.copyFile(src, dest);
		
		
		
		
		
		
		
		
	}

}
