package seleniumsessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedEnabledSelected {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		d.get("https://www.freecrm.com/register/");
		System.out.println("isDisplayed : "+d.findElement(By.id("submitButton")).isDisplayed());
		
		System.out.println("isEnabled : "+d.findElement(By.id("submitButton")).isEnabled());
		
		System.out.println("isSelected - before click checkbox : "+d.findElement(By.name("agreeTerms")).isSelected());
		
		d.findElement(By.name("agreeTerms")).click();

		System.out.println("isSelected after click - checkbox : "+d.findElement(By.name("agreeTerms")).isSelected());

		System.out.println("isEnabled : "+d.findElement(By.id("submitButton")).isEnabled());
		
		
	}

}
