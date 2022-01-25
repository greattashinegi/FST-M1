package LiveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class Activity9 {
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
    public void selectCourse() {
        driver.findElement(By.linkText("All Courses")).click();
        WebElement course1=driver.findElement(By.xpath("//a[contains(@href,'social-media-marketing')]/following-sibling::div/p/following-sibling::p/a"));
        course1.click();
       String courseContent= driver.findElement(By.xpath("//div[contains(@class,'ld-section-heading')]/h2")).getText();
        System.out.println("Course Content--->" + courseContent);
        Assert.assertEquals("Course Content", courseContent);
    }
    @Test
    public void insideCourse() {
        driver.findElement(By.xpath("//div[contains(@class,'ld-item-title')]")).click();
        String title=driver.getTitle();
        System.out.println("title of the course page is---->"+title);
        //Assert.assertEquals("Course Content", courseContent);
    }

    @AfterClass
    public void teardown(){
        driver.close();
    }
}
