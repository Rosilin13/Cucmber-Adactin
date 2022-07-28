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
import org.openqa.selenium.interactions.Actions;

public class Action_Concept {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Selenium13\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://jqueryui.com/droppable/");
		
		Actions act = new Actions(driver);
	
		driver.switchTo().frame(0);
		
	    WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		act.dragAndDrop(drag, drop).build().perform();
		
		TakesScreenshot s = (TakesScreenshot) driver;
		File src = s.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\LENOVO\\eclipse-workspace\\Selenium13\\Snap\\dragdrop.png");
		FileUtils.copyFile(src, dest);
		
		driver.navigate().to("https://demoqa.com/buttons");
		
		Thread.sleep(3000);
		
		WebElement dk = driver.findElement(By.id("doubleClickBtn"));
		act.doubleClick(dk).build().perform();
		
		
	    WebElement click = driver.findElement(By.xpath("//button[text()='Click Me']"));
		act.click(click).build().perform();
	    
	    WebElement rc = driver.findElement(By.id("rightClickBtn"));
	    act.contextClick(rc).build().perform();
	    
	    
	    
	    
		
	}
		

}
