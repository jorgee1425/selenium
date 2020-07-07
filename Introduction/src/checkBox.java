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

public class checkBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/jorge.padilla/Downloads/chromedriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");

		driver.findElement(By.cssSelector("input[id=ctl00_mainContent_chk_SeniorCitizenDiscount]")).click();
		// method to check if checkbox is selected or not
		if (driver.findElement(By.cssSelector("input[id=ctl00_mainContent_chk_SeniorCitizenDiscount]")).isSelected())
			System.out.println("is selected");
		// or
		System.out.println(driver.findElement(By.cssSelector("input[id=ctl00_mainContent_chk_SeniorCitizenDiscount]"))
				.isSelected());
		Thread.sleep(2000);
		Assert.assertFalse((driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).isSelected()));
		Thread.sleep(1000);
		Assert.assertFalse(false);

		// obtain the number of checkbpx
		System.out.println(driver.findElements(By.cssSelector("input[type=checkbox]")).size());

		WebElement Mdesplegable = driver.findElement(By.id("divpaxinfo"));
		Mdesplegable.click();
		Thread.sleep(2000);
		WebElement Npasajeros = driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_Adult\"]/option[6]"));
		Npasajeros.click();
		System.out.println("el Texto del menu desplegable es :  " + Mdesplegable.getText());
		Assert.assertEquals(Mdesplegable.getText(), "6 Adult");
		System.out.println("el texto del menu despleable si es igual a " + Mdesplegable.getText());
		System.out.println(
				"el numero de checkboxes es: " + driver.findElements(By.xpath("//*[@type='checkbox']")).size());
		Thread.sleep(3000);

		System.out.println("stream");

		// static dropdown

		Select staticDropDown = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		staticDropDown.selectByIndex(2);

		/*
		 * Select s=new
		 * Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		 * s.selectByIndex(2); s.selectByVisibleText("USD"); s.selectByValue("AED");
		 */

		/*
		 * //go to dropdown WebElement
		 * dropdown=driver.findElement(By.xpath("//*[@id=\"divpaxinfo\"]"));
		 * dropdown.click();
		 * 
		 * //adult dropdown Thread.sleep(2000);
		 * 
		 * driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_Adult\"]")).
		 * click(); driver.findElement(By.
		 * cssSelector("#ctl00_mainContent_ddl_Adult > option:nth-child(3)")).click();
		 * System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		 * 
		 * WebElement pasajerosDropDown=
		 * driver.findElement(By.xpath("//*[@id='divpaxinfo']"));
		 * pasajerosDropDown.click();
		 */

		Thread.sleep(4000);
		// driver.close();

		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * int a=0; while(a<100) {
		 * 
		 * for (int i = 0; i <10;) { destination2.sendKeys(Keys.ARROW_DOWN); i++; }
		 * 
		 * for (int j = 10; j > 0;) { destination2.sendKeys(Keys.ARROW_UP); j--; } a++;
		 * }
		 * 
		 */

		// destination2.sendKeys(Keys.ENTER);

		// Thread.sleep(8000);
//	driver.close();

	}

}
