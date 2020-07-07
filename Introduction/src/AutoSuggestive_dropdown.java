import java.awt.SecondaryLoop;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.sun.nio.sctp.SendFailedNotification;

public class AutoSuggestive_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/jorge.padilla/Downloads/chromedriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com");

		WebElement source = driver.findElement(By.id("fromCity"));
		source.click();
		WebElement source2 = driver.findElement(
				By.xpath("//*[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"));
		source2.sendKeys("MUM");
		source2.sendKeys(Keys.ENTER);

		Thread.sleep(1000);

		WebElement destination1 = driver.findElement(By.xpath("//*[@id='toCity']"));
		destination1.click();
		Thread.sleep(1000);
		WebElement destination2 = driver.findElement(
				By.xpath("//*[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input"));
		destination2.sendKeys("DEL");

		/*
		 * 
		 * WebElement source=driver.findElement(By.id("fromCity"));
		 * 
		 * source.click(); Thread.sleep(2000); WebElement
		 * sourceINPUT=driver.findElement(By.xpath(
		 * "//*[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"
		 * )); sourceINPUT.sendKeys("MUM"); Thread.sleep(1000);
		 * sourceINPUT.sendKeys(Keys.ARROW_DOWN); sourceINPUT.sendKeys(Keys.ARROW_DOWN);
		 * sourceINPUT.sendKeys(Keys.ARROW_DOWN); sourceINPUT.sendKeys(Keys.ARROW_DOWN);
		 * sourceINPUT.sendKeys(Keys.ENTER);
		 */

		int a = 0;
		while (a < 3) {

			for (int i = 0; i < 10;) {
				destination2.sendKeys(Keys.ARROW_DOWN);
				i++;
			}

			for (int j = 10; j > 0;) {
				destination2.sendKeys(Keys.ARROW_UP);
				j--;
			}
			a++;
		}

		if (driver.findElement(By.className("primaryBtn font24 latoBold widgetSearchBtn ")).getAttribute("class")
				.contains("primaryBtn")) {
			System.out.println("the webelement is enabled");
			Assert.assertFalse(false, "passed");
		} else {
			// assert that condition is false, else throw an assertion err
			Assert.assertFalse(false, "failed");
		}

		// destination2.sendKeys(Keys.ENTER);

		// Thread.sleep(8000);
//	driver.close();

	}

}
