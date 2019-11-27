package testng2;

import org.testng.annotations.Test;

public class TestcClass2 {
	
	@Test(groups="sanity")
	public void test21()
	{

		System.out.println("test21-sanity ");
	}

	@Test(groups="smoke")
	public void test22()
	{
		System.out.println("test22 -smoke");
	}

	@Test(groups="sanity")
	public void test23()
	{
		System.out.println("test23 -sanity");
	}

	@Test
	public void test24()
	{
		System.out.println("test24 - no grp");
	}

}
