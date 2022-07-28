package com.Sele13;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdowm_Methods {
	
	public static void main(String[] args) throws Throwable {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Selenium13\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		Thread.sleep(3000);
		
		WebElement first = driver.findElement(By.id("firstName"));
		first.sendKeys("Rosilin");
		
		WebElement last = driver.findElement(By.id("lastName"));
		last.sendKeys("Anthony");
		
		WebElement mail = driver.findElement(By.id("userEmail"));
		mail.sendKeys("anthony@gmail.com");
		
		WebElement gender = driver.findElement(By.xpath("//label[text()='Female']"));
		gender.click();
		
	    WebElement number = driver.findElement(By.id("userNumber"));
		number.sendKeys("9176102186");
		
	   // WebElement dob = driver.findElement(By.id("dateOfBirth"));
	    //dob.sendKeys("14");
	    
	    WebElement month = driver.findElement(By.id("dateOfBirth"));
	    Select s = new Select(month);
	    s.selectByValue("8");
	    
	    WebElement year = driver.findElement(By.id("dateOfBirth"));
	    Select s1 = new Select(year);
	    s1.selectByVisibleText("1989");
	    
	    
	    
	    
	  
	    
	 
	    
		
	}

}
