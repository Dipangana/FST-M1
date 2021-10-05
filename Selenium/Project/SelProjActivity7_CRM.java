package SelTestNGProjCRM;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelProjActivity7_CRM {
WebDriver driver;


	
	@BeforeMethod
	public void beforeMethod7() {
		
		//Initializing driver
	  
	  driver = new FirefoxDriver();
	  
	  //landing on the page url
    
 
    driver.get("https://alchemy.hguy.co/crm/");
    
    
}

@Test
public void PopupTest() throws InterruptedException {
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("pa$$w0rd");
	driver.findElement(By.xpath("//input[@id='bigbutton']")).click();
	
	//asserting if after login, page is getting landed on the next page
	
	driver.findElement(By.xpath("//span[@class='notCurrentTab']//a"));
	System.out.println("Login is successful");
	driver.findElement(By.xpath("//span[@class='notCurrentTab']//a")).click();
	
	driver.findElement(By.xpath("//ul[@class='dropdown-menu']//li[5]")).click();
	Thread.sleep(5000);
	//Reading a popup that contains additional information about the account/lead.
	driver.findElement(By.xpath("//tbody//tr[@class='oddListRowS1']//td[10]//span")).click();
	System.out.println("Additional detail icon is clicked");
	WebDriverWait wait = new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class, 'ui-dialog-content') and contains(.//span, '1234567890')]")));
	
	String text =driver.findElement(By.xpath("//div[contains(@class, 'ui-dialog-content') and contains(.//span, '1234567890')]")).getText();
	System.out.println("Phone number on pop up is:"+text);
	}

	
@AfterMethod
public void teardown7() {
	//closing driver
	 driver.close();

}

}
