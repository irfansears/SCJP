package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameDemo {

	public static void main(String[] args) {

		WebDriver d=Browser.launchChrome();
		d.get("https://www.freecrm.com/index.html");
		d.findElement(By.name("username")).sendKeys("naveenk");;
		d.findElement(By.name("password")).sendKeys("Test@123");
//		d.findElement(By.xpath("//input[@type='submit']")).click();
//		d.findElement(By.xpath("//input[@value='login']")).click();
		Browser.sleep();
		d.findElement(By.xpath("//input[@class='btn btn-small']")).click();
		Browser.sleep();
		d.switchTo().frame("mainpanel");
		Browser.sleep();
		d.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		
	}

}
