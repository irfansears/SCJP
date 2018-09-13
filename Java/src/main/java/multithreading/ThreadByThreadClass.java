package multithreading;

public class ThreadByThreadClass {

	public static void main(String[] args) throws InterruptedException {

		MyThread1 t= new MyThread1();
		t.start();
		
		for (int i = 0; i < 10; i++) {
//			System.out.print("no -> " +i +" : ");
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(100);
		}
		
	}

}

class MyThread1 extends Thread
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

//difference between  t.start() and t.run();
// 1. t.start() : new thread is created . Thread class start() method is started and which start run() through threadschedular
//2.t.run(); no new method is created and its just like normal method call