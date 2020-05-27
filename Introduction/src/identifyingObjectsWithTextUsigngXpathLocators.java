import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.nio.sctp.SendFailedNotification;

public class identifyingObjectsWithTextUsigngXpathLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/jorge.padilla/Downloads/chromedriver/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		
		//example using sibling and contains
	//	"//html[contains(@xmlns,'http://www.w3.org/1999/xhtml') ]//meta[@content='text/html; charset=UTF-8']"
		
		//    /html/body/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div/form/span/section/div/div/div/div/div/div/div/input
		//    //html/body/div/div/div//img[@alt='Portal de la Junta de Andalucía']
		//    //html/head/following-sibling::body/div/div/div/h1//a[contains(@class,'logotipo')]
		//    //html/head/following-sibling::body/div//a[contains(@class, 'logotipo')]
		//*[contains(text(),'fico y transporte')]
		//*[contains(text(),'público')]    -> permite solo un fragmento del texto buscado (respetando comilla, y mayusculas y minusculas)
		//*[text()='Transporte público']   -> aqui el texto tiene que ir exactamente igual
		//html/child::body
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("user name");
		driver.findElement(By.cssSelector(".input.username")).sendKeys(".input.username");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("password");
		driver.findElement(By.cssSelector("input[id='Login']")).click();
		driver.findElement(By.cssSelector("input#Login")).click();
		
		
		
		
		
		
		
	}
		
		
		
		
		

}
