import java.awt.SecondaryLoop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.nio.sctp.SendFailedNotification;

public class StaticDropDrown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/jorge.padilla/Downloads/chromedriver/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); 
		/*
		driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("busqueda en google");
		// iniciar seession button
		driver.findElement(By.xpath("//div[@class='ctr-p']/div[2]/div/div/div/div[2]/div[2]/div/a")).click();
		//  //div[@class='RNNXgb']
		
		//  http://www.juntadeandalucia.es/servicios/madeja/contenido/recurso/381
		
		// /html/body/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div/form/span/section/div/div/div/div/div/div/div/input
		
		*/
		
		
		/*
		 * Select s=new
		 * Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		 * s.selectByIndex(2); s.selectByVisibleText("USD"); s.selectByValue("AED");
		 */
		
		
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(2000);
		
		
		
	/*	
		int i=1;
		
		while(i<5) { driver.findElement(By.id("hrefIncAdt")).click();
		i++;
			
		}   */
	   
		
		
		for (int i = 1; i < 5; i++) {
			
			driver.findElement(By.id("hrefIncAdt")).click();
		}
			
		
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
		
		
		
		

}
