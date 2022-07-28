package com.Sele13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Multi {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Selenium13\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		WebElement multi = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]"));
		multi.click();
		
		WebElement f1 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(f1);
		
		//WebElement f2 = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
		
		
		WebElement f2 = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(f2);
		
		WebElement ip = driver.findElement(By.xpath("//input[@type='text']"));
		ip.sendKeys("Hiiiiii");
		
		
	}

}
