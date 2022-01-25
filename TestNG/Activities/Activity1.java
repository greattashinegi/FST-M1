package TestngActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new FirefoxDriver();
        driver.get(" https://www.training-support.net");
    }

    @Test
    public void title() {
        String title=driver.getTitle();
        System.out.println("Title of the page is" + driver.getTitle());
        Assert.assertEquals("Training Support",title);
        driver.findElement(By.id("about-link")).click();
        String title2=driver.getTitle();
        System.out.println("title of 2nd page:"+title2);
        Assert.assertEquals("About Training Support1",title2);
    }
    @AfterMethod
    public void afterMethod(){
        driver.quit();
    }
}