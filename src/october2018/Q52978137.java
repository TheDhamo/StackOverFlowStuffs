package october2018;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Q52978137 {

	@Test
	public void testing() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://signup.insly.com/signup");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("terms and conditions")).click();
		//Click the I AGREE button
		WebElement btnIagree = driver
				.findElement(By.xpath("//button[@btnclass='primary' and contains(text(),'I agree')]"));
		btnIagree.click();
		//Verify the check box for T&C is checked
		WebElement chkbxTnC=driver.findElement(By.xpath("//*[@id='agree_termsandconditions']/../span[@class='icon-check-empty icon-check']"));
		Assert.assertTrue(chkbxTnC.isDisplayed());
	}

}
