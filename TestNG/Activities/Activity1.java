package testNGTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class Activity1 {
	
	WebDriver driver;
  @Test
  public void f() {
	  
	  String title = driver.getTitle();
      
 
      System.out.println("Page title is: " + title);
      Reporter.log("opened browser");
          
      
      Assert.assertEquals("Training Support", title);
                  

      driver.findElement(By.id("about-link")).click();
                  
  
      System.out.println("New page title is: " + driver.getTitle());
      
      Assert.assertEquals(driver.getTitle(), "About Training Support");
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  driver = new FirefoxDriver();
      
   
      driver.get("https://www.training-support.net");
  }

  @AfterMethod
  public void afterMethod() {
	  

	     
	        driver.quit();
  }

}
