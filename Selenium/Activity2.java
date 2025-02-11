package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
        System.out.println(driver.getTitle());
        WebElement id =driver.findElement(By.id("about-link"));
        System.out.println(id.getText());
        WebElement c =driver.findElement(By.className("green"));
        System.out.println(c.getText());
        WebElement l =driver.findElement(By.linkText("About Us"));
        System.out.println(l.getText());
        WebElement s=driver.findElement(By.cssSelector(".ui.inverted.green"));
        System.out.println(s.getText());
        System.out.println(driver.findElement(By.id("about-link")).getText());
        driver.close();

	}

}
