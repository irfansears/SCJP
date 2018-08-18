package com.testngtests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import seleniumsessions.Browser;

public class GoogleTest {
	WebDriver driver;
	
	@BeforeMethod 
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}
	
	@Test(priority=3)
	private void titleTest() {
		String title= driver.getTitle();
		System.out.println(driver.getTitle());
	Assert.assertEquals(title, "Google","tile mismatch test failed");	
	Assert.assertTrue(true);

	}
	
	@AfterMethod
	public void tearDoen() {
		driver.quit();
	}

}
