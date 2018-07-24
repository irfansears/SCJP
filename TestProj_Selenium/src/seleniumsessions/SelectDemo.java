package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo {

	public static void main(String[] args) {
		WebDriver d= Browser.launchChrome();
		d.get("https://phptravels.org/register.php");
		
		d.findElement(By.cssSelector("input#inputFirstName")).sendKeys("Irfan");;
		d.findElement(By.cssSelector("input.field")).sendKeys("Naikwade");
		Select sel= new Select(d.findElement(By.id("inputCountry")));
//		sel.selectByVisibleText("Nepal"); //OR 
		sel.selectByIndex(0);
	}

}
