package com.maven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriverPOI {
	private static final char[] column = null;

	public ArrayList<String> getData(String sheetName, String testcaseName, String scenario) throws IOException {
		ArrayList<String> al = new ArrayList<String>();
		// Workbook -->Sheet --> Row --> Cell
		FileInputStream fis = new FileInputStream("D://TestData//demo.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		int sheets = wb.getNumberOfSheets(); // Count of sheets in excel
		for (int i = 0; i < sheets; i++) {
			if (wb.getSheetName(i).equalsIgnoreCase(sheetName)) {
				XSSFSheet sheet = wb.getSheetAt(i);
				// identify testcase column by scanning first row.
				Iterator<Row> rows = sheet.iterator();
				Row firstrow = rows.next();
				Iterator<Cell> ce = firstrow.cellIterator();
				int k = 0;
				int column = 0;
				while (ce.hasNext()) {
					Cell value = ce.next();
					if (value.getStringCellValue().equalsIgnoreCase(testcaseName)) {
						column = k;
					}
				}
				k++;
				System.out.println(column);
				// Going through each row now
				while (rows.hasNext()) {
					Row rw = rows.next();
					if (rw.getCell(column).getStringCellValue().equalsIgnoreCase(scenario)) {
						Iterator<Cell> c = rw.cellIterator();
						while (c.hasNext()) {

							Cell cl = c.next();
							if (cl.getCellType() == CellType.STRING) {
								// System.out.println(c.next().getStringCellValue());
								al.add(cl.getStringCellValue());
							} else {
								al.add(NumberToTextConverter.toText(cl.getNumericCellValue()));
							}

						}
					}
				}
			}
		}
		return al;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	}
}
