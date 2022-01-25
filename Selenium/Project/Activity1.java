package LiveProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {
    WebDriver driver;
    @BeforeClass
    public void setup(){
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
    }
    @Test
    public void title() {
        String title = driver.getTitle();
        System.out.println("Title of the page is" + driver.getTitle());
        Assert.assertEquals("Alchemy LMS – An LMS Application", title);
    }

    @AfterClass
    public void teardown(){
        driver.close();
    }
}
