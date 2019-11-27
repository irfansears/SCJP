package sto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BrowserFactory {

	public static WebDriver driver;

	@BeforeClass
	public static WebDriver startBrowser(String browserName, String url) throws Exception {

		System.setProperty("webdriver.gecko.driver", "C:\\selenium-driver\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-driver\\chromedriver.exe");

		if (browserName.equals("")) {
			System.out.println("No Browser Parameter given, use default Browser Firefox");
			browserName = "Firefox";
		}

		if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("IE")) {
			driver = new InternetExplorerDriver();
		} else {
			System.out.println("Browser not defined!");
			throw new Exception("Browser not defined!");
		}

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);

		return driver;
	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}
}
