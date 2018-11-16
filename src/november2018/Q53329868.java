package november2018;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Q53329868 {

	@Test
	public void testExcelIteration() throws IOException{
		
//		WebElement email = driver.findElement(By.name("Email"));
//	    WebElement password = driver.findElement(By.name("Password"));
//	    WebElement confirmPassword = 
//	    driver.findElement(By.name("confirmPassword"));

	    File file = new File("./src/november2018/Q53329868.xlsx");
	    FileInputStream inputStream = new FileInputStream(file);
	    Workbook guruWorkbook = new XSSFWorkbook(inputStream);
	    Sheet guruSheet = guruWorkbook.getSheet("Sheet1");

	    int rowCount = guruSheet.getLastRowNum();
	    System.out.println(guruSheet.getFirstRowNum());

	    for (int i = 1; i < rowCount + 1; i++) {

	        Row row = guruSheet.getRow(i);

	        for (int j = 0; j < row.getLastCellNum() - 1; j++) {
	            /*
	             * if(row.getCell(3).getStringCellValue().equals("Yes")) {
	             * 
	             * }
	             */
	            System.out.print(row.getCell(j).getStringCellValue() + "||");

	            String emailText = row.getCell(j).getStringCellValue();
	            String passText = row.getCell(j).getStringCellValue();
	            String CpassText = row.getCell(j).getStringCellValue();


	            System.out.println(emailText + " || " + passText + " || " + CpassText + " || ");

//	            email.sendKeys(emailText);
//	            password.sendKeys(passText);
//	            confirmPassword.sendKeys(CpassText);
//	            email.clear();
//	            password.clear();
//	            confirmPassword.clear();

	        }

	        System.out.println();
	    }
	}
}
