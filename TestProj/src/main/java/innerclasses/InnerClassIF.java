package innerclasses;

public class InnerClassIF {
	
	interface iff
	{
		public int noOfVehicles();
	}
	
	class A implements iff
	{

		@Override
		public int noOfVehicles() {
			// TODO Auto-generated method stub
			return 2;
		}
		
	}
	
	class B implements iff
	{

		@Override
		public int noOfVehicles() {

			return 3;
		}
		
	}

}
