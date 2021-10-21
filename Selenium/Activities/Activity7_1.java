package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_1 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		 driver.get("https://www.training-support.net/selenium/dynamic-attributes");
	        System.out.println(driver.getTitle());
	        driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("admin");
	        driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("password");
	        driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
	       String text = driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText();
	       System.out.println(text);
	       driver.close();
	        
	        

	}

}
