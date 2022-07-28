package com.Sele13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Single {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Selenium13\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		WebElement s = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(s);
		
		WebElement ip = driver.findElement(By.xpath("(//input[@type='text'])"));
	    ip.sendKeys("Hello");
		
		
	}

}
