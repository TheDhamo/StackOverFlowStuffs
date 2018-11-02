package october2018;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Q53034550 {
	 
	@Test
	public void testt() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.com");

	    Actions actions = new Actions(driver);
	    WebElement ele = driver.findElement(By.xpath("//span[@class='nav-line-2' and contains(.,'Departments')]"));
	    
	    WebElement ele1 = driver.findElement((By.xpath("//span")));
	    Thread.sleep(300);
	    
	    WebDriverWait wait=new WebDriverWait(driver, 10);
	    
	    WebElement guru99seleniumlink;
		guru99seleniumlink= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//.")));
	    
	    actions.moveToElement(ele);
	    actions.perform();
	    actions.perform();

	}
}
