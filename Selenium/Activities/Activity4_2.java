package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/simple-form");
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Dipangana");
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Chatterjee");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("dipa@gmail.com");
        driver.findElement(By.xpath("//input[@id='number']")).sendKeys("1234567890");
        driver.findElement(By.xpath("//div[@class='field']//textarea")).sendKeys("Selenium test");
        driver.findElement(By.xpath("//input[@type='submit']")).submit();
        driver.close();
      
        

	}

}
