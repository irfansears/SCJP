package multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorFrmaeWorkDemo_Callable {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService service= Executors.newFixedThreadPool(2);
		MyCallable1 [] jobs={
				new MyCallable1(10),
				new MyCallable1(20)/*,
				new MyThread3("C"),
				new MyThread3("D"),
				new MyThread3("E"),
				new MyThread3("F"),
				new MyThread3("G"),
				new MyThread3("h"),
				new MyThread3("I"),
				new MyThread3("j"),*/
		};

		for (MyCallable1 job : jobs) {

			Future r = service.submit(job);
				System.out.println(r.get());
		}

		service.shutdown();
	}

}

class MyCallable1 implements Callable
{

	int num;
	public MyCallable1(int num) {

		this.num=num;
	}
	public Object call() throws Exception {
		
		System.out.println(num+" executed by "+Thread.currentThread().getName());
		int sum=0;
		for (int i = 0; i <= num; i++) {
			sum=sum+i;
		}
		return sum;
	}
	
}