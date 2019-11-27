package testng;

import java.lang.annotation.Annotation;

import org.testng.annotations.Test;

public class TestcClass3 extends TestBase{
	
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
	
	@Test(groups="smoke")
	public void test4()
	{
		Class [] classes={  TestBase.class ,TestcClass3.class};
		for(Class c:classes)
		{
			System.out.println("annotation for "+c);
			for(Annotation a:c.getAnnotations())
				System.out.println(a);
			{
				
			}
		}

		System.out.println("test3 : threadName :->"+Thread.currentThread().getName());
	}

}
