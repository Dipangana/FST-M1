package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class Activity9_1 {

	public static void main(String[] args) {
		 WebDriver driver = new FirefoxDriver();

	        
	        driver.get("https://training-support.net/selenium/selects");
	        
	        WebElement sd = driver.findElement(By.id("single-value"));
	        Select dropdown = new Select(driver.findElement(By.id("single-select")));
	        dropdown.selectByIndex(2);
	        System.out.println(sd.getText());
	        dropdown.selectByVisibleText("Option 3");;
	        System.out.println(sd.getText());
	        dropdown.selectByValue("4");
	        System.out.println(sd.getText());
	        List<WebElement> options = dropdown.getOptions();
	  
	        for(WebElement option : options) {
	            System.out.println("Option: " + option.getText());
	        }
	 
	    
	        driver.close();
	        
	        

	}

}
