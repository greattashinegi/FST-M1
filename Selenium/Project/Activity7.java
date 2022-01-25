package LiveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity7 {
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
    @Test
    public void allCourses() {
        driver.findElement(By.linkText("All Courses")).click();
        String course1=driver.findElement(By.xpath("//a[contains(@href,'social-media-marketing')]/following-sibling::div/h3")).getText();
        String course2=driver.findElement(By.xpath("//a[contains(@href,'email-marketing-strategies')]/following-sibling::div/h3")).getText();
        String course3=driver.findElement(By.xpath("//a[contains(@href,'how-to-play-the-piano')]/following-sibling::div/h3")).getText();
        System.out.println("Courses are--->" + course1 + course2 + course3);
        Assert.assertEquals("Social Media MarketingEmail Marketing StrategiesContent Marketing", course1+ course2 + course3);
    }

    @AfterClass
    public void teardown(){
        driver.close();
    }
}
