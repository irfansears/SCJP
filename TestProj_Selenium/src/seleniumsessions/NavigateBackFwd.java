package seleniumsessions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class NavigateBackFwd {

	public static void main(String[] args) throws InterruptedException, IOException {

		
		WebDriver d=Browser.launchChrome();
		d.get("https://www.facebook.com");
		d.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
//		d.navigate().to("https://www.google.com");
//		Thread.sleep(2000);
//		d.navigate().back();
//		d.navigate().forward();
//		d.navigate().refresh();
//		d.navigate().
		
		File f=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\Admin\\Desktop\\scrennshot\\a.png"));
	}

}
