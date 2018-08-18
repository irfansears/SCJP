package com.testngtests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleSearchTest {
	WebDriver driver;
	@BeforeMethod
	private void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}
	
	
	@Test
	private void googleSearchTest() {

		driver.findElement(By.id("lst-ib")).sendKeys("testing ");
		List<WebElement> list= driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbqs_c']"));
		System.out.println("total number of suggesstions: "+list.size());

		for (int i = 0; i < list.size(); i++) {
			
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("testing tools"));
			list.get(i).click();
			break;
			
		}
		
	}
	@AfterMethod
	private void teardown() {

		driver.quit();
	}
}
