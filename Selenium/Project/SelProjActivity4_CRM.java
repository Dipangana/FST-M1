package SelTestNGProjCRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelProjActivity4_CRM {
	
WebDriver driver;

	
	@BeforeMethod
	public void beforeMethod4() {
	  
		//initializing driver
		  
		  driver = new FirefoxDriver();
		//landing on the URL
 
    driver.get("https://alchemy.hguy.co/crm/");
    
    
}

@Test
public void LoginTest() {
	
	//Logging in
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("pa$$w0rd");
	driver.findElement(By.xpath("//input[@id='bigbutton']")).click();
	
	//asserting if after login, page is getting landed on the next page
	
	driver.findElement(By.xpath("//span[@class='notCurrentTab']//a"));
	System.out.println("Login is successful");
}

@AfterMethod
public void teardown4() {
	 driver.close();

}

}
