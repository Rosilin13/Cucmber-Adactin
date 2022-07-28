package com.Sele13;



import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetTitle;

public class Windowhandle_Newtab {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Selenium13\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.viki.com/");
		
		Actions act = new Actions(driver);
		
		WebElement ex = driver.findElement(By.linkText("Explore"));
		act.contextClick(ex).build().perform();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement com = driver.findElement(By.linkText("Community"));
		act.contextClick(com).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement app = driver.findElement(By.linkText("Apps"));
		act.contextClick(app).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		String wh1 = driver.getWindowHandle();
		System.out.println(wh1);
		
		Set<String> wh2 = driver.getWindowHandles();
		System.out.println(wh2);
		
	for (String string : wh2) {
		
		String title=driver.switchTo().window(string).getTitle();
		System.out.println(title);
		
	}
	
	String s1 = "Viki Contributor Community";
	
	for (String string : wh2) {
		
		if (driver.switchTo().window(string).getTitle().equals(s1)) {
			
			System.out.println("Done");
			break;
			
		}
		
	}
		
	}

}
