package testng2;

import org.testng.annotations.Test;

public class TestcClass1 {
	
	@Test(groups="smoke")
	public void test11()
	{

		System.out.println("test11 -smoke");
	}

	@Test(groups="smoke")
	public void test12()
	{
		System.out.println("test12 -smoke");
	}

	@Test
	public void test13()
	{
		System.out.println("test13 - no grp");
	}
	
	@Test(groups="sanity")
	public void test14()
	{
		System.out.println("test14 -sanity");
	}

}
