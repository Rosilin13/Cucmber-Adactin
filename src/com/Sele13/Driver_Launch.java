package com.Sele13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver_Launch {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Selenium13\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl + "(URL)");
		
		
		String title = driver.getTitle();
		System.out.println(title+"(TITLE)");
		
		System.out.println();
		
		
		
	}

}
