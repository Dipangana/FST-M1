package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		 WebDriverWait wait = new WebDriverWait(driver, 10);
	        
	        driver.get("https://training-support.net/selenium/dynamic-controls");
	 
	        WebElement cb = driver.findElement(By.xpath("//div[@id='dynamicCheckbox']/input"));
	        WebElement toggleCheckboxButton = driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
	        
	      
	        toggleCheckboxButton.click();
	        
	   
	        wait.until(ExpectedConditions.invisibilityOf(cb));
	        
	  
	        toggleCheckboxButton.click();
	        
	  
	        wait.until(ExpectedConditions.visibilityOf(cb));
	        cb.click();
	      
	        driver.close();
	}

}
