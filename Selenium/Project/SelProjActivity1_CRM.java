package SelTestNGProjCRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelProjActivity1_CRM {
	WebDriver driver;
	
	
	 @BeforeMethod
	  public void beforeMethod1() {
		  //initializing driver
		  driver = new FirefoxDriver();
	      
	   //landing on the URL
	      driver.get("https://alchemy.hguy.co/crm/");
	      
	      
	  }
	 
	 @Test
	 public void getPageTitleTest() {
		 //Testing the Page title matches with driver.getitle output or not
		 String title = driver.getTitle();
		 System.out.println("Title is: " + title);
	      Assert.assertEquals(title, "SuiteCRM");
	      System.out.println("Title matches with the driver.gettitle text");
	      
	  
	 }
	 
	 @AfterMethod
	 public void teardown1() {
		 //closing the driver
		 driver.close();
	 }

}
