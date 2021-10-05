package SelTestNGProjCRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelProjActivity8_CRM {
	
WebDriver driver;

	
	@BeforeMethod
	public void beforeMethod8() {
	  
		//initializing driver
	  driver = new FirefoxDriver();
	  
	  //landing on the page url
    
 
    driver.get("https://alchemy.hguy.co/crm/");
    
    
}

@Test
public void TraversingtablesTest() throws InterruptedException {
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("pa$$w0rd");
	driver.findElement(By.xpath("//input[@id='bigbutton']")).click();
	
	//asserting if after login, page is getting landed on the next page
	
	driver.findElement(By.xpath("//span[@class='notCurrentTab']//a"));
	System.out.println("Login is successful");
    driver.findElement(By.xpath("//span[@class='notCurrentTab']//a")).click();
    Thread.sleep(5000);
    
    //Opening the accounts page and print the contents of the 5 odd rows in the table.
	
    List<WebElement> Set1 = driver.findElements(By.xpath("//li[@class='topnav']//ul//li"));
    for( WebElement s:Set1)
    	if (s.getText().equalsIgnoreCase("Accounts")) {
    		s.click();
    		break;
    	}
    Thread.sleep(5000);

	
	List<WebElement> Set = driver.findElements(By.xpath("//tbody//tr[@class='oddListRowS1']//td[3]"));
	for (int i=0;i<Set.size()-5;i++) {
		
		String text =Set.get(i).getText();
		
		System.out.println(text);
		
	}
}

@AfterMethod
public void teardown8() {
	
	//closing driver
	 driver.close();

}

}
