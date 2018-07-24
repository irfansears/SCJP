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
		d.findElement(By.xpath("//input[@type='submit']")).click();
		Browser.sleep();
		d.switchTo().frame("mainpanel");
		d.findElement(By.xpath("//a[contains(text(),'Contacts']")).click();
		
//		d.findElement(By.xpath("//li[@class='c1 gnf_nav_depth1_item gnf-has-dropdown']")).click();
//		Actions a= new Actions(d);
//		a.moveToElement(d.findElement(By.xpath("//li[@class='c1 gnf_nav_depth1_item gnf-has-dropdown']")));
		d.findElement(By.xpath("//button[@class='button-secondary']")).click();;
	}

}
