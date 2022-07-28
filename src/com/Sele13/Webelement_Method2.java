package com.Sele13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_Method2 {
	
	public static void main(String[] args) {
		
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Selenium13\\Driver\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
    driver.get("https://www.facebook.com/");
	
    WebElement username = driver.findElement(By.id("email"));
	username.sendKeys("rosilin11@gmail.com");
	
	WebElement password = driver.findElement(By.name("pass"));
	password.sendKeys("Maddy@13");
	
	WebElement Login = driver.findElement(By.name("login"));
	
	boolean displayed = Login.isDisplayed();
	System.out.println(displayed);
	
	boolean selected = Login.isSelected();
	System.out.println(selected);
	
	boolean enabled = Login.isEnabled();
	System.out.println(enabled);
	
	String text = Login.getText();
	System.out.println(text);
	
	String attribute = Login.getAttribute("data-testid");
	System.out.println(attribute);
	
	
	Login.click();
	
	System.out.println("Done");

}
}

