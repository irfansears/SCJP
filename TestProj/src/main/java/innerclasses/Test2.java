package innerclasses;

public class Test2 {

	public static void main(String[] args) {

		Popcorn p = new Popcorn() {
			public void taste() {
				System.out.println("sweet");
			}
		};
		
		Popcorn p1 = new Popcorn();

		Popcorn p2 = new Popcorn() {
			public void taste() {
				System.out.println("spicy");
			}
		};
		
		p.taste();
		p1.taste();
		p2.taste();
		System.out.println(p.getClass().getName());
		System.out.println(p1.getClass().getName());
		System.out.println(p2.getClass().getName());
	}

}

class Popcorn {
	public void taste() {
		System.out.println("salty");
	}
}