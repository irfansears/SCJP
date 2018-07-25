package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDemo {

	public static void main(String[] args) {

		WebDriver d=Browser.launchChrome();
		d.get("http://www.spicejet.com/Default.aspx");
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		Actions a = new Actions(d);
		a.moveToElement(d.findElement(By.id("highlight-addons"))).build().perform();
	}

}
