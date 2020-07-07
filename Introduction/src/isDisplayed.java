import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.remote.server.handler.SendKeys;

import com.sun.nio.sctp.SendFailedNotification;

public class isDisplayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/jorge.padilla/Downloads/chromedriver/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	
if(driver.findElement(By.xpath("//input[@type='password']")).isDisplayed());
if(driver.findElement(By.xpath("//input[@class='inputtext login_form_input_box']")).isDisplayed())System.out.println("is displayed");
if(driver.findElement(By.xpath("//input[@name='pass']")).isDisplayed())System.out.println("is displayed");
if(driver.findElement(By.xpath("//input[@id='pass']")).isDisplayed())System.out.println("is displayed");
if(driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).isDisplayed())System.out.println("is displayed"); 
		
			
	}

}
