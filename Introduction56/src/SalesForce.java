import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/jorge.padilla/Downloads/chromedriver/chromedriver");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://login.salesforce.com");
	    driver.findElement(By.name("username")).sendKeys("user name");;
	    driver.findElement(By.name("pw")).sendKeys("elPassword");
	   //driver.findElement(By.className("button r4 wide primary")).click();
	 
	    
	    
	    //login button by xpath
	    
	    //  driver.findElement(By.xpath("//*[@id='Login']")).click();   
	   
	
	    
	    //Login Button by CSS Selector
	    driver.findElement(By.cssSelector("#Login")).click();
	    
	    
	    
	    //identify presence of text
	   
	    driver.findElement(By.cssSelector("div#error.loginError")).getText();
	String text=driver.findElement(By.cssSelector("div#error.loginError")).getText();
		 System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
	    System.out.println(text);
	  /*  if(driver.findElement(By.cssSelector("div#error.loginError")).getText().contains(text)) {
	    	System.out.println("la cadena de texto es correcta");
	    }else System.out.println("la cadena de texto es incorrecta");
	    
	    
	    */
	    
	    // is use $x("")  - for xpath
	    // $("")  - for css selector
	   
	    
	    
	  if(driver.findElement(By.cssSelector("div#error.loginError")).getText().contains(text)) {
		  System.out.println("content its the same, are correct!");
	  }else System.out.println("content its not the same, unexpected!");
	  
	    System.out.println(text);
	
		
		
	}

}
