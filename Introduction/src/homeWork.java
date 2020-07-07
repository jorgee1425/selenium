
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class homeWork {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/jorge.padilla/Downloads/chromedriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com");
		

		Thread.sleep(10000);

		WebElement fromCity = driver.findElement(By.id("FromTag"));
		fromCity.sendKeys("new");
		Thread.sleep(4000);

		for (int i = 0; i < 2;) {
			fromCity.sendKeys(Keys.ARROW_DOWN);
			i++;
		}

		fromCity.sendKeys(Keys.ENTER);

		// click on calendar
		driver.findElement(By.xpath("//*[@id=\"DepartDate\"]")).click();
		Thread.sleep(1000);
		// select current day
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		// select number of adults static dropdown
		Select s = new Select(driver.findElement(By.id("Adults")));
		s.selectByIndex(2);
		// click on more options
		driver.findElement(By.id("MoreOptionsDiv")).click();
		Select ClassTrip = new Select(driver.findElement(By.id("Class")));
		ClassTrip.selectByValue("First");
		// preferred airline
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("aeromexico");
		// click on seach btn
		driver.findElement(By.id("SearchBtn")).click();
		// obtain error text
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
		getScreenshot(driver);
	}

	public static void getScreenshot(WebDriver driver) throws IOException, InterruptedException {
		//driver.get("https://www.google.com");
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("/Users/jorge.padilla/Desktop/captures/IMAGEN.png"));

	}

}
