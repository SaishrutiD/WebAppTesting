package Helpers;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class TestDataProvider {

	public String[][] readData(String Filename, String Sheetname) throws Exception {
		int ci, cj;

		FileInputStream fs = new FileInputStream(Filename);
		Workbook wb = Workbook.getWorkbook(fs);
		Sheet ws = wb.getSheet(Sheetname);

		int row = ws.getRows();
		int column = ws.getColumns();
		String[][] tabArray = new String[row - 1][column];
		ci = 0;
		for (int i = 1; i < row; i++, ci++) {
			cj = 0;
			for (int j = 0; j < column; j++, cj++) {

				tabArray[ci][cj] = ws.getCell(j, i).getContents();
			}
			}
		return (tabArray);
	}
	
}
