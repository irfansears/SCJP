package testng;

import org.testng.annotations.Test;

@Test
public class TestcClass2 {
	
	public void test1()
	{

		System.out.println("test1 : threadName :->"+Thread.currentThread().getName());
	}

	public void test2()
	{

		System.out.println("test2 : threadName :->"+Thread.currentThread().getName());
	}

	public void test3()
	{

		System.out.println("test3 : threadName :->"+Thread.currentThread().getName());
	}

}
