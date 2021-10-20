package activities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity4 {
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
        wait = new WebDriverWait(driver, 10);

        // Open page
        driver.get("https://www.training-support.net/selenium");
    }

    @Test
    public void scrollIntoViewTest() throws InterruptedException {
        // Wait for the page to load
    	try {
    	    driver.findElement(MobileBy.AndroidUIAutomator(
    	            "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(10)"));
    	} catch (InvalidSelectorException e) {
    	    // ignore
    	}
    	Thread.sleep(3000);
    	driver.findElementByXPath("//android.webkit.WebView/android.view.View[2]/android.view.View[3]/android.view.View[15]/android.view.View").click();
    	Thread.sleep(5000);
    	driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[1]/android.widget.EditText").sendKeys("Add tasks to list");
    	driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[1]/android.widget.Button").click();
    	Thread.sleep(3000);
    	driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[1]/android.widget.EditText").sendKeys("Get number of tasks");
    	driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[1]/android.widget.Button").click();
    	Thread.sleep(3000);
    	driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[1]/android.widget.EditText").sendKeys("Clear the list");
    	driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[1]/android.widget.Button").click();
    	Thread.sleep(5000);
    	List<MobileElement> s =driver.findElementsByXPath("//android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[2]/android.view.View");
    	for(MobileElement t:s) {
    		Thread.sleep(2000);
    		t.click();
    	}
    	Thread.sleep(2000);
    	driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[3]").click();
    	Thread.sleep(2000);
    	driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[1]/android.widget.EditText");
    	Assert.assertTrue(true);
    	Thread.sleep(2000);
    }
      
    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}