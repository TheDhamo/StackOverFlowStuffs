package october2018;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Q53037719 {

	@Test
	public void testt() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("test-type");
		options.addArguments("start-maximized");
		options.addArguments("disable-infobars");
		options.addArguments("--disable-extensions");
		WebDriver driver = new ChromeDriver(options);

		// String username = "elonmusk";
		// String url = "https://twitter.com/" + username +
		// "/followers?lang=en";
		// https://stackoverflow.com/questions/53037719/python-selenium-instagram-bot-clicking-same-picture#
		driver.get("https://www.instagram.com/explore/tags/likeforfollow/");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Actions actions = new Actions(driver);
		try {
			List<WebElement> imgs = driver.findElements(By.xpath("//*[@class='eLAPa']/div[@class='KL4Bh']/img"));

			for (WebElement img : imgs) {
				actions.moveToElement(img);
				actions.perform();
//				img.click();
				JavascriptExecutor executor = (JavascriptExecutor) driver;
				executor.executeScript("arguments[0].click();", img);
				System.out.println(driver.getCurrentUrl());
				actions.sendKeys(Keys.ESCAPE).perform();
				
			}
		} catch (Exception e) {
			System.out.println("*******getMessage***************");
			System.out.println(e.getMessage());
			System.out.println("*********getLocalizedMessage*************");
			System.out.println(e.getLocalizedMessage());
			System.out.println("**************getCause********");
			System.out.println(e.getCause());
			System.out.println("******getStackTrace****************");
			System.out.println(e.getStackTrace());
			System.out.println("**********************");

		}

		// WebElement elem =
		// driver.findElement(By.xpath("//input[@name='session[username_or_email]']"));
		// elem.sendKeys("Michael");
		//
		//
		// for pic in
		// driver.find_elements_by_class_name('eLAPa'):////*[@class='eLAPa']/div[@class='KL4Bh']
		// driver.find_element_by_xpath('''//*[@id="react-root"]/section/main/article/div[1]/div/div/div[1]/div[3]/a/div''').click()
		// driver.find_element_by_xpath("""/html/body/div[3]/div/button""").click()

		// #
		// browser.find_element_by_xpath("//input[@name='session[username_or_email]']").send_keys("Michael")
		// wait = WebDriverWait(browser, 2)
		// wait.until(EC.visibility_of_element_located((By.XPATH,"//input[@name='session[username_or_email]']"))).send_keys("person")

	}
}