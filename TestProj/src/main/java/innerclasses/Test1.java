package innerclasses;

public class Test1 {

	int x=10;
	
	public void m1() {

		class Inner
		{
			public void m2() {
				System.out.println(x);
			} 
			
		}
		
		Inner i= new Inner();
		i.m2();
	}
	
	
	
	public static void main(String[] args) {

		Test1 t= new Test1();
		t.m1();
	}

}
