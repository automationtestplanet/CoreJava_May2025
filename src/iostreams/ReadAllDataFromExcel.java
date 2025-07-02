package iostreams;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAllDataFromExcel {

	public static void main(String[] args) throws Exception {
		File excelFile = new File(
				"E:\\TESTING\\SELENIUM\\SeleniumJavaRestAssuredMay2025\\Eclipse\\CoreJava_May2025\\InputDataFiles\\Test.xlsx");

		FileInputStream fis = new FileInputStream(excelFile);


		XSSFWorkbook xlsxWorkBook = new XSSFWorkbook(fis); 
		XSSFSheet languagesSheet = xlsxWorkBook.getSheet("Languages");
		
		for(int i=0; i<languagesSheet.getLastRowNum(); i++) {
			Row eachRow = languagesSheet.getRow(i);
			for(int j=0; j<eachRow.getLastCellNum(); j++) {
				Cell eachCell = eachRow.getCell(j);
				switch (eachCell.getCellType()) {
				case Cell.CELL_TYPE_STRING:
					String str = eachCell.getStringCellValue();
					System.out.println(str);
					break;
				case Cell.CELL_TYPE_NUMERIC:
					double d1 = eachCell.getNumericCellValue();
					System.out.println(d1);
					break;
				case Cell.CELL_TYPE_BOOLEAN:
					boolean bool1 = eachCell.getBooleanCellValue();
					System.out.println(bool1);
					break;
				case Cell.CELL_TYPE_BLANK:
					String str2 = "";
					System.out.println(str2);
					break;
				default:
					break;
				}
			}
		}

		fis.close();
	}

}
