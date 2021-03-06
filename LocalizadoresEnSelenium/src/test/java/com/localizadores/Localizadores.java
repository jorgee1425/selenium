package com.localizadores;

import org.testng.annotations.Test;
import java.util.List;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Localizadores {
	
	private WebDriver driver;
	By registerLinkLocator=By.linkText("REGISTER");
	By registerPageLocator=By.xpath("//img[@src='/images/masts/mast_register.gif']");
	By userNameLocator=By.name("email");
	By userPasswordLocator=By.name("password");
	By confirmPasswordLocator=By.cssSelector("input[name='confirmPassword']");
	By registerBtnLocator=By.cssSelector("input[name='register']");
	
	//img[@src="/images/masts/mast_register.gif"]
	
	//aqui usamos uns estrategia de localizacion por css selector
	
	
	
	
	//localizadores de autennticacion
	By userNameLocatorHomePage=By.name("userName");
	By passLocatorHomePage=By.name("password");
	By signBtnLocatorHomePage=By.name("login");
	By homaPageLocator=By.xpath("//img [@src='/images/masts/mast_flightfinder.gif']  ");
	
	
	  @BeforeMethod   //este se aplicara cada vez que se ejecute un metodo , asi 
	               public void beforeClass() {
		  
		           System.out.println("before Method");
		           System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver");
		           driver=new ChromeDriver(); //estamos creando el driver para utilizar la instancia de chrome
		           driver.manage().window().maximize();
	               driver.get("http://newtours.demoaut.com/");
	               }
	  @Test
                    public void registerUser() throws InterruptedException {
		  System.out.println("test 1");
		  driver.findElement(registerLinkLocator).click();
		  
		 Thread.sleep(2000);
		 if(driver.findElement(registerPageLocator).isDisplayed()) {//si la imagen aparece devuelve un true, caso contrario devuelve false
	
			 driver.findElement(userNameLocator).sendKeys("jorge p");
			 driver.findElement(userPasswordLocator).sendKeys("password");
			 driver.findElement(confirmPasswordLocator).sendKeys("password");
			 

			 driver.findElement(registerBtnLocator).click();
		 }else System.out.println("no existe la pagina");
		 
		 
		 //como el elemento forma parte de la etiqueta font es elemeetno 6
		 //para poder usar List importamos import java.util.List; 
	         List <WebElement>  fonts=(List) driver.findElements(By.tagName("font"));
	         assertEquals("Note: Your user name is jorge p.", fonts.get(5).getText());
	         
	      
	                }
	  @Test
	  public void signIn() throws InterruptedException {
		  System.out.println("test 2");
		  if(driver.findElement(userNameLocatorHomePage).isDisplayed()) {
			  driver.findElement(userNameLocatorHomePage).sendKeys("jorge p");
			  driver.findElement(passLocatorHomePage).sendKeys("password");
			  driver.findElement(signBtnLocatorHomePage).click();
			  Thread.sleep(2000);
			  assertTrue(driver.findElement(homaPageLocator).isDisplayed());
			 
			  
		  }else System.out.println("textbox is not present");
		  
	  }

      @AfterTest
                   public void afterTest() {
    	 driver.quit();
    	  System.out.println("after test");
    
                    }


}
