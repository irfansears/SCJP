package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckOutTest {

	@Given("^user added product to cart$")
	public void user_added_product_to_cart() {
		System.out.println("user added product to cart");

	}

	@When("^user did checkout$")
	public void user_did_checkout() {

//		Assert.assertEquals("google", d.getTitle());
		System.out.println("user did checkout");
	}
	
	@Then("^order number generated$")
	public void order_number_generated() {

		System.out.println("order number generated");
	}
}
