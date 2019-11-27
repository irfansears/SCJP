package testng;

import org.testng.annotations.Test;

public class TestcClass1 {
	
	@Test(invocationCount=3, threadPoolSize=2)
	public void test1()
	{

		System.out.println("test1 : threadName :->"+Thread.currentThread().getName());
		System.out.println("test1 : threadName :->"+Thread.currentThread().getThreadGroup().getName());
	}

	@Test(groups="smoke")
	public void test2()
	{

		System.out.println("test2 : threadName :->"+Thread.currentThread().getName());
		System.out.println("test1 : threadName :->"+Thread.currentThread().getThreadGroup().getName());
	}

	@Test
	public void test3()
	{

		System.out.println("test3 : threadName :->"+Thread.currentThread().getName());
		System.out.println("test1 : threadName :->"+Thread.currentThread().getThreadGroup().getName());
	}

}
