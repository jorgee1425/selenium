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
	    driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		if (driver.getTitle().equals("Google")) System.out.println("esta en la pagina correcta");
		
		
	//	webdriver.chrome.driver
   //   webdriver.gecko.driver
   //   webdriver-ie.driver
///Users/jorge.padilla/Downloads/chromedriver/chromedriver
		
		
		
	

	}

}
