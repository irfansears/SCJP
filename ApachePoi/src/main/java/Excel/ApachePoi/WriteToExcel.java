package Excel.ApachePoi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcel {

	public static void main(String[] args) throws IOException {

		File f= new File("C:\\Users\\Admin\\Desktop\\TestData.xlsx");
		FileInputStream fis= new FileInputStream(f);
		XSSFWorkbook wb =new XSSFWorkbook(fis);
		
		XSSFSheet sheet= wb.getSheetAt(1);
		int count= sheet.getLastRowNum();
		for (int i = 0; i < count; i++) {
			
			int cellcount= sheet.getRow(i).getLastCellNum();
			for (int j = 0; j < cellcount; j++) {
				sheet.getRow(i).getCell(j).setCellValue(i+j);
//				System.out.print();
			}
//			System.out.println("");
			
		}
	}

}
