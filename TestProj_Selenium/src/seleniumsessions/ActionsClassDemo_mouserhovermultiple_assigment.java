package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDemo_mouserhovermultiple_assigment {

	public static void main(String[] args) {
// assignment to do
		WebDriver d=Browser.launchChrome();
		d.get("http://www.spicejet.com/Default.aspx");
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		Actions a = new Actions(d);
		a.moveToElement(d.findElement(By.id("ctl00_HyperLinkLogin")))
		.moveToElement(d.findElement(By.xpath("//*[@class='selected']")))
		.moveToElement(d.findElement(By.linkText("Sign up")))
		.build()
		.perform();
	}

}
