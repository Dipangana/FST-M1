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

public class Activity1 {
	 AppiumDriver<MobileElement> driver = null;
	 WebDriverWait wait;

	@BeforeTest
	 public void Setup() throws InterruptedException, IOException {
	        
	        DesiredCapabilities caps = new DesiredCapabilities();
	     //   caps.setCapability("deviceId", "2eed910sa");
	        caps.setCapability("deviceName", "PixelEmulator");
	        caps.setCapability("platformName", "Android");
	        caps.setCapability("appPackage", "com.google.android.apps.tasks");
	        caps.setCapability("appActivity", ".ui.TaskListsActivity");
	        driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
	        wait = new WebDriverWait(driver, 10);
	}
	        
	        @Test
	        public void testGoogleTaskAppium() throws InterruptedException {
	            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	            driver.findElementById("com.google.android.apps.tasks:id/welcome_get_started").click();
	            driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Create new task\"]").click();
	            
	            Thread.sleep(3000);
	            driver.findElementById("com.google.android.apps.tasks:id/add_task_title").sendKeys("Complete Activity with Google Tasks");
	            driver.findElementById("com.google.android.apps.tasks:id/add_task_done").click();
	            
	            Thread.sleep(3000);
	            driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Create new task\"]").click();
	            
	            Thread.sleep(3000);
	            driver.findElementById("com.google.android.apps.tasks:id/add_task_title").sendKeys("Complete Activity with Google Keep");
	            driver.findElementById("com.google.android.apps.tasks:id/add_task_done").click();
	         
	            Thread.sleep(3000);
	            driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Create new task\"]").click();
	            
	           // Thread.sleep(3000);
	            driver.findElementById("com.google.android.apps.tasks:id/add_task_title").sendKeys("Complete the second Activity Google Keep");
	            driver.findElementById("com.google.android.apps.tasks:id/add_task_done").click();
	            
	         //   Thread.sleep(2000);
	            
	          // String Text= driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Complete the second Activity Google Keep\"]/android.view.ViewGroup/android.widget.TextView").getText();
	          //  Assert.assertEquals(Text, "Complete Activity with Google Tasks");
	            
	         //   Thread.sleep(2000);
	         //   String Text1= driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Complete Activity with Google Keep\"]/android.view.ViewGroup/android.widget.TextView").getText();
	        //    Assert.assertEquals(Text1, "Complete Activity with Google Keep");
	            
	            Thread.sleep(2000);
	            
	            String Text2= driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Complete the second Activity Google Keep\"]/android.view.ViewGroup/android.widget.TextView").getText();
	            Assert.assertEquals(Text2, "Complete the second Activity Google Keep");
	            
	          //  Thread.sleep(2000);
	            
		     //      String Text= driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Complete the second Activity Google Keep\"]/android.view.ViewGroup/android.widget.TextView").getText();
		     //       Assert.assertEquals(Text, "Complete Activity with Google Tasks");
		            
		            Thread.sleep(2000);
		            String Text1= driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Complete Activity with Google Keep\"]/android.view.ViewGroup/android.widget.TextView").getText();
		            Assert.assertEquals(Text1, "Complete Activity with Google Keep");
		            Thread.sleep(2000);
		            
			           String Text= driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Complete Activity with Google Tasks\"]/android.view.ViewGroup/android.widget.TextView").getText();
			            Assert.assertEquals(Text, "Complete Activity with Google Tasks");
			            
		            
	        }
	        @AfterTest
	        public void tearDown() {
	            driver.quit();
	        }
	            
	        
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            

	     


	 
}
