package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadFile {

	public static void main(String[] args) {

		WebDriver d=Browser.launchChrome();
		d.get("https://html.com/input-type-file/");
		d.findElement(By.id("fileupload")).sendKeys("C:\\Users\\Admin\\Desktop\\1.html");
		Browser.sleep();
	}

}
