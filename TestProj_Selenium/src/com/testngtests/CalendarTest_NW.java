package com.testngtests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalendarTest_NW {

//	sad  this is not working
		WebDriver driver;
		@BeforeMethod
		private void setup() {
			System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("http://www.spicejet.com");
		}
		
		
		@Test
		public void calendarTest() {

			WebElement ele= driver.findElement(By.id("ctl00_mainContent_txt_Fromdate"));
			System.out.println(ele.getAttribute("value"));
			System.out.println(ele.getText());
			String dateVal="19-08-2018";
			selectDate(driver,ele,dateVal);
			
			
		}
		
		public  void selectDate(WebDriver driver, WebElement ele, String date) {
			
			JavascriptExecutor js= ((JavascriptExecutor)driver);
			js.executeScript("arguments[0].setAttribute('value','"+date+"');", ele);
		}
		@AfterMethod
		private void teardown() {

//			driver.quit();
		}
	}