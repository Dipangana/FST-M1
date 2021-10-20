package activities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity6 {
	
	 WebDriverWait wait;
	    AppiumDriver<MobileElement> driver = null;

	    @BeforeClass
	    public void beforeClass() throws MalformedURLException {
	        // Set the Desired Capabilities
	        DesiredCapabilities caps = new DesiredCapabilities();
	        caps.setCapability("deviceName", "PixelEmulator");
	        caps.setCapability("platformName", "Android");
	        caps.setCapability("appPackage", "com.android.chrome");
	        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
	        caps.setCapability("noReset", true);

	        // Instantiate Appium Driver
	        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
	        driver = new AndroidDriver<MobileElement>(appServer, caps);
	        wait = new WebDriverWait(driver, 15);

	        // Open page
	        driver.get("https://www.training-support.net/selenium");
	    }

	    @Test
	    public void scrollIntoViewTest1() throws InterruptedException {
	        // Wait for the page to load
	    	try {
	    	    driver.findElement(MobileBy.AndroidUIAutomator(
	    	            "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(10)"));
	    	} catch (InvalidSelectorException e) {
	    	    // ignore
	    	}
	    	Thread.sleep(3000);
	    	driver.findElementByXPath("//android.webkit.WebView/android.view.View[2]/android.view.View[3]/android.view.View[19]/android.view.View").click();
	    	Thread.sleep(5000);
	    	driver.findElementByXPath("//android.webkit.WebView/android.view.View[1]/android.view.View[4]/android.widget.Button").click();
	    	Thread.sleep(2000);
	    	driver.findElementByXPath("//android.webkit.WebView/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[1]").sendKeys("admin");
	    	Thread.sleep(2000);
	    	driver.findElementByXPath("//android.webkit.WebView/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[2]").sendKeys("password");
	    	driver.findElementByXPath("//android.webkit.WebView/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View/android.widget.Button").click();
	    	Thread.sleep(2000);
	    	String msg = driver.findElementByXPath("//android.webkit.WebView/android.view.View[1]/android.view.View[4]").getText();
	    	Assert.assertEquals(msg, "Welcome Back, admin");
	    	
	    	driver.findElementByXPath("//android.webkit.WebView/android.view.View[1]/android.view.View[5]/android.widget.Button").click();
	    	Thread.sleep(5000);
	    	driver.findElementByXPath("//android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[1]").clear();
	    	Thread.sleep(2000);
	    	driver.findElementByXPath("//android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[1]").sendKeys("Dipa");
	    	Thread.sleep(2000);
	    	driver.findElementByXPath("//android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[2]").clear();
	    	Thread.sleep(2000);
	    	driver.findElementByXPath("//android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[2]").sendKeys("1234");
	    	Thread.sleep(2000);
	    	driver.findElementByXPath("//android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.widget.Button").click();
	    	Thread.sleep(2000);
	    	String msg1=driver.findElementByXPath("//android.webkit.WebView/android.view.View[1]/android.view.View[4]").getText();
	    	Assert.assertEquals(msg1, "Invalid Credentials");
	    	}
	    @AfterClass
	    public void afterClass() {
	        driver.quit();
	    }
}
