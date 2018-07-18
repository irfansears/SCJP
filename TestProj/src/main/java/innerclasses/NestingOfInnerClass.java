package innerclasses;

class A
{
	class B
	{
		class C
		{
			public void m1() {

				System.out.println("inner most class method");
			}
		}
	}
}
public class NestingOfInnerClass {

	public static void main(String[] args) {

		A.B.C i =new A().new B().new C();
		i.m1();
//		or
		new A().new B().new C().m1();
	}

}
