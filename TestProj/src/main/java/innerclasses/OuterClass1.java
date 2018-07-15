package innerclasses;

public class OuterClass1 {

	class Inner1
	{
		public void m1()
		{
			System.out.println("inner class m1 method");
		}
	}

	public static void main(String[] args) {

		System.out.println("outer class main method");
		
		// accessing inner class methods from out main 
		
		/*OuterClass1 o= new OuterClass1();
		OuterClass1.Inner1 i= o.new Inner1();
		i.m1();*/
		
		new OuterClass1(). new Inner1().m1();
	}

}
