package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class logintest {

	WebDriver driver;
	@Test
	public void facebook() {
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Test.abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("test@123");
		driver.findElement(By.name("login")).submit();
		
		
	}
	@BeforeMethod
	public void beforeMethod() {
		
		System.setProperty("webdriver.chrome.driver", "F:chromedriverjar\\\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	@AfterMethod
	public void afterMethod() {
		//driver.close();
		driver=null;
	}
	
	
}
