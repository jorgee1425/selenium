package com.qualitystream.testng;  //esta es nuetra primera clase de testNG

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGExample {
	WebDriver driver;
	//aqui creamos un localizador
	By searchBoxLocator=By.id("search_query_top");
    By resultsLocator=By.cssSelector("span.heading-counter");
    
    
    
    
    
    @BeforeClass
	  public void beforeClass() {
		 
		  System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://automationpractice.com/index.php");
		  
	  }
  @Test
  public void search_Blouses() {
	  
	  //el locator contiene la estrategia de localizacion
	  //el WebElement representa la accion sobre ese locator
	 //nos permite asociar la estrategia de localizacion para poder aplicar una accion (metodo)
	    WebElement searchbox=driver.findElement(searchBoxLocator);
	  searchbox.clear();
	  searchbox.sendKeys("blouses");
	  searchbox.submit();
	  
	  //aqui hacemos una espera explicita,ESTO EES UNA ESPERA EXPLICITA
	  
	  WebDriverWait wait=new WebDriverWait(driver, 7) ;
	  wait.until(ExpectedConditions.presenceOfElementLocated(resultsLocator));
	  
	  System.out.println("this is the resultn number"+ driver.findElement(resultsLocator).getText());
	  
	  
	  assertTrue(driver.findElement(resultsLocator).isDisplayed(), "the result is not present");;
	  
			  }
 

  

  @AfterClass
  public void afterClass() {
	  
	  
	  driver.close();
  }

}