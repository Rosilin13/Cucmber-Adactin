package com.Sele13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Selenium13\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/men-casual-shirts");
		
		List<WebElement> prod = driver.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling :: span[@class='product-discountedPrice']"));
		
		List<Integer> price = new ArrayList<>();
		
	    for (WebElement webElement : prod) {
	    	
	    	String replace = webElement.getText().replace("Rs. ","");
	    	int parseInt = Integer.parseInt(replace);
	    	price.add(parseInt);
			
		}
		Collections.sort(price, Collections.reverseOrder());
		System.out.println(price);
		
		System.out.println("Product count ="+ price.size());// how many product
		System.out.println("Maxi ="+ Collections.max(price));//maximum price
		System.out.println("Mini =" + Collections.min(price));//minimum price
		
	}
	
}
