

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class addingitems2Array {

	public static void main(String[] args)    {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/jpadilla/Downloads/chromedriver/chromedriver");
		WebDriver driver = new ChromeDriver();
         
		String items[]= {"Cucumber","Brocolli"};  
		
		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/");
		//using findElements for plural
		
	List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
	
	String text=driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div/div[19]/div[3]/button")).getText();
	
	
           System.out.println(items[1]); 
           
         // int j=items.length;
  
           
           
           /*
	
	for (int j = 0; j < items.length; j++) {
		
		
		
		for (int i = 0; i < products.size(); i++) {
	         String name=products.get(i).getText();
	         if(name.contains(items[j])) {
	        	 //click on Add to cart
	        	 //get.(i) regresa el elemento web de la lista en el indice i, y a ese le aplicamos un click
	        	 driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(j).click();
	        	 break;
	        	 
	        	 
	        }
	         
		}
		
	}   */
		   //items contains 2 elements
			for (int i = 0; i < items.length; i++) {
				System.out.println("print name");
				String name = items[i];
				System.out.println("name" + name);
				for (int j = 0; j < products.size(); j++) {
					if (products.get(j).getText().contains(name)) {
						driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(j).click();

					}

				}

			}
		
		//driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(j).click();
		
		
		
		
		
		
		//button[text()='ADD TO CART']
		
		//*[contains(text(),'Cucumber - 1 Kg')]//following-sibling::div[2]//button[text()='ADD TO CART']
		}
	
	
	

}
