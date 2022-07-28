package com.Sele13;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_Alsolutepath {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Selenium13\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		
		WebElement table = driver.findElement(By.xpath("//img[@alt='Table']"));
		table.click();
		
		String text = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/section/div/table/tbody/tr[3]/td[1]")).getText();
        System.out.println(text);

        
       // String row = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/section/div/table/tbody/tr[2]")).getText();
       // System.out.println(row);
        
        
    	//String text2 = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/section/div/table/tbody")).getText();
	    //System.out.println(text2);
	    
	    List<WebElement> tab = driver.findElements(By.xpath("/table/tbody/tr/td")); //get text wont come so we for foreach concept
	
	    for (WebElement webElement : tab) {
	    	
	    	System.out.println(webElement.getText());
	    	
		}
		
	}

}
