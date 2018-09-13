package multithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo1 {

	public static void main(String[] args) {

		ExecutorService pool= Executors.newFixedThreadPool(2);
		MyRunnable1[] jobs = {new MyRunnable1("A"), new MyRunnable1("B"), new MyRunnable1("C")};
		for(MyRunnable1 job: jobs)
		{
			pool.submit(job);
		}
	
	pool.shutdown();
	}
	

}

class MyRunnable1 implements Runnable {

	String MyRunnable_name;
	public MyRunnable1(String MyRunnable1_name) {
		this.MyRunnable_name=MyRunnable1_name;

	}
	public void run() {
		
		System.out.println(MyRunnable_name+" is executed by "+Thread.currentThread().getName());
		ExecutorService pool= Executors.newFixedThreadPool(2);

		MyRunnable2[] jobs = {new MyRunnable2("a"), new MyRunnable2("b"), new MyRunnable2("d")};
		for(MyRunnable2 job: jobs)
		{
			pool.submit(job);
		}
		pool.shutdown();
	
//		MyRunnable2
	}
} 


class MyRunnable2 implements Runnable {
	
	String MyRunnable2;
	public MyRunnable2(String MyRunnable2) {
		this.MyRunnable2=MyRunnable2;

	}
	public void run() {
		
		System.out.println(MyRunnable2+" is executed by "+Thread.currentThread().getName());
//		System.out.println(Thread.currentThread().getName());
		
	}
} 