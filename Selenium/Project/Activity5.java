package LiveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5 {
    WebDriver driver;
    @BeforeClass
    public void setup(){
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
    }
    @Test
    public void titleMyAccount() {
        driver.findElement(By.linkText("My Account")).click();
        String title=driver.getTitle();
        System.out.println("header of the page is" + title);
        Assert.assertEquals("My Account – Alchemy LMS", title);
    }

    @AfterClass
    public void teardown(){
        driver.close();
    }
}
