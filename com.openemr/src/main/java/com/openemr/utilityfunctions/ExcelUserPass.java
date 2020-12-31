package com.openemr.utilityfunctions;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUserPass {

	static XSSFWorkbook workbook =null;
	static XSSFSheet sheet=null;

	public static void getSheet() {
		try {
			workbook =new XSSFWorkbook("C:\\Users\\priya\\eclipse-framework\\com.openemr\\Data\\userpass.xlsx");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			sheet=workbook.getSheet("Sheet1");
		}
	}

	public static int rowCount() {
		int rowcount =sheet.getPhysicalNumberOfRows();
		return rowcount;

	}

	public static int colCount() {
		int colcount=sheet.getRow(0).getPhysicalNumberOfCells();
		return colcount;
	}


	public static String getData(int row,int col) {
		String data= sheet.getRow(row).getCell(col).getStringCellValue();
		return data;


	}







}
