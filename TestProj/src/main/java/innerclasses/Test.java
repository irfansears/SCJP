package innerclasses;

class Test {
public static void main(String[] args) {
	new Outer().new Inner().m1();
	
}
	// accessing inner class code from outer instance area 


}

class Outer{
	
	class Inner
	{
		public void m1()
		{
			System.out.println("inner class m1 method");
		}
	}

}
