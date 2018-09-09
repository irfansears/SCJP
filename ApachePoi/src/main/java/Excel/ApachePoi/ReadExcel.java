package Excel.ApachePoi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {

		
		File f= new File("C:\\Users\\Admin\\Desktop\\TestData.xlsx");
		FileInputStream fis= new FileInputStream(f);
		
		XSSFWorkbook wb =new XSSFWorkbook(fis);
//		HSSFWorkbook hb= new HSSFWorkbook(fis);
		
		XSSFSheet sheet= wb.getSheetAt(0);
		
		int count= sheet.getLastRowNum();
		for (int i = 0; i < count; i++) {
			
			int cellcount= sheet.getRow(i).getLastCellNum();
			for (int j = 0; j < cellcount; j++) {
				System.out.print(sheet.getRow(i).getCell(j).getStringCellValue()+"  ");
			}
			System.out.println("");
			
		}
//		String s= sheet.getRow(0).getCell(0).getStringCellValue();
//		System.out.println(s);
	}

}
