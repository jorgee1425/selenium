import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/jorge.padilla/Downloads/chromedriver/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://spicejet.com"); 
		Thread.sleep(15000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//*[@id='dropdownGroup1']/div/ul[1]/li[5]/a")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@value=\"MAA\"])[2]")).click();
		
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[contains(text(),'25')])[1]")).click();
		
		//done
		
		
		//pasajeros
		WebElement Mdesplegable=driver.findElement(By.id("divpaxinfo"));
		Mdesplegable.click();
		Thread.sleep(1000);
		WebElement Npasajeros=driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_Adult\"]/option[6]"));
		Npasajeros.click();
		System.out.println("el Texto del menu desplegable es :  " + Mdesplegable.getText());
		Assert.assertEquals(Mdesplegable.getText(), "6 Adult");
		System.out.println("el texto del menu despleable si es igual a "+ Mdesplegable.getText());
        System.out.println("el numero de checkboxes es: " + driver.findElements(By.xpath("//*[@type='checkbox']")).size());		
		Thread.sleep(1000);
		
		//
		
		Select s=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		 s.selectByIndex(2);
	     s.selectByVisibleText("USD");
	     //s.selectByValue("AED");
		
	     
	     //search btn
	     
	     
	     driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
	}

}
