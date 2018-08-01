package seleniumsessions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlashDemoUsingJS {

	public static void main(String[] args) throws IOException {

		WebDriver d= Browser.getUrl("https://www.freecrm.com/index.html");
		d.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Browser.sleep();
		System.out.println("before login title : "+d.getTitle());
		d.findElement(By.name("username")).sendKeys("naveenk");;
		d.findElement(By.name("password")).sendKeys("Test@123");
		WebElement loginBtn=	d.findElement(By.xpath("//input[@class='btn btn-small']"));
		/*flash(loginBtn,d);
		drawBorder(loginBtn,d);
		File f =((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File ("C:\\Users\\Admin\\Desktop\\scrennshot\\b.png"));
		genrateAlert(d, "the screen is captured");
		Alert alert = d.switchTo().alert();
		alert.dismiss();
		ClickElementByJS(loginBtn,d);
		File f1 =((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File ("C:\\Users\\Admin\\Desktop\\scrennshot\\b1.png"));
		d.navigate().refresh();
		refreshBrowserByJS(d);*/
		System.out.println(getTitleByJS(d));
		System.out.println(getPageInnerTextByJS(d));
//		scrollPageDownByJS(d);
		scrollIntoViewByJS(d.findElement(By.linkText("Forgot Password?")),d);
		
	}
	
	public static void flash(WebElement element, WebDriver driver){
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		String bgcolor= element.getCssValue("backgroundColor");
		System.out.println("bgcolor is : "+bgcolor);
		for (int i = 0; i < 7; i++) {
			
			changeColor("rgb(0,200,0)",element,driver);
			changeColor(bgcolor,element,driver);
		}
		
	}

	public static void changeColor(String color,WebElement element, WebDriver driver){
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.backgroundColor = '"+color+"'", element);
		
		try {
			Thread.sleep(30);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void drawBorder(WebElement element, WebDriver driver){
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border = '3px solid red'", element);
	}
	
	public static void genrateAlert(WebDriver driver, String msg){

		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("alert('"
				+ msg+
				"')");
		}
	
	public static void ClickElementByJS(WebElement element, WebDriver driver){
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",element);
		}
	
	public static void refreshBrowserByJS( WebDriver driver){
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("history.go(0);");
		}
	
	public static String getTitleByJS( WebDriver driver){
		JavascriptExecutor js= (JavascriptExecutor)driver;
		return js.executeScript("return document.title;").toString();
		}
	
	public static String getPageInnerTextByJS( WebDriver driver){
		JavascriptExecutor js= (JavascriptExecutor)driver;
		return js.executeScript("return document.documentElement.innerText;").toString();
		}
	
	public static void scrollPageDownByJS( WebDriver driver){
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		}
	
	public static void scrollIntoViewByJS(WebElement element, WebDriver driver){
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",element);
		}
}
