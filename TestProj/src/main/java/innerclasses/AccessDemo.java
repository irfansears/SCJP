package innerclasses;

public class AccessDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface Interf1{
	void sum();
}

class Test100 implements Interf1
{

	public void sum() {
		System.out.println("child dum");
	}
	
}

class Test101 extends Test100
{
	Interf1 if1= new Test101();
	
}