package com.testngtests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import seleniumsessions.Browser;

public class GoogleTitleTest {
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
		
		System.out.println(driver.getTitle());
		
		

	}
	@Test(priority=3)
	private void googleLogoTest() {

		boolean b= driver.findElement(By.id("hplogo")).isDisplayed();
		
		if(b) System.out.println("logo is displayed");
		else System.out.println("logo is not diaplayed");
	}
	
	@Test(priority=1)
	private void mailLinkTest() {

		boolean b = driver.findElement(By.linkText("Gmail")).isDisplayed();
		if(b) System.out.println("mail link is displayed");
		else System.out.println("mail link is not diaplayed");
		
		
	}
	@AfterMethod
	public void tearDoen() {
		driver.quit();
	}

}
