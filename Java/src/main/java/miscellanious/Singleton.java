package miscellanious;

import org.testng.Assert;

public class Singleton 
{
	private static Singleton instance= null;
	
	public static Singleton getInstance()
	{
		if(instance==null)
		{
			Thread.yield();
			Assert.assertNull(instance);
			instance= new Singleton();
		}
		return instance;
	}
}


