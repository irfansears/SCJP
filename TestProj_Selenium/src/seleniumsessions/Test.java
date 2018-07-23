package seleniumsessions;

import java.util.Random;

public class Test {

	public static void main(String[] args) 
	{
		firstThreeDigits() ;
	}
	
	public static void firstThreeDigits() 
	{
		Random randomNumber= new Random();
		int[] firstArray= new int[3];
		for (int i = 0,j=0; ;j++) //if for array index and j for running loop until we get 3 numbers which are not 4 or 6
		{  
			int number=randomNumber.nextInt(10);
			if(!(number==4||number==6)) //if random number is NOT 4 or 6
			{
				firstArray[i]=number; // add to array
				i++;
				if(i==3) // print three number from array and break the loop
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
	


interface A
{
	
}
interface B extends A
{
	
}