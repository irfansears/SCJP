package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertDemo {

	public static void main(String[] args) {

		WebDriver d=Browser.launchChrome();
		d.get("https://mail.rediff.com/cgi-bin/login.cgi");
		d.findElement(By.cssSelector("input[type='submit']")).click();
		Alert a= d.switchTo().alert();
		System.out.println(a.getText());
		a.dismiss();
		
	}

}
