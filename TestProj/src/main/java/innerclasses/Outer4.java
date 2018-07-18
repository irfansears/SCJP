package innerclasses;

public class Outer4 {

	int x=10;
	class Inner
	{
		int x=100;
		public void m1() {

			int x=1000;
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(Outer4.this.x);
		}
	}
	public static void main(String[] args) {

		new Outer4().new Inner().m1();
	}

}
