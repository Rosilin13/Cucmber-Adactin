package com.Sele13;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Create {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Selenium13\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement create = driver.findElement(By.xpath("//a[text()='Create New Account']"));
	    create.click();
	    
	    //Thread.sleep(5000);
		
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    WebElement first = driver.findElement(By.name("firstname"));
		first.sendKeys("Rosilin");
		

		WebElement last = driver.findElement(By.name("lastname"));
		last.sendKeys("Anthony");
		
		WebElement mail = driver.findElement(By.name("reg_email__"));
		mail.sendKeys("rosilin13@gmail.com");
		
		WebElement reenter = driver.findElement(By.name("reg_email_confirmation__"));
		reenter.sendKeys("rosilin13@gmail.com");
		
		WebElement pass = driver.findElement(By.id("password_step_input"));
		pass.sendKeys("Rosy@45632");
		
		WebElement day = driver.findElement(By.id("day"));
		Select s = new Select(day);
		s.selectByValue("16");
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select s1 = new Select(month);
		s1.selectByIndex(7);

		WebElement year = driver.findElement(By.name("birthday_year"));
		Select s2=new Select(year);
		boolean multiple = s2.isMultiple();
		System.out.println(multiple);
		s2.selectByVisibleText("1989");
		
		WebElement gender = driver.findElement(By.xpath("//label[text()='Female']"));
		gender.click();
		
	//	WebElement submit = driver.findElement(By.name("websubmit"));
		//submit.click();
		
		System.out.println("Done");
	
	}

}
