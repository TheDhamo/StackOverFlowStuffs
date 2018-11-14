package november2018;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Q53283467 {
	 
	@Test
	public static void testMF() {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "./src/drivers/geckodriver64bit.exe");
		driver = new FirefoxDriver();

		driver.get(
				"https://www.amazon.com/s/ref=nb_sb_noss?url=search-alias%3Daps&field-keywords=Java&rh=i%3Aaps%2Ck%3AJava");

		List<WebElement> searchResults = driver.findElements(By
				.xpath("//div[@class='s-item-container'][1]/div/div/div[@class='a-fixed-left-grid-col a-col-right']"));
		System.out.println(searchResults.size());
		try {
			if (searchResults.size() > 0) {
				String title, author = null;
				int i = 0;
				for (WebElement el : searchResults) {
					((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", el);
					i++;
					title = el.findElement(By.cssSelector("h2.a-size-medium.s-inline.s-access-title.a-text-normal"))
							.getText();
					System.out.println("Title:" + i + "-" + title);
					if(el.findElements(By.cssSelector("div.a-row.a-spacing-small > div:nth-child(2)")).size()>0){
						author = el.findElement(By.cssSelector("div.a-row.a-spacing-small > div:nth-child(2)")).getText();
					}
					System.out.println("Author:" + i + "-" + (author.isEmpty()?"Author Not Found":author));
				}
			} else
				System.out.println("Your search has no results");
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
}