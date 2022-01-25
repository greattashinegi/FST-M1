package TestngActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
    WebDriver driver;
    @BeforeClass
    public void setup(){
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/login-form");
    }
    @Test
    public void login() {
         driver.findElement(By.id("username")).sendKeys("admin");
         driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals("Welcome Back, admin", loginMessage);

    }
    @Test
    public void blackButton(){
        WebElement bbutton=driver.findElement(By.xpath("//button[contains(@class,'black')]"));
        Assert.assertEquals("blue",bbutton.getText());
    }
    @Test(enabled = false)
    public void skipped(){
        System.out.println("Skipped");
    }
    @Test
    public void skipClass() throws SkipException
    {
        throw new SkipException("Not ready for testing");
    }

    @AfterClass
    public void teardown(){
        driver.close();
    }
}
