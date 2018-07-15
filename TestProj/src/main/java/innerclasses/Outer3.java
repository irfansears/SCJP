package innerclasses;

public class Outer3 {

	int i=10;
	static int j=20;
	class Inner
	{
		public void m1() {

			System.out.println("accessing out class instance variable from inner class---> valid : "+i);
			System.out.println("accessing out class static variable from inner class --> valid : "+j);
		}
	}
	
	
	public static void main(String[] args) {

		new Outer3().new Inner().m1();
	}

}
