package SelTestNGProjCRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelProjActivity5_CRM {
	
WebDriver driver;

	
	@BeforeMethod
	public void beforeMethod5() {
	  
		//initializing driver
		  
		  driver = new FirefoxDriver();
		//landing on the URL
 
    driver.get("https://alchemy.hguy.co/crm/");
    
    
}

@Test
public void BarColorTest() {
	
	

	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("pa$$w0rd");
	driver.findElement(By.xpath("//input[@id='bigbutton']")).click();
	
	//asserting if after login, page is getting landed on the next page
	
	driver.findElement(By.xpath("//span[@class='notCurrentTab']//a"));
	System.out.println("Login is successful");
	WebElement t =driver.findElement(By.xpath("//div[@class='desktop-toolbar']"));
	//Getting the colors of the navigation menu
	String color =t.getCssValue("color");
	System.out.println("Color of top toolbar on page is:" +color);
	
	
}

@AfterMethod
public void teardown5() {
	//closing driver
	 driver.close();

}

}
