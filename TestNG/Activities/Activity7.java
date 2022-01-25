package TestngActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Activity7 {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new FirefoxDriver();
        driver.get(" https://www.training-support.net/selenium/login-form");
    }
@DataProvider(name="Authentication")
public static Object[][] credentials(){
        return new Object[][]{
                {"admin","password"},
                {"tashi","rautela"}
        };
}
@Test(dataProvider="Authentication")
public void credentials(String username,String password){
    driver.findElement(By.id("username")).sendKeys(username);
    driver.findElement(By.id("password")).sendKeys(password);
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
    Assert.assertEquals(loginMessage, "Welcome Back, admin");
}

    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}
