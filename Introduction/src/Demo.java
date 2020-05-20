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
	    driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
		if (driver.getTitle().equals("Google")) System.out.println("esta en la pagina correcta");	
	//	webdriver.chrome.driver
   //   webdriver.gecko.driver
   //   webdriver-ie.driver
///Users/jorge.padilla/Downloads/chromedriver/chromedriver
		 System.out.println(driver.getCurrentUrl());	//validateni if you are in the correct url
	     System.out.println(driver.getPageSource()); //this print page Source code
	      driver.get("https://www.yahoo.com");
	      //driver.navigate().back(); // go back from page
	      //driver.navigate().forward();  // go to the last page
	      //driver.quit(); // close all browsers open by selenium script
	      driver.close(); // it close the current browser
	      

	}

}























