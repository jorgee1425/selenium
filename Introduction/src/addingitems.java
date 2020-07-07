
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class addingitems {

	public static void main(String[] args) throws IOException   {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/jorge.padilla/Downloads/chromedriver/chromedriver");
		WebDriver driver = new ChromeDriver();
         
		
		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/");
		
		//using findElements for plural
		
	List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
	
	String text=driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div/div[19]/div[3]/button")).getText();
	
	System.out.println("el texto del elementos es: "+ text);
	
	
	
	//imprimir todos los productos
	for (int i = 0; i < products.size(); i++) {
		String name=products.get(i).getText();
		System.out.println(name);
		
	}
	
	for (int i = 0; i < products.size(); i++) {
         String name=products.get(i).getText();
         if(name.contains("Brocolli")) {
        	 //click on Add to kart
        	//button[text()='ADD TO CART']
        	 //get.(i) regresa el elemento web de la lista en el indice i, y a ese le aplicamos un click
        	 driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
        	 break;
        	 
        	 
        }
         
	}
		
		
		
		
		
		
		
		
		
		
		//button[text()='ADD TO CART']
		
		//*[contains(text(),'Cucumber - 1 Kg')]//following-sibling::div[2]//button[text()='ADD TO CART']
		}
	
	
	

}
