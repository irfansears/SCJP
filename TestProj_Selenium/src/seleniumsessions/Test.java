package seleniumsessions;

import java.util.Random;

public class Test {

	public static void main(String[] args) {

		firstThreeDigits() ;
		/*Random r= new Random();
		int[] arr= new int[3];
		for (int j = 0,i=0; ;i++ ) {
			int number=r.nextInt(10);
			if(!(number==4||number==6))
			{
				arr[j]=number;
				j++;
				if(j==3) {
					for(int num:arr){
						System.out.println(num);
					}
					
					break;
				}
			}
		}
	
		for(int i:arr){
			System.out.println(i);
		}
		System.out.println("----");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		*/
		
	}
	
	public static void firstThreeDigits() 
	{
		Random randomNumber= new Random();
		int[] firstArray= new int[3];
		for (int i = 0,j=0; ;j++) // i if for array index and j for running loop until we get 3 numbers which are not 4 or 6
		{  
			int number=randomNumber.nextInt(10);
			if(!(number==4||number==6)) //if random number is NOT 4 or 6
			{
				firstArray[i]=number; // add to array
				i++;
				if(i==3) // if 
				{
					for(int num:firstArray)
					{
						System.out.println(num);
					}
					
					break;
				}
			}
		}
	}
}
	
