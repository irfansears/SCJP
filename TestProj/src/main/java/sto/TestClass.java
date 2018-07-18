package sto;


class Outer {
	public void calculations() { 
		class Inner {
			public int sum(int x, int y) {
				System.out.println("sum : " + (x+y));
				return x+y;
			}
			public int mul(int x, int y) {
				System.out.println("multiplication : " + (x*y));
				return x*y;
			}
		}
		Inner i= new Inner();
//		some code...
		i.sum(10, 20);
//		some code...etc
		i.mul(30, 40);
		i.mul(14, 12);
		i.sum(10000, 20000);
//		some other code...
	}
}

public class TestClass {
	public static void main(String[] args) {
		new Outer().calculations();
	}
}

