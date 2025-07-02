package iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataToExcel {

	public static void main(String[] args) throws Exception {
		File excelFile = new File(
				"E:\\TESTING\\SELENIUM\\SeleniumJavaRestAssuredMay2025\\Eclipse\\CoreJava_May2025\\InputDataFiles\\Test.xlsx");
		
		FileInputStream fis = new FileInputStream(excelFile);
		
		XSSFWorkbook xlsxWorkBook = new XSSFWorkbook(fis); 
		
		XSSFSheet sheet = xlsxWorkBook.createSheet("May2025");
		Row firstRow = sheet.createRow(0);
		Cell firstCell = firstRow.createCell(0);
		Cell secondCell = firstRow.createCell(1);
		
		firstCell.setCellValue("Hello");
		secondCell.setCellValue("Java");
		
		FileOutputStream fos = new FileOutputStream(excelFile);
		xlsxWorkBook.write(fos);
		fos.close();
		fis.close();
		
	}

}
