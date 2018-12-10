package december2018;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Q53711859 {
	@Test
	public static void testMF() {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "./src/drivers/geckodriver64bit.exe");
		driver = new FirefoxDriver();
		try {
			driver.navigate().to("C:\\Users\\Dhamo\\Downloads\\Sample 2.html");
		} catch (Exception e) {
		}

		System.out.println(driver.getPageSource());
	}
}
