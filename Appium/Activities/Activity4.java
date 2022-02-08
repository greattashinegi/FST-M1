package activities;


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

public class Activity4 {
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;
    @BeforeClass
    public void setUp() throws MalformedURLException {

        DesiredCapabilities caps=new DesiredCapabilities();
        caps.setCapability("deviceId","988e50335a3757323130");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.samsung.android.dialer");
        caps.setCapability("appActivity", ".DialtactsActivity");
        caps.setCapability("noReset", true);
        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<>(appServer, caps);
        wait = new WebDriverWait(driver, 5);
    }
    @Test
    public void add(){
       // driver.findElementById("tab_text_view").click();
        driver.findElementById("menu_create_contact").click();
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.widget.TextView[@text='Phone']")));
        driver.findElementByXPath("//android.widget.TextView[@text='Phone']").click();
        driver.findElementByXPath("//android.widget.Button[@text='Select']").click();
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.widget.LinearLayout[@resource-id='topLayout']/android.widget.LinearLayout[2]")));
        driver.findElementByXPath("//android.widget.EditText[@resource-id='nameEdit']").sendKeys("Appium Contact");
        //driver.findElementByXPath("//android.widget.EditText[@text='Phone']").sendKeys("Appium Contact");
        driver.findElementByXPath("//android.widget.RelativeLayout[@resource-id='titleLayout']").sendKeys("9987776565");
        driver.findElementById("smallLabel").click();
         // wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("toolbar_parent")));

        String Name = driver.findElement(MobileBy.id("header")).getText();
        System.out.println(Name);

        // Assertion
        Assert.assertEquals(Name, "Appium Contact");
    }

    @AfterClass
    public void teardown(){
        driver.quit();
    }
}
