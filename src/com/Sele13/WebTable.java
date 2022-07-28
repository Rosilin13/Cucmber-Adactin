package com.Sele13;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Selenium13\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/table.html");
		
		List<WebElement> row = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
		System.out.println("rowsize =" +row.size());
	    
		for (WebElement webElement : row) {
			
			String text = webElement.getText();
			System.out.println(text);
			
		}
		
		List<WebElement> col = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
		System.out.println("size of col" +col.size());
		
		for (WebElement webElement : col) {
			String text2 = webElement.getText();
			System.out.println(text2);
			
		}
		
		String particular = driver.findElement(By.xpath("//table/tbody/tr[6]/td[1]")).getText();
		System.out.println(particular);
		
		List<WebElement> table = driver.findElements(By.xpath("//table/tbody/tr/td"));
		System.out.println("size of table" +table.size());
		
		for (WebElement webElement : table) {
			
			String all = webElement.getText();
			System.out.println(all);
			
		}
		
				
		}
		
		
	}


