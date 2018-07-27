package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DynamicTable {

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
		
		
//		Methodd 1

		String before_xpath="//*[@id='vContactsForm']/table/tbody/tr[";
//				+ "4"
		String after_xpath	= "]/td[2]/a";
		for (int i = 4; i < 10; i++) {
			String name=d.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
			System.out.println(name);
			if(name.contains("Aakash Maheshwari"))
			{
				d.findElement(By.xpath(before_xpath+i+"]/td[1]/input")).click();
				
			}
			
		}
		
		
//		Methodd 2 by fining ancestor
		
		
		
	}

}
