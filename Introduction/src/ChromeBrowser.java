import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class ChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/jorge.padilla/Downloads/chromedriver/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		//driver.findElement(By.className("inputtext")).sendKeys("helloworld");
		//driver.get("https://www.facebook.com");
	//	driver.findElement(By.name("email")).sendKeys("aqui va el email");
	//	driver.findElement(By.name("pass")).sendKeys("this is the password");
	//	driver.findElement(By.linkText("Forgot account?")).click();
		
		// this a css selector:   #email
		
		driver.findElement(By.cssSelector("#email")).sendKeys("helloworld");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("password");
		driver.findElement(By.xpath("//*[@id='u_0_b']")).click();
		
		
		
		
	}

}
