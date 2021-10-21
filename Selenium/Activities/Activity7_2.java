package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		 driver.get("https://www.training-support.net/selenium/dynamic-attributes");
	        System.out.println(driver.getTitle());
	        driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Dipa");
	        driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Lovely123");
	        driver.findElement(By.xpath("(//input[@type='password'])[3]")).sendKeys("Lovely123");
	        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("dipa123@gmail.com");
	        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	        String text = driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText();
		       System.out.println(text);
		       driver.close();
	        
	        

	}

}
