package november2018;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Q53281249 {
	@Test
	public static void testMF(){
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","./src/drivers/geckodriver64bit.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.google.com");

	}
}
