package SelTestNGProjCRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelProjActivity2_CRM {
	WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod2() {
		 //initializing driver
	  
	  driver = new FirefoxDriver();
	//landing on the URL
 
    driver.get("https://alchemy.hguy.co/crm/");
    
    
}

@Test
public void getPageTitleURLTest() {
	
	//Getting URL present in the header image
	 String title1=driver.findElement(By.xpath("//div[@class='companylogo']//img")).getAttribute("src");
	 System.out.println("URL on page title is: " + title1);
    
    
    

}

@AfterMethod
public void teardown2() {
	//closing the driver
	 driver.close();
}

}
