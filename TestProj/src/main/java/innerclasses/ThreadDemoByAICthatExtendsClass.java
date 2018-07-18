package innerclasses;

public class ThreadDemoByAICthatExtendsClass {

	public static void main(String[] args){

		Runnable r = new Runnable() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("child");
					try {
						Thread.sleep(400);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		new Thread(r).start();
//		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main");
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//		java.lang.Error
		
		/*new Thread(new Runnable(){@Override
		public void run() {
			// TODO Auto-generated method stub
			
		};*/
			
	}

}
