package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
        System.out.println(driver.getTitle());
        String third = driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
        System.out.println(third);
        String fifth =driver.findElement(By.xpath("//h5")).getCssValue("color");
        System.out.println(fifth);
        String violet =driver.findElement(By.xpath("(//div[@class='spaced']//button)[8]")).getAttribute("class");
        System.out.println(violet);
        String grey =driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
        System.out.println(grey);
        driver.close();
        
        
		

	}

}
