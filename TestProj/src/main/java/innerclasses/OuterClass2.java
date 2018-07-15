package innerclasses;

public class OuterClass2 {

	class Inner
	{
		public void m1()
		{
			System.out.println("inner class m1 method");
		}
	}

	public void m1()
	{
		// accessing inner class code from outer instance area 
		Inner i= new Inner();
		i.m1();
		
	}
	public static void main(String[] args) {

		System.out.println("outer class main method");
		OuterClass2 o= new OuterClass2();
		o.m1();
	}

}
