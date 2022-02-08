
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

public class Activity3 {
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;
    @BeforeClass
    public void setUp() throws MalformedURLException {

        DesiredCapabilities caps=new DesiredCapabilities();
        caps.setCapability("deviceId","988e50335a3757323130");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.android.chrome");
        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        caps.setCapability("noReset", true);
        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<>(appServer, caps);
        wait = new WebDriverWait(driver, 20);
        driver.get("https://www.training-support.net/selenium");
    }
    @Test
    public void googleChrome(){
        // driver.findElementById("tab_text_view").click();
        String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
        //  driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector()).scrollTextIntoView(\"To-Do List\")"));
        driver.findElement(
                        MobileBy.AndroidUIAutomator(UiScrollable + ".scrollForward(7).scrollIntoView(text(\"To-Do List\"))"))
                .click();
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.widget.EditText[@resource-id='taskInput']")));

        // driver.findElementById("taskInput").sendKeys("task1");

        //driver.findElementById("com.android.chrome:id/taskInput").sendKeys("task1");
        driver.findElementByXPath("//android.widget.EditText[contains(@resource-id,'taskInput')]").sendKeys("task1");
        driver.findElementByXPath("//android.widget.Button[@text='Add Task']").click();
        driver.findElementByXPath("//android.widget.EditText[contains(@resource-id,'taskInput')]").sendKeys("task2");
        driver.findElementByXPath("//android.widget.Button[@text='Add Task']").click();
        List<MobileElement> numberOfTask = driver.findElementsByXPath("//android.view.View[@resource-id='tasksList']//android.widget.TextView");
        System.out.println("size---->"+numberOfTask.size());
        int numTask = numberOfTask.size();
        Assert.assertEquals(numTask, 3);

        driver.findElementByXPath("// android.widget.TextView[@text='task1']").click();
        driver.findElementByXPath("// android.widget.TextView[@text='task2']").click();
        driver.findElementByXPath("//android.view.View[@resource-id='tasksCard']/android.view.View[3]").click();
        //driver.findElementByXPath("//android.widget.TextView[@text='\uF1F8']").click();
        List<MobileElement> clearingTask = driver.findElementsByXPath("//android.view.View[@resource-id='tasksList']//android.widget.TextView");
        int clrTask=clearingTask.size();
        Assert.assertEquals(clrTask, 0);


    }


    @AfterClass
    public void teardown(){
        //driver.quit();
    }
}


