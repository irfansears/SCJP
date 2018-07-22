package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

//		System.setProperty("webdriver.gecko.driver", "C:\\Tools\\firefoxDriver\\geckodriver-v0.21.0-win64\\geckodriver.exe");
//		WebDriver d= new FirefoxDriver();
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("http://www.google.com");
		
	}

}
