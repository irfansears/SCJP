package seleniumsessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverDemo {

	public static void main(String[] args) {

//		WebDriver d= Browser.getUrl("https://www.freecrm.com/index.html");
		
		WebDriver d= new HtmlUnitDriver(); // download from https://github.com/SeleniumHQ/htmlunit-driver/releases
		d.get("https://www.freecrm.com/index.html");
		d.manage().window().maximize();
		d.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Browser.sleep();
		System.out.println("before login title : "+d.getTitle());
		d.findElement(By.name("username")).sendKeys("naveenk");;
		d.findElement(By.name("password")).sendKeys("Test@123");
		d.findElement(By.xpath("//input[@class='btn btn-small']")).click();
		Browser.sleep();
		System.out.println("after login title : "+d.getTitle());
		
	}

}
