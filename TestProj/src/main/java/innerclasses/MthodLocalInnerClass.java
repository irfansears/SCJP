package innerclasses;

class InnerDemo {
	int z=20;
	static int s=30;
	public void m1() { //inner class defined in instance method hence it can access both static and non static variables z shere
		class Inner {
			public void sum(int x, int y) {
				System.out.println("sum : "+(x+y));
				System.out.println(z);
				System.out.println(s);
			}
		}
		
		Inner i= new Inner();
		i.sum(10, 20);
		i.sum(100, 200);
		i.sum(1000, 2000);
		i.sum(10000, 20000);
		
	}
}

public class MthodLocalInnerClass {

	public static void main(String[] args) {
		new InnerDemo().m1();
		
	}

}
