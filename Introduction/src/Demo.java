import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// selenio code
		//create Driver object chrome browser
		//nosotros estamos implementando metodos del interfaz webdriver
		//proporciona todos los metodos para que nosotros automaticemos
		//invoke the file
		System.setProperty("webdriver.chrome.driver", "/Users/jorge.padilla/Downloads/chromedriver/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
	//	webdriver.chrome.driver
   //   webdriver.gecko.driver
   //   webdriver-ie.driver
///Users/jorge.padilla/Downloads/chromedriver/chromedriver
		
		
		
	

	}

}
