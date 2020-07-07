
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class takescreenshot {

	public static void main(String[] args) throws IOException   {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/jorge.padilla/Downloads/chromedriver/chromedriver");
		WebDriver driver = new ChromeDriver();

		
		
			
			driver.get("https://www.google.com");
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			//File srcDestination=new File("/Users/jorge.padilla/imagenpng");
			FileUtils.copyFile(scrFile, new File("/Users/jorge.padilla/Desktop/captures/imagen.png"));

		}
	
	
	

}
