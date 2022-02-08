package liveProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLOutput;
import java.util.List;

import org.openqa.selenium.remote.DesiredCapabilities;

public class Activity2 {
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;
    @BeforeClass
    public void setUp() throws MalformedURLException {

        DesiredCapabilities caps=new DesiredCapabilities();
        caps.setCapability("deviceId","988e50335a3757323130");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.google.android.keep");
        caps.setCapability("appActivity", ".activities.BrowseActivity");
        caps.setCapability("noReset", true);
        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<>(appServer, caps);
        wait = new WebDriverWait(driver, 5);
    }
    @Test
    public void googleKeepNote(){
        driver.findElementById("new_note_button").click();
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("editable_title")));
        driver.findElementById("editable_title").sendKeys("New Title1");
        driver.findElementById("edit_note_text").sendKeys("New Note1");
        driver.findElementByXPath("//android.widget.ImageButton[contains(@content-desc,'Navigate up')]").click();
        String checkNote=driver.findElementById("browse_note_interior_content").getText();
        System.out.println("title---"+checkNote);
        Assert.assertEquals(checkNote, "New Title1");

    }

    @AfterClass
    public void teardown(){
        driver.quit();
    }
}

