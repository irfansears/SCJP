package Excel.ApachePoi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcel {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook wb = null;
		FileOutputStream fos=null;
		try {
			File f= new File("C:\\Users\\Admin\\Desktop\\TestData.xlsx");
			FileInputStream fis= new FileInputStream(f);
			fos= new FileOutputStream(f);
			wb = new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		wb.createSheet();
		XSSFSheet sheet= wb.createSheet("tableData");
		
		Row row= sheet.createRow(1);
		Cell cell= row.createCell(1);
		cell.setCellValue("irfan");
		
		/*
		int count= sheet.getLastRowNum();
		for (int i = 0; i < count; i++) {
			
			int cellcount= sheet.getRow(i).getLastCellNum();
			for (int j = 0; j < cellcount; j++) {
				sheet.getRow(i).getCell(j).setCellValue("A");
//				System.out.print();
			}
*///			System.out.println("");
			
//		}
//		f.
		wb.write(fos);
		System.out.println("done");
	}

}
