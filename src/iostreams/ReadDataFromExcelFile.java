package iostreams;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import jxl.CellType;

public class ReadDataFromExcelFile {

	public static void main(String[] args) throws Exception {
		File excelFile = new File(
				"E:\\TESTING\\SELENIUM\\SeleniumJavaRestAssuredMay2025\\Eclipse\\CoreJava_May2025\\InputDataFiles\\Test.xlsx");

		FileInputStream fis = new FileInputStream(excelFile);

//		HSSFWorkbook xlsWorkBook = new HSSFWorkbook(fis);  // .xls file
		XSSFWorkbook xlsxWorkBook = new XSSFWorkbook(fis); // .xlsx file
		XSSFSheet languagesSheet = xlsxWorkBook.getSheet("Languages");
		System.out.println(languagesSheet.getLastRowNum());
		Row firstRow = languagesSheet.getRow(0);
		System.out.println(firstRow.getLastCellNum());
		Cell firstCell = firstRow.getCell(0);

		switch (firstCell.getCellType()) {
		case Cell.CELL_TYPE_STRING:
			String str = firstCell.getStringCellValue();
			System.out.println(str);
			break;
		case Cell.CELL_TYPE_NUMERIC:
			double d1 = firstCell.getNumericCellValue();
			System.out.println(d1);
			break;
		case Cell.CELL_TYPE_BOOLEAN:
			boolean bool1 = firstCell.getBooleanCellValue();
			System.out.println(bool1);
			break;
		case Cell.CELL_TYPE_BLANK:
			String str2 = "";
			System.out.println(str2);
			break;
		default:
			break;
		}

		fis.close();
	}

}
