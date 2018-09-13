package multithreading;

// Runnable present in java.lang and contains only one method run()

public class ThreadByRunnableInterface {

	public static void main(String[] args) {

		MyRannable1 r = new MyRannable1();
		Thread t1 = new Thread(r);
		t1.start();
		for (int i = 0; i < 10; i++) {

			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

class MyRannable1 implements Runnable {

	public void run() {
		// job of thread
		for (int i = 0; i < 10; i++) {

			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
