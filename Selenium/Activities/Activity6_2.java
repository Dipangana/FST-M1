package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
	
	        
	        driver.get("https://training-support.net/selenium/ajax");
	        System.out.println(driver.getTitle());
	        driver.findElement(By.xpath("//button[contains(@class, 'violet')]")).click();
	        WebDriverWait wait = new WebDriverWait(driver, 10);
	        
	        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "HELLO!"));
	        String t = driver.findElement(By.id("ajax-content")).getText();
	        System.out.println(t);
	        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));
	        String lateText = driver.findElement(By.id("ajax-content")).getText();
	        System.out.println(lateText);
	        driver.close();

	}

}
