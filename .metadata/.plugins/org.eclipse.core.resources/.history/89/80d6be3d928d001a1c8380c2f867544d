package com.qualitystream.tutorial;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

public class GoogleSearchTest {
	
	
	
WebDriver driver;//creamos un objeto webdriver


@BeforeClass
public void setUp() {
	
	
	
System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver");
driver =new ChromeDriver();	//declaramos el objeto driver de tipo chrome driver
driver.manage().window().maximize();
driver.get("http://www.google.com");
	
}

@Test
public void testGooglePage() {
	
	WebElement searchbox=driver.findElement(By.name("q"));
	searchbox.clear();
	searchbox.sendKeys("texto de busqueda en google");
	searchbox.submit();
	//AQUI HACEMOS UNA ESPERA IMPLICITA
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	assertEquals("texto de busqueda en google - Buscar con Google", driver.getTitle());
	System.out.println("el titulo de la pagina es:"+driver.getTitle());
	
	
	
}

@AfterTest
public void tearDown() {
	driver.quit();
}


}
