package com.Sele13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Jse_13methods {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Selenium13\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
	//	js.executeScript("window.scrollBy(0,1000);");
		
    	js.executeScript("window.scrollBy(0,9000);");
    	
    	js.executeScript("window.scrollBy(0,-4000);");
    	
    	js.executeScript("history.go(0)");
		
    	Thread.sleep(3000);
    	
		WebElement toy = driver.findElement(By.xpath("//h2[text()='New arrivals in Toys']"));
		js.executeScript("arguments[0].scrollIntoView();", toy);
		
		String s1 = js.executeScript("return arguments[0].innerHTML", toy).toString();
		System.out.println(s1+"= text");
		
		
		WebElement ck = driver.findElement(By.xpath("//img[@alt='New arrivals in Toys']"));
		js.executeScript("arguments[0].click();", ck);
		
		
		String sTexString = js.executeScript("return document.title;").toString();
		System.out.println(sTexString + "= Title");
		
		Object url = js.executeScript("return document.URL;");
		System.out.println(url);
		
	    js.executeScript("alert('hello');");
		
		
		js.executeScript("window.location ='https://www.facebook.com/'");
		
		//js.executeScript("document.getElementById('email').value='Rosy';");
		
	//	String string = js.executeScript("return document.documentElement.innerText;").toString();
		//System.out.println(string);
		
		//js.executeScript("window.location='https://www.dominos.co.in/'");
		
		//driver.close();
		

		
		
		
	}

}
