


import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class addingitems3ArrayAsList3_solo4 {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "/Users/jpadilla/Downloads/chromedriver/chromedriver");
		WebDriver driver = new ChromeDriver();
       //definimos un arreglo de dos elementos
		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/");
       System.out.println("mensaje");
	//Array de elementos a buscar
		                                         
		String arrayItems[]= {"Brocolli ","Beans "};
		
		
		List names=Arrays.asList(arrayItems);
		
		
		 List<WebElement>  nItmes= driver.findElements(By.xpath("//button[contains(text(),'ADD TO CART')]"));	
	     List<WebElement>  nProducts=driver.findElements(By.cssSelector("h4.product-name"));
	     //nItmes.get(6).click();
	
	for (int i = 0; i < arrayItems.length; i++) {
		//System.out.println(i + nProducts.get(i).getText());
		String[] name=names.get(i).toString().split("-");
		String formattedName=name[0].trim();
		System.out.println(formattedName);
		
		System.out.println(name[1].trim());
		
		
		//List lista = Arrays.asList(arrayItems);
		
		for (int j = 0; j < nProducts.size(); j++) {
			if(nProducts.get(j).getText().toString().equals(name.toString())) {
				
				
				nItmes.get(i).click();
				
			}
				
		}
		 
		 
		
	}
   
		
	
		
		
		
	
//button[text()='ADD TO CART']
		
		//*[contains(text(),'Cucumber - 1 Kg')]//following-sibling::div[2]//button[text()='ADD TO CART']
		}

}
