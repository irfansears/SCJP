package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		WebDriver d=Browser.launchChrome();
		d.get("https://jqueryui.com/droppable/");
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.switchTo().frame(0);
		
		Actions a = new Actions(d);
	    a
	    .clickAndHold(d.findElement(By.xpath("//*[@id='draggable']")))
		.moveToElement(d.findElement(By.xpath("//*[@id='droppable']")))
		.release()
		.build()
		.perform();

	}

}
