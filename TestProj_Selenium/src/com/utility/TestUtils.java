package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class TestUtils {

	public static void main(String[] args) {
			getDataFromExcel();
	}

	public static ArrayList<Object[]>  getDataFromExcel() {
		ArrayList<Object[]> al=null;
		Properties prop = new Properties();
		FileInputStream f=null;
		try {
			f = new FileInputStream(
					new File("E:\\MyWorkSpace\\TestProj_Selenium\\src\\testDataconfig\\config.properties"));
			prop.load(f);
			 al=readExcel(prop.getProperty("filePath"), prop.getProperty("fileName"), prop.getProperty("sheetName"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return al;
	}

	public static ArrayList<Object[]>  readExcel(String filePath, String fileName, String sheetName) throws IOException {

		ArrayList<Object[]> al = new ArrayList<Object[]>();
		// Create an object of File class to open xlsx file

		File file = new File(filePath + "\\" + fileName);

		// Create an object of FileInputStream class to read excel file

		FileInputStream inputStream = new FileInputStream(file);

		Workbook workbook = null;

		// Find the file extension by splitting file name in substring and
		// getting only extension name

		String fileExtensionName = fileName.substring(fileName.indexOf("."));

		// Check condition if the file is xlsx file

		if (fileExtensionName.equals(".xlsx")) {

			// If it is xlsx file then create object of XSSFWorkbook class

			workbook = new XSSFWorkbook(inputStream);

		}

		// Check condition if the file is xls file

		else if (fileExtensionName.equals(".xls")) {

			// If it is xls file then create object of XSSFWorkbook class

			workbook = new HSSFWorkbook(inputStream);

		}

		// Read sheet inside the workbook by its name

		Sheet sheet = workbook.getSheet(sheetName);

		// Find number of rows in excel file

		int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();

		// Create a loop over all the rows of excel file to read it

		for (int i = 1; i < rowCount + 1; i++) {

			Row row = sheet.getRow(i);
			// Create a loop to print cell values in a row
			Object[] rowData = new Object[3];
			for (int j = 0; j < row.getLastCellNum(); j++) {

				// Print Excel data in console

				// System.out.print(row.getCell(j).getStringCellValue());
				rowData[j] = row.getCell(j).getStringCellValue();

			}

			al.add(rowData);

		}
		System.out.println(al);
		return al;
	}
}