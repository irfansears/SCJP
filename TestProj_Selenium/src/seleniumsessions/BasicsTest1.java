package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicsTest1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://phptravels.org/register.php");
		
		d.findElement(By.cssSelector("input#inputFirstName")).sendKeys("Irfan");;
		d.findElement(By.cssSelector("input.field")).sendKeys("Naikwade");
//		d.findElement(By.id("inputCountry"));
		Select sel= new Select(d.findElement(By.id("inputCountry")));
//		sel.selectByVisibleText("Nepal");
		sel.selectByIndex(0);
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		d.quit();
	}

}
