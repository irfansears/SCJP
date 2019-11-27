package seleniumsessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_report {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
//		dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> list= driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
		System.out.println("total rows are :"+list.size());
		int rowCount=list.size();
		
		for (int i = 2; i <= rowCount; i++) {
			List<WebElement> list_coloumns= driver.findElements(By.xpath("//*[@id='customers']/tbody/tr["+ i + "]/td"));
			System.out.println("total columns in row no "+ i +" are :"+list_coloumns.size());
			for (int j = 1; j < list_coloumns.size(); j++) {
				System.out.print(driver.findElement(By.xpath("//*[@id='customers']/tbody/tr["+i+"]/td["+ j + "]")).getText());
			}
			System.out.println("");
		}
	}

}
