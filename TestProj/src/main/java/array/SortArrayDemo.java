package array;

import java.sql.Array;
import java.util.Arrays;

public class SortArrayDemo {

	public static void main(String[] args) {
		
		String s1= "book = 12 AND x2 = 50 AND cost = 45";
		String s2= "pen = 1 AND case = 10 AND bala = 40";
		
		System.out.println(s1.replaceAll("(?:(.*?)(?==))+", ""));

		/*int [] arr= {7,2,1,4,1,7};
//		sort arrar
		boolean swapped=true;
		int k=0;
		int tmp;
		while(swapped)
		{
			swapped = false;
			k++;
			for (int i = 0; i < arr.length-k; i++) {
				if(arr[i]>arr[i+1])
				{
					tmp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=tmp;
					swapped=true;
				}
				
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		int distinctIntegers = 0;

		for (int j = 0; j < arr.length; j++)
		{
		    //Get the next integer to check
		    int thisInt = arr[j];

		    //Check if we've seen it before (by checking all array indexes below j)
		    boolean seenThisIntBefore = false;
		    for (int i = 0; i < j; i++)
		    {
		        if (thisInt == arr[i])
		        {
		            seenThisIntBefore = true;
		        }
		    }

		    //If we have not seen the integer before, increment the running total of distinct integers
		    if (!seenThisIntBefore)
		    {
		        distinctIntegers++;
		    }
//		    Arrays.sort(arr);
		}*/
	}

}
