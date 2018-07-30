package seleniumsessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser {
	static WebDriver d;
	public static WebDriver launchChrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver_win32\\chromedriver.exe");
		d= new ChromeDriver();
//		new DesiredCapabilities();
//		DesiredCapabilities cap= DesiredCapabilities.chrome();
//		cap.setBrowserName("My Chrome Browser");
//		cap.setVersion("10.0");
//		cap.setPlatform(Platform.WINDOWS);
//		cap.
		
//		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		
//		dynamic wait
		d.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return d;
	}

	public static void sleep() {

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		d.quit();
	}
	
	public static void sleep(int i) {

		try {
			Thread.sleep(i*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		d.quit();
	}
	public static WebDriver getUrl(String url) {
		launchChrome();
		d.get(url);
		return d;
	}
	
	public void click(int wait, WebElement ele) 
	{
		new WebDriverWait(d,wait).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();
	}
}
