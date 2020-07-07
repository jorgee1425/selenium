
import java.io.File;
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

public class addingitems3ArrayAsList3_solo {

	public static void main(String[] args) throws IOException   {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/jpadilla/Downloads/chromedriver/chromedriver");
		WebDriver driver = new ChromeDriver();
       //definimos un arreglo de dos elementos
		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/");
		String[] items={"Brocolli - 1 Kg","Cucumber - 1 Kg"};
		//vamos a buscar los elementos
	
    List nItems =driver.findElements(By.xpath("//*[contains(text(),'ADD TO CART')]"));
    List<WebElement>  listOfProducts =  driver.findElements(By.cssSelector("h4.product-name"));
	   
           
		System.out.println("items.lenght"+items.length);
		List<String> itemsList=Arrays.asList(items);
	for (int i = 0; i <items.length;i++ ) {  
		
	String name=itemsList.get(i);
                System.out.println(itemsList.get(i));
               
                
                for (int j = 0; j < nItems.size(); j++ ) {
            	   
			if (listOfProducts.get(j).getText().contains(name)) {
					
					driver.findElements(By.xpath("//*[text()='ADD TO CART']")).get(i).click();
					System.out.println("j="+j );
			    }
			}
                
                
                
                
                
                
		}    
	
	
	
	
   
		
   
		
		
		
	for(int j=1, a=1; j<5; j++,a=j*a, System.out.println(a));
		
		
		
		
		
		
		//button[text()='ADD TO CART']
		
		//*[contains(text(),'Cucumber - 1 Kg')]//following-sibling::div[2]//button[text()='ADD TO CART']
		}

}
