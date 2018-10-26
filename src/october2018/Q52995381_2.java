package october2018;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Q52995381_2 {
	public static String strGender;
	@Test
	public void testPOI() throws IOException {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/october2018/Q52995381.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");

		// Read specific row and column
		Row row = sheet.getRow(2);
		Cell cell = row.getCell(7);
		// This will print data which I want to click
		System.out.println(cell);
		strGender=cell.toString();
	}
}
