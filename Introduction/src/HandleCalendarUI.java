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

import com.sun.nio.sctp.SendFailedNotification;
import org.testng.*;

public class HandleCalendarUI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/jorge.padilla/Downloads/chromedriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");

		// Handle a calendar
		Thread.sleep(4000);
		driver.findElement(By.name("ctl00$mainContent$view_date1")).click();
		// hadle calendar to select day 24
		Thread.sleep(2000);
		// driver.findElement(By.xpath("(//a[contains(text(),'27')] )[1] ")).click();

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

		// this will be highlight only for curret date

	}

}
