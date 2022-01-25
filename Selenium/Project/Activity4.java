package LiveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity4 {
    WebDriver driver;
    @BeforeClass
    public void setup(){
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
    }
    @Test
    public void titleSecondPopularCourse() {
        String title = driver.findElement(By.xpath("//a[contains(@href,'email-marketing-strategies')]/following-sibling::div/h3")).getText();
        System.out.println("header of the page is" + title);
        Assert.assertEquals("Email Marketing Strategies", title);
    }

    @AfterClass
    public void teardown(){
        driver.close();
    }
}
