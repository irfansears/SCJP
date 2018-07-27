package seleniumsessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitAndExplicitWait {

	public static void main(String[] args) {

		WebDriver d=Browser.launchChrome();
		d.get("https://www.facebook.com");
		d.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement firstname = d.findElement(By.name("firstname"));
		WebElement lastname =d.findElement(By.name("lastname"));
		WebElement reg_email__ =d.findElement(By.name("reg_email__"));
		WebElement reg_passwd__ =d.findElement(By.name("reg_passwd__"));
		sendKeys(d,firstname,10,"firstname");
		sendKeys(d,lastname,10,"lastname");
		sendKeys(d,reg_email__,10,"reg_email__");
		sendKeys(d,reg_passwd__,10,"reg_passwd__");
		
		WebElement Forgotten_account =d.findElement(By.linkText("Forgotten account?"));
		click(d,Forgotten_account,20);
	}

	public static void sendKeys(WebDriver d, WebElement element, int timeout, String value)
	{
		new WebDriverWait(d,timeout)
		.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
	
	public static void click(WebDriver d, WebElement element, int timeout)
	{
		new WebDriverWait(d,timeout)
		.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
}
