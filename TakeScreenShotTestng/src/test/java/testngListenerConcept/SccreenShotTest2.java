package testngListenerConcept;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class SccreenShotTest2 {
	static WebDriver d;
	static int imgno=0;
	@BeforeMethod
	private void setup() {

		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver_win32\\chromedriver.exe");
		d= new ChromeDriver();
		d.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.get("http:///www.google.com");
	}
	
	static void failed(String methodName, String time) {

		File f=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		try {
//			FileUtils.copyFile(f, new File("E:\\MyWorkSpace\\TakeScreenShotTestng\\screenshots\\a1.png"));
			/*FileUtils.copyFile(f, new File("E:\\MyWorkSpace\\TakeScreenShotTestng\\screenshots\\"
					+ "a1"
					+ ++imgno
					+ ".png"));*/
			
			FileUtils.copyFile(f, new File("E:\\MyWorkSpace\\TakeScreenShotTestng\\screenshots\\"
					+ methodName+"_"+time
					+ ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Test
	private void take() {

		Assert.assertEquals(true, false);
	}
	
	@Test
	private void take2() {

		Assert.assertEquals(true, false);
	}
	
	@AfterMethod
	private void tearDown() {

		d.quit();
	}
	
	
}
