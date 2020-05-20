import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.remote.server.handler.SendKeys;

import com.sun.nio.sctp.SendFailedNotification;

public class facebookXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/jorge.padilla/Downloads/chromedriver/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		//  driver.findElement(By.xpath("//*[@type='email']")).sendKeys("my own xpath");
		
	//xpaths for email field for all atributes
	/* if(driver.findElement(By.xpath("//input[@type='email']")).isDisplayed())System.out.println("//input[@type='email is displayed");
	 
	if(driver.findElement(By.xpath("//input[@class='inputtext login_form_input_box']")).isDisplayed())System.out.println("//input[@class='inputtext login_form_input_box'] is displayed");
	if(driver.findElement(By.xpath("//input[@name='email']")).isDisplayed())System.out.println("//input[@name='email'] is displayed");
	if(driver.findElement(By.xpath("//input[@id='email']")).isDisplayed())System.out.println("//input[@id='email'] is displayed");
	if(driver.findElement(By.xpath("//input[@data-testid='royal_email']")).isDisplayed())System.out.println("//input[@data-testid='royal_email' is diplayed");  */
		
	// --driver.findElement(By.xpath("//input[@type='email']")).sendKeys("usuario");
	
	//xpath for password field
	//<input type="password" class="inputtext login_form_input_box" name="pass" id="pass" data-testid="royal_pass">
	/*
if(driver.findElement(By.xpath("//input[@type='password']")).isDisplayed())System.out.println("is displayed");
if(driver.findElement(By.xpath("//input[@class='inputtext login_form_input_box']")).isDisplayed())System.out.println("is displayed");
if(driver.findElement(By.xpath("//input[@name='pass']")).isDisplayed())System.out.println("is displayed");
if(driver.findElement(By.xpath("//input[@id='pass']")).isDisplayed())System.out.println("is displayed");
if(driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).isDisplayed())System.out.println("is displayed");  */

   // --	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
	//now i am writing an xpath to permform a click in login button  <input value="Log In" aria-label="Log In" data-testid="royal_login_button" type="submit" id="u_0_b">
	
	//html code fot login button
	// --driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		
		
		
		
		//USING CSS SELECTOR TagName[attibute='value']
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("CSS1");
        driver.findElement(By.cssSelector("[id='email']")).sendKeys("CSS2");
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
		
		
		
		
		
	}

}
