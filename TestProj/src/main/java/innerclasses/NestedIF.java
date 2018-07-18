package innerclasses;

/* every IF presnt inside IF is always public and static whether we are declaring or not hence we ca implmment innner IF directly 
without implementing outer IF and vice versa
*/

interface OuterIf {
	void m1();

	interface Inner {
		void m2();
	}
}

class IF1 implements OuterIf {

	@Override
	public void m1() {
		System.out.println("outer");
	}

}

class IF2 implements OuterIf.Inner
{

	@Override
	public void m2() {

		System.out.println("Inner");
	}
	
}
public class NestedIF {

	public static void main(String[] args) {

		IF1 f1= new IF1();
		f1.m1();
		IF2 f2= new IF2();
		f2.m2();
		
		
	}

}
