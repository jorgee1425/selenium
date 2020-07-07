

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class addingitems3ArrayAsList {

	public static void main(String[] args) throws IOException   {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/jpadilla/Downloads/chromedriver/chromedriver");
		WebDriver driver = new ChromeDriver();
         
		String items[]= {"Cucumber - 1 Kg","Brocolli - 1 Kg"};  
		
		
		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/");
		//using findElements for plural
		
	List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
	
	String text=driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div/div[19]/div[3]/button")).getText();
	System.out.println("el texto"+text);
	
	System.out.println(items[1]); 
           
         // int j=items.length;
         for (int i = 0; i < products.size(); i++) {
            	
            	String name=products.get(i).getText();
            	
            	//how to convert arrays to list
            	List<String> itemsList =Arrays.asList(items);
            	
            	System.out.println("este es el nombre actual"+name);
            	
	         if(itemsList.contains(name)) {
	        	 //click on Add to cart
	        	 //get.(i) regresa el elemento web de la lista en el indice i, y a ese le aplicamos un click
	        	 driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
	        	 
	        	 
	        	 
	        }
	         
		
	         
		
	}
		
		
		
		
		
		
		
		
		
		
		//button[text()='ADD TO CART']
		
		//*[contains(text(),'Cucumber - 1 Kg')]//following-sibling::div[2]//button[text()='ADD TO CART']
		}

}
