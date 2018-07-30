package seleniumsessions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.support.ui.Sleeper;

public class PopupDemo {

	public static void main(String[] args) {

		/*WebDriver d=Browser.launchChrome();
		d.get("http://www.popuptest.com/goodpopups.html");
		d.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);*/
		
		WebDriver d= Browser.getUrl("http://www.popuptest.com/goodpopups.html");
		d.findElement(By.linkText("Good PopUp #3")).click();
		Set<String> handles= d.getWindowHandles();
		Iterator<String> itr= handles.iterator();

		/*ArrayList<String> al = new ArrayList<String>();
		
		while(itr.hasNext())
		{
			al.add((String)itr.next());
//			System.out.println();
		}
		
		System.out.println(al);
		for (int i = 0; i < al.size(); i++) {
			d.switchTo().window(al.get(i));
			System.out.println(d.getTitle());
			Browser.sleep(5);
		}*/
		
		String pwind= itr.next();
		String cwind= itr.next();
		
		d.switchTo().window(cwind);
		System.out.println(d.getTitle());
		d.close();
		d.switchTo().window(pwind);
		System.out.println(d.getTitle());
		
		
	
	}

}
