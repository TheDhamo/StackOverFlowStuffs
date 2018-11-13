package november2018;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Q53283467 {
	@Test
	public static void testMF() {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "./src/drivers/geckodriver64bit.exe");
		driver = new FirefoxDriver();
		
		driver.get(
				"https://www.amazon.com/s/ref=nb_sb_noss?url=search-alias%3Daps&field-keywords=Java&rh=i%3Aaps%2Ck%3AJava");
		WebElement searchResults = driver.findElement(By.cssSelector("#s-results-list-atf"));

		List<WebElement> links = searchResults.findElements(By.tagName("li"));

		if (links.size() > 0) {
			String title, author, price, rating, isBestSeller;

			for (int i = 0; i < links.size(); i++) {
				title = links.get(i)
						.findElement(By.cssSelector("h2.a-size-medium.s-inline.s-access-title.a-text-normal"))
						.getText();
				System.out.println("Title:"+title);
				author = links.get(i).findElement(By.xpath("//span[@class='a-size-small a-color-secondary' and contains(.,'by')]/../span[2]")).getText();
				System.out.println("Author:"+author);
				
				price = links.get(i).findElement(By.xpath("//span[@class='sx-price-whole']")).getText();
				System.out.println("Price:"+price);
				
				rating= links.get(i).findElement(By.xpath("//span[@class='a-icon-alt']")).getText();
				System.out.println("Rating:"+rating);
				
				
				isBestSeller = links.get(i).findElement(By.xpath("//span[@class='a-badge-text' and contains(.,'Best Seller')]")).isDisplayed()?"Y":"N";
				System.out.println("IsBestSeller:"+isBestSeller);
			}
		} else
			System.out.println("Your search has no results");
	}
}
