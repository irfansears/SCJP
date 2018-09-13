package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFrmaeWorkDemo_Runnable {

	public static void main(String[] args) {

		ExecutorService service= Executors.newFixedThreadPool(2);
		MyThread3 [] jobs={
				new MyThread3("A"),
				new MyThread3("B")
		};

		for (MyThread3 job : jobs) {

			service.submit(job);
		}

		System.out.println("-------------------------------");
		
		for (MyThread3 job : jobs) {

			service.execute(job);
		}
		service.shutdown();
	}
}

class MyThread3 implements Runnable
{

	String name;
	public MyThread3(String name) {

		this.name=name;
	}
	public void run() {

		System.out.println(name+" executed by "+Thread.currentThread().getName());
	}
	
}