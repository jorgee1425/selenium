import static org.testng.Assert.assertFalse;

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
public class ValidateUiElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/jorge.padilla/Downloads/chromedriver/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com");
		
		//Handle a calendar
		
	//	driver.findElement(By.name("ctl00$mainContent$view_date1")).click();
        //hadle calendar to select day 24
		
		//driver.findElement(By.xpath("(//a[contains(text(),'27')] )[1] ")).click();
		
	//  this will be highlight only for curret date
		
//driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();		
		
		
		//validate if an element are disable or enable
Thread.sleep(2000);
   //alreadyz all those appear are isenable=true
      if(driver.findElement(By.id("Div1")).getAttribute("style").contains("opacity: 1")) {
    	  System.out.println("the webelement is enabled");
    	  Assert.assertTrue(true,"passed");
      }else 
    	  {
    	  //assert that condition is false, else throw an assertion err 
    	  Assert.assertFalse(false,"failed");
    	  }
      
     
      
      
   //  System.out.println("is enabled: "+ driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
      driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
      
      
      
      
      if(driver.findElement(By.id("Div1")).getAttribute("style").contains("opacity: 1")) {
    	  System.out.println("the webelement is enabled");
    	     Assert.assertTrue(false, "passed"); //assert espera un true, pero esta obteniendo un false
      }else 
    	  
    	  {
    	  
    	  Assert.assertFalse(true, "failed");
    	  }
      
      
      
      
     // System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
      //we look for an attribute that is changing when we select
		
		//driver.close();
				
      
      
      
		
	}
		
		
		
		
		

}









