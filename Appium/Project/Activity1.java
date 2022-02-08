package liveProject;
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

public class Activity1 {
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;
    @BeforeClass
    public void setUp() throws MalformedURLException {

        DesiredCapabilities caps=new DesiredCapabilities();
        caps.setCapability("deviceId","988e50335a3757323130");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.google.android.apps.tasks");
        caps.setCapability("appActivity", ".ui.TaskListsActivity");
        caps.setCapability("noReset", true);
        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<>(appServer, caps);
        wait = new WebDriverWait(driver, 5);
    }
    @Test
    public void add(){
        // driver.findElementById("tab_text_view").click();
        driver.findElementById("tasks_fab").click();
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.widget.EditText[@text='New task']")));
        //driver.findElementById("add_task_title").sendKeys("Complete Activity with Google Tasks");
        driver.findElementByXPath("//android.widget.EditText[@text='New task']").sendKeys("Complete Activity with Google Tasks");
        // driver.findElementByXPath("//android.widget.EditText[@resource-id='add_task_title']").sendKeys("Complete Activity with Google Tasks");
        driver.findElementById("add_task_done").click();
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("task_name")));
        String name1=driver.findElementById("task_name").getText();
        Assert.assertEquals(name1, "Complete Activity with Google Tasks");

        driver.findElementByXPath("//android.view.View[@content-desc='Mark as complete']").click();
        driver.findElementById("tasks_fab").click();
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.widget.EditText[@text='New task']")));
        driver.findElementById("add_task_title").sendKeys("Complete Activity with Google Keep");
        driver.findElementById("add_task_done").click();
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("task_name")));
        String name2=driver.findElementById("task_name").getText();
        Assert.assertEquals(name2, "Complete Activity with Google Keep");

        driver.findElementByXPath("//android.view.View[@content-desc='Mark as complete']").click();
        driver.findElementById("tasks_fab").click();
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.widget.EditText[@text='New task']")));
        driver.findElementByXPath("add_task_title").sendKeys("Complete the second Activity Google Keep");
        driver.findElementById("add_task_done").click();
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("task_name")));
        String name3=driver.findElementById("task_name").getText();
        Assert.assertEquals(name3, "Complete the second Activity Google Keep");


}


    @AfterClass
    public void teardown(){
        driver.quit();
    }
}
