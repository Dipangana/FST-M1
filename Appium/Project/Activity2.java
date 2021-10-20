package activities;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Activity2 {
	 AppiumDriver<MobileElement> driver = null;
	 WebDriverWait wait;

	@BeforeTest
	 public void Setup() throws InterruptedException, IOException {
	        
	        DesiredCapabilities caps = new DesiredCapabilities();
	     //   caps.setCapability("deviceId", "2eed910sa");
	        caps.setCapability("deviceName", "PixelEmulator");
	        caps.setCapability("platformName", "Android");
	        caps.setCapability("appPackage", "com.google.android.keep");
	        caps.setCapability("appActivity", ".activities.BrowseActivity");
	        driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
	        wait = new WebDriverWait(driver, 10);
	}
	
	@Test
    public void testGoogleKeepAppium() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementById("com.google.android.keep:id/skip_welcome").click();
        
        driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"New text note\"]").click();
        
        Thread.sleep(3000);
        driver.findElementById("com.google.android.keep:id/editable_title").sendKeys("GoodMorning");
        driver.findElementById("com.google.android.keep:id/edit_note_text").sendKeys("Have a nice day!");
        
      //  driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
        driver.navigate().back();
        driver.navigate().back();
        
        Thread.sleep(3000);
        String msg=driver.findElementById("com.google.android.keep:id/index_note_title").getText();
        System.out.println(msg);
        Assert.assertEquals(msg, "GoodMorning");
        
        
        
	        
}
	  @AfterTest
      public void tearDown() {
          driver.quit();
      }
}
