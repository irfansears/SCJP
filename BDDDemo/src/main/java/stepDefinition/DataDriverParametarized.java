package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataDriverParametarized {

	@Given("^test1$")
	public void test1() {
		System.out.println("given test1");

	}

	@When("^test2$")
	public void test2() {

//		Assert.assertEquals("google", d.getTitle());
		System.out.println("when test2");
	}
	
	@Then("^user enter \"(.*)\" and \"(.*)\" in search text box$")
	public void enterText1(String s1, String s2) {

//		d.findElement(By.id("lst-ib")).sendKeys("testing ");
		System.out.println("data driver test :  first parameter: "+s1+ "\nsecond parameter : "+s2 );
		System.out.println("in then entering text");
	}
	
	@Then("^close Browser$")
	public void close_Browser() {

		System.out.println("closing the browser !!!");
	}
}
