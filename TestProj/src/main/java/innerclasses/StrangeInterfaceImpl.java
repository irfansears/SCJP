package innerclasses;

import innerclasses.StrangeInterface.SendEmail;

interface StrangeInterface {
	int a = 10;
	int b = 5;

	void add();

	void sub();

	class Inner implements StrangeInterface {
		public void add() {
			int c = a + b;
			System.out.println("After Addition:" + c);
		}

		public void sub() {
			int c = a - b;
			System.out.println("After Subtraction:" + c);
		}

		@Override
		public void emailService(SendEmail e) {

			System.out.println("default mail service");
		}
	}
	
	public void emailService(SendEmail e);
	class SendEmail
	{
		String to;
		String sub;
		String body;
	}
}

class MyTest implements StrangeInterface {

	public void add() {

		System.out.println("My own implementation for add : " + (a +b));
	}

	public void sub() {
		System.out.println("My own implementation for sub : " + (a- b));

	}

	@Override
	public void emailService(SendEmail e) {
		System.out.println("email sent...");
	}

}

public class StrangeInterfaceImpl {
	
	public static void main(String args[]) {
		StrangeInterface.Inner i = new StrangeInterface.Inner(); // calling default implementation
		i.add();
		i.sub();
		SendEmail e= new SendEmail();
		i.emailService( e);

		MyTest t = new MyTest();   // my own implementation
		t.add();
		t.sub();
		t.emailService(e);
	}
}