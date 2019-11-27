package miscellanious;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CompareTwoLists {

	public static void main(String[] args) {
		
		/*ArrayList<String> list1= new ArrayList<String> ();
		list1.add("A");list1.add("B");list1.add("C");list1.add("D");
		
		ArrayList<String> list2= new ArrayList<String> ();
		list2.add("E");list2.add("F");list2.add("A");list2.add("G");*/
		
	/*	System.out.println(list1.toString());
		System.out.println(list2.toString());
		
		ArrayList<String> onlyCommon= new ArrayList<String> ();
		onlyCommon.addAll(list1);
//		System.out.println(onlyCommon.toString());
		onlyCommon.retainAll(list2);
		System.out.println(onlyCommon.toString());
		
		System.out.println("---------------------");
		System.out.println(list1.toString());
		System.out.println(list2.toString());
		ArrayList<String> commonOnceAndAll= new ArrayList<String> ();
		commonOnceAndAll.addAll(list1);
		commonOnceAndAll.removeAll(list2);
		System.out.println(commonOnceAndAll.toString());*/

//		System.out.println("---------------------");
//		System.out.println(list1.toString());
//		System.out.println(list2.toString());
//
//		list1.retainAll(list2);
//		list2.removeAll(list1);
//		
//		System.out.println(list1.toString());
//		System.out.println(list2.toString());

		/*System.out.println("---------------------");
		System.out.println(list1.toString());
		System.out.println(list2.toString());
		ArrayList<String> common= new ArrayList<String> ();
		ArrayList<String> union= new ArrayList<String> ();
		common.addAll(list1);
		common.retainAll(list2);
		list1.removeAll(common);
		list2.removeAll(common);
		union.addAll(list1);
		union.addAll(list2);
		union.addAll(common);
//		union.re
		System.out.println(union.toString());
//		System.out.println(common.toString());
 * 
 * 
*/
		ArrayList<String> list1= new ArrayList<String> ();
		list1.add("A");list1.add("B");list1.add("C");list1.add("D");
		list1.add("H");list1.add("I");list1.add("J");list1.add("K");
		
		ArrayList<String> list2= new ArrayList<String> ();
		list2.add("E");list2.add("F");list2.add("A");list2.add("G");
		list2.add("J");list2.add("K");list2.add("M");list2.add("L");
		System.out.println(list1.toString());
		System.out.println(list2.toString());
		
		
		Set<String> common = new HashSet<String>();
//		common.addAll(list1);
//		common.addAll(list2);
		for (String s1:list1) {
			if(common.add(s1)!=false)
			{
				
			}else
			{
				System.out.println(s1);
			}
			
		}
		
		for (String s1:list2) {
			if(common.add(s1)!=false)
			{
				
			}else
			{
				System.out.println(s1);
			}
			
		}
		
		
		
		
		System.out.println(common.toString());
		
		/*ArrayList<String> common= new ArrayList<String> ();
//		ArrayList<String> union= new ArrayList<String> ();
		
		common.addAll(list1);
		common.retainAll(list2);
		System.out.println("-------------");
		for (String s1:common) {
			System.out.println(s1);
		}
		System.out.println("-------------");
		list1.removeAll(common);
		for (String s1:list1) {
			System.out.println(s1);
		}
		System.out.println("-------------");
		list2.removeAll(common);
		for (String s1:list2) {
			System.out.println(s1);
		}
		*/
	}

}
