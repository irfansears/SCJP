package miscellanious;

import org.testng.annotations.Test;

public class InvocationCountAndThreadPool {
	static int count=0;

	@Test(invocationCount=10, threadPoolSize=2)
	public void test()
	{

		System.out.println(++count+" : threadName :->"+Thread.currentThread().getName());
	}
	
}
