package multithreading;

public class SetThreadName {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("my main thread");
		
		System.out.println(Thread.currentThread().getName());
		
		MyThread2 t= new MyThread2();
		System.out.println(t.getName());
		t.setName("my child thread");
		
		System.out.println(t.getName());
	}

}


class MyThread2 extends Thread
{
	
	public void run()
	{
		for (int i = 0; i < 10; i++) {
//			System.out.print("no -> " +i +" : ");
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}