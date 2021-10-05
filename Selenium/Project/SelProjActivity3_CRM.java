package SelTestNGProjCRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelProjActivity3_CRM {
	
	WebDriver driver;

	
	@BeforeMethod
	public void beforeMethod3() {
	  
		 //initializing driver
		  
		  driver = new FirefoxDriver();
		//landing on the URL
	 
 
    driver.get("https://alchemy.hguy.co/crm/");
    
    
}

@Test
public void getPageFooterTextTest() {
	
	//Printing the first copyright text in the footer to the console
	 String title2=driver.findElement(By.xpath("(//div[@class='p_login_bottom']//a)[1]")).getText();
	 System.out.println("Text on first footer of page is: " + title2);
    
    
    

}

@AfterMethod
public void teardown3() {
	//closing driver
	 driver.close();

}
}