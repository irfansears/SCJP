package seleniumsessions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksTest {

	public static void main(String[] args) throws MalformedURLException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.get("http://www.google.com");
		System.out.println("title of the window : " + driver.getTitle());

		List<WebElement> list = driver.findElements(By.xpath("//a"));
		System.out.println("no of a tags : " + list.size());

		ArrayList<WebElement> al = new ArrayList<WebElement>();

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).getAttribute("href") != null&&!list.get(i).getAttribute("href").startsWith("javascript")) {
				al.add(list.get(i));
				System.out.println("adding " + list.get(i).getAttribute("href"));
			} else {
				System.out.println("Not adding :->" + list.get(i).getAttribute("href"));
			}
		}

		System.out.println("valid a having href : " + al.size());

		System.out.println("--------validating broken links");
		for (int i = 0; i < al.size(); i++) {
			
			 HttpURLConnection con=( HttpURLConnection) new URL(al.get(i).getAttribute("href")).openConnection();
			 con.connect();
			 String response= con.getResponseMessage(); //ok 
			 con.disconnect();
			 System.out.println(al.get(i).getAttribute("href")+ "---->"+response ); //200 400 401 500
		}

	}

}
