package multithreading;

public class ThreadLocalDemo {

	public static void main(String[] args) {
		
		ThreadLocal tl= new ThreadLocal()
				{ // inner class to override initial value method
						public  Object initialValue() {
							return "abc";
						}
				};
		
		System.out.println(tl.get());
		tl.set("irfan");
		System.out.println(tl.get());
		tl.remove();
		System.out.println(tl.get()); 
		
		
	}

}
