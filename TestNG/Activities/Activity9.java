package TestngActivities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity9 {
    WebDriver driver;
    @BeforeClass
    public void setup(){
        driver = new FirefoxDriver();
        Reporter.log("Set Up method");
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
    }
    @BeforeMethod
    public void beforeMethod(){
        Reporter.log("Before Method");
        driver.switchTo().defaultContent();
    }
@Test
public void simpleAlertTestCase(){
        Reporter.log("simpleAlertTestCase");
        driver.findElement(By.id("simple")).click();
    Reporter.log("Simple Alert opened");
    Alert alert= driver.switchTo().alert();
    String alerttext=alert.getText();
    Assert.assertEquals("This is a JavaScript Alert!",alerttext);
    alert.accept();
    Reporter.log("alert accepted");
    Reporter.log("1st Test case ended |");
}

    @Test
    public void confirmAlertTestCase(){
        Reporter.log("confirmAlertTestCase");
        driver.findElement(By.id("confirm")).click();
        Reporter.log("confirmation Alert opened");
        Alert alert= driver.switchTo().alert();
        String alerttext1=alert.getText();
        Assert.assertEquals("This is a JavaScript Confirmation!",alerttext1);
        alert.accept();
        Reporter.log("confirm alert accepted");
        Reporter.log("2nd Test case ended |");

    }

        @Test
        public void promptAlertTestCase(){
            Reporter.log("promptAlertTestCase");
            driver.findElement(By.id("prompt")).click();
            Reporter.log("prompt Alert opened");
            Alert alert= driver.switchTo().alert();
            String alerttext2=alert.getText();
            Reporter.log("alert text" +alerttext2);
            Assert.assertEquals("This is a JavaScript Prompt!",alerttext2);
            alert.sendKeys("yes");
            Reporter.log("Text entered");
            alert.accept();
            Reporter.log("prompt alert accepted");
            Reporter.log("3rd Test case ended |");
        }

    @AfterClass
    public void teardown(){
        driver.close();
    }
}
