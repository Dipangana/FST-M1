package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println(driver.getTitle());
		System.out.println("is checkbox displayed on page?" +driver.findElement(By.xpath("//input[@type='checkbox']")).isDisplayed());
		driver.findElement(By.xpath("//button[@id='toggleCheckbox']")).click();
		Thread.sleep(5000);
		System.out.println("Is checkbox displayed on page? " +driver.findElement(By.xpath("//input[@type='checkbox']")).isDisplayed());
		driver.close();
	}

}
