import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.nio.sctp.SendFailedNotification;

public class rediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/jorge.padilla/Downloads/chromedriver/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.rediff.com");
		
		//sing in button html
		//<a href="https://mail.rediff.com/cgi-bin/login.cgi" title="Already a user? Sign in" class="signin">Sign in</a>
		
		//USING CSS SELECTOR TagName[attibute='value']
		driver.findElement(By.cssSelector("a[class='signin']")).click();
		
		
		  
		//username field
		//<input type="text" id="login1" maxlength="30" name="login" value="" tabindex="1">
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("u");
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("s");
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("e");
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("r");
	
		// password
		//<input type="password" id="password" name="passwd" value="" tabindex="2">
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
		 
		 // Logib button
		 // <input type="submit" name="proceed" value="Sign in" title="Sign in" tabindex="4" class="signinbtn">
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	
	
		
    /*    driver.findElement(By.cssSelector("[id='email']")).sendKeys("CSS2");
        driver.findElement(By.cssSelector("input#email")).sendKeys("CSS3");
        driver.findElement(By.cssSelector("input[id*='emai']")).sendKeys("CSS4");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("password");
		// in console use $x("input[id='email']")
		
		
		//USING Xpath
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("xpath1");
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("xpath2");
        driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("xpath3");
		// in consle use $("")
        
        
        
		//for login button
		
		
		//<input value="Log In" aria-label="Log In" data-testid="royal_login_button" type="submit" id="u_0_b">
	       driver.findElement(By.cssSelector("[value='Log In']")).click();
		//driver.findElement(By.cssSelector("input#u_0_b")).click();    // CSS 
		
	
		       //tagName
		//    //input[contains(@id, 'email' )]
		
		*/
		
		
		
	}

}
