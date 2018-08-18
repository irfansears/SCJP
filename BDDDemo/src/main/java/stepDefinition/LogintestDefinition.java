package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LogintestDefinition {

	WebDriver d;
	@Given("^user is already on login page$")
	public void userOnloginPage() {
		
	/*	System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver_win32\\chromedriver.exe");
		d= new ChromeDriver();
		d.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.get("http:///www.google.com");*/
		
		System.out.println("in first");

	}
	
/*	@When("^title is page is google$")
	public void title_is_page_is_google() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
		System.out.println("in second");

	}*/
	
	@When("^title is page is google$")
	public void titleTest() {

//		Assert.assertEquals("google", d.getTitle());
		System.out.println("in when");
	}
	
	@Then("^user enter testing in search text box$")
	public void enterText() {

//		d.findElement(By.id("lst-ib")).sendKeys("testing ");
		System.out.println("in then entering text");
	}
	
	@Then("^user clicks login button$")
	public void clickBtn() {

		System.out.println("in click button");
		
	}
	
	@And("^check if same title is present$")
	public void titleCheck() {

		System.out.println("in and");
//		Assert.assertEquals(true,false);
	}
}
