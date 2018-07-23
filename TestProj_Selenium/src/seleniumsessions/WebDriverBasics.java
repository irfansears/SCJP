package seleniumsessions;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.*;

public class WebDriverBasics {

	public static void main(String[] args) {

//		System.setProperty("webdriver.gecko.driver", "C:\\Tools\\firefoxDriver\\geckodriver-v0.21.0-win64\\geckodriver.exe");
//		WebDriver d= new FirefoxDriver();
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("http://www.google.com");
		d.getPageSource();
		d.quit();
		d.getWindowHandle();
		d.manage().window().maximize();
//		WebDriver.Window  dr1=RemoteWebDriver.
		
		WebDriver.Window dr= new WebDriver.Window() {
			
			public void setSize(Dimension targetSize) {
				// TODO Auto-generated method stub
				
			}
			
			public void setPosition(Point targetPosition) {
				// TODO Auto-generated method stub
				
			}
			
			public void maximize() {
				// TODO Auto-generated method stub
				
			}
			
			public Dimension getSize() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public Point getPosition() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public void fullscreen() {
				// TODO Auto-generated method stub
				
			}
		};
		
//		d.manage()
		d.close();
	}

}
