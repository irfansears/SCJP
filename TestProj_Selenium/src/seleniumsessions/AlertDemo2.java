package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertDemo2 {

	public static void main(String[] args) {

		WebDriver d=Browser.launchChrome();
		d.get("https://www.realestate.com.kh/buy/?listing_type=sale&categories=Condo&order_by=relevance&is_certified=1&private_seller=1#page-10");
		d.findElement(By.id("leadpages-close-button")).click();
//		Alert a= d.switchTo().alert();
//		System.out.println(a.getText());
//		a.dismiss();
		
	}

}
