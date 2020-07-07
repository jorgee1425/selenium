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
public class checkBoxHomeWork {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/jorge.padilla/Downloads/chromedriver/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
      //identify checkbox1
		
	    driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println("checkbok1 is selected?: " + driver.findElement(By.id("checkBoxOption1")).isSelected()); 
		
		
		driver.findElement(By.id("checkBoxOption1")).click();
	System.out.println("checkbok1 is selected?: " +driver.findElement(By.id("checkBoxOption1")).isSelected());	
	
	
	
	System.out.println("number of checkbox in the page is: "+driver.findElements(By.xpath("//input[@type=\"checkbox\"]")).size());

		
		
		
		
		
		
		
		
	
	
	
	
	
	
	

		
		
		
	
		
				
		
	}
		
		
		
		
		

}
