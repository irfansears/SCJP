package com.tests;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

	WebDriver driver;
//	Logger log = Logger.getLogger(LoginTest.class);
//what is log: capturing info/activities at the time of program execution
//	types of logs
//	1. info
//	2.warn
//	3.error
//	4.fatal
//	how to generate logs: use apache log4j api (jar file)
//	how it works: it reads log 4j configurations from log4j.properties 
//	 where to create : inside resources folders
	Logger log = Logger.getLogger("LoginTest");
	
	@BeforeMethod
	public void setUp() {

		System.out.println("in before method ..");
		/*System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");*/
		log.info("In Before setup");
	}

	@Test
	private void titleTest() {
		/*String title = driver.getTitle();
		System.out.println(driver.getTitle());
		Assert.assertEquals(title, "Google", "tile mismatch test failed");
		Assert.assertTrue(true);*/
		log.info("In title test method");
		System.out.println("in title test");

	}
	
	@Test
	private void logTest() {
		
		log.info("In logTest");
		/*String title = driver.getTitle();
		System.out.println(driver.getTitle());
		Assert.assertEquals(title, "Google", "tile mismatch test failed");
		Assert.assertTrue(true);*/
/*
		boolean b=driver.findElement(By.id("hplogo")).isDisplayed();
		Assert.assertTrue(b);*/
		System.out.println("in log test");
	}

	@AfterMethod
	public void tearDown() {
//		driver.quit();
		log.info("In tear down");
	}
}
