package com.testngtests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalendarTest_ByJavaScript {

		WebDriver driver;
		@BeforeMethod
		private void setup() {
			System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://www.freecrm.com");
			
		}
		
		
		@Test
		private void calendarTest() {

			driver.findElement(By.name("username")).sendKeys("naveenk");;
			driver.findElement(By.name("password")).sendKeys("Test@123");
			driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
			
			driver.switchTo().frame("mainpanel");
			
//			driver.findElement(By.linkText("Calendar")).click();
			driver.findElement(By.xpath("//a[@title='Calendar']")).click();;
			
			String date="29-September-2018";
			String [] dtarr=date.split("-");
			String day= dtarr[0];
			String month= dtarr[1];
			String year= dtarr[2];
			
			Select select= new Select(driver.findElement(By.name("slctMonth")));
			select.selectByVisibleText(month);
			System.out.println("title: "+driver.getTitle());
			
			
			Select select1= new Select(driver.findElement(By.name("slctYear")));
			select1.selectByVisibleText(year);
			
			//table[@class='crmcalendar']/tbody/tr[2]/td/table/tbody/tr[2]/td[1]
			String beforexpath="//table[@class='crmcalendar']/tbody/tr[2]/td/table/tbody/tr[";
			String afterxpath = "]/td[";
//					+ "1]";			
			
			int totalRows=driver.findElements(By.xpath("//table[@class='crmcalendar']/tbody/tr[2]/td/table/tbody/tr")).size();
			
			System.out.println("total rows are : "+ totalRows);
			final int totalWeekDays=7;
			boolean flag = false;
			String dayVal=null;
			for (int rowNo = 2; rowNo <= totalRows; rowNo++) {
				for (int colNo = 1; colNo <= totalWeekDays; colNo++) {
					dayVal=driver.findElement(By.xpath(beforexpath+rowNo+afterxpath+colNo+"]")).getText();
					System.out.println(dayVal);
					if(dayVal.equals(day))
					{
						System.out.println("clicking "+driver.findElement(By.xpath(beforexpath+rowNo+afterxpath+colNo+"1]")).getText());
						driver.findElement(By.xpath(beforexpath+rowNo+afterxpath+"]")).click();
						flag=true;
						break;
					}
				}
				if(flag) break;
			}
			
			
		}
		@AfterMethod
		private void teardown() {

			driver.quit();
		}
	}