package SelTestNGProjCRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelProjActivity9_CRM {
	
WebDriver driver;


	
	@BeforeMethod
	public void beforeMethod9() {
		
		//initializing driver
	  
	  driver = new FirefoxDriver();
	  
	  //landing on page url
    
 
    driver.get("https://alchemy.hguy.co/crm/");
    
    
}

@Test
public void Traversingtables2_Test() throws InterruptedException {
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("pa$$w0rd");
	driver.findElement(By.xpath("//input[@id='bigbutton']")).click();
	
	//asserting if after login, page is getting landed on the next page
	
	driver.findElement(By.xpath("//span[@class='notCurrentTab']//a"));
	System.out.println("Login is successful");
	driver.findElement(By.xpath("//span[@class='notCurrentTab']//a")).click();
	
	//Opening the leads page and print the usernames and full names from the table.

	
	driver.findElement(By.xpath("//ul[@class='dropdown-menu']//li[5]")).click();
	Thread.sleep(5000);
	List<WebElement> Set2 = driver.findElements(By.xpath("//td[@class=' inlineEdit']//b"));
	for (WebElement t:Set2) {
		
	 String s =t.getText();
	 System.out.println("Text in name column of the table:"+s);
	 
	}
	 
	 Thread.sleep(3000);
	 List<WebElement> Set3 = driver.findElements(By.xpath("(//div[@class='list-view-rounded-corners']//tbody)[2]//td[8]"));
		for (WebElement t1:Set3) {
			
		 String s1 =t1.getText();
		 System.out.println(s1);
		 System.out.println("Text in User column of the table:"+s1);
		 
		}
			
		}
	 
		
@AfterMethod
public void teardown9() {
	
	//closing driver
	 driver.close();

}

}
