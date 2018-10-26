package october2018;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Q52995381_1 {
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

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		if (cell.toString().contentEquals("male")) {
			WebElement male_radio_button = driver.findElement(By.xpath("//input[@value='2']"));
			male_radio_button.click();
		} else {
			WebElement female_radio_button = driver.findElement(By.xpath("//input[@value='1']"));
			female_radio_button.click();
		}

	}
}
