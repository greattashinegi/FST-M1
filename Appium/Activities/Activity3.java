package activities;


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

public class Activity3 {
    AndroidDriver<MobileElement> driver;
    @BeforeClass
    public void setUp() throws MalformedURLException {

        DesiredCapabilities caps=new DesiredCapabilities();
        caps.setCapability("deviceId","988e50335a3757323130");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.sec.android.app.popupcalculator");
        caps.setCapability("appActivity", ".Calculator");
        caps.setCapability("noReset", true);
        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<>(appServer, caps);

    }
    @Test
    public void add(){
        driver.findElementById("calc_keypad_btn_05").click();
        driver.findElementById("calc_keypad_btn_add").click();
        driver.findElementById("calc_keypad_btn_09").click();
        driver.findElementById("calc_keypad_btn_equal").click();
        String result = driver.findElement(MobileBy.id("calc_edt_formula")).getText();
        System.out.println(result);

        // Assertion
        Assert.assertEquals(result, "14");
    }
    @Test
    public void subtract(){
        driver.findElementById("calc_keypad_btn_01").click();
        driver.findElementById("calc_keypad_btn_00").click();
        driver.findElementById("calc_keypad_btn_sub").click();
        driver.findElementById("calc_keypad_btn_05").click();
        driver.findElementById("calc_keypad_btn_equal").click();
        String result = driver.findElement(MobileBy.id("calc_edt_formula")).getText();
        System.out.println(result);

        // Assertion
        Assert.assertEquals(result, "5");
    }
    @Test
    public void multiply(){
        driver.findElementById("calc_keypad_btn_05").click();
        driver.findElementById("calc_keypad_btn_mul").click();
        driver.findElementById("calc_keypad_btn_01").click();
        driver.findElementById("calc_keypad_btn_00").click();
        driver.findElementById("calc_keypad_btn_00").click();
        driver.findElementById("calc_keypad_btn_equal").click();
        String result = driver.findElement(MobileBy.id("calc_edt_formula")).getText();
        System.out.println(result);

        // Assertion
        Assert.assertEquals(result, "500");
    }
    @Test
    public void divide() {
        driver.findElementById("calc_keypad_btn_05").click();
        driver.findElementById("calc_keypad_btn_00").click();
        driver.findElementById("calc_keypad_btn_div").click();
        driver.findElementById("calc_keypad_btn_02").click();
        driver.findElementById("calc_keypad_btn_equal").click();
        String result = driver.findElement(MobileBy.id("calc_edt_formula")).getText();
        System.out.println(result);

        // Assertion
        Assert.assertEquals(result, "25");
    }

    @AfterClass
    public void teardown(){
        driver.quit();
    }
}
