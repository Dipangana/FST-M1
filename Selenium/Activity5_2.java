package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println(driver.getTitle());
		System.out.println("is checkbox selected on page?" +driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected());
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(5000);
		System.out.println("Is checkbox selected on page? " +driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected());
		driver.close();

	}

}
