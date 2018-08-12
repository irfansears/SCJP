package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssTest {
	
	@Test
	private void Test1() {
		SoftAssert softassert= new SoftAssert();
		
		System.out.println("open browser");
		Assert.assertEquals(true, true);
		
		System.out.println("enter username");
		System.out.println("enter password");
		System.out.println("clock sign in");
		Assert.assertEquals(true, true); // hard assertions

		
		System.out.println("validate home page");
		softassert.assertEquals(true, false,"Home page validation failed");

		
		System.out.println("Create deals page");
		softassert.assertEquals(true, true,"create deal passed");
		
		System.out.println("Create new contact");
		softassert.assertEquals(true, false,"create new contact failed");
		
		softassert.assertAll();
		

	}
	
	@Test
	private void Test2() {
		SoftAssert softassert= new SoftAssert();

		softassert.assertEquals(true, false,"Home page validation failed");
		softassert.assertEquals(true, true,"create deal passed");
		
		Assert.assertEquals(true, true);
		
		softassert.assertAll();
	}	


}
