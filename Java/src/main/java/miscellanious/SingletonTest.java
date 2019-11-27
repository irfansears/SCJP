package miscellanious;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SingletonTest {

	private Singleton singleton;
	@BeforeClass
	public void init()
	{
		singleton= new Singleton();
	}
	
	@Test(invocationCount=100, threadPoolSize=10)
	public void testSingleton()
	{
		Thread.yield();
		Singleton p = singleton.getInstance();
		
	}
	
	
}
