package seleniumsessions;

import org.openqa.selenium.WebDriver;

public class ImplicitWaitDemo {

	public static void main(String[] args) {

		WebDriver d=Browser.launchChrome();
		d.get("https://jqueryui.com/droppable/");
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
	}

}
