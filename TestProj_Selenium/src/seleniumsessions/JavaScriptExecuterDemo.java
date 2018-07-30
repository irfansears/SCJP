package seleniumsessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptExecuterDemo {

	public static void main(String[] args) {

		WebDriver d= Browser.getUrl("https://www.freecrm.com/index.html");
		d.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Browser.sleep();
		System.out.println("before login title : "+d.getTitle());
		d.findElement(By.name("username")).sendKeys("naveenk");;
		d.findElement(By.name("password")).sendKeys("Test@123");
	WebElement ele=	d.findElement(By.xpath("//input[@class='btn btn-small']"));
//	ele.click();
		String bgcolor= ele.getCssValue("backgroundColor");
		JavascriptExecutor js= (JavascriptExecutor)d;
//		js.executeScript("arguments[0].style.backgroundColor=rgb(0,200,0)", ele);
		js.executeScript("alert('hello world');");
//		js.executeScript("arguments[0].click();", ele);
	
	
	
	}

}
