package testng2;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_BeforeTestAndBeforeMethod  {

	@BeforeTest
	public void beforeTest()
	{
		System.out.println("beforeTest");
	}

	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("\nbeforeMethod");
	}
	
	
	@Test
	public void firstTest()
	{
		System.out.println("firstTest");
	}
	
	@Test
	public void secondTest()
	{
		System.out.println("secondTest");
	}
	
	@Test
	public void thirdTest()
	{
		System.out.println("thirdTest");
	}
	
	public void login() {

		
	}
}
