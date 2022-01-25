package LiveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
    WebDriver driver;
    @BeforeClass
    public void setup(){
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
    }
    @Test
    public void titleFirstInfo() {
        String title = driver.findElement(By.xpath("//h3[contains(@class,'title')]")).getText();
        System.out.println("header of the page is" + title);
        Assert.assertEquals("Actionable Training", title);
    }

    @AfterClass
    public void teardown(){
        driver.close();
    }
}
