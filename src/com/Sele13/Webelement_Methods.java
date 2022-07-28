package com.Sele13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_Methods {
	
	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\Selenium13\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
        driver.get("https://www.instagram.com/accounts/login/?hl=en");
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("rosilin11@gmail.com");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Maddy@13");
		
	
		
	
		System.out.println("Done");
	}

		
	}