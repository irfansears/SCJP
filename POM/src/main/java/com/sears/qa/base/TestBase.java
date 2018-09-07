package com.sears.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.sears.qa.util.TestUtil;
import com.sears.qa.util.WebEventListener;


public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public  static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;

	public TestBase() {
		try 
		{
			prop=new Properties();
			FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/sears/qa/config/config.properties");
			prop.load(fis);
		}
		catch(IOException io)
		{
			System.out.println("property file not found \n");
			io.printStackTrace();
		}
	}
	
	public static  void initialization() {

		String browsername=prop.getProperty("browser");
		
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if(browsername.equals("chrome"))
		{
			System.getProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		
//		browser 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
//		dynamic wait
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	}

}
