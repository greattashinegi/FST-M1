package activities;


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
import org.openqa.selenium.remote.DesiredCapabilities;

public class Activity5 {
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;
    @BeforeClass
    public void setUp() throws MalformedURLException {

        DesiredCapabilities caps=new DesiredCapabilities();
        caps.setCapability("deviceId","988e50335a3757323130");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
       caps.setCapability("appPackage", "com.samsung.android.messaging");
       caps.setCapability("appActivity", ".ui.view.main.WithActivity");
       // caps.setCapability("appPackage", "com.sec.android.app.launcher");
        //caps.setCapability("appActivity", "..activities.LauncherActivity");
        caps.setCapability("noReset", true);
        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<>(appServer, caps);

    }
    @Test
    public void createMessage(){
        driver.findElementById("fab").click();
        driver.findElementById("recipients_editor_to").sendKeys("9704968692");
        driver.findElementById("message_edit_text").sendKeys("hello appium");
        driver.findElementById("end_buttons_container").click();
        String messageText=driver.findElementByXPath("//android.widget.TextView[@text='9704968692']").getText();
        System.out.println("message------"+messageText);
        // Assertion
        Assert.assertEquals(messageText, "9704968692");
    }

    @AfterClass
    public void teardown(){
        driver.quit();
    }
}
