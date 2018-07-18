package innerclasses;

interface OuterInterface {
	public void m1();
	
	interface InnerInterface {
		public void m1();
	}
}

public class TestImp{
	
	public static void main(String[] args) {
		TestClass t = new TestClass();
		t.m1();
	}

}

class TestClass  implements OuterInterface.InnerInterface, OuterInterface {
	public void m1() {
		System.out.println("Hello World");
	}
}