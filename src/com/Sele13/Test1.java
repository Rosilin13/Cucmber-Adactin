package com.Sele13;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Test1 {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Selenium13\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php?id_category=3&controller=category");
		
		driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']")).click();
		
		WebElement size = driver.findElement(By.id("group_1"));
		Select s = new Select(size);
		s.selectByValue("2");
		
		driver.findElement(By.name("Submit")).click();
		
		Thread.sleep(3000); 
		WebElement pro = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a"));
	    pro.click();
		
	    driver.findElement(By.linkText("Proceed to checkout")).click();
	
		
		}
		
	}


