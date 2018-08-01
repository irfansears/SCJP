package sto;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;

public class TestUtils {

	@DataProvider(name = "dp",parallel=true)
	public static Object[][] getData() {

//	    String sheetName = m.getName();
//
//	    int rows = excel.getRowCount(sheetName);
//
//	    int cols = excel.getColumnCount(sheetName);
//
		 Object[][] data = new Object[2][2];

	    //	    Hashtable<String, String> table = null;
//
//	    for (int rowNum = 2; rowNum <= rows; rowNum++) { // 2
//
//	        table = new Hashtable<String, String>();
//
//	        for (int colNum = 0; colNum < cols; colNum++) {
//
//	            // data[0][0]
//	            table.put(excel.getCellData(sheetName, colNum, 1), excel.getCellData(sheetName, colNum, rowNum));
//	            data[rowNum - 2][0] = table;
//	        }
//
//	    }
//		Object[][] data = new Object[1][2];
		Hashtable<String, String> ht= new Hashtable<String, String>();
		ht.put("key1", "value1");
		data[0][0]=ht;
		data[0][1]=new Hashtable<String, String>().put("Key2", "value2");
		data[1][0]=new Hashtable<String, String>().put("Key3", "value3");
		Hashtable<String, String> ht1= new Hashtable<String, String>();
		ht1.put("key2", "value2");
		data[1][1]=ht1;
//		data[0][0]=new Hashtable<String, String>().put("Key1", "value1");
//		data[1][1]=new Hashtable<String, String>().put("Key4", "value4");
		
//		   return  new Object[][]{ new Object[] { "Cedric" }};
		return data;

	}
}
