package SelTestNGProjCRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelProjActivity6_CRM {
	
WebDriver driver;

	
	@BeforeMethod
	public void beforeMethod6() {
	  
		//initializing driver
		  
		  driver = new FirefoxDriver();
		//landing on the URL

 
    driver.get("https://alchemy.hguy.co/crm/");
    
    
}

@Test
public void ActivitiesItemTest() {
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("pa$$w0rd");
	driver.findElement(By.xpath("//input[@id='bigbutton']")).click();
	
	//asserting if after login, page is getting landed on the next page
	
	driver.findElement(By.xpath("//span[@class='notCurrentTab']//a"));
	System.out.println("Login is successful");
	//Making sure that the “Activities” menu item exists and is clickable
	if(driver.findElement(By.xpath("//a[@id='grouptab_3']")).isDisplayed()) {
		System.out.println("The top tool bar has Activity displayed");
	}
	
	
	
}

@AfterMethod
public void teardown6() {
	
	//closing driver
	 driver.close();

}

}
