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
	   // driver.findElement(By.className("button r4 wide primary")).click();
	    driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
	    
	
	//CSS is similar 
		
		
		
		
		
	}

}
