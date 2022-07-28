package com.Sele13;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Selenium13\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		WebElement sign = driver.findElement(By.xpath("//a[normalize-space()='Sign in']"));
		sign.click();
		
		WebElement mail = driver.findElement(By.id("email_create"));
		mail.sendKeys("jas197@gmail.com");
		
		WebElement create = driver.findElement(By.id("SubmitCreate"));
		create.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebElement gender = driver.findElement(By.id("id_gender2"));
		gender.click();
		
		WebElement first = driver.findElement(By.id("customer_firstname"));
		first.sendKeys("jim");
		
		WebElement last = driver.findElement(By.id("customer_lastname"));
		last.sendKeys("min");
		
		WebElement pwd = driver.findElement(By.id("passwd"));
		pwd.sendKeys("bonobonaya");
		
		WebElement day = driver.findElement(By.id("days"));
		Select s = new Select(day);
		s.selectByValue("4");
		
		WebElement mon = driver.findElement(By.id("months"));
		Select s1 = new Select(mon);
		s1.selectByIndex(8);
		
		WebElement yr = driver.findElement(By.id("years"));
		Select s2 = new Select(yr);
		s2.selectByValue("1970");
		
		WebElement cpy = driver.findElement(By.id("company"));
		cpy.sendKeys("claps");
		
		WebElement cadd = driver.findElement(By.id("address1"));
		cadd.sendKeys("EspeeITpark,6th floor,jawaharlal nehru road");
		
		WebElement padd = driver.findElement(By.id("address2"));
		padd.sendKeys("a5,balaji nagar");
		
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("Los Angeles");
		
		WebElement state = driver.findElement(By.id("id_state"));
		Select s3 = new Select(state);
		s3.selectByValue("5");
		
		WebElement pin = driver.findElement(By.id("postcode"));
		pin.sendKeys("90002");
		
		WebElement info = driver.findElement(By.id("other"));
		info.sendKeys("329 easwaran nagar,3rd cross street,west saidapet,044276897");
		
		WebElement hp = driver.findElement(By.id("phone"));
		hp.sendKeys("765422");
		
		WebElement mobile = driver.findElement(By.id("phone_mobile"));
		mobile.sendKeys("9876345217");
		
		WebElement al = driver.findElement(By.id("alias"));
		al.clear();
		al.sendKeys("LA,California");
		
	   WebElement register = driver.findElement(By.id("submitAccount"));
	   register.click();
	   
	   driver.findElement(By.linkText("Women")).click();
		
        driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']")).click();
		
		WebElement size = driver.findElement(By.id("group_1"));
		Select sz = new Select(size);
		sz.selectByValue("2");
		
		driver.findElement(By.name("Submit")).click();
		
		Thread.sleep(3000); 
		WebElement pro = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a"));
	    pro.click();
		
	    driver.findElement(By.linkText("Proceed to checkout")).click();
	    
		
	    driver.findElement(By.name("processAddress")).click();
	    
	    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
	    driver.findElement(By.name("processCarrier")).click();
	    
	    TakesScreenshot sc = (TakesScreenshot) driver;
	    File src = sc.getScreenshotAs(OutputType.FILE);
	    File dest = new File("C:\\Users\\LENOVO\\eclipse-workspace\\Selenium13\\Snap\\mini.png");
	    FileUtils.copyFile(src, dest);
		
	}

}
