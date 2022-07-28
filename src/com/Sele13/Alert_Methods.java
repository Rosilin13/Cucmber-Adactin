package com.Sele13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Methods {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\Selenium13\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		
		Thread.sleep(3000);
		
		WebElement ck = driver.findElement(By.id("alertButton"));
		ck.click();
		driver.switchTo().alert().accept();
		
		
		WebElement cf = driver.findElement(By.id("confirmButton"));
		cf.click();
		driver.switchTo().alert().dismiss();
		
		//promtButton
		
		WebElement pb = driver.findElement(By.id("promtButton"));
		pb.click();
		driver.switchTo().alert().sendKeys("rosy");
		driver.switchTo().alert().accept();
		
		
	}

}
