package com.Sele13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locator_Xpath {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Selenium123\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/r.php?r=101");
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		
		firstname.sendKeys("rosilin");
		
		WebElement lastname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		lastname.sendKeys("anthony");
		
		WebElement contains = driver.findElement(By.xpath("//input[contains(@class,'inputtext ')]"));
		
		contains.getClass();
		
		contains.getText();
		System.out.println(contains);
		
		WebElement text = driver.findElement(By.xpath("//div[text()='First name']"));
		text.getText();
		System.out.println(text);
		
		
		WebElement context = driver.findElement(By.xpath("//div[contains(text(),'First name')]"));
		
		System.out.println(context);
		
	}

}
