import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.nio.sctp.SendFailedNotification;

public class xpathWithParentChildTraverseRelationship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/jorge.padilla/Downloads/chromedriver/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("busqueda en google");
		// iniciar seession button
		driver.findElement(By.xpath("//div[@class='ctr-p']/div[2]/div/div/div/div[2]/div[2]/div/a")).click();
		//  //div[@class='RNNXgb']
		
		//  http://www.juntadeandalucia.es/servicios/madeja/contenido/recurso/381
		
		// /html/body/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div/form/span/section/div/div/div/div/div/div/div/input
		
		
	}
		
		
		
		
		

}
